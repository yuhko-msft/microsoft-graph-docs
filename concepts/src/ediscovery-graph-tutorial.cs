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
            "eDiscovery.Read.All",
            "eDiscovery.ReadWrite.All",
            "Sites.Read.All"
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
            var @case = new Microsoft.Graph.Ediscovery.Case
            {
                DisplayName = "eDiscovery Graph Tutorial"
            };

            var newUser = await graphClient.Compliance.Ediscovery.Cases
                .Request()
                .AddAsync(@case);
            // </CreateUserSnippet>
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
