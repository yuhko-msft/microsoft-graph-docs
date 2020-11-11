---
title: "Upgrade app in a chat"
description: "Upgrade an app installed in a chat and bring it in sync with the current version available in the tenant app catalog."
author: "nkramer"
localization_priority: Priority
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# Upgrade app in a chat

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
HTTP/1.1 204 No Content

## Example: Upgrade an app installed in a chat

### Request

The following is an example of the request.

<!-- {
  "blockType": "request",
  "name": "add_teamsApp"
}-->

```http
POST https://graph.microsoft.com/beta/chats/{chatId}/installedApps/{appInstallationId}/upgrade
```

### Response

```
HTTP/1.1 204 No Content
```

<!-- uuid: 16cd6b66-4b1a-43a1-adaf-3a886856ed98
2019-02-04 14:57:30 UTC -->
<!-- {
  "type": "#page.annotation",
  "description": "Upgrade app in chat",
  "keywords": "",
  "section": "Upgrade app in chat",
  "tocPath": ""
}-->
