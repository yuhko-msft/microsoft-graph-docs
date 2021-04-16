---
title: "eventMessageRequest resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# eventMessageRequest resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [eventMessage](../resources/eventmessage.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List eventMessageRequests](../api/eventmessagerequest-list.md)|[eventMessageRequest](../resources/eventmessagerequest.md) collection|Get a list of the [eventMessageRequest](../resources/eventmessagerequest.md) objects and their properties.|
|[Create eventMessageRequest](../api/eventmessagerequest-create.md)|[eventMessageRequest](../resources/eventmessagerequest.md)|Create a new [eventMessageRequest](../resources/eventmessagerequest.md) object.|
|[Get eventMessageRequest](../api/eventmessagerequest-get.md)|[eventMessageRequest](../resources/eventmessagerequest.md)|Read the properties and relationships of an [eventMessageRequest](../resources/eventmessagerequest.md) object.|
|[Update eventMessageRequest](../api/eventmessagerequest-update.md)|[eventMessageRequest](../resources/eventmessagerequest.md)|Update the properties of an [eventMessageRequest](../resources/eventmessagerequest.md) object.|
|[Delete eventMessageRequest](../api/eventmessagerequest-delete.md)|None|Deletes an [eventMessageRequest](../resources/eventmessagerequest.md) object.|
|[accept](../api/eventmessagerequest-accept.md)|None|**TODO: Add Description**|
|[decline](../api/eventmessagerequest-decline.md)|None|**TODO: Add Description**|
|[tentativelyAccept](../api/eventmessagerequest-tentativelyaccept.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowNewTimeProposals|Boolean|**TODO: Add Description**|
|bccRecipients|[recipient](../resources/recipient.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|body|[itemBody](../resources/itembody.md)|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|bodyPreview|String|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|categories|String collection|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|ccRecipients|[recipient](../resources/recipient.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|changeKey|String|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|conversationId|String|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|conversationIndex|Binary|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|endDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md)|
|flag|[followupFlag](../resources/followupflag.md)|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|from|[recipient](../resources/recipient.md)|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|hasAttachments|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|importance|importance|**TODO: Add Description** Inherited from [message](../resources/message.md). Possible values are: `low`, `normal`, `high`.|
|inferenceClassification|inferenceClassificationType|**TODO: Add Description** Inherited from [message](../resources/message.md). Possible values are: `focused`, `other`.|
|internetMessageHeaders|[internetMessageHeader](../resources/internetmessageheader.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|internetMessageId|String|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|isAllDay|Boolean|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md)|
|isDelegated|Boolean|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md)|
|isDeliveryReceiptRequested|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|isDraft|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|isOutOfDate|Boolean|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md)|
|isRead|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|isReadReceiptRequested|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|location|[location](../resources/location.md)|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md)|
|meetingMessageType|meetingMessageType|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md). Possible values are: `none`, `meetingRequest`, `meetingCancelled`, `meetingAccepted`, `meetingTentativelyAccepted`, `meetingDeclined`.|
|mentionsPreview|[mentionsPreview](../resources/mentionspreview.md)|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|parentFolderId|String|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|previousEndDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|previousLocation|[location](../resources/location.md)|**TODO: Add Description**|
|previousStartDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|receivedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|recurrence|[patternedRecurrence](../resources/patternedrecurrence.md)|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md)|
|replyTo|[recipient](../resources/recipient.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|responseRequested|Boolean|**TODO: Add Description**|
|sender|[recipient](../resources/recipient.md)|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|sentDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|startDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md)|
|subject|String|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|toRecipients|[recipient](../resources/recipient.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|type|eventType|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md). Possible values are: `singleInstance`, `occurrence`, `exception`, `seriesMaster`.|
|uniqueBody|[itemBody](../resources/itembody.md)|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|unsubscribeData|String collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|unsubscribeEnabled|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|webLink|String|**TODO: Add Description** Inherited from [message](../resources/message.md)|

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
  "@odata.type": "microsoft.graph.eventMessageRequest",
  "baseType": "microsoft.graph.eventMessage",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.eventMessageRequest",
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
  "allowNewTimeProposals": "Boolean",
  "previousEndDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "previousLocation": {
    "@odata.type": "microsoft.graph.location"
  },
  "previousStartDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "responseRequested": "Boolean"
}
```

