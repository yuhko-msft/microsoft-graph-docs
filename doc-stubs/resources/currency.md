---
title: "currency resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# currency resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List currencies](../api/currency-list.md)|[currency](../resources/currency.md) collection|Get a list of the [currency](../resources/currency.md) objects and their properties.|
|[Create currency](../api/currency-create.md)|[currency](../resources/currency.md)|Create a new [currency](../resources/currency.md) object.|
|[Get currency](../api/currency-get.md)|[currency](../resources/currency.md)|Read the properties and relationships of a [currency](../resources/currency.md) object.|
|[Update currency](../api/currency-update.md)|[currency](../resources/currency.md)|Update the properties of a [currency](../resources/currency.md) object.|
|[Delete currency](../api/currency-delete.md)|None|Deletes a [currency](../resources/currency.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|amountDecimalPlaces|String|**TODO: Add Description**|
|amountRoundingPrecision|Decimal|**TODO: Add Description**|
|code|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|symbol|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.currency",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.currency",
  "id": "String (identifier)",
  "amountDecimalPlaces": "String",
  "amountRoundingPrecision": "Decimal",
  "code": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "symbol": "String"
}
```

