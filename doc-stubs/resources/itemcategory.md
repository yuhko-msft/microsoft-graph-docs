---
title: "itemCategory resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# itemCategory resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List itemCategories](../api/itemcategory-list.md)|[itemCategory](../resources/itemcategory.md) collection|Get a list of the [itemCategory](../resources/itemcategory.md) objects and their properties.|
|[Create itemCategory](../api/itemcategory-create.md)|[itemCategory](../resources/itemcategory.md)|Create a new [itemCategory](../resources/itemcategory.md) object.|
|[Get itemCategory](../api/itemcategory-get.md)|[itemCategory](../resources/itemcategory.md)|Read the properties and relationships of an [itemCategory](../resources/itemcategory.md) object.|
|[Update itemCategory](../api/itemcategory-update.md)|[itemCategory](../resources/itemcategory.md)|Update the properties of an [itemCategory](../resources/itemcategory.md) object.|
|[Delete itemCategory](../api/itemcategory-delete.md)|None|Deletes an [itemCategory](../resources/itemcategory.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|code|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.itemCategory",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.itemCategory",
  "id": "String (identifier)",
  "code": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

