---
title: "Upgrade app in chat"
description: "API to upgrade an app installed in a chat and bring it in sync with the current version available in the tenant app catalog."
author: "Nick Kramer"
localization_priority: Priority
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# Upgrade app in a chat

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Upgrade an [app](../resources/teamsapp.md) installed within a [chat](../api-reference/beta/resources/chat.md).

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

## Example

### Request

The following is an example of the request.

# [HTTP](#tab/http)
<!-- {
  "blockType": "request",
  "name": "add_teamsApp"
}-->

```http
POST https://graph.microsoft.com/beta/chats/19:ea28e88c00e94c7786b065394a61f296@thread.v2/installedApps/NjRiOWM3NDYtYjE1NS00MDQyLThkNDctOTQxYmQzODE2ODFiIyMwZDgyMGVjZC1kZWYyLTQyOTctYWRhZC03ODA1NmNkZTdjNzg=/upgrade
```

# [C#](#tab/csharp)


# [JavaScript](#tab/javascript)


# [Objective-C](#tab/objc)


---

### Response

HTTP/1.1 204 No Content 
