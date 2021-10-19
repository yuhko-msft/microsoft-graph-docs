---
title: "serviceAnnouncementAttachment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# serviceAnnouncementAttachment resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [attachment](../resources/attachment.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List serviceAnnouncementAttachments](../api/serviceannouncementattachment-list.md)|[serviceAnnouncementAttachment](../resources/serviceannouncementattachment.md) collection|Get a list of the [serviceAnnouncementAttachment](../resources/serviceannouncementattachment.md) objects and their properties.|
|[Create serviceAnnouncementAttachment](../api/serviceupdatemessage-post-attachments.md)|[serviceAnnouncementAttachment](../resources/serviceannouncementattachment.md)|Create a new [serviceAnnouncementAttachment](../resources/serviceannouncementattachment.md) object.|
|[Get serviceAnnouncementAttachment](../api/serviceannouncementattachment-get.md)|[serviceAnnouncementAttachment](../resources/serviceannouncementattachment.md)|Read the properties and relationships of a [serviceAnnouncementAttachment](../resources/serviceannouncementattachment.md) object.|
|[Update serviceAnnouncementAttachment](../api/serviceannouncementattachment-update.md)|[serviceAnnouncementAttachment](../resources/serviceannouncementattachment.md)|Update the properties of a [serviceAnnouncementAttachment](../resources/serviceannouncementattachment.md) object.|
|[Delete serviceAnnouncementAttachment](../api/serviceannouncementattachment-delete.md)|None|Deletes a [serviceAnnouncementAttachment](../resources/serviceannouncementattachment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|content|Stream|**TODO: Add Description**|
|contentType|String|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|isInline|Boolean|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md).|
|name|String|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md).|
|size|Int32|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.serviceAnnouncementAttachment",
  "baseType": "microsoft.graph.attachment",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.serviceAnnouncementAttachment",
  "id": "String (identifier)",
  "lastModifiedDateTime": "String (timestamp)",
  "name": "String",
  "contentType": "String",
  "size": "Integer",
  "isInline": "Boolean",
  "content": "Stream"
}
```

