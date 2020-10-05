---
title: "List tabs in chat"
description: "Retrieve the list of tabs in the specified chat within a team. "
author: "nkramer"
localization_priority: Normal
ms.prod: "microsoft-teams"
doc_type: apiPageType
---
 
# List tabs in chat
 
Namespace: microsoft.graph
 
[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]
 
Retrieve the list of [tabs](../resources/teamstab.md) in the specified [chat (../resources/chat.md) within a [team](../resources/team.md).
 
## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).
 
|Permission type      | Permissions (from least to most privileged)              |
|:--------------------|:---------------------------------------------------------|
|Delegated (work or school account) | TeamsTab.Read.All, TeamsTab.ReadWrite.All, Group.Read.All, Group.ReadWrite.All, Directory.Read.All, Directory.ReadWrite.All |
|Delegated (personal Microsoft account) | Not supported.    |
| Application                            | TeamsTab.Read.Group*, TeamsTab.Edit.Group*, TeamsTab.Read.All, TeamsTab.ReadWrite.All, Group.Read.All, Group.ReadWrite.All, Directory.Read.All, Directory.ReadWrite.All |
 
> **Note**: Permissions marked with * use [resource-specific consent]( https://aka.ms/teams-rsc).
 
> **Note**: This API supports admin permissions. Global admins and Microsoft Teams service admins can access teams that they are not a member of.
 
## HTTP request
 
```http
GET /teams/{id}/chat/{id}/tabs
```
 
## Optional query parameters
 
This method supports the $filter, $select, and $expand [OData query parameters](/graph/query-parameters) to help customize the response.
 
## Request headers
| Header       | Value |
|:---------------|:--------|
| Authorization  | Bearer {token}. Required.  |
 
## Request body
Do not supply a request body for this method.
 
## Response
If successful, this method returns a `200 OK` response code and collection of [tabs](../resources/teamstab.md) objects in the response body.
 
## Example
### Request
The following is an example of the request.
```http
GET /chat/{chatId}/tabs

```

### Response
The following is an example of the response.
>**Note:** The response object shown here might be shortened for readability. All the properties will be returned from an actual call.
```http
HTTP/1.1 200 OK
Content-type: application/json

{
  "@odata.context": "https://localhost:8200/beta/$metadata#chats/{chatId}/tabs",
  "@odata.count": 1,
  "value": [
    {
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
     ]
}

```
