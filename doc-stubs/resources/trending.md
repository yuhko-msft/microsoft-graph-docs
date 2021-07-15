---
title: "trending resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# trending resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List trendings](../api/trending-list.md)|[trending](../resources/trending.md) collection|Get a list of the [trending](../resources/trending.md) objects and their properties.|
|[Create trending](../api/trending-create.md)|[trending](../resources/trending.md)|Create a new [trending](../resources/trending.md) object.|
|[Get trending](../api/trending-get.md)|[trending](../resources/trending.md)|Read the properties and relationships of a [trending](../resources/trending.md) object.|
|[Update trending](../api/trending-update.md)|[trending](../resources/trending.md)|Update the properties of a [trending](../resources/trending.md) object.|
|[Delete trending](../api/trending-delete.md)|None|Deletes a [trending](../resources/trending.md) object.|
|[List entity](../api/trending-list-resource.md)|[entity](../resources/entity.md) collection|Get the entity resources from the resource navigation property.|
|[Add entity](../api/trending-post-resource.md)|[entity](../resources/entity.md)|Add resource by posting to the resource collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|resourceReference|[resourceReference](../resources/resourcereference.md)|**TODO: Add Description**|
|resourceVisualization|[resourceVisualization](../resources/resourcevisualization.md)|**TODO: Add Description**|
|weight|Double|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|resource|[entity](../resources/entity.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.trending",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.trending",
  "id": "String (identifier)",
  "lastModifiedDateTime": "String (timestamp)",
  "resourceReference": {
    "@odata.type": "microsoft.graph.resourceReference"
  },
  "resourceVisualization": {
    "@odata.type": "microsoft.graph.resourceVisualization"
  },
  "weight": "Double"
}
```

