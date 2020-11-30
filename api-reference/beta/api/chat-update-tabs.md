---
title: "Update tab in chat "
description: "Update the properties of the specified tab in a chat."
author: "nkramer"
localization_priority: Normal
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# Update tab in chat

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of the specified [tab](../resources/teamstab.md) in a chat.
This can be used to configure the content of the tab in chat.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged) | 
|:--------------------|:---------------------------------|
|Delegated (work or school account) | TeamsTab.ReadWrite.All  |
|Delegated (personal Microsoft account) | Not supported |
|Application | TeamsTab.ReadWrite.All  |

## HTTP request
<!-- { "blockType": "ignored" } -->
```http
PATCH /chat/{id}/tabs/{id}
```

## Request headers
| Header       | Value |
|:---------------|:--------|
| Authorization  | Bearer {token}. Required.  |
| Content-Type  | application/json. Required.  |

## Request body
In the request body, supply a JSON representation of [tab](../resources/teamstab.md) object.

## Response

If successful, this method returns a `200 OK` response code.

## Example

### Request

<!-- {
  "blockType": "request",
  "name": "update_tabs_in_chat"
}-->

```http
PATCH /chats/19:75a0894119a0468caee5811901a75ffd@thread.tacv2/tabs/794f0e4e-4d10-4bb5-9079-3a465a629eff

{
  "displayName": "Sprint Board"
}
```

#### Response
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.team"
} -->

```http
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

<!-- uuid: 8fcb5dbc-d5aa-4681-8e31-b001d5168d79
2015-10-25 14:57:30 UTC -->
<!--
{
  "type": "#page.annotation",
  "description": "Update chat in tab",
  "keywords": "",
  "section": "documentation",
  "tocPath": "",
  "suppressions": [
  ]
}
-->
