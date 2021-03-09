---
title: "Provisioning users with Microsoft Graph"
description: "Learn how to perform common provisioning tasks for user with Microsoft Graph"
localization_priority: Normal
author: jasonjoh
---

<!-- markdownlint-disable MD001 MD024 MD025 -->
<!-- snippet-enable User.ReadWrite.All Group.ReadWrite.All -->

# Provisioning users with Microsoft Graph

Provisioning new users is a common task for IT departments. For every new employee hired, there are a number of tasks to complete: create a new user in Azure Active Directory, assign a manager, and add the user to groups, just to name a few. Developers can automate these tasks by using Microsoft Graph.

In this article, you'll learn about the sequence of Microsoft Graph calls that are used to accomplish a fictional user provisioning scenario.

## Required permissions

Any application that provisions users will need write access to Azure Active Directory. If the application will be performing these actions as a user (using [delegated authentication](auth-v2-user.md)), that user will need to be an administrator. Alternatively, permissions can be granted to the application directly (using [application authentication](auth-v2-service.md)), allowing it to provision users without an authenticated user.

The Microsoft Graph APIs used in this article require the following permissions.

| Actions                          | Permission            |
|----------------------------------|-----------------------|
| Creating and updating users      | User.ReadWrite.All    |
| Adding users to groups           | Group.ReadWrite.All   |

## Create a user

The first step to provision a user is to [create the user](/graph/api/user-post-users?view=graph-rest-1.0&preserve-view=true) in Azure Active Directory.

The following request includes all the required properties to create a user. You can include more properties in the create request. See [user resource type](/graph/api/resources/user?view=graph-rest-1.0&preserve-view=true) for a list of available properties.

### Request

# [HTTP](#tab/http)

<!-- {
  "saveResultVariable": {
    "name": "newUser",
    "type": "user"
  },
  "snippetName": "CreateUser"
} -->

```http
POST https://graph.microsoft.com/v1.0/users
Content-Type: application/json

{
  "accountEnabled": true,
  "displayName": "Ensi Vasala",
  "mailNickname": "ensiv",
  "passwordProfile": {
    "forceChangePasswordNextSignIn": true,
    "password": "TZ%vTr24tCkp"
  },
  "userPrincipalName": "ensiv@contoso.com"
}
```

# [C#](#tab/CS)

:::code language="csharp" source="src/work-with-users.cs" id="CreateUserSnippet":::

# [Java](#tab/java)

:::code language="java" source="src/work-with-users.java" id="CreateUserSnippet":::

# [JavaScript](#tab/javascript)

:::code language="javascript" source="src/work-with-users.js" id="CreateUserSnippet":::

---

Consider the properties being used to create the user.

- `accountEnabled` - Since the user will need to use their account, this is set to `true`.
- `displayName` - The name displayed in the address book for the user
- `mailNickName` - The user's mail alias
- `passwordProfile` - Sets the user's password to a randomly generated password, and specifies that the user must change the password when they sign in.
- `userPrincipalName` - Set to `<mail alias>@<domain>`

### Response

A successful response contains the newly created user. The application saves the `id` property from the response in order to take further actions on the user.

```http
HTTP/1.1 201 Created
Content-type: application/json

{
    "id": "87d349ed-44d7-43e1-9a83-5f2406dee5bd",
    "businessPhones": [],
    "displayName": "Ensi Vasala",
    "givenName": null,
    "jobTitle": null,
    "mail": null,
    "mobilePhone": null,
    "officeLocation": null,
    "preferredLanguage": null,
    "surname": null,
    "userPrincipalName": "ensiv@contoso.com"
}
```

## Assign a manager

The next task is to assign a manager to the new user. Two pieces of information are required to assign a manager - the user's ID (the `id` property), and the manager's ID. The user's ID was returned in the create user response, but the application only has the manager's email address.

### Find the manager's user object

The application will need to lookup the manager's ID by using the [list users](/graph/api/user-list?view=graph-rest-1.0&preserve-view=true) API.

#### Request

# [HTTP](#tab/http)

<!-- {
  "saveCollectionItem": {
    "index": 0,
    "variable": {
        "name": "manager",
        "type": "user"
    }
  },
  "snippetName": "GetManager"
} -->

```http
GET https://graph.microsoft.com/v1.0/users?$filter=mail eq 'meganb@contoso.com'&$select=displayName,id,mail
```

# [C#](#tab/CS)

:::code language="csharp" source="src/work-with-users.cs" id="GetManagerSnippet":::

# [Java](#tab/java)

:::code language="java" source="src/work-with-users.java" id="GetManagerSnippet":::

# [JavaScript](#tab/javascript)

:::code language="javascript" source="src/work-with-users.js" id="GetManagerSnippet":::

---

This request uses OData query parameters to shape the response.

- The `$filter` parameter returns the user with the specified email address.
- The `$select` parameter specifies the properties that are returned in the response.

#### Response

```http
HTTP/1.1 200 OK
Content-type: application/json

{
  "value": [
    {
      "displayName": "Megan Bowen",
      "id": "d226a090-66c5-4998-8284-7600cbf7ad96",
      "mail": "meganb@contoso.com"
    }
  ]
}
```

Notice that the `value` property is an array. This is because the list users API can return more than one user. In this case it only returned one because of the filter included in the request. The application saves the `id` property of the returned user.

### Assign the manager to the new user

Now that the application has both user IDs, it uses the [assign manager](/graph/api/user-post-manager?view=graph-rest-1.0) API to make the assignment.

#### Request

# [HTTP](#tab/http)

<!-- {
  "mappings": [
    {
      "snippetValue": "87d349ed-44d7-43e1-9a83-5f2406dee5bd",
      "replacement": {
        "type": "complex",
        "value": "newUser",
        "properties": [
          "id"
        ]
      }
    },
    {
      "snippetValue": "d226a090-66c5-4998-8284-7600cbf7ad96",
      "replacement": {
        "type": "complex",
        "value": "manager",
        "properties": [
          "id"
        ]
      }
    }
  ],
  "newVarOverride": {
    "name": "managerObj",
    "type": "directoryObject"
  },
  "snippetName": "AssignManager"
} -->

```http
PUT https://graph.microsoft.com/v1.0/users/87d349ed-44d7-43e1-9a83-5f2406dee5bd/manager/$ref
Content-Type: application/json

{
  "@odata.id": "https://graph.microsoft.com/v1.0/users/d226a090-66c5-4998-8284-7600cbf7ad96"
}
```

# [C#](#tab/CS)

:::code language="csharp" source="src/work-with-users.cs" id="AssignManagerSnippet":::

# [Java](#tab/java)

:::code language="java" source="src/work-with-users.java" id="AssignManagerSnippet":::

# [JavaScript](#tab/javascript)

:::code language="javascript" source="src/work-with-users.js" id="AssignManagerSnippet":::

---

Notice that the new user's ID is included in the request URL (`87d349ed-44d7-43e1-9a83-5f2406dee5bd`), and the manager's ID is included in the request body (`d226a090-66c5-4998-8284-7600cbf7ad96`).

#### Response

```http
HTTP/1.1 204 No Content
```

## Add the user to a group

Adding a user to a group is similar to assigning a manager. The application needs the user's ID and the group's ID.

### Find the group

The application uses the [list groups](/graph/api/group-list?view=graph-rest-1.0) to find the desired group.

#### Request

# [HTTP](#tab/http)

<!-- {
  "saveCollectionItem": {
    "index": 0,
    "variable": {
        "name": "salesMarketing",
        "type": "group"
    }
  },
  "snippetName": "GetGroup"
} -->

```http
GET https://graph.microsoft.com/v1.0/groups?$filter=displayName eq 'Sales and Marketing'&$select=displayName,id
```

# [C#](#tab/CS)

:::code language="csharp" source="src/work-with-users.cs" id="GetGroupSnippet":::

# [Java](#tab/java)

:::code language="java" source="src/work-with-users.java" id="GetGroupSnippet":::

# [JavaScript](#tab/javascript)

:::code language="javascript" source="src/work-with-users.js" id="GetGroupSnippet":::

---

Just as it did when [finding the manager](#find-the-managers-user-object), the application uses `$filter` and `$select` to customize the response.

#### Response

```http
HTTP/1.1 200 OK
Content-type: application/json

{
  "value": [
    {
      "displayName": "Sales and Marketing",
      "id": "18505c12-3495-4f1b-8c63-29d5c21b0daa"
    }
  ]
}
```

The application saves the `id` property of the group.

### Add the user

The application uses the [add member](/graph/api/group-post-members?view=graph-rest-1.0) API to add the user to the group.

#### Request

# [HTTP](#tab/http)

<!-- {
  "mappings": [
    {
      "snippetValue": "18505c12-3495-4f1b-8c63-29d5c21b0daa",
      "replacement": {
        "type": "complex",
        "value": "salesMarketing",
        "properties": [
          "id"
        ]
      }
    },
    {
      "snippetValue": "87d349ed-44d7-43e1-9a83-5f2406dee5bd",
      "replacement": {
        "type": "complex",
        "value": "newUser",
        "properties": [
          "id"
        ]
      }
    }
  ],
  "newVarOverride": {
    "name": "userObj",
    "type": "directoryObject"
  },
  "snippetName": "AddUserToGroup"
} -->

```http
POST https://graph.microsoft.com/v1.0/groups/18505c12-3495-4f1b-8c63-29d5c21b0daa/members/$ref
Content-Type: application/json

{
  "@odata.id": "https://graph.microsoft.com/v1.0/directoryObjects/87d349ed-44d7-43e1-9a83-5f2406dee5bd"
}
```

# [C#](#tab/CS)

:::code language="csharp" source="src/work-with-users.cs" id="AddUserToGroupSnippet":::

# [Java](#tab/java)

:::code language="java" source="src/work-with-users.java" id="AddUserToGroupSnippet":::

# [JavaScript](#tab/javascript)

:::code language="javascript" source="src/work-with-users.js" id="AddUserToGroupSnippet":::

---

Notice that the group's ID is included in the request URL, and the user's ID is included in the request body.

> [!NOTE]
> The add member API can only add members to security groups or Microsoft 365 groups. Attempts to add uses to a distribution group will result in a `400 Bad Request` response.

#### Response

```http
HTTP/1.1 204 No Content
```

## Update the user

Finally, the application uses the [update user](/graph/api/user-update?view=graph-rest-1.0) API to add additional information to the user.

### Request

The application includes only the properties it wants to update in the request payload. Properties not included will either keep their existing value or be recalculated based on the changes made.

# [HTTP](#tab/http)

<!-- {
  "mappings": [
    {
      "snippetValue": "87d349ed-44d7-43e1-9a83-5f2406dee5bd",
      "replacement": {
        "type": "complex",
        "value": "newUser",
        "properties": [
          "id"
        ]
      }
    }
  ],
  "newVarOverride": {
    "name": "updateUser",
    "type": "user"
  },
  "snippetName": "UpdateUser"
} -->

```http
PATCH https://graph.microsoft.com/v1.0/users/87d349ed-44d7-43e1-9a83-5f2406dee5bd
Content-Type: application/json

{
  "department": "Marketing",
  "jobTitle": "Marketing Analyst",
  "mobilePhone": "+1 425 555 1212",
  "officeLocation": "14/3159"
}
```

# [C#](#tab/CS)

:::code language="csharp" source="src/work-with-users.cs" id="UpdateUserSnippet":::

# [Java](#tab/java)

:::code language="java" source="src/work-with-users.java" id="UpdateUserSnippet":::

# [JavaScript](#tab/javascript)

:::code language="javascript" source="src/work-with-users.js" id="UpdateUserSnippet":::

---

### Response

```http
HTTP/1.1 204 No Content
```
