---
title: "Add app to chat"
description: "Install an app to chat."
author: "nkramer"
localization_priority: Priority
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# Add app to chat

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Installs a [teamsApp](../resources/teamsapp.md) to the specified [chat](../resources/chat.md).

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged)              |
|:--------------------|:---------------------------------------------------------|
|Delegated (work or school account) | TeamsAppInstallation.ReadWriteSelfForChat, TeamsAppInstallation.ReadWriteForChat |
|Delegated (personal Microsoft account) | Not supported.    |
|Application | TeamsAppInstallation.ReadWriteSelfForChat.All, TeamsAppInstallation.ReadWriteForChat.All |

## HTTP request

<!-- { 
"blockType": "ignored" 
} -->

```http
POST /chats/{chatId}/installedApps
```

## Request headers

| Header       | Value |
|:---------------|:--------|
| Authorization  | Bearer {token}. Required.  |
| Content-Type  | application/json. Required.  |

## Request body

The request body should contain the catalog app's generated app ID. *See* [teamsApp Properties](../resources/teamsapp.md#properties)

## Response

If successful, this method returns a `201 Created` response code and a [teamsApp](../resources/channel.md) in the response body.

## Example:  Install an app in the specified chat

### Request

<!-- {
  "blockType": "request",
  "name": "add_installedApp"
}-->

```http
POST https://graph.microsoft.com/beta/chats/19:ea28e88c00e94c7786b065394a61f296@thread.v2/installedApps

{
"teamsApp@odata.bind":"https://graph.microsoft.com/beta/appCatalogs/teamsApps/12345678-9abc-def0-123456789a"
}
```

### Response

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.chat"
} -->

```http
HTTP/1.1 201 Created

Content-Type: application/json
{
    "@odata.type": "#microsoft.graph.chat",
    "id": "4c54cdc2-6f55-4587-a7cc-c7280997b04f",
    "createdDateTime": "2020-10-27 23:52:29",
    "lastUpdatedDateTime": "2020-10-27 23:52:29"
}
```
