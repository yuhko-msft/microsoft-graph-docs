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
  'User.ReadWrite.All',
  'Group.ReadWrite.All'
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
  const user = {
    accountEnabled: true,
    displayName: 'Ensi Vasala',
    mailNickname: 'ensiv',
    passwordProfile: {
      forceChangePasswordNextSignIn: true,
      password: 'TZ%vTr24tCkp'
    },
    userPrincipalName: 'ensiv@contoso.com'
  };

  let newUser = await client.api('/users')
    .post(user);
  // </CreateUserSnippet>

  // <GetManagerSnippet>
  let users = await client.api('/users')
    .filter('mail eq \'meganb@contoso.com\'')
    .select('displayName,id,mail')
    .get();

  let manager = users.value[0];
  // </GetManagerSnippet>

  // <AssignManagerSnippet>
  const managerObj = {
    '@odata.id': `https://graph.microsoft.com/v1.0/users/${manager.id}`
  };

  await client.api(`/users/${newUser.id}/manager/$ref`)
    .put(managerObj);
  // </AssignManagerSnippet>

  // <GetGroupSnippet>
  let groups = await client.api('/groups')
    .filter('displayName eq \'Sales and Marketing\'')
    .select('displayName,id')
    .get();

  let salesMarketing = groups.value[0];
  // </GetGroupSnippet>

  // <AddUserToGroupSnippet>
  const userObj = {
    '@odata.id': `https://graph.microsoft.com/v1.0/directoryObjects/${newUser.id}`
  };

  await client.api(`/groups/${salesMarketing.id}/members/$ref`)
    .post(userObj);
  // </AddUserToGroupSnippet>

  // <UpdateUserSnippet>
  const updateUser = {
    department: 'Marketing',
    jobTitle: 'Marketing Analyst',
    mobilePhone: '+1 425 555 1212',
    officeLocation: '14/3159'
  };

  await client.api(`/users/${newUser.id}`)
    .update(updateUser);
  // </UpdateUserSnippet>
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
