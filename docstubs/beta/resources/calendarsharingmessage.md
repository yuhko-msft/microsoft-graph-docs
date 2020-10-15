---
title: "calendarSharingMessage resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# calendarSharingMessage resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [message](message.md)

## Methods

| Method                                                                   | Return Type                                                    | Description                                                           |
| :----------------------------------------------------------------------- | :------------------------------------------------------------- | :-------------------------------------------------------------------- |
| [List calendarSharingMessage](../api/calendarsharingmessage-list.md)     | [calendarSharingMessage](calendarSharingMessage.md) collection | List properties and relationships of a calendarSharingMessage object. |
| [Create calendarSharingMessage](../api/calendarsharingmessage-create.md) | [calendarSharingMessage](calendarSharingMessage.md)            | Create a new calendarSharingMessage object.                           |
| [Get calendarSharingMessage](../api/calendarsharingmessage-get.md)       | [calendarSharingMessage](calendarSharingMessage.md)            | Read properties and relationships of a calendarSharingMessage object. |
| [Update calendarSharingMessage](../api/calendarsharingmessage-update.md) | [calendarSharingMessage](calendarSharingMessage.md)            | Update the properties of a calendarSharingMessage object.             |
| [Delete calendarSharingMessage](../api/calendarsharingmessage-delete.md) |                                                                | Delete a calendarSharingMessage object.                               |
| [accept](../api/calendarsharingmessage-accept.md)                        | [calendar](../resources/-calendar.md)                          |                                                                       |
| [copy](../api/calendarsharingmessage-copy.md)                            | [message](../resources/-message.md)                            |                                                                       |
| [createForward](../api/calendarsharingmessage-createForward.md)          | [message](../resources/-message.md)                            |                                                                       |
| [createReply](../api/calendarsharingmessage-createReply.md)              | [message](../resources/-message.md)                            |                                                                       |
| [createReplyAll](../api/calendarsharingmessage-createReplyAll.md)        | [message](../resources/-message.md)                            |                                                                       |
| [forward](../api/calendarsharingmessage-forward.md)                      |                                                                |                                                                       |
| [move](../api/calendarsharingmessage-move.md)                            | [message](../resources/-message.md)                            |                                                                       |
| [reply](../api/calendarsharingmessage-reply.md)                          |                                                                |                                                                       |
| [replyAll](../api/calendarsharingmessage-replyAll.md)                    |                                                                |                                                                       |
| [send](../api/calendarsharingmessage-send.md)                            |                                                                |                                                                       |
| [unsubscribe](../api/calendarsharingmessage-unsubscribe.md)              |                                                                |                                                                       |

## Properties

| Property                   | Type                                                                                    | Description |
| :------------------------- | :-------------------------------------------------------------------------------------- | :---------- |
| bccRecipients              | [recipient](../resources/recipient.md) collection                                       |             |
| body                       | [itemBody](../resources/itembody.md)                                                    |             |
| bodyPreview                | String                                                                                  |             |
| canAccept                  | Boolean                                                                                 |             |
| categories                 | String collection                                                                       |             |
| ccRecipients               | [recipient](../resources/recipient.md) collection                                       |             |
| changeKey                  | String                                                                                  |             |
| conversationId             | String                                                                                  |             |
| conversationIndex          | Binary                                                                                  |             |
| createdDateTime            | DateTimeOffset                                                                          |             |
| flag                       | [followupFlag](../resources/followupflag.md)                                            |             |
| from                       | [recipient](../resources/recipient.md)                                                  |             |
| hasAttachments             | Boolean                                                                                 |             |
| id                         | String                                                                                  | Read-only.  |
| importance                 | String                                                                                  |             |
| inferenceClassification    | String                                                                                  |             |
| internetMessageHeaders     | [internetMessageHeader](../resources/internetmessageheader.md) collection               |             |
| internetMessageId          | String                                                                                  |             |
| isDeliveryReceiptRequested | Boolean                                                                                 |             |
| isDraft                    | Boolean                                                                                 |             |
| isRead                     | Boolean                                                                                 |             |
| isReadReceiptRequested     | Boolean                                                                                 |             |
| lastModifiedDateTime       | DateTimeOffset                                                                          |             |
| mentionsPreview            | [mentionsPreview](../resources/mentionspreview.md)                                      |             |
| parentFolderId             | String                                                                                  |             |
| receivedDateTime           | DateTimeOffset                                                                          |             |
| replyTo                    | [recipient](../resources/recipient.md) collection                                       |             |
| sender                     | [recipient](../resources/recipient.md)                                                  |             |
| sentDateTime               | DateTimeOffset                                                                          |             |
| sharingMessageAction       | [calendarSharingMessageAction](../resources/calendarsharingmessageaction.md)            |             |
| sharingMessageActions      | [calendarSharingMessageAction](../resources/calendarsharingmessageaction.md) collection |             |
| subject                    | String                                                                                  |             |
| suggestedCalendarName      | String                                                                                  |             |
| toRecipients               | [recipient](../resources/recipient.md) collection                                       |             |
| uniqueBody                 | [itemBody](../resources/itembody.md)                                                    |             |
| unsubscribeData            | String collection                                                                       |             |
| unsubscribeEnabled         | Boolean                                                                                 |             |
| webLink                    | String                                                                                  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.calendarSharingMessage",
  "baseType": "microsoft.graph.message",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.calendarSharingMessage",
  "bccRecipients": [{"@odata.type": "microsoft.graph.recipient"}],
  "body": {"@odata.type": "microsoft.graph.itemBody"},
  "bodyPreview": "String",
  "canAccept": "Boolean",
  "categories": ["String"],
  "ccRecipients": [{"@odata.type": "microsoft.graph.recipient"}],
  "changeKey": "String",
  "conversationId": "String",
  "conversationIndex": "Binary",
  "createdDateTime": "DateTimeOffset",
  "flag": {"@odata.type": "microsoft.graph.followupFlag"},
  "from": {"@odata.type": "microsoft.graph.recipient"},
  "hasAttachments": "Boolean",
  "id": "String (identifier)",
  "importance": "low | normal | high",
  "inferenceClassification": "focused | other",
  "internetMessageHeaders": [{"@odata.type": "microsoft.graph.internetMessageHeader"}],
  "internetMessageId": "String",
  "isDeliveryReceiptRequested": "Boolean",
  "isDraft": "Boolean",
  "isRead": "Boolean",
  "isReadReceiptRequested": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "mentionsPreview": {"@odata.type": "microsoft.graph.mentionsPreview"},
  "parentFolderId": "String",
  "receivedDateTime": "DateTimeOffset",
  "replyTo": [{"@odata.type": "microsoft.graph.recipient"}],
  "sender": {"@odata.type": "microsoft.graph.recipient"},
  "sentDateTime": "DateTimeOffset",
  "sharingMessageAction": {"@odata.type": "microsoft.graph.calendarSharingMessageAction"},
  "sharingMessageActions": [{"@odata.type": "microsoft.graph.calendarSharingMessageAction"}],
  "subject": "String",
  "suggestedCalendarName": "String",
  "toRecipients": [{"@odata.type": "microsoft.graph.recipient"}],
  "uniqueBody": {"@odata.type": "microsoft.graph.itemBody"},
  "unsubscribeData": ["String"],
  "unsubscribeEnabled": "Boolean",
  "webLink": "String"
}
```
