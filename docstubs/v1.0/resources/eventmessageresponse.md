---
title: "eventMessageResponse resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# eventMessageResponse resource type

Namespace: microsoft.graph

Inherits from [eventMessage](eventmessage.md)

## Methods

| Method                                                               | Return Type                                                | Description                                                          |
| :------------------------------------------------------------------- | :--------------------------------------------------------- | :------------------------------------------------------------------- |
| [List eventMessageResponse](../api/eventmessageresponse-list.md)     | [eventMessageResponse](eventMessageResponse.md) collection | List properties and relationships of an eventMessageResponse object. |
| [Create eventMessageResponse](../api/eventmessageresponse-create.md) | [eventMessageResponse](eventMessageResponse.md)            | Create a new eventMessageResponse object.                            |
| [Get eventMessageResponse](../api/eventmessageresponse-get.md)       | [eventMessageResponse](eventMessageResponse.md)            | Read properties and relationships of an eventMessageResponse object. |
| [Update eventMessageResponse](../api/eventmessageresponse-update.md) | [eventMessageResponse](eventMessageResponse.md)            | Update the properties of an eventMessageResponse object.             |
| [Delete eventMessageResponse](../api/eventmessageresponse-delete.md) |                                                            | Delete an eventMessageResponse object.                               |
| [copy](../api/eventmessageresponse-copy.md)                          | [message](../resources/-message.md)                        |                                                                      |
| [createForward](../api/eventmessageresponse-createForward.md)        | [message](../resources/-message.md)                        |                                                                      |
| [createReply](../api/eventmessageresponse-createReply.md)            | [message](../resources/-message.md)                        |                                                                      |
| [createReplyAll](../api/eventmessageresponse-createReplyAll.md)      | [message](../resources/-message.md)                        |                                                                      |
| [forward](../api/eventmessageresponse-forward.md)                    |                                                            |                                                                      |
| [move](../api/eventmessageresponse-move.md)                          | [message](../resources/-message.md)                        |                                                                      |
| [reply](../api/eventmessageresponse-reply.md)                        |                                                            |                                                                      |
| [replyAll](../api/eventmessageresponse-replyAll.md)                  |                                                            |                                                                      |
| [send](../api/eventmessageresponse-send.md)                          |                                                            |                                                                      |

## Properties

| Property                   | Type                                                                      | Description |
| :------------------------- | :------------------------------------------------------------------------ | :---------- |
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
| parentFolderId             | String                                                                    |             |
| proposedNewTime            | [timeSlot](../resources/timeslot.md)                                      |             |
| receivedDateTime           | DateTimeOffset                                                            |             |
| recurrence                 | [patternedRecurrence](../resources/patternedrecurrence.md)                |             |
| replyTo                    | [recipient](../resources/recipient.md) collection                         |             |
| responseType               | String                                                                    |             |
| sender                     | [recipient](../resources/recipient.md)                                    |             |
| sentDateTime               | DateTimeOffset                                                            |             |
| startDateTime              | [dateTimeTimeZone](../resources/datetimetimezone.md)                      |             |
| subject                    | String                                                                    |             |
| toRecipients               | [recipient](../resources/recipient.md) collection                         |             |
| type                       | String                                                                    |             |
| uniqueBody                 | [itemBody](../resources/itembody.md)                                      |             |
| webLink                    | String                                                                    |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.eventMessageResponse",
  "baseType": "microsoft.graph.eventMessage",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.eventMessageResponse",
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
  "meetingMessageType": "none | meetingRequest | meetingCancelled | meetingAccepted | meetingTenativelyAccepted | meetingDeclined",
  "parentFolderId": "String",
  "proposedNewTime": {"@odata.type": "microsoft.graph.timeSlot"},
  "receivedDateTime": "DateTimeOffset",
  "recurrence": {"@odata.type": "microsoft.graph.patternedRecurrence"},
  "replyTo": [{"@odata.type": "microsoft.graph.recipient"}],
  "responseType": "none | organizer | tentativelyAccepted | accepted | declined | notResponded",
  "sender": {"@odata.type": "microsoft.graph.recipient"},
  "sentDateTime": "DateTimeOffset",
  "startDateTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "subject": "String",
  "toRecipients": [{"@odata.type": "microsoft.graph.recipient"}],
  "type": "singleInstance | occurrence | exception | seriesMaster",
  "uniqueBody": {"@odata.type": "microsoft.graph.itemBody"},
  "webLink": "String"
}
```
