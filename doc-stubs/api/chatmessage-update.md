---
title: "Update chatMessage"
description: "Update the properties of a chatMessage object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update chatMessage
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [chatMessage](../resources/chatmessage.md) object.

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
PATCH /chats/{chatsId}/messages/{chatMessageId}
PATCH /teams/{teamsId}/channels/{channelId}/messages/{chatMessageId}
PATCH /chats/{chatsId}/messages/{chatMessageId}/replies/{chatMessageId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|replyToId|String|**TODO: Add Description** Optional.|
|from|[Microsoft.Teams.GraphSvc.chatMessageFromIdentitySet](../resources/chatmessagefromidentityset.md)|**TODO: Add Description** Optional.|
|etag|String|**TODO: Add Description** Optional.|
|messageType|chatMessageType|**TODO: Add Description**. The possible values are: `message`, `chatEvent`, `typing`, `unknownFutureValue`, `systemEventMessage`. Note that you must use the `Prefer: include - unknown -enum-members` request header to get the following value(s) in this [evolvable enum](/graph/best-practices-concept#handling-future-members-in-evolvable-enumerations): `systemEventMessage`. Required.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastEditedDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|deletedDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|subject|String|**TODO: Add Description** Optional.|
|body|[Microsoft.Teams.GraphSvc.itemBody](../resources/itembody.md)|**TODO: Add Description** Required.|
|summary|String|**TODO: Add Description** Optional.|
|chatId|String|**TODO: Add Description** Optional.|
|channelIdentity|[Microsoft.Teams.GraphSvc.channelIdentity](../resources/channelidentity.md)|**TODO: Add Description** Optional.|
|attachments|[Microsoft.Teams.GraphSvc.chatMessageAttachment](../resources/chatmessageattachment.md) collection|**TODO: Add Description** Optional.|
|mentions|[Microsoft.Teams.GraphSvc.chatMessageMention](../resources/chatmessagemention.md) collection|**TODO: Add Description** Optional.|
|importance|chatMessageImportance|**TODO: Add Description**. The possible values are: `normal`, `high`, `urgent`. Required.|
|policyViolation|[Microsoft.Teams.GraphSvc.chatMessagePolicyViolation](../resources/chatmessagepolicyviolation.md)|**TODO: Add Description** Optional.|
|reactions|[Microsoft.Teams.GraphSvc.chatMessageReaction](../resources/chatmessagereaction.md) collection|**TODO: Add Description** Optional.|
|locale|String|**TODO: Add Description** Required.|
|webUrl|String|**TODO: Add Description** Optional.|
|eventDetail|[Microsoft.Teams.GraphSvc.eventMessageDetail](../resources/eventmessagedetail.md)|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [chatMessage](../resources/chatmessage.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_chatmessage"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/chats/{chatsId}/messages/{chatMessageId}
Content-Type: application/json
Content-length: 1071

{
  "@odata.type": "#microsoft.graph.chatMessage",
  "replyToId": "String",
  "from": {
    "@odata.type": "microsoft.graph.chatMessageFromIdentitySet"
  },
  "etag": "String",
  "messageType": "String",
  "lastEditedDateTime": "String (timestamp)",
  "deletedDateTime": "String (timestamp)",
  "subject": "String",
  "body": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "summary": "String",
  "chatId": "String",
  "channelIdentity": {
    "@odata.type": "microsoft.graph.channelIdentity"
  },
  "attachments": [
    {
      "@odata.type": "microsoft.graph.chatMessageAttachment"
    }
  ],
  "mentions": [
    {
      "@odata.type": "microsoft.graph.chatMessageMention"
    }
  ],
  "importance": "String",
  "policyViolation": {
    "@odata.type": "microsoft.graph.chatMessagePolicyViolation"
  },
  "reactions": [
    {
      "@odata.type": "microsoft.graph.chatMessageReaction"
    }
  ],
  "locale": "String",
  "webUrl": "String",
  "eventDetail": {
    "@odata.type": "microsoft.graph.eventMessageDetail"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.chatMessage",
  "id": "b892b9f4-b9f4-b892-f4b9-92b8f4b992b8",
  "replyToId": "String",
  "from": {
    "@odata.type": "microsoft.graph.chatMessageFromIdentitySet"
  },
  "etag": "String",
  "messageType": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "lastEditedDateTime": "String (timestamp)",
  "deletedDateTime": "String (timestamp)",
  "subject": "String",
  "body": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "summary": "String",
  "chatId": "String",
  "channelIdentity": {
    "@odata.type": "microsoft.graph.channelIdentity"
  },
  "attachments": [
    {
      "@odata.type": "microsoft.graph.chatMessageAttachment"
    }
  ],
  "mentions": [
    {
      "@odata.type": "microsoft.graph.chatMessageMention"
    }
  ],
  "importance": "String",
  "policyViolation": {
    "@odata.type": "microsoft.graph.chatMessagePolicyViolation"
  },
  "reactions": [
    {
      "@odata.type": "microsoft.graph.chatMessageReaction"
    }
  ],
  "locale": "String",
  "webUrl": "String",
  "eventDetail": {
    "@odata.type": "microsoft.graph.eventMessageDetail"
  }
}
```

