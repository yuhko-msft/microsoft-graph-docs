---
title: "Update app in a chat"
description: "Update an app installed in a chat and bring it in sync with the current version available in the tenant app catalog."
author: "laujan"
localization_priority: Priority
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# Update app in a chat

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Upgrade [teamsAppInstallation](../resources/teamsappinstallation.md) of an [app](../resources/teamsapp.md) within a [chat](../resources/chat.md).

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged)              |
|:--------------------|:---------------------------------------------------------|
|Delegated (work or school account) | TeamsAppInstallation.ReadWriteSelfForChat, TeamsAppInstallation.ReadWriteForChat |
|Delegated (personal Microsoft account) | Not supported.   |
|Application | TeamsAppInstallation.ReadWriteSelfForChat.All, TeamsAppInstallation.ReadWriteForChat.All |

## HTTP request

<!-- { "blockType": "ignored" } -->

```http
POST /chats/{chatId}/installedApps/{appInstallationId}/upgrade
```

## Response 

```http
HTTP/1.1 200 OK
```

## Example: Upgrade an app installed in a chat

### Request

<!-- {
  "blockType": "request",
  "name": "update_installedApp"
}-->

```http
POST https://graph.microsoft.com/beta/chats/{chatId}/installedApps/{appInstallationId}/upgrade
```

### Response

<!-- {
  "blockType": "response",
  "truncated": true,
}
-->

```http
HTTP/1.1 200 OK

Content-type: application/json
{
      "@odata.type": "#microsoft.graph.chat",
      "id": "e8127558-91ad-4595-8703-6e1ed3f04bfe",
      "topic": "Update installed app in chat",
      "createdDateTime": "2020-10-27 23:52:29",
      "lastUpdatedDateTime": "2020-10-27 23:52:29"
}
```

<!--{
  "value": {
    "@odata.type": "#microsoft.graph.chat",
    "id": "d58b7b66-a74b-4726-a038-a701e31988c2",
    "topic": "Uninstall app in chat",
    "createdDateTime": "2020-10-27 23:52:29",
    "lastUpdatedDateTime": "2020-10-27 23:52:29"
  }
}-->
