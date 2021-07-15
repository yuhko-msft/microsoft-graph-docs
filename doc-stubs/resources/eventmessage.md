---
title: "eventMessage resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# eventMessage resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [message](../resources/message.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List eventMessages](../api/eventmessage-list.md)|[eventMessage](../resources/eventmessage.md) collection|Get a list of the [eventMessage](../resources/eventmessage.md) objects and their properties.|
|[Create eventMessage](../api/eventmessage-create.md)|[eventMessage](../resources/eventmessage.md)|Create a new [eventMessage](../resources/eventmessage.md) object.|
|[Get eventMessage](../api/eventmessage-get.md)|[eventMessage](../resources/eventmessage.md)|Read the properties and relationships of an [eventMessage](../resources/eventmessage.md) object.|
|[Update eventMessage](../api/eventmessage-update.md)|[eventMessage](../resources/eventmessage.md)|Update the properties of an [eventMessage](../resources/eventmessage.md) object.|
|[Delete eventMessage](../api/eventmessage-delete.md)|None|Deletes an [eventMessage](../resources/eventmessage.md) object.|
|[forward](../api/eventmessage-forward.md)|None|**TODO: Add Description**|
|[copy](../api/eventmessage-copy.md)|[message](../resources/message.md)|**TODO: Add Description**|
|[move](../api/eventmessage-move.md)|[message](../resources/message.md)|**TODO: Add Description**|
|[createForward](../api/eventmessage-createforward.md)|[message](../resources/message.md)|**TODO: Add Description**|
|[createReply](../api/eventmessage-createreply.md)|[message](../resources/message.md)|**TODO: Add Description**|
|[createReplyAll](../api/eventmessage-createreplyall.md)|[message](../resources/message.md)|**TODO: Add Description**|
|[reply](../api/eventmessage-reply.md)|None|**TODO: Add Description**|
|[replyAll](../api/eventmessage-replyall.md)|None|**TODO: Add Description**|
|[send](../api/eventmessage-send.md)|None|**TODO: Add Description**|
|[unsubscribe](../api/eventmessage-unsubscribe.md)|None|**TODO: Add Description**|
|[List attachments](../api/eventmessage-list-attachments.md)|[attachment](../resources/attachment.md) collection|Get the attachment resources from the attachments navigation property.|
|[Create attachment](../api/eventmessage-post-attachments.md)|[attachment](../resources/attachment.md)|Create a new attachment object.|
|[List event](../api/eventmessage-list-event.md)|[event](../resources/event.md) collection|Get the event resources from the event navigation property.|
|[Create event](../api/eventmessage-post-event.md)|[event](../resources/event.md)|Create a new event object.|
|[List extensions](../api/eventmessage-list-extensions.md)|[extension](../resources/extension.md) collection|Get the extension resources from the extensions navigation property.|
|[Create extension](../api/eventmessage-post-extensions.md)|[extension](../resources/extension.md)|Create a new extension object.|
|[List mentions](../api/eventmessage-list-mentions.md)|[mention](../resources/mention.md) collection|Get the mention resources from the mentions navigation property.|
|[Create mention](../api/eventmessage-post-mentions.md)|[mention](../resources/mention.md)|Create a new mention object.|
|[List multiValueExtendedProperties](../api/eventmessage-list-multivalueextendedproperties.md)|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|Get the multiValueLegacyExtendedProperty resources from the multiValueExtendedProperties navigation property.|
|[Create multiValueLegacyExtendedProperty](../api/eventmessage-post-multivalueextendedproperties.md)|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md)|Create a new multiValueLegacyExtendedProperty object.|
|[List singleValueExtendedProperties](../api/eventmessage-list-singlevalueextendedproperties.md)|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|Get the singleValueLegacyExtendedProperty resources from the singleValueExtendedProperties navigation property.|
|[Create singleValueLegacyExtendedProperty](../api/eventmessage-post-singlevalueextendedproperties.md)|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md)|Create a new singleValueLegacyExtendedProperty object.|

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
|endDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|flag|[followupFlag](../resources/followupflag.md)|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|from|[recipient](../resources/recipient.md)|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|hasAttachments|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|importance|importance|**TODO: Add Description** Inherited from [message](../resources/message.md). Possible values are: `low`, `normal`, `high`.|
|inferenceClassification|inferenceClassificationType|**TODO: Add Description** Inherited from [message](../resources/message.md). Possible values are: `focused`, `other`.|
|internetMessageHeaders|[internetMessageHeader](../resources/internetmessageheader.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|internetMessageId|String|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|isAllDay|Boolean|**TODO: Add Description**|
|isDelegated|Boolean|**TODO: Add Description**|
|isDeliveryReceiptRequested|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|isDraft|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|isOutOfDate|Boolean|**TODO: Add Description**|
|isRead|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|isReadReceiptRequested|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md).|
|location|[location](../resources/location.md)|**TODO: Add Description**|
|meetingMessageType|meetingMessageType|**TODO: Add Description**. Possible values are: `none`, `meetingRequest`, `meetingCancelled`, `meetingAccepted`, `meetingTentativelyAccepted`, `meetingDeclined`.|
|mentionsPreview|[mentionsPreview](../resources/mentionspreview.md)|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|parentFolderId|String|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|receivedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|recurrence|[patternedRecurrence](../resources/patternedrecurrence.md)|**TODO: Add Description**|
|replyTo|[recipient](../resources/recipient.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|sender|[recipient](../resources/recipient.md)|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|sentDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|startDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|subject|String|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|toRecipients|[recipient](../resources/recipient.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|type|eventType|**TODO: Add Description**. Possible values are: `singleInstance`, `occurrence`, `exception`, `seriesMaster`.|
|uniqueBody|[itemBody](../resources/itembody.md)|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|unsubscribeData|String collection|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|unsubscribeEnabled|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|webLink|String|**TODO: Add Description** Inherited from [message](../resources/message.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|attachments|[attachment](../resources/attachment.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|event|[event](../resources/event.md)|**TODO: Add Description**|
|extensions|[extension](../resources/extension.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|mentions|[mention](../resources/mention.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|multiValueExtendedProperties|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|singleValueExtendedProperties|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.eventMessage",
  "baseType": "microsoft.graph.message",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.eventMessage",
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
  "type": "String"
}
```

