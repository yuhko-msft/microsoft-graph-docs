---
title: "Create tab in chat"
description: "Creates (pins) a tab to the specified chat within a team. Adds a scrum board tab in the meeting chat by using Graph APIs. "
author: "nkramer"
localization_priority: Normal
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# Create tab in chat

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create (pin) a [tab](../resources/teamstab.md) to the specified [chat](../resources/chat.md) within a [team](../resources/team.md). 
The corresponding app must already be [installed in the team](../api/teamsappinstallation-add.md).

#### Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions | Entities/APIs Covered |
|:--------------------|:----------------------------------------|:---------------------------------------------------------|
|Delegated  | TeamsTab.Create, TeamsTab.ReadWrite.All  |Allows write of the new teamsTab to the chat. TeamsTab.Create does not grant the ability to read, modify or delete tabs after they are created, or give access to the content inside the tabs. None give access to the content inside the tabs.|
|Delegated  | TeamsTab.Read.All, TeamsTab.ReadWrite.All |Allows read of existing teamsTab in the chat. None give access to the content inside the tabs.|
|Application |TeamsTab.Create, TeamsTab.ReadWrite.All  |Allows write of the new teamsTab to the chat. TeamsTab.Create does not grant the ability to read, modify or delete tabs after they are created, or give access to the content inside the tabs. None give access to the content inside the tabs.|
|Application |TeamsTab.Read.All, TeamsTab.ReadWrite.All  |Allows read of existing teamsTab in the chat. None give access to the content inside the tabs.|


## HTTP request

```
POST /teams/{id}/chat/{id}/tabs
```

## Request headers
| Header       | Value |
|:---------------|:--------|
| Authorization  | Bearer {token}. Required.  |
| Content-type   | application/json. Required. |

## Request body

In the request body, supply a JSON representation of a [teamsTab](../resources/teamstab.md) resource.

## Response

If successful, this method returns a `201 Created` response code.

## Example

> **Note**: When a meeting is started, our customer's automation is invoked. The automation add a Scrum Board tab to the meeting. The details of the invocation of the automation and the logic to figure out whether a meeting is a scrum meeting or not, is not in scope of this discussion.

### Request

```
POST /chats/{chatId}/tabs

{
  "displayName": "My Awesome Tab",
  "teamsApp@odata.bind" : "https://graph.microsoft.com/beta/appCatalogs/teamsApps/06805b9e-77e3-4b93-ac81-525eb87513b8",
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
```

### Response

The following is an example of the response. 

```
HTTP/1.1 201 Created
Content-type: application/json

{
  "id": "794f0e4e-4d10-4bb5-9079-3a465a629eff",
  "displayName": "My Awesome Tab",
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

### Example : Create tabs in a Teams chat

#### Request

The following example shows a request to create all chats.
```
POST https://graph.microsoft.com/beta/chats/19:75a0894119a0468caee5811901a75ffd@thread.tacv2/tabs

{
  "displayName": "Scrum Board",
  "teamsApp@odata.bind" : "https://graph.microsoft.com/beta/appCatalogs/teamsApps/06805b9e-77e3-4b93-ac81-525eb87513b8",
  "configuration": {
    "entityId": "2DCA2E6C7A10415CAF6B8AB6661B3154",
    "contentUrl": "https://www.contoso.com/scrumsboards/",
    "websiteUrl": "https://www.contoso.com/scrumsboards/2DCA2E6C7A10415CAF6B8AB6661B3154",
    "removeUrl": "https://www.contoso.com/scrumsboards.2DCA2E6C7A10415CAF6B8AB6661B3154/uninstallTab"
  }
}
```

#### Response
```
HTTP/1.1 201 Created
Content-type: application/json

{
  "id": "794f0e4e-4d10-4bb5-9079-3a465a629eff",
  "displayName": "Scrum Board",
  "webUrl": "https://teams.microsoft.com/l/chat/19:75a0894119a0468caee5811901a75ffd@thread.tacv2/tab%3a%3a794f0e4e-4d10-4bb5-9079-3a465a629eff?label=scrum%20tab",
  "configuration": {
    "entityId": "2DCA2E6C7A10415CAF6B8AB6661B3154",
    "contentUrl": "https://www.contoso.com/scrumsboards/",
    "websiteUrl": "https://www.contoso.com/scrumsboards/2DCA2E6C7A10415CAF6B8AB6661B3154",
    "removeUrl": "https://www.contoso.com/scrumsboards.2DCA2E6C7A10415CAF6B8AB6661B3154/uninstallTab"
  }
}

```
