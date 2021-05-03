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
 *    implementation 'com.azure:azure-identity:1.+'
 *    implementation 'com.microsoft.graph:microsoft-graph:3.+'
 *
 * 3. Replace the contents of App.java with the contents of this file.
 *
 * 4. Change any example values such as user names, email addresses, etc. to
 *    work with your environment.
 *
 * 5. Use your Java IDE's debugging tools to run the project.
 */
package graphtest;

import java.util.Arrays;
import java.util.List;

import okhttp3.Request;

import com.azure.identity.DeviceCodeCredential;
import com.azure.identity.DeviceCodeCredentialBuilder;

import com.microsoft.graph.authentication.TokenCredentialAuthProvider;
import com.microsoft.graph.logger.DefaultLogger;
import com.microsoft.graph.logger.LoggerLevel;
import com.microsoft.graph.models.*;
import com.microsoft.graph.requests.*;

public class App {
    private final static String applicationId = "YOUR_APP_ID_HERE";

    private final static List<String> scopes = Arrays.asList(
        "eDiscovery.Read.All",
        "eDiscovery.ReadWrite.All",
        "Sites.Read.All"
    );

    public static void main(String[] args) {
        // Create the auth provider
        final DeviceCodeCredential credential = new DeviceCodeCredentialBuilder()
            .clientId(applicationId)
            .challengeConsumer(challenge -> System.out.println(challenge.getMessage()))
            .build();

        final TokenCredentialAuthProvider authProvider =
            new TokenCredentialAuthProvider(scopes, credential);

        // Create default logger to only log errors
        DefaultLogger logger = new DefaultLogger();
        logger.setLoggingLevel(LoggerLevel.ERROR);

        GraphServiceClient<Request> graphClient = GraphServiceClient
            .builder()
            .authenticationProvider(authProvider)
            .logger(logger)
            .buildClient();

        // <CreateUserSnippet>
        Case _case = new Case();
        _case.displayName = "eDiscovery Graph Tutorial";

        User newUser = graphClient.compliance().ediscovery().cases()
            .buildRequest()
            .post(_case);
        // </CreateUserSnippet>
    }
}
