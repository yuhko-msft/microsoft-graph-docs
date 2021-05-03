/*
 * HOW TO RUN THIS FILE
 *
 * You must have Node.js installed on your development machine.
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
 * Run the script
 *
 * 1. Copy this file to an empty directory, then open your command line interface (CLI) in that directory.
 *
 * 2. Run the following command to install dependencies
 *
 *    npm install @azure/msal-node @microsoft/microsoft-graph-client isomorphic-fetch
 *
 * 3. Change any example values such as user names, email addresses, etc. to
 *    work with your environment.
 *
 * 4. Run the following command to run the script
 *
 *    node <name-of-file>
 */

const msal = require('@azure/msal-node');
const graph = require('@microsoft/microsoft-graph-client');
require('isomorphic-fetch');

const scopes = [
  'eDiscovery.Read.All',
  'eDiscovery.ReadWrite.All',
  'Sites.Read.All'
];

let userAccountId = null;

const pca = new msal.PublicClientApplication({
  auth: {
    // Register app for app ID
    // Replace YOUR_APP_ID_HERE with your application ID
    clientId: 'YOUR_APP_ID_HERE'
  }
});

const client = graph.Client.init({
  authProvider: async (done) => {
    const token = await getAccessToken();
    done(null, token);
  }
});

// Run the asynchronous main function
main().then(() => {
  console.log('Done!');
}).catch((reason) => {
  console.log(`Error: ${JSON.stringify(reason)}`);
});

async function main() {
  // <CreateUserSnippet>
  const _case = {
      displayName: 'eDiscovery Graph Tutorial'
  };

  let newUser = await client.api('/compliance/ediscovery/cases')
    .version('beta')
    .post(_case);
  // </CreateUserSnippet>
}

// Use MSAL to get an access token
async function getAccessToken()
{
  if (userAccountId != null) {
    // Attempt to get the token silently from the cache
    const account = await pca.getTokenCache()
      .getAccountByHomeId(userAccountId);

    if (account != null) {
      const silentRequest = {
        account: account,
        scopes: scopes
      };

      try {
        const response = await pca.acquireTokenSilent(silentRequest);
        return response.accessToken;
      } catch { /* Fallback to interactive auth */ }
    }
  }

  // Interactive request using device code flow
  const deviceCodeRequest = {
    deviceCodeCallback: (response) => {
      console.log(response.message);
    },
    scopes: scopes,
    timeout: 300
  };

  const response = await pca.acquireTokenByDeviceCode(deviceCodeRequest);
  userAccountId = response.account.homeAccountId;
  return response.accessToken;
}
