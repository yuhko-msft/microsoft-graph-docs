---
title: "List apps in chat"
description: "List the apps installed in a chat."
author: "nkramer"
localization_priority: Priority
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# List apps in chat

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

List all [app installations](../resources/teamsappinstallation.md) within a [chat](../resources/chat.md).

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged)              |
|:--------------------|:---------------------------------------------------------|
|Delegated (work or school account) | TeamsAppInstallation.ReadForChat, TeamsAppInstallation.ReadWriteSelfForChat, TeamsAppInstallation.ReadWriteForChat |
|Delegated (personal Microsoft account) | Not supported.    |
|Application | TeamsAppInstallation.ReadForChat.All, TeamsAppInstallation.ReadWriteSelfForChat.All, TeamsAppInstallation.ReadWriteForChat.All |

## HTTP request

<!-- { "blockType": "ignored" } -->

```http
GET /chats/{chatId}/installedApps
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

If successful, this method returns a `200 OK` response code and a collection of [teamsApp](../resources/teamsapp.md) objects in the response body.

## Example: Get all the apps installed in the specified chat

### Request

<!-- {
  "blockType": "request",
  "name": "list_installedApps"
}
-->

```http
GET https://graph.microsoft.com/beta/chats/19:ea28e88c00e94c7786b065394a61f296@thread.v2/installedApps
```

### Response

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.chat)"
}
-->

```http
HTTP/1.1 200 OK
Content-type: application/json

{
  "value": [
    {
      "id": "id-value"
    }
  ]
}
```

<!-- uuid: 8fcb5dbc-d5aa-4681-8e31-b001d5168d79
2015-10-25 14:57:30 UTC -->
<!-- {
  "type": "#page.annotation",
  "description": "Chat list installedapps",
  "keywords": "",
  "section": "documentation",
  "tocPath": ""
}-->
