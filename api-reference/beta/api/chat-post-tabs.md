---
title: "Create a tab in chat"
description: "Create (pin) a tab to the specified chat. "
author: "nkramer"
localization_priority: Normal
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# Create a tab in chat

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create (pin) a [tab](../resources/teamstab.md) to the specified [chat](../resources/chat.md). 
The corresponding app must already be installed in the chat.Link document for adding apps to chat.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged) | 
|:--------------------|:----------------------------------------|
|Delegated (work or school account)  | TeamsTab.Create, TeamsTab.ReadWrite.All  |
|Delegated (personal Microsoft account)  | TeamsTab.ReadWrite.All |
|Application (work or school account)| TeamsTab.Create, TeamsTab.ReadWrite.All  |
|Application (personal Microsoft account)| TeamsTab.ReadWrite.All|

## HTTP request
<!-- { "blockType": "ignored" } -->

```http
POST /chats/{id}/tabs
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

### Request

<!-- {
  "blockType": "request",
  "name": "create_tab_in_chat"
}-->

```http
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

### Response
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.team"
} -->

```http
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
<!-- uuid: 8fcb5dbc-d5aa-4681-8e31-b001d5168d79
2015-10-25 14:57:30 UTC -->
<!--
{
  "type": "#page.annotation",
  "description": "Create tab in chat",
  "keywords": "",
  "section": "documentation",
  "tocPath": "",
  "suppressions": [
  ]
}
-->
