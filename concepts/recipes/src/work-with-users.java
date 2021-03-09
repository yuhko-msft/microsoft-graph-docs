/*
 * HOW TO RUN THIS FILE
 *
 * You must have the Java SDK and Gradle installed on your development machine.
 *
 * Register an application to get an application ID
 *
 * 1. Open a browser, navigate to https://aad.portal.azure.com, and login.
 *
 * 2. Select Azure Active Directory in the left-hand navigation, then select
 *    App registrations under Manage.
 *
 * 3. Select New registration. On the Register an application page, set the
 *    values as follows.
 *
 *    - Set Name to something descriptive.
 *    - Set Supported account types to Accounts in any organizational directory
 *      and personal Microsoft accounts.
 *    - Under Redirect URI, leave the value blank.
 *
 * 4. Select Register. On the Overview page, copy the value of the Application
 *    (client) ID and paste it below to replace the YOUR_APP_ID_HERE placeholder.
 *
 * 5. Select Authentication under Manage. Locate the Advanced settings section
 *    and change the Allow public client flows toggle to Yes, then choose Save.
 *
 * Generate a Java console project
 *
 * 1. In an empty directory, use your command line interface (CLI) to run:
 *
 *    gradle init --dsl groovy --test-framework junit --type java-application --project-name graphtest --package graphtest
 *
 * 2. Add the following dependencies in build.gradle
 *
 *    implementation 'com.microsoft.azure:msal4j:1.+'
 *    implementation 'com.microsoft.graph:microsoft-graph:2.+'
 *    implementation 'org.slf4j:slf4j-nop:1.8.0-beta4'
 *
 * 3. Replace the contents of App.java with the contents of this file.
 *
 * 4. Change any example values such as user names, email addresses, etc. to
 *    work with your environment.
 *
 * 5. Use your Java IDE's debugging tools to run the project.
 */
package graphtest;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

import com.microsoft.aad.msal4j.DeviceCode;
import com.microsoft.aad.msal4j.DeviceCodeFlowParameters;
import com.microsoft.aad.msal4j.IAccount;
import com.microsoft.aad.msal4j.IAuthenticationResult;
import com.microsoft.aad.msal4j.PublicClientApplication;
import com.microsoft.aad.msal4j.SilentParameters;

import com.microsoft.graph.authentication.IAuthenticationProvider;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.logger.DefaultLogger;
import com.microsoft.graph.logger.LoggerLevel;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.requests.extensions.*;

@SuppressWarnings( "deprecation" )
public class App implements IAuthenticationProvider {
    private final static String applicationId = "f401d676-2e6b-44d3-9a5d-7e55c635e88b";

    private final static String[] scopes = {
        "User.ReadWrite.All",
        "Group.ReadWrite.All"
    };

    private static PublicClientApplication app = null;

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(1);

        try {
            // Build the MSAL application object with
            // app ID and authority
            app = PublicClientApplication.builder(applicationId)
                .authority("https://login.microsoftonline.com/common/")
                .executorService(pool)
                .build();
        } catch (MalformedURLException e) {
            System.out.println(e);
            return;
        }

        // Create default logger to only log errors
        DefaultLogger logger = new DefaultLogger();
        logger.setLoggingLevel(LoggerLevel.ERROR);

        IGraphServiceClient graphClient = GraphServiceClient
            .builder()
            .authenticationProvider(new App())
            .logger(logger)
            .buildClient();

        // <CreateUserSnippet>
        User user = new User();
        user.accountEnabled = true;
        user.displayName = "Ensi Vasala";
        user.mailNickname = "ensiv";
        PasswordProfile passwordProfile = new PasswordProfile();
        passwordProfile.forceChangePasswordNextSignIn = true;
        passwordProfile.password = "TZ%vTr24tCkp";
        user.passwordProfile = passwordProfile;
        user.userPrincipalName = "ensiv@contoso.com";

        User newUser = graphClient.users()
            .buildRequest()
            .post(user);
        // </CreateUserSnippet>

        // <GetManagerSnippet>
        IUserCollectionPage users = graphClient.users()
            .buildRequest()
            .filter("mail eq 'meganb@contoso.com'")
            .select("displayName,id,mail")
            .get();

        User manager = users.getCurrentPage().get(0);
        // </GetManagerSnippet>

        // <AssignManagerSnippet>
        DirectoryObject managerObj = new DirectoryObject();
        managerObj.id = manager.id;

        graphClient.users(newUser.id).manager().reference()
            .buildRequest()
            .put(managerObj);
        // </AssignManagerSnippet>

        // <GetGroupSnippet>
        IGroupCollectionPage groups = graphClient.groups()
            .buildRequest()
            .filter("displayName eq 'Sales and Marketing'")
            .select("displayName,id")
            .get();

        Group salesMarketing = groups.getCurrentPage().get(0);
        // </GetGroupSnippet>

        // <AddUserToGroupSnippet>
        DirectoryObject userObj = new DirectoryObject();
        userObj.id = newUser.id;

        graphClient.groups(salesMarketing.id).members().references()
            .buildRequest()
            .post(userObj);
        // </AddUserToGroupSnippet>

        // <UpdateUserSnippet>
        User updateUser = new User();
        updateUser.department = "Marketing";
        updateUser.jobTitle = "Marketing Analyst";
        updateUser.mobilePhone = "+1 425 555 1212";
        updateUser.officeLocation = "14/3159";

        graphClient.users(newUser.id)
            .buildRequest()
            .patch(updateUser);
        // </UpdateUserSnippet>

        pool.shutdown();
    }

    @Override
    public void authenticateRequest(IHttpRequest request) {
        // Add the access token in the Authorization header
        request.addHeader("Authorization", "Bearer " + getAccessToken());
    }

    private static String getAccessToken()
    {
        Set<String> scopeSet = Set.of(scopes);

        IAuthenticationResult result = null;

        // First attempt a silent token request
        // If that fails, prompt the user to login interactively
        Set<IAccount> accounts = app.getAccounts().join();
        if (accounts.size() > 0) {
            IAccount account = accounts.iterator().next();

            try {
                result = app.acquireTokenSilently(
                    SilentParameters
                        .builder(scopeSet, account)
                        .build()).join();
            } catch (Exception ex) {}
        }

        if (result == null) {
            // Create consumer to receive the DeviceCode object
            // This method gets executed during the flow and provides
            // the URL the user logs into and the device code to enter
            Consumer<DeviceCode> deviceCodeConsumer = (DeviceCode deviceCode) -> {
                // Print the login information to the console
                System.out.println(deviceCode.message());
            };

            result = app.acquireToken(
                DeviceCodeFlowParameters
                    .builder(scopeSet, deviceCodeConsumer)
                    .build()
            ).join();
        }

        return result.accessToken();
    }
}
