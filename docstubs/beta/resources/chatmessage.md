---
title: "chatMessage resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# chatMessage resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                               | Return Type                                                           | Description                                                                         |
| :------------------------------------------------------------------- | :-------------------------------------------------------------------- | :---------------------------------------------------------------------------------- |
| [List chatMessage](../api/chatmessage-list.md)                       | [chatMessage](chatMessage.md) collection                              | List properties and relationships of a chatMessage object.                          |
| [Create chatMessage](../api/chatmessage-create.md)                   | [chatMessage](chatMessage.md)                                         | Create a new chatMessage object.                                                    |
| [Get chatMessage](../api/chatmessage-get.md)                         | [chatMessage](chatMessage.md)                                         | Read properties and relationships of a chatMessage object.                          |
| [Update chatMessage](../api/chatmessage-update.md)                   | [chatMessage](chatMessage.md)                                         | Update the properties of a chatMessage object.                                      |
| [Delete chatMessage](../api/chatmessage-delete.md)                   |                                                                       | Delete a chatMessage object.                                                        |
| [List hostedContents](../api/chatmessage-list-hostedcontents.md)     | [chatMessageHostedContent](../resources/-chatmessagehostedcontent.md) | Get the chatMessageHostedContent objects from a hostedContents navigation property. |
| [Create hostedContents](../api/chatmessage-post-hostedcontents.md)   | [chatMessageHostedContent](../resources/-chatmessagehostedcontent.md) | Create a new chatMessageHostedContent object.                                       |
| [Get hostedContents](../api/chatmessage-get-hostedcontents.md)       | [chatMessageHostedContent](../resources/-chatmessagehostedcontent.md) | Read the properties and relationships of a chatMessageHostedContent object.         |
| [Update hostedContents](../api/chatmessage-update-hostedcontents.md) | [chatMessageHostedContent](../resources/-chatmessagehostedcontent.md) | Update the properties of a chatMessageHostedContent object.                         |
| [Delete hostedContents](../api/chatmessage-delete-hostedcontents.md) |                                                                       | Delete a chatMessageHostedContent object.                                           |
| [List replies](../api/chatmessage-list-replies.md)                   | [chatMessage](../resources/-chatmessage.md)                           | Get the chatMessage objects from a replies navigation property.                     |
| [Create replies](../api/chatmessage-post-replies.md)                 | [chatMessage](../resources/-chatmessage.md)                           | Create a new chatMessage object.                                                    |
| [Get replies](../api/chatmessage-get-replies.md)                     | [chatMessage](../resources/-chatmessage.md)                           | Read the properties and relationships of a chatMessage object.                      |
| [Update replies](../api/chatmessage-update-replies.md)               | [chatMessage](../resources/-chatmessage.md)                           | Update the properties of a chatMessage object.                                      |
| [Delete replies](../api/chatmessage-delete-replies.md)               |                                                                       | Delete a chatMessage object.                                                        |

## Properties

| Property             | Type                                                                      | Description |
| :------------------- | :------------------------------------------------------------------------ | :---------- |
| attachments          | [chatMessageAttachment](../resources/chatmessageattachment.md) collection |             |
| body                 | [itemBody](../resources/itembody.md)                                      |             |
| channelIdentity      | [channelIdentity](../resources/channelidentity.md)                        |             |
| chatId               | String                                                                    |             |
| createdDateTime      | DateTimeOffset                                                            |             |
| deletedDateTime      | DateTimeOffset                                                            |             |
| etag                 | String                                                                    |             |
| from                 | [identitySet](../resources/identityset.md)                                |             |
| id                   | String                                                                    | Read-only.  |
| importance           | String                                                                    |             |
| lastEditedDateTime   | DateTimeOffset                                                            |             |
| lastModifiedDateTime | DateTimeOffset                                                            |             |
| locale               | String                                                                    |             |
| mentions             | [chatMessageMention](../resources/chatmessagemention.md) collection       |             |
| messageType          | String                                                                    |             |
| policyViolation      | [chatMessagePolicyViolation](../resources/chatmessagepolicyviolation.md)  |             |
| reactions            | [chatMessageReaction](../resources/chatmessagereaction.md) collection     |             |
| replyToId            | String                                                                    |             |
| subject              | String                                                                    |             |
| summary              | String                                                                    |             |
| webUrl               | String                                                                    |             |

## Relationships

| Relationship   | Type                                                                            | Description |
| :------------- | :------------------------------------------------------------------------------ | :---------- |
| hostedContents | [chatMessageHostedContent](../resources/chatmessagehostedcontent.md) collection |             |
| replies        | [chatMessage](../resources/chatmessage.md) collection                           |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.chatMessage",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.chatMessage",
  "attachments": [{"@odata.type": "microsoft.graph.chatMessageAttachment"}],
  "body": {"@odata.type": "microsoft.graph.itemBody"},
  "channelIdentity": {"@odata.type": "microsoft.graph.channelIdentity"},
  "chatId": "String",
  "createdDateTime": "DateTimeOffset",
  "deletedDateTime": "DateTimeOffset",
  "etag": "String",
  "from": {"@odata.type": "microsoft.graph.identitySet"},
  "id": "String (identifier)",
  "importance": "normal | high | urgent",
  "lastEditedDateTime": "DateTimeOffset",
  "lastModifiedDateTime": "DateTimeOffset",
  "locale": "String",
  "mentions": [{"@odata.type": "microsoft.graph.chatMessageMention"}],
  "messageType": "message | chatEvent | typing",
  "policyViolation": {"@odata.type": "microsoft.graph.chatMessagePolicyViolation"},
  "reactions": [{"@odata.type": "microsoft.graph.chatMessageReaction"}],
  "replyToId": "String",
  "subject": "String",
  "summary": "String",
  "webUrl": "String"
}
```
