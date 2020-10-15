---
title: "eventMessage resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# eventMessage resource type

Namespace: microsoft.graph

Inherits from [message](message.md)

## Methods

| Method                                                  | Return Type                                | Description                                                  |
| :------------------------------------------------------ | :----------------------------------------- | :----------------------------------------------------------- |
| [List eventMessage](../api/eventmessage-list.md)        | [eventMessage](eventMessage.md) collection | List properties and relationships of an eventMessage object. |
| [Create eventMessage](../api/eventmessage-create.md)    | [eventMessage](eventMessage.md)            | Create a new eventMessage object.                            |
| [Get eventMessage](../api/eventmessage-get.md)          | [eventMessage](eventMessage.md)            | Read properties and relationships of an eventMessage object. |
| [Update eventMessage](../api/eventmessage-update.md)    | [eventMessage](eventMessage.md)            | Update the properties of an eventMessage object.             |
| [Delete eventMessage](../api/eventmessage-delete.md)    |                                            | Delete an eventMessage object.                               |
| [copy](../api/eventmessage-copy.md)                     | [message](../resources/-message.md)        |                                                              |
| [createForward](../api/eventmessage-createForward.md)   | [message](../resources/-message.md)        |                                                              |
| [createReply](../api/eventmessage-createReply.md)       | [message](../resources/-message.md)        |                                                              |
| [createReplyAll](../api/eventmessage-createReplyAll.md) | [message](../resources/-message.md)        |                                                              |
| [forward](../api/eventmessage-forward.md)               |                                            |                                                              |
| [move](../api/eventmessage-move.md)                     | [message](../resources/-message.md)        |                                                              |
| [reply](../api/eventmessage-reply.md)                   |                                            |                                                              |
| [replyAll](../api/eventmessage-replyAll.md)             |                                            |                                                              |
| [send](../api/eventmessage-send.md)                     |                                            |                                                              |
| [List event](../api/eventmessage-list-event.md)         | [event](../resources/-event.md)            | Get the event objects from an event navigation property.     |
| [Create event](../api/eventmessage-post-event.md)       | [event](../resources/-event.md)            | Create a new event object.                                   |
| [Get event](../api/eventmessage-get-event.md)           | [event](../resources/-event.md)            | Read the properties and relationships of an event object.    |
| [Update event](../api/eventmessage-update-event.md)     | [event](../resources/-event.md)            | Update the properties of an event object.                    |
| [Delete event](../api/eventmessage-delete-event.md)     |                                            | Delete an event object.                                      |

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
| receivedDateTime           | DateTimeOffset                                                            |             |
| recurrence                 | [patternedRecurrence](../resources/patternedrecurrence.md)                |             |
| replyTo                    | [recipient](../resources/recipient.md) collection                         |             |
| sender                     | [recipient](../resources/recipient.md)                                    |             |
| sentDateTime               | DateTimeOffset                                                            |             |
| startDateTime              | [dateTimeTimeZone](../resources/datetimetimezone.md)                      |             |
| subject                    | String                                                                    |             |
| toRecipients               | [recipient](../resources/recipient.md) collection                         |             |
| type                       | String                                                                    |             |
| uniqueBody                 | [itemBody](../resources/itembody.md)                                      |             |
| webLink                    | String                                                                    |             |

## Relationships

| Relationship                  | Type                                                                                              | Description |
| :---------------------------- | :------------------------------------------------------------------------------------------------ | :---------- |
| attachments                   | [attachment](../resources/attachment.md) collection                                               |             |
| event                         | [event](../resources/event.md)                                                                    |             |
| extensions                    | [extension](../resources/extension.md) collection                                                 |             |
| multiValueExtendedProperties  | [multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection   |             |
| singleValueExtendedProperties | [singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.eventMessage",
  "baseType": "microsoft.graph.message",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.eventMessage",
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
  "receivedDateTime": "DateTimeOffset",
  "recurrence": {"@odata.type": "microsoft.graph.patternedRecurrence"},
  "replyTo": [{"@odata.type": "microsoft.graph.recipient"}],
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
