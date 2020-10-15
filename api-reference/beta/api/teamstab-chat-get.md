---
title: "Get tab in chat"
description: "Retrieve the properties and relationships of the specified tab. "
author: "nkramer"
localization_priority: Normal
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# Get tab in chat

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Retrieve the properties and relationships of the specified [tab](../resources/teamstab.md). 

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged)              |
|:--------------------|:---------------------------------------------------------|
|Delegated (work or school account) | TeamsTab.Read.All, TeamsTab.ReadWrite.All, Group.Read.All, Group.ReadWrite.All, Directory.Read.All, Directory.ReadWrite.All |
|Delegated (personal Microsoft account) | Not supported.    |
|Application | TeamsTab.Read.Group*, TeamsTab.Edit.Group*, TeamsTab.Read.All, TeamsTab.ReadWrite.All, Group.Read.All, Group.ReadWrite.All, Directory.Read.All, Directory.ReadWrite.All |
> **Note**: Permissions marked with * use [resource-specific consent]( https://aka.ms/teams-rsc).

> **Note**: This API supports admin permissions. Global admins and Microsoft Teams service admins can access teams that they are not a member of.

## HTTP request
```http
GET /teams/{id}/chat /{id}/tabs/{id}
```

## Optional query parameters

This method supports the $select, and $expand [OData query parameters](/graph/query-parameters) to help customize the response.

## Request headers
| Header       | Value |
|:---------------|:--------|
| Authorization  | Bearer {token}. Required.  |

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [tab](../resources/teamstab.md) object in the response body.
## Example
### Request
The following is an example of the request.
```http
GET /chats/{chatId}/tabs/{tabId}
```
### Response
The following is an example of the response. 

```http
HTTP/1.1 200 OK
Content-type: application/json

{
  "@odata.context": "https://localhost:8200/beta/$metadata#chats/{chatId}/tabs/{tabId}",
  "value": {
    "id": "62a07424-9c50-4adf-8931-c0038d7ef11e",
    "displayName": "My Awesome Tab",
    "webUrl": "https://teams.microsoft.com/l/chat/19%3ac2e36757ee744c569e70b385e6dd79b6%40thread.skype/tab%3a%3afd736d46-51ed-4c0b-9b23-e67ca354bb24?label=my%20%awesome%to%tab",
    "configuration": {
      "entityId": "fd3791c9-1e39-42b9-9e48-e9b1cbe54f99",
      "contentUrl": "https://www.example.com/",
      "removeUrl": "https://www.example.com/",
      "websiteUrl": "https://www.example.com/",
      "customPropertyInt": 1,
      "customPropertyBool": true,
      "customPropertyString": "value"
    }
  }
}
```

### Example : Get tabs in a Teams chat

#### Request
The following example shows a request to get all chats.

```
GET /chats/{chatId}/tabs/{tabId}
```

#### Response
```
HTTP/1.1 200 OK
Content-type: application/json

{
  "@odata.context": "https://localhost:8200/beta/$metadata#chats/{chatId}/tabs/{tabId}",
  "value": {
    "id": "62a07424-9c50-4adf-8931-c0038d7ef11e",
    "displayName": "My Awesome Tab",
    "webUrl": "https://teams.microsoft.com/l/chat/19%3ac2e36757ee744c569e70b385e6dd79b6%40thread.skype/tab%3a%3afd736d46-51ed-4c0b-9b23-e67ca354bb24?label=my%20%awesome%to%tab",
    "configuration": {
      "entityId": "fd3791c9-1e39-42b9-9e48-e9b1cbe54f99",
      "contentUrl": "https://www.example.com/",
      "removeUrl": "https://www.example.com/",
      "websiteUrl": "https://www.example.com/",
      "customPropertyInt": 1,
      "customPropertyBool": true,
      "customPropertyString": "value"
    }
  }
}
```

