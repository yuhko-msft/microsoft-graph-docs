---
title: "eventMessageResponse resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# eventMessageResponse resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [eventMessage](../resources/eventmessage.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List eventMessageResponses](../api/eventmessageresponse-list.md)|[eventMessageResponse](../resources/eventmessageresponse.md) collection|Get a list of the [eventMessageResponse](../resources/eventmessageresponse.md) objects and their properties.|
|[Create eventMessageResponse](../api/eventmessageresponse-create.md)|[eventMessageResponse](../resources/eventmessageresponse.md)|Create a new [eventMessageResponse](../resources/eventmessageresponse.md) object.|
|[Get eventMessageResponse](../api/eventmessageresponse-get.md)|[eventMessageResponse](../resources/eventmessageresponse.md)|Read the properties and relationships of an [eventMessageResponse](../resources/eventmessageresponse.md) object.|
|[Update eventMessageResponse](../api/eventmessageresponse-update.md)|[eventMessageResponse](../resources/eventmessageresponse.md)|Update the properties of an [eventMessageResponse](../resources/eventmessageresponse.md) object.|
|[Delete eventMessageResponse](../api/eventmessageresponse-delete.md)|None|Deletes an [eventMessageResponse](../resources/eventmessageresponse.md) object.|
|[List attachments](../api/eventmessageresponse-list-attachments.md)|[attachment](../resources/attachment.md) collection|Get the attachment resources from the attachments navigation property.|
|[Create attachment](../api/eventmessageresponse-post-attachments.md)|[attachment](../resources/attachment.md)|Create a new attachment object.|
|[List event](../api/eventmessageresponse-list-event.md)|[event](../resources/event.md) collection|Get the event resources from the event navigation property.|
|[Create event](../api/eventmessageresponse-post-event.md)|[event](../resources/event.md)|Create a new event object.|
|[List extensions](../api/eventmessageresponse-list-extensions.md)|[extension](../resources/extension.md) collection|Get the extension resources from the extensions navigation property.|
|[Create extension](../api/eventmessageresponse-post-extensions.md)|[extension](../resources/extension.md)|Create a new extension object.|
|[List mentions](../api/eventmessageresponse-list-mentions.md)|[mention](../resources/mention.md) collection|Get the mention resources from the mentions navigation property.|
|[Create mention](../api/eventmessageresponse-post-mentions.md)|[mention](../resources/mention.md)|Create a new mention object.|
|[List multiValueExtendedProperties](../api/eventmessageresponse-list-multivalueextendedproperties.md)|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|Get the multiValueLegacyExtendedProperty resources from the multiValueExtendedProperties navigation property.|
|[Create multiValueLegacyExtendedProperty](../api/eventmessageresponse-post-multivalueextendedproperties.md)|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md)|Create a new multiValueLegacyExtendedProperty object.|
|[List singleValueExtendedProperties](../api/eventmessageresponse-list-singlevalueextendedproperties.md)|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|Get the singleValueLegacyExtendedProperty resources from the singleValueExtendedProperties navigation property.|
|[Create singleValueLegacyExtendedProperty](../api/eventmessageresponse-post-singlevalueextendedproperties.md)|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md)|Create a new singleValueLegacyExtendedProperty object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|bccRecipients|[recipient](../resources/recipient.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|body|[itemBody](../resources/itembody.md)|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|bodyPreview|String|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|categories|String collection|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md).|
|ccRecipients|[recipient](../resources/recipient.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|changeKey|String|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md).|
|conversationId|String|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|conversationIndex|Binary|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md).|
|endDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md).|
|flag|[followupFlag](../resources/followupflag.md)|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|from|[recipient](../resources/recipient.md)|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|hasAttachments|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|importance|importance|**TODO: Add Description** Inherited from [message](../resources/message.md). Possible values are: `low`, `normal`, `high`.|
|inferenceClassification|inferenceClassificationType|**TODO: Add Description** Inherited from [message](../resources/message.md). Possible values are: `focused`, `other`.|
|internetMessageHeaders|[internetMessageHeader](../resources/internetmessageheader.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|internetMessageId|String|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|isAllDay|Boolean|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md).|
|isDelegated|Boolean|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md).|
|isDeliveryReceiptRequested|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|isDraft|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|isOutOfDate|Boolean|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md).|
|isRead|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|isReadReceiptRequested|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md).|
|location|[location](../resources/location.md)|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md).|
|meetingMessageType|meetingMessageType|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md). Possible values are: `none`, `meetingRequest`, `meetingCancelled`, `meetingAccepted`, `meetingTentativelyAccepted`, `meetingDeclined`.|
|mentionsPreview|[mentionsPreview](../resources/mentionspreview.md)|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|parentFolderId|String|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|proposedNewTime|[timeSlot](../resources/timeslot.md)|**TODO: Add Description**|
|receivedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|recurrence|[patternedRecurrence](../resources/patternedrecurrence.md)|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md).|
|replyTo|[recipient](../resources/recipient.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|responseType|responseType|**TODO: Add Description**. Possible values are: `none`, `organizer`, `tentativelyAccepted`, `accepted`, `declined`, `notResponded`.|
|sender|[recipient](../resources/recipient.md)|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|sentDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|startDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md).|
|subject|String|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|toRecipients|[recipient](../resources/recipient.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|type|eventType|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md). Possible values are: `singleInstance`, `occurrence`, `exception`, `seriesMaster`.|
|uniqueBody|[itemBody](../resources/itembody.md)|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|unsubscribeData|String collection|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|unsubscribeEnabled|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|webLink|String|**TODO: Add Description** Inherited from [message](../resources/message.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|attachments|[attachment](../resources/attachment.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|event|[event](../resources/event.md)|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md)|
|extensions|[extension](../resources/extension.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|mentions|[mention](../resources/mention.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|multiValueExtendedProperties|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|singleValueExtendedProperties|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.eventMessageResponse",
  "baseType": "microsoft.graph.eventMessage",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.eventMessageResponse",
  "id": "String (identifier)",
  "categories": [
    "String"
  ],
  "changeKey": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "bccRecipients": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "body": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "bodyPreview": "String",
  "ccRecipients": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "conversationId": "String",
  "conversationIndex": "Binary",
  "flag": {
    "@odata.type": "microsoft.graph.followupFlag"
  },
  "from": {
    "@odata.type": "microsoft.graph.recipient"
  },
  "hasAttachments": "Boolean",
  "importance": "String",
  "inferenceClassification": "String",
  "internetMessageHeaders": [
    {
      "@odata.type": "microsoft.graph.internetMessageHeader"
    }
  ],
  "internetMessageId": "String",
  "isDeliveryReceiptRequested": "Boolean",
  "isDraft": "Boolean",
  "isRead": "Boolean",
  "isReadReceiptRequested": "Boolean",
  "mentionsPreview": {
    "@odata.type": "microsoft.graph.mentionsPreview"
  },
  "parentFolderId": "String",
  "receivedDateTime": "String (timestamp)",
  "replyTo": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "sender": {
    "@odata.type": "microsoft.graph.recipient"
  },
  "sentDateTime": "String (timestamp)",
  "subject": "String",
  "toRecipients": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "uniqueBody": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "unsubscribeData": [
    "String"
  ],
  "unsubscribeEnabled": "Boolean",
  "webLink": "String",
  "endDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "isAllDay": "Boolean",
  "isDelegated": "Boolean",
  "isOutOfDate": "Boolean",
  "location": {
    "@odata.type": "microsoft.graph.location"
  },
  "meetingMessageType": "String",
  "recurrence": {
    "@odata.type": "microsoft.graph.patternedRecurrence"
  },
  "startDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "type": "String",
  "proposedNewTime": {
    "@odata.type": "microsoft.graph.timeSlot"
  },
  "responseType": "String"
}
```

