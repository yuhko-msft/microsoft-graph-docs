---
title: "calendarSharingMessage resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# calendarSharingMessage resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [message](../resources/message.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List calendarSharingMessages](../api/calendarsharingmessage-list.md)|[calendarSharingMessage](../resources/calendarsharingmessage.md) collection|Get a list of the [calendarSharingMessage](../resources/calendarsharingmessage.md) objects and their properties.|
|[Create calendarSharingMessage](../api/calendarsharingmessage-create.md)|[calendarSharingMessage](../resources/calendarsharingmessage.md)|Create a new [calendarSharingMessage](../resources/calendarsharingmessage.md) object.|
|[Get calendarSharingMessage](../api/calendarsharingmessage-get.md)|[calendarSharingMessage](../resources/calendarsharingmessage.md)|Read the properties and relationships of a [calendarSharingMessage](../resources/calendarsharingmessage.md) object.|
|[Update calendarSharingMessage](../api/calendarsharingmessage-update.md)|[calendarSharingMessage](../resources/calendarsharingmessage.md)|Update the properties of a [calendarSharingMessage](../resources/calendarsharingmessage.md) object.|
|[Delete calendarSharingMessage](../api/calendarsharingmessage-delete.md)|None|Deletes a [calendarSharingMessage](../resources/calendarsharingmessage.md) object.|
|[accept](../api/calendarsharingmessage-accept.md)|[calendar](../resources/calendar.md)|**TODO: Add Description**|
|[forward](../api/calendarsharingmessage-forward.md)|None|**TODO: Add Description**|
|[copy](../api/calendarsharingmessage-copy.md)|[message](../resources/message.md)|**TODO: Add Description**|
|[move](../api/calendarsharingmessage-move.md)|[message](../resources/message.md)|**TODO: Add Description**|
|[createForward](../api/calendarsharingmessage-createforward.md)|[message](../resources/message.md)|**TODO: Add Description**|
|[createReply](../api/calendarsharingmessage-createreply.md)|[message](../resources/message.md)|**TODO: Add Description**|
|[createReplyAll](../api/calendarsharingmessage-createreplyall.md)|[message](../resources/message.md)|**TODO: Add Description**|
|[reply](../api/calendarsharingmessage-reply.md)|None|**TODO: Add Description**|
|[replyAll](../api/calendarsharingmessage-replyall.md)|None|**TODO: Add Description**|
|[send](../api/calendarsharingmessage-send.md)|None|**TODO: Add Description**|
|[unsubscribe](../api/calendarsharingmessage-unsubscribe.md)|None|**TODO: Add Description**|
|[List attachments](../api/calendarsharingmessage-list-attachments.md)|[attachment](../resources/attachment.md) collection|Get the attachment resources from the attachments navigation property.|
|[Create attachment](../api/calendarsharingmessage-post-attachments.md)|[attachment](../resources/attachment.md)|Create a new attachment object.|
|[List extensions](../api/calendarsharingmessage-list-extensions.md)|[extension](../resources/extension.md) collection|Get the extension resources from the extensions navigation property.|
|[Create extension](../api/calendarsharingmessage-post-extensions.md)|[extension](../resources/extension.md)|Create a new extension object.|
|[List mentions](../api/calendarsharingmessage-list-mentions.md)|[mention](../resources/mention.md) collection|Get the mention resources from the mentions navigation property.|
|[Create mention](../api/calendarsharingmessage-post-mentions.md)|[mention](../resources/mention.md)|Create a new mention object.|
|[List multiValueExtendedProperties](../api/calendarsharingmessage-list-multivalueextendedproperties.md)|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|Get the multiValueLegacyExtendedProperty resources from the multiValueExtendedProperties navigation property.|
|[Create multiValueLegacyExtendedProperty](../api/calendarsharingmessage-post-multivalueextendedproperties.md)|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md)|Create a new multiValueLegacyExtendedProperty object.|
|[List singleValueExtendedProperties](../api/calendarsharingmessage-list-singlevalueextendedproperties.md)|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|Get the singleValueLegacyExtendedProperty resources from the singleValueExtendedProperties navigation property.|
|[Create singleValueLegacyExtendedProperty](../api/calendarsharingmessage-post-singlevalueextendedproperties.md)|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md)|Create a new singleValueLegacyExtendedProperty object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|bccRecipients|[recipient](../resources/recipient.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|body|[itemBody](../resources/itembody.md)|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|bodyPreview|String|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|canAccept|Boolean|**TODO: Add Description**|
|categories|String collection|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md).|
|ccRecipients|[recipient](../resources/recipient.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|changeKey|String|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md).|
|conversationId|String|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|conversationIndex|Binary|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md).|
|flag|[followupFlag](../resources/followupflag.md)|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|from|[recipient](../resources/recipient.md)|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|hasAttachments|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|importance|importance|**TODO: Add Description** Inherited from [message](../resources/message.md). Possible values are: `low`, `normal`, `high`.|
|inferenceClassification|inferenceClassificationType|**TODO: Add Description** Inherited from [message](../resources/message.md). Possible values are: `focused`, `other`.|
|internetMessageHeaders|[internetMessageHeader](../resources/internetmessageheader.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|internetMessageId|String|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|isDeliveryReceiptRequested|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|isDraft|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|isRead|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|isReadReceiptRequested|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md).|
|mentionsPreview|[mentionsPreview](../resources/mentionspreview.md)|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|parentFolderId|String|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|receivedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|replyTo|[recipient](../resources/recipient.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|sender|[recipient](../resources/recipient.md)|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|sentDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|sharingMessageAction|[calendarSharingMessageAction](../resources/calendarsharingmessageaction.md)|**TODO: Add Description**|
|sharingMessageActions|[calendarSharingMessageAction](../resources/calendarsharingmessageaction.md) collection|**TODO: Add Description**|
|subject|String|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|suggestedCalendarName|String|**TODO: Add Description**|
|toRecipients|[recipient](../resources/recipient.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|uniqueBody|[itemBody](../resources/itembody.md)|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|unsubscribeData|String collection|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|unsubscribeEnabled|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md).|
|webLink|String|**TODO: Add Description** Inherited from [message](../resources/message.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|attachments|[attachment](../resources/attachment.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|extensions|[extension](../resources/extension.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|mentions|[mention](../resources/mention.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|multiValueExtendedProperties|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|singleValueExtendedProperties|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.calendarSharingMessage",
  "baseType": "microsoft.graph.message",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.calendarSharingMessage",
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
  "canAccept": "Boolean",
  "sharingMessageAction": {
    "@odata.type": "microsoft.graph.calendarSharingMessageAction"
  },
  "sharingMessageActions": [
    {
      "@odata.type": "microsoft.graph.calendarSharingMessageAction"
    }
  ],
  "suggestedCalendarName": "String"
}
```

