---
title: "Update tab in chat "
description: "Update the properties of the specified tab."
author: "nkramer"
localization_priority: Normal
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# Update tab in chat

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of the specified [tab](../resources/teamstab.md).
This can be used to configure the content of the tab.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).


|Permission type      | Permissions (from least to most privileged)              |
|:--------------------|:---------------------------------------------------------|
|Delegated (work or school account) | TeamsTab.ReadWrite.All, Group.ReadWrite.All, Directory.ReadWrite.All |
|Delegated (personal Microsoft account) | Not supported.    |
|Application                            | TeamsTab.Edit.Group*, TeamsTab.ReadWrite.All, Group.ReadWrite.All, Directory.ReadWrite.All |

> **Note**: Permissions marked with * use [resource-specific consent]( https://aka.ms/teams-rsc).

> **Note**: This API supports admin permissions. Global admins and Microsoft Teams service admins can access teams that they are not a member of.

## HTTP request
```http
PATCH /teams/{id}/chat/{id}/tabs/{id}
```

## Request headers
| Header       | Value |
|:---------------|:--------|
| Authorization  | Bearer {token}. Required.  |
| Content-Type  | application/json  |

## Request body
In the request body, supply a JSON representation of [tab](../resources/teamstab.md) object.

## Response

If successful, this method returns a `200 OK` response code.

## Example
### Request
The following is an example of the request.
```http
PATCH /chats/{chatId}/tabs/{tabId}

{
  "displayName": "My Awesome Tab - Updated"
}
```
### Response
```http
HTTP/1.1 200 OK
Content-type: application/json

{
  "id": "tabId",
  "displayName": "My Awesome Tab - updated",
  "configuration": {
    "entityId": "fd3791c9-1e39-42b9-9e48-e9b1cbe54f99",
    "contentUrl": "https://www.example.com/",
    "removeUrl": "https://www.example.com/",
    "websiteUrl": "https://www.example.com/",
    "customPropertyInt": 1,
    "customPropertyBool": true,
    "customPropertyString": "value"
  },
  "webUrl": "https://teams.microsoft.com/l/chat/19%3ac2e36757ee744c569e70b385e6dd79b6%40thread.skype/tab%3a%3afd736d46-51ed-4c0b-9b23-e67ca354bb24?label=my%20%awesome%to%tab"
}
```
