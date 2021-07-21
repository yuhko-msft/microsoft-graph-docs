---
title: "Get chatMessage"
description: "Read the properties and relationships of a chatMessage object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get chatMessage
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [chatMessage](../resources/chatmessage.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /chats/{chatsId}/messages/{chatMessageId}
GET /teams/{teamsId}/channels/{channelId}/messages/{chatMessageId}
GET /chats/{chatsId}/messages/{chatMessageId}/replies/{chatMessageId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [chatMessage](../resources/chatmessage.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_chatmessage"
}
-->
``` http
GET https://graph.microsoft.com/beta/chats/{chatsId}/messages/{chatMessageId}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.chatMessage"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.chatMessage",
    "id": "7bce0ca2-0ca2-7bce-a20c-ce7ba20cce7b",
    "attachments": [
      {
        "@odata.type": "microsoft.graph.chatMessageAttachment"
      }
    ],
    "body": {
      "@odata.type": "microsoft.graph.itemBody"
    },
    "channelIdentity": {
      "@odata.type": "microsoft.graph.channelIdentity"
    },
    "chatId": "String",
    "createdDateTime": "String (timestamp)",
    "deletedDateTime": "String (timestamp)",
    "etag": "String",
    "eventDetail": {
      "@odata.type": "microsoft.graph.eventMessageDetail"
    },
    "from": {
      "@odata.type": "microsoft.graph.chatMessageFromIdentitySet"
    },
    "importance": "String",
    "lastEditedDateTime": "String (timestamp)",
    "lastModifiedDateTime": "String (timestamp)",
    "locale": "String",
    "mentions": [
      {
        "@odata.type": "microsoft.graph.chatMessageMention"
      }
    ],
    "messageType": "String",
    "policyViolation": {
      "@odata.type": "microsoft.graph.chatMessagePolicyViolation"
    },
    "reactions": [
      {
        "@odata.type": "microsoft.graph.chatMessageReaction"
      }
    ],
    "replyToId": "String",
    "subject": "String",
    "summary": "String",
    "webUrl": "String"
  }
}
```

