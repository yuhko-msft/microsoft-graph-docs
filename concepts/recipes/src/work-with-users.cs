/**
    HOW TO RUN THIS FILE

    You must have the .NET SDK installed on your development machine.

    Register an application to get an application ID

    1. Open a browser, navigate to https://aad.portal.azure.com, and login.

    2. Select Azure Active Directory in the left-hand navigation, then select
       App registrations under Manage.

    3. Select New registration. On the Register an application page, set the
       values as follows.

       - Set Name to something descriptive.
       - Set Supported account types to Accounts in any organizational directory
         and personal Microsoft accounts.
       - Under Redirect URI, leave the value blank.

    4. Select Register. On the Overview page, copy the value of the Application
       (client) ID and paste it below to replace the YOUR_APP_ID_HERE placeholder.

    5. Select Authentication under Manage. Locate the Advanced settings section
       and change the Allow public client flows toggle to Yes, then choose Save.

    Generate a .NET console project

    1. In an empty directory, use your command line interface (CLI) to run:

       dotnet new console -o GraphTest

    2. Change to the GraphTest directory and run the following commands

       dotnet add package Microsoft.Identity.Client
       dotnet add package Microsoft.Graph

    3. Delete Program.cs. Copy this file into the GraphTest directory.

    4. Open GraphTest.csproj with Visual Studio or open the GraphTest directory
       with Visual Studio Code.

    5. Change any example values such as user names, email addresses, etc. to
       work with your environment.

    6. Use the debugging tools to run the project.
 */

using System;
using System.Net.Http.Headers;
using System.Threading.Tasks;
using Microsoft.Identity.Client;
using Microsoft.Graph;

namespace GraphTest
{
    class Program
    {
        // Register app for app ID
        // Replace YOUR_APP_ID_HERE with your application ID
        private static string applicationId = "YOUR_APP_ID_HERE";
        private static string[] scopes = {
            "User.ReadWrite.All",
            "Group.ReadWrite.All"
        };

        private static string userAccountId = null;

        private static IPublicClientApplication pca =
            PublicClientApplicationBuilder
                .Create(applicationId)
                .Build();

        static async Task Main(string[] args)
        {
            var authProvider = new DelegateAuthenticationProvider(async (request) => {
                var accessToken = await GetAccessTokenAsync();
                request.Headers.Authorization =
                    new AuthenticationHeaderValue("Bearer", accessToken);
            });

            var graphClient = new GraphServiceClient(authProvider);

            // <CreateUserSnippet>
            var user = new User
            {
                AccountEnabled = true,
                DisplayName = "Ensi Vasala",
                MailNickname = "ensiv",
                PasswordProfile = new PasswordProfile
                {
                    ForceChangePasswordNextSignIn = true,
                    Password = "TZ%vTr24tCkp"
                },
                UserPrincipalName = "ensiv@contoso.com"
            };

            var newUser = await graphClient.Users
                .Request()
                .AddAsync(user);
            // </CreateUserSnippet>

            // <GetManagerSnippet>
            var users = await graphClient.Users
                .Request()
                .Filter("mail eq 'meganb@contoso.com'")
                .Select("displayName,id,mail")
                .GetAsync();

            var manager = users.CurrentPage[0];
            // </GetManagerSnippet>

            // <AssignManagerSnippet>
            await graphClient.Users[newUser.Id].Manager.Reference
                .Request()
                .PutAsync(manager.Id);
            // </AssignManagerSnippet>

            // <GetGroupSnippet>
            var groups = await graphClient.Groups
                .Request()
                .Filter("displayName eq 'Sales and Marketing'")
                .Select("displayName,id")
                .GetAsync();

            var salesMarketing = groups.CurrentPage[0];
            // </GetGroupSnippet>

            // <AddUserToGroupSnippet>
            var userObj = new DirectoryObject
            {
                Id = newUser.Id
            };

            await graphClient.Groups[salesMarketing.Id].Members.References
                .Request()
                .AddAsync(userObj);
            // </AddUserToGroupSnippet>

            // <UpdateUserSnippet>
            var updateUser = new User
            {
                Department = "Marketing",
                JobTitle = "Marketing Analyst",
                MobilePhone = "+1 425 555 1212",
                OfficeLocation = "14/3159"
            };

            await graphClient.Users[newUser.Id]
                .Request()
                .UpdateAsync(updateUser);
            // </UpdateUserSnippet>
        }

        private static async Task<string> GetAccessTokenAsync()
        {
            // First attempt a silent token request
            // If that fails, prompt the user to login interactively
            try
            {
                if (!string.IsNullOrEmpty(userAccountId))
                {
                    var account = await pca.GetAccountAsync(userAccountId);

                    var silentResult = await pca
                        .AcquireTokenSilent(scopes, account)
                        .ExecuteAsync();

                    return silentResult.AccessToken;
                }
            }
            catch (MsalException ex)
            {
                if (ex.ErrorCode != MsalError.InteractionRequired)
                {
                    throw;
                }
            }

            // Interactive request using device code flow
            var interactiveResult = await pca
                .AcquireTokenWithDeviceCode(scopes, callback => {
                    Console.WriteLine(callback.Message);
                    return Task.FromResult(0);
                })
                .ExecuteAsync();

            userAccountId = interactiveResult.Account.HomeAccountId.Identifier;

            return interactiveResult.AccessToken;
        }
    }
}
