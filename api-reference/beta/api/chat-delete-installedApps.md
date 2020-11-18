---
title: "Uninstall app installed in a chat"
description: "API to uninstall (remove) an app installed in a chat."
author: "nkramer"
localization_priority: Priority
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# Uninstall app in a chat

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Uninstall an [app](../resources/teamsapp.md) installed within a [chat](../resources/chat.md).

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged)              |
|:--------------------|:---------------------------------------------------------|
|Delegated (work or school account) | TeamsAppInstallation.ReadWriteSelfForChat, TeamsAppInstallation.ReadWriteForChat |
|Delegated (personal Microsoft account) | Not supported.   |
|Application | TeamsAppInstallation.ReadWriteSelfForChat.All, TeamsAppInstallation.ReadWriteForChat.All |

## HTTP request

<!-- { 
"blockType": "ignored" 
} -->

```http
DELETE /chats/{chatId}/installedApps/{appInstallationId}
```

## Response 

```http
HTTP/1.1 204 No Content
```

## Example: Uninstall an app from the specified chat

### Request

<!-- {
  "blockType": "request",
  "name": "add_teamsApp"
}-->

```http
DELETE https://graph.microsoft.com/beta/chats/19:ea28e88c00e94c7786b065394a61f296@thread.v2/installedApps/NjRiOWM3NDYtYjE1NS00MDQyLThkNDctOTQxYmQzODE2ODFiIyMwZDgyMGVjZC1kZWYyLTQyOTctYWRhZC03ODA1NmNkZTdjNzg=
```

### Response

<<<<<<< HEAD
```http
HTTP/1.1 204 No Content
```

<!--{
  "value": {
    "@odata.type": "#microsoft.graph.chat",
    "id": "d58b7b66-a74b-4726-a038-a701e31988c2",
    "topic": "Uninstall app in chat",
    "createdDateTime": "2020-10-27 23:52:29",
    "lastUpdatedDateTime": "2020-10-27 23:52:29"
  }
=======
```
HTTP/1.1 204 No Content
```

<!-- uuid: 16cd6b66-4b1a-43a1-adaf-3a886856ed98
2019-02-04 14:57:30 UTC -->
<!-- {
  "type": "#page.annotation",
  "description": "Uninstall app in a chat",
  "keywords": "",
  "section": "Uninstall app in a chat",
  "tocPath": ""
>>>>>>> 881227566af8693a212df6f9ae5e49258bacf75c
}-->
