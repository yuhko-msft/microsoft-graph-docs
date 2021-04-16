---
title: "dimensionValue resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# dimensionValue resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List dimensionValues](../api/dimensionvalue-list.md)|[dimensionValue](../resources/dimensionvalue.md) collection|Get a list of the [dimensionValue](../resources/dimensionvalue.md) objects and their properties.|
|[Create dimensionValue](../api/dimensionvalue-create.md)|[dimensionValue](../resources/dimensionvalue.md)|Create a new [dimensionValue](../resources/dimensionvalue.md) object.|
|[Get dimensionValue](../api/dimensionvalue-get.md)|[dimensionValue](../resources/dimensionvalue.md)|Read the properties and relationships of a [dimensionValue](../resources/dimensionvalue.md) object.|
|[Update dimensionValue](../api/dimensionvalue-update.md)|[dimensionValue](../resources/dimensionvalue.md)|Update the properties of a [dimensionValue](../resources/dimensionvalue.md) object.|
|[Delete dimensionValue](../api/dimensionvalue-delete.md)|None|Deletes a [dimensionValue](../resources/dimensionvalue.md) object.|

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
  "@odata.type": "microsoft.graph.dimensionValue",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.dimensionValue",
  "id": "String (identifier)",
  "code": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

