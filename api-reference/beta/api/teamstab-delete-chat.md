---
title: "Delete tab from chat"
description: "Removes (unpins) a tab from the specified chat . "
author: "nkramer"
localization_priority: Normal
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# Delete tab from chat

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Removes (unpins) a tab from the specified [chat](../resources/chat.md). 

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions | 
|:--------------------|:---------------------------------|
|Delegated  |TeamsTab.ReadWrite.All  |
|Delegated  | TeamsTab.ReadWrite.All |
|Application |TeamsTab.ReadWrite.All  |
|Application | TeamsTab.ReadWrite.All  |
## HTTP request

```http
DELETE /chats/{id}/tabs/{id}
```

## Request headers
| Header       | Value |
|:---------------|:--------|
| Authorization  | Bearer {token}. Required.  |

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns `204 No Content` response code. It does not return anything in the response body.

## Example

### Request

```http
DELETE /chats/{chatId}/tabs/{tabId}
```
### Response
The following is an example of the response. Note: The response object shown here may be truncated for brevity. All of the properties will be returned from an actual call.
```http
HTTP/1.1 204 No Content
```
### Example : Delete tabs in a Teams chat

#### Request

The following example shows a request to delete all chats.

```http
DELETE /chats/19:75a0894119a0468caee5811901a75ffd@thread.tacv2/tabs/{id}
```

#### Response

```http
HTTP/1.1 204 No Content
```

<!-- uuid: 8fcb5dbc-d5aa-4681-8e31-b001d5168d79
2015-10-25 14:57:30 UTC -->
<!--
{
  "type": "#page.annotation",
  "description": "List channels",
  "keywords": "",
  "section": "documentation",
  "tocPath": "",
  "suppressions": [
  ]
}
-->
