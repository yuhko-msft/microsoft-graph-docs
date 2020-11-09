---
title: "Create tab in chat"
description: "Creates (pins) a tab to the specified chat. Adds a scrum board tab in the meeting chat by using Graph APIs. "
author: "nkramer"
localization_priority: Normal
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# Create a tab to the specified chat

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create (pin) a [tab](../resources/teamstab.md) to the specified [chat](../resources/chat.md). 
The corresponding app must already be installed in the chat.Link document for adding apps to chat.

#### Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions | 
|:--------------------|:----------------------------------------|
|Delegated  | TeamsTab.Create, TeamsTab.ReadWrite.All  |
|Delegated  | TeamsTab.ReadWrite.All |

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

Here is an example of the request.

<!-- {
  "blockType": "request",
  "name": "get_team"
}-->

```http
POST /chats/{chatId}/tabs
```

### Response

The following is an example of the response.
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
<!-- {
  "blockType": "request",
  "name": "get_team"
}-->

```http
POST https://graph.microsoft.com/beta/chats/19:75a0894119a0468caee5811901a75ffd@thread.tacv2/tabs
```

#### Response

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
