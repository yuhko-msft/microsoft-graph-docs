---
title: "eventMessageRequest resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# eventMessageRequest resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [eventMessage](eventmessage.md)

## Methods

| Method                                                               | Return Type                                              | Description                                                         |
| :------------------------------------------------------------------- | :------------------------------------------------------- | :------------------------------------------------------------------ |
| [List eventMessageRequest](../api/eventmessagerequest-list.md)       | [eventMessageRequest](eventMessageRequest.md) collection | List properties and relationships of an eventMessageRequest object. |
| [Create eventMessageRequest](../api/eventmessagerequest-create.md)   | [eventMessageRequest](eventMessageRequest.md)            | Create a new eventMessageRequest object.                            |
| [Get eventMessageRequest](../api/eventmessagerequest-get.md)         | [eventMessageRequest](eventMessageRequest.md)            | Read properties and relationships of an eventMessageRequest object. |
| [Update eventMessageRequest](../api/eventmessagerequest-update.md)   | [eventMessageRequest](eventMessageRequest.md)            | Update the properties of an eventMessageRequest object.             |
| [Delete eventMessageRequest](../api/eventmessagerequest-delete.md)   |                                                          | Delete an eventMessageRequest object.                               |
| [accept](../api/eventmessagerequest-accept.md)                       |                                                          |                                                                     |
| [copy](../api/eventmessagerequest-copy.md)                           | [message](../resources/-message.md)                      |                                                                     |
| [createForward](../api/eventmessagerequest-createForward.md)         | [message](../resources/-message.md)                      |                                                                     |
| [createReply](../api/eventmessagerequest-createReply.md)             | [message](../resources/-message.md)                      |                                                                     |
| [createReplyAll](../api/eventmessagerequest-createReplyAll.md)       | [message](../resources/-message.md)                      |                                                                     |
| [decline](../api/eventmessagerequest-decline.md)                     |                                                          |                                                                     |
| [forward](../api/eventmessagerequest-forward.md)                     |                                                          |                                                                     |
| [move](../api/eventmessagerequest-move.md)                           | [message](../resources/-message.md)                      |                                                                     |
| [reply](../api/eventmessagerequest-reply.md)                         |                                                          |                                                                     |
| [replyAll](../api/eventmessagerequest-replyAll.md)                   |                                                          |                                                                     |
| [send](../api/eventmessagerequest-send.md)                           |                                                          |                                                                     |
| [tentativelyAccept](../api/eventmessagerequest-tentativelyAccept.md) |                                                          |                                                                     |
| [unsubscribe](../api/eventmessagerequest-unsubscribe.md)             |                                                          |                                                                     |

## Properties

| Property                   | Type                                                                      | Description |
| :------------------------- | :------------------------------------------------------------------------ | :---------- |
| allowNewTimeProposals      | Boolean                                                                   |             |
| bccRecipients              | [recipient](../resources/recipient.md) collection                         |             |
| body                       | [itemBody](../resources/itembody.md)                                      |             |
| bodyPreview                | String                                                                    |             |
| categories                 | String collection                                                         |             |
| ccRecipients               | [recipient](../resources/recipient.md) collection                         |             |
| changeKey                  | String                                                                    |             |
| conversationId             | String                                                                    |             |
| conversationIndex          | Binary                                                                    |             |
| createdDateTime            | DateTimeOffset                                                            |             |
| endDateTime                | [dateTimeTimeZone](../resources/datetimetimezone.md)                      |             |
| flag                       | [followupFlag](../resources/followupflag.md)                              |             |
| from                       | [recipient](../resources/recipient.md)                                    |             |
| hasAttachments             | Boolean                                                                   |             |
| id                         | String                                                                    | Read-only.  |
| importance                 | String                                                                    |             |
| inferenceClassification    | String                                                                    |             |
| internetMessageHeaders     | [internetMessageHeader](../resources/internetmessageheader.md) collection |             |
| internetMessageId          | String                                                                    |             |
| isAllDay                   | Boolean                                                                   |             |
| isDelegated                | Boolean                                                                   |             |
| isDeliveryReceiptRequested | Boolean                                                                   |             |
| isDraft                    | Boolean                                                                   |             |
| isOutOfDate                | Boolean                                                                   |             |
| isRead                     | Boolean                                                                   |             |
| isReadReceiptRequested     | Boolean                                                                   |             |
| lastModifiedDateTime       | DateTimeOffset                                                            |             |
| location                   | [location](../resources/location.md)                                      |             |
| meetingMessageType         | String                                                                    |             |
| mentionsPreview            | [mentionsPreview](../resources/mentionspreview.md)                        |             |
| parentFolderId             | String                                                                    |             |
| previousEndDateTime        | [dateTimeTimeZone](../resources/datetimetimezone.md)                      |             |
| previousLocation           | [location](../resources/location.md)                                      |             |
| previousStartDateTime      | [dateTimeTimeZone](../resources/datetimetimezone.md)                      |             |
| receivedDateTime           | DateTimeOffset                                                            |             |
| recurrence                 | [patternedRecurrence](../resources/patternedrecurrence.md)                |             |
| replyTo                    | [recipient](../resources/recipient.md) collection                         |             |
| responseRequested          | Boolean                                                                   |             |
| sender                     | [recipient](../resources/recipient.md)                                    |             |
| sentDateTime               | DateTimeOffset                                                            |             |
| startDateTime              | [dateTimeTimeZone](../resources/datetimetimezone.md)                      |             |
| subject                    | String                                                                    |             |
| toRecipients               | [recipient](../resources/recipient.md) collection                         |             |
| type                       | String                                                                    |             |
| uniqueBody                 | [itemBody](../resources/itembody.md)                                      |             |
| unsubscribeData            | String collection                                                         |             |
| unsubscribeEnabled         | Boolean                                                                   |             |
| webLink                    | String                                                                    |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.eventMessageRequest",
  "baseType": "microsoft.graph.eventMessage",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.eventMessageRequest",
  "allowNewTimeProposals": "Boolean",
  "bccRecipients": [{"@odata.type": "microsoft.graph.recipient"}],
  "body": {"@odata.type": "microsoft.graph.itemBody"},
  "bodyPreview": "String",
  "categories": ["String"],
  "ccRecipients": [{"@odata.type": "microsoft.graph.recipient"}],
  "changeKey": "String",
  "conversationId": "String",
  "conversationIndex": "Binary",
  "createdDateTime": "DateTimeOffset",
  "endDateTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "flag": {"@odata.type": "microsoft.graph.followupFlag"},
  "from": {"@odata.type": "microsoft.graph.recipient"},
  "hasAttachments": "Boolean",
  "id": "String (identifier)",
  "importance": "low | normal | high",
  "inferenceClassification": "focused | other",
  "internetMessageHeaders": [{"@odata.type": "microsoft.graph.internetMessageHeader"}],
  "internetMessageId": "String",
  "isAllDay": "Boolean",
  "isDelegated": "Boolean",
  "isDeliveryReceiptRequested": "Boolean",
  "isDraft": "Boolean",
  "isOutOfDate": "Boolean",
  "isRead": "Boolean",
  "isReadReceiptRequested": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "location": {"@odata.type": "microsoft.graph.location"},
  "meetingMessageType": "none | meetingRequest | meetingCancelled | meetingAccepted | meetingTentativelyAccepted | meetingDeclined",
  "mentionsPreview": {"@odata.type": "microsoft.graph.mentionsPreview"},
  "parentFolderId": "String",
  "previousEndDateTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "previousLocation": {"@odata.type": "microsoft.graph.location"},
  "previousStartDateTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "receivedDateTime": "DateTimeOffset",
  "recurrence": {"@odata.type": "microsoft.graph.patternedRecurrence"},
  "replyTo": [{"@odata.type": "microsoft.graph.recipient"}],
  "responseRequested": "Boolean",
  "sender": {"@odata.type": "microsoft.graph.recipient"},
  "sentDateTime": "DateTimeOffset",
  "startDateTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "subject": "String",
  "toRecipients": [{"@odata.type": "microsoft.graph.recipient"}],
  "type": "singleInstance | occurrence | exception | seriesMaster",
  "uniqueBody": {"@odata.type": "microsoft.graph.itemBody"},
  "unsubscribeData": ["String"],
  "unsubscribeEnabled": "Boolean",
  "webLink": "String"
}
```
