---
title: "List apps in chat"
description: "API to get an app installed in a chat."
author: "nkramer"
localization_priority: Priority
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# List apps in chat

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get an [app](../resources/teamsapp.md) installed within [chat](../resources/chat.md).

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged)              |
|:--------------------|:---------------------------------------------------------|
|Delegated (work or school account) | TeamsAppInstallation.ReadForChat, TeamsAppInstallation.ReadWriteSelfForChat, TeamsAppInstallation.ReadWriteForChat |
|Delegated (personal Microsoft account) | Not supported.    |
|Application | TeamsAppInstallation.ReadForChat.All, TeamsAppInstallation.ReadWriteSelfForChat.All, TeamsAppInstallation.ReadWriteForChat.All

## HTTP request

<!-- { 
"blockType": "ignored" 
} -->

```http
GET /chats/{chatId}/installedApps/{appInstallationId}
```

## Response

`200 OK` and a teamsAppInstallation object.

## Example

### Request

The following is an example of the request.

<!-- {
  "blockType": "request",
  "name": "add_teamsApp"
}-->

```http
GET https://graph.microsoft.com/beta/chats/19:ea28e88c00e94c7786b065394a61f296@thread.v2/installedApps/NjRiOWM3NDYtYjE1NS00MDQyLThkNDctOTQxYmQzODE2ODFiIyMwZDgyMGVjZC1kZWYyLTQyOTctYWRhZC03ODA1NmNkZTdjNzg=
```

### Response

HTTP/1.1 200 OK
Content-type: application/json
```
{
"id": "id-value"
}
```

<!-- uuid: 16cd6b66-4b1a-43a1-adaf-3a886856ed98
2019-02-04 14:57:30 UTC -->
<!-- {
  "type": "#page.annotation",
  "description": "List apps in chat",
  "keywords": "",
  "section": "List apps in chat",
  "tocPath": ""
}-->
