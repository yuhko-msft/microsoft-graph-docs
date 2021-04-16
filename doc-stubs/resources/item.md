---
title: "item resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# item resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List items](../api/item-list.md)|[item](../resources/item.md) collection|Get a list of the [item](../resources/item.md) objects and their properties.|
|[Create item](../api/item-create.md)|[item](../resources/item.md)|Create a new [item](../resources/item.md) object.|
|[Get item](../api/item-get.md)|[item](../resources/item.md)|Read the properties and relationships of an [item](../resources/item.md) object.|
|[Update item](../api/item-update.md)|[item](../resources/item.md)|Update the properties of an [item](../resources/item.md) object.|
|[Delete item](../api/item-delete.md)|None|Deletes an [item](../resources/item.md) object.|
|[List itemCategory](../api/item-list-itemcategory.md)|[itemCategory](../resources/itemcategory.md) collection|Get the itemCategory resources from the itemCategory navigation property.|
|[Create itemCategory](../api/item-post-itemcategory.md)|[itemCategory](../resources/itemcategory.md)|Create a new itemCategory object.|
|[List picture](../api/item-list-picture.md)|[picture](../resources/picture.md) collection|Get the picture resources from the picture navigation property.|
|[Create picture](../api/item-post-picture.md)|[picture](../resources/picture.md)|Create a new picture object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|baseUnitOfMeasureId|Guid|**TODO: Add Description**|
|blocked|Boolean|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|gtin|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|inventory|Decimal|**TODO: Add Description**|
|itemCategoryCode|String|**TODO: Add Description**|
|itemCategoryId|Guid|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|number|String|**TODO: Add Description**|
|priceIncludesTax|Boolean|**TODO: Add Description**|
|taxGroupCode|String|**TODO: Add Description**|
|taxGroupId|Guid|**TODO: Add Description**|
|type|String|**TODO: Add Description**|
|unitCost|Decimal|**TODO: Add Description**|
|unitPrice|Decimal|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|itemCategory|[itemCategory](../resources/itemcategory.md)|**TODO: Add Description**|
|picture|[picture](../resources/picture.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.item",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.item",
  "id": "String (identifier)",
  "baseUnitOfMeasureId": "Guid",
  "blocked": "Boolean",
  "displayName": "String",
  "gtin": "String",
  "inventory": "Decimal",
  "itemCategoryCode": "String",
  "itemCategoryId": "Guid",
  "lastModifiedDateTime": "String (timestamp)",
  "number": "String",
  "priceIncludesTax": "Boolean",
  "taxGroupCode": "String",
  "taxGroupId": "Guid",
  "type": "String",
  "unitCost": "Decimal",
  "unitPrice": "Decimal"
}
```

