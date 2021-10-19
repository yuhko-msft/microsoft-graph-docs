---
title: "serviceUpdateMessage resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# serviceUpdateMessage resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [serviceAnnouncementBase](../resources/serviceannouncementbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List serviceUpdateMessages](../api/serviceupdatemessage-list.md)|[serviceUpdateMessage](../resources/serviceupdatemessage.md) collection|Get a list of the [serviceUpdateMessage](../resources/serviceupdatemessage.md) objects and their properties.|
|[Create serviceUpdateMessage](../api/serviceannouncement-post-messages.md)|[serviceUpdateMessage](../resources/serviceupdatemessage.md)|Create a new [serviceUpdateMessage](../resources/serviceupdatemessage.md) object.|
|[Get serviceUpdateMessage](../api/serviceupdatemessage-get.md)|[serviceUpdateMessage](../resources/serviceupdatemessage.md)|Read the properties and relationships of a [serviceUpdateMessage](../resources/serviceupdatemessage.md) object.|
|[Update serviceUpdateMessage](../api/serviceupdatemessage-update.md)|[serviceUpdateMessage](../resources/serviceupdatemessage.md)|Update the properties of a [serviceUpdateMessage](../resources/serviceupdatemessage.md) object.|
|[Delete serviceUpdateMessage](../api/serviceupdatemessage-delete.md)|None|Deletes a [serviceUpdateMessage](../resources/serviceupdatemessage.md) object.|
|[List attachments](../api/serviceupdatemessage-list-attachments.md)|[serviceAnnouncementAttachment](../resources/serviceannouncementattachment.md) collection|Get the serviceAnnouncementAttachment resources from the attachments navigation property.|
|[Create serviceAnnouncementAttachment](../api/serviceupdatemessage-post-attachments.md)|[serviceAnnouncementAttachment](../resources/serviceannouncementattachment.md)|Create a new serviceAnnouncementAttachment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|actionRequiredByDateTime|DateTimeOffset|**TODO: Add Description**|
|attachmentsArchive|Stream|**TODO: Add Description**|
|body|[itemBody](../resources/itembody.md)|**TODO: Add Description**|
|category|serviceUpdateCategory|**TODO: Add Description**. The possible values are: `preventOrFixIssue`, `planForChange`, `stayInformed`, `unknownFutureValue`.|
|details|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description** Inherited from [serviceAnnouncementBase](../resources/serviceannouncementbase.md).|
|endDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [serviceAnnouncementBase](../resources/serviceannouncementbase.md).|
|hasAttachments|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|isMajorChange|Boolean|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [serviceAnnouncementBase](../resources/serviceannouncementbase.md).|
|services|String collection|**TODO: Add Description**|
|severity|serviceUpdateSeverity|**TODO: Add Description**. The possible values are: `normal`, `high`, `critical`, `unknownFutureValue`.|
|startDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [serviceAnnouncementBase](../resources/serviceannouncementbase.md).|
|tags|String collection|**TODO: Add Description**|
|title|String|**TODO: Add Description** Inherited from [serviceAnnouncementBase](../resources/serviceannouncementbase.md).|
|viewPoint|[serviceUpdateMessageViewpoint](../resources/serviceupdatemessageviewpoint.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|attachments|[serviceAnnouncementAttachment](../resources/serviceannouncementattachment.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.serviceUpdateMessage",
  "baseType": "microsoft.graph.serviceAnnouncementBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.serviceUpdateMessage",
  "id": "String (identifier)",
  "startDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "title": "String",
  "details": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "body": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "category": "String",
  "severity": "String",
  "tags": [
    "String"
  ],
  "isMajorChange": "Boolean",
  "actionRequiredByDateTime": "String (timestamp)",
  "services": [
    "String"
  ],
  "viewPoint": {
    "@odata.type": "microsoft.graph.serviceUpdateMessageViewpoint"
  },
  "hasAttachments": "Boolean",
  "attachmentsArchive": "Stream"
}
```

