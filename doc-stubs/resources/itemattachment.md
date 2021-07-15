---
title: "itemAttachment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# itemAttachment resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [attachment](../resources/attachment.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List itemAttachments](../api/itemattachment-list.md)|[itemAttachment](../resources/itemattachment.md) collection|Get a list of the [itemAttachment](../resources/itemattachment.md) objects and their properties.|
|[Create itemAttachment](../api/itemattachment-create.md)|[itemAttachment](../resources/itemattachment.md)|Create a new [itemAttachment](../resources/itemattachment.md) object.|
|[Get itemAttachment](../api/itemattachment-get.md)|[itemAttachment](../resources/itemattachment.md)|Read the properties and relationships of an [itemAttachment](../resources/itemattachment.md) object.|
|[Update itemAttachment](../api/itemattachment-update.md)|[itemAttachment](../resources/itemattachment.md)|Update the properties of an [itemAttachment](../resources/itemattachment.md) object.|
|[Delete itemAttachment](../api/itemattachment-delete.md)|None|Deletes an [itemAttachment](../resources/itemattachment.md) object.|
|[List outlookItem](../api/itemattachment-list-item.md)|[outlookItem](../resources/outlookitem.md) collection|Get the outlookItem resources from the item navigation property.|
|[Create outlookItem](../api/itemattachment-post-item.md)|[outlookItem](../resources/outlookitem.md)|Create a new outlookItem object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|contentType|String|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|isInline|Boolean|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md).|
|name|String|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md).|
|size|Int32|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|item|[outlookItem](../resources/outlookitem.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.itemAttachment",
  "baseType": "microsoft.graph.attachment",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.itemAttachment",
  "id": "String (identifier)",
  "contentType": "String",
  "isInline": "Boolean",
  "lastModifiedDateTime": "String (timestamp)",
  "name": "String",
  "size": "Integer"
}
```

