---
title: "List chatMessages"
description: "Get a list of the chatMessage objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List chatMessages
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the [chatMessage](../resources/chatmessage.md) objects and their properties.

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
GET /chats/{chatsId}/messages
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

If successful, this method returns a `200 OK` response code and a collection of [chatMessage](../resources/chatmessage.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_chatmessage"
}
-->
``` http
GET https://graph.microsoft.com/beta/chats/{chatsId}/messages
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.chatMessage)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.chatMessage",
      "id": "e7dc844e-844e-e7dc-4e84-dce74e84dce7",
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
  ]
}
```

