---
title: "dimension resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# dimension resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List dimensions](../api/dimension-list.md)|[dimension](../resources/dimension.md) collection|Get a list of the [dimension](../resources/dimension.md) objects and their properties.|
|[Create dimension](../api/dimension-create.md)|[dimension](../resources/dimension.md)|Create a new [dimension](../resources/dimension.md) object.|
|[Get dimension](../api/dimension-get.md)|[dimension](../resources/dimension.md)|Read the properties and relationships of a [dimension](../resources/dimension.md) object.|
|[Update dimension](../api/dimension-update.md)|[dimension](../resources/dimension.md)|Update the properties of a [dimension](../resources/dimension.md) object.|
|[Delete dimension](../api/dimension-delete.md)|None|Deletes a [dimension](../resources/dimension.md) object.|
|[List dimensionValues](../api/dimension-list-dimensionvalues.md)|[dimensionValue](../resources/dimensionvalue.md) collection|Get the dimensionValue resources from the dimensionValues navigation property.|
|[Create dimensionValue](../api/dimension-post-dimensionvalues.md)|[dimensionValue](../resources/dimensionvalue.md)|Create a new dimensionValue object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|code|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|dimensionValues|[dimensionValue](../resources/dimensionvalue.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.dimension",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.dimension",
  "id": "String (identifier)",
  "code": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

