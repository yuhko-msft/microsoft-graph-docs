---
title: "Update tab in chat "
description: "Update the properties of the specified tab in chat."
author: "nkramer"
localization_priority: Normal
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# Update tab in chat

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of the specified [tab](../resources/teamstab.md) in chat.
This can be used to configure the content of the tab in chat.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions | Entities/APIs Covered |
|:--------------------|:---------------------------------|:---------------------------------|
|Delegated  | TeamsTab.Create, TeamsTab.ReadWrite.All  |Allows write of the new teamsTab to the chat. TeamsTab.Create does not grant the ability to read, modify or delete tabs after they are created, or give access to the content inside the tabs. None give access to the content inside the tabs.|
|Delegated  | TeamsTab.Read.All, TeamsTab.ReadWrite.All |Allows read of existing teamsTab in the chat. None give access to the content inside the tabs.|
|Application |TeamsTab.Create, TeamsTab.ReadWrite.All  |Allows write of the new teamsTab to the chat. TeamsTab.Create does not grant the ability to read, modify or delete tabs after they are created, or give access to the content inside the tabs. None give access to the content inside the tabs.|
|Application |TeamsTab.Read.All, TeamsTab.ReadWrite.All  |Allows read of existing teamsTab in the chat. None give access to the content inside the tabs.|

## HTTP request

```
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
```
PATCH /chats/{chatId}/tabs/{tabId}

{
  "displayName": "My Awesome Tab - Updated"
}
```

### Response

```
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

### Example : Update tabs in a Teams chat

#### Request

The following example shows a request to get all chats.

```
PATCH /chats/19:75a0894119a0468caee5811901a75ffd@thread.tacv2/tabs/794f0e4e-4d10-4bb5-9079-3a465a629eff

{
  "displayName": "Sprint Board"
}
```

#### Response

```
HTTP/1.1 200 OK
Content-type: application/json

{
  "id": "794f0e4e-4d10-4bb5-9079-3a465a629eff",
  "displayName": "Sprint Board",
  "webUrl": "https://teams.microsoft.com/l/chat/19:75a0894119a0468caee5811901a75ffd@thread.tacv2/tab%3a%3a794f0e4e-4d10-4bb5-9079-3a465a629eff?label=scrum%20tab",
  "configuration": {
    "entityId": "2DCA2E6C7A10415CAF6B8AB6661B3154",
    "contentUrl": "https://www.contoso.com/scrumsboards/",
    "websiteUrl": "https://www.contoso.com/scrumsboards/2DCA2E6C7A10415CAF6B8AB6661B3154",
    "removeUrl": "https://www.contoso.com/scrumsboards.2DCA2E6C7A10415CAF6B8AB6661B3154/uninstallTab"
  }
}
```
