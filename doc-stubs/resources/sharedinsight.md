---
title: "sharedInsight resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sharedInsight resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sharedInsights](../api/sharedinsight-list.md)|[sharedInsight](../resources/sharedinsight.md) collection|Get a list of the [sharedInsight](../resources/sharedinsight.md) objects and their properties.|
|[Create sharedInsight](../api/sharedinsight-create.md)|[sharedInsight](../resources/sharedinsight.md)|Create a new [sharedInsight](../resources/sharedinsight.md) object.|
|[Get sharedInsight](../api/sharedinsight-get.md)|[sharedInsight](../resources/sharedinsight.md)|Read the properties and relationships of a [sharedInsight](../resources/sharedinsight.md) object.|
|[Update sharedInsight](../api/sharedinsight-update.md)|[sharedInsight](../resources/sharedinsight.md)|Update the properties of a [sharedInsight](../resources/sharedinsight.md) object.|
|[Delete sharedInsight](../api/sharedinsight-delete.md)|None|Deletes a [sharedInsight](../resources/sharedinsight.md) object.|
|[List entity](../api/sharedinsight-list-lastsharedmethod.md)|[entity](../resources/entity.md) collection|Get the entity resources from the lastSharedMethod navigation property.|
|[Add entity](../api/sharedinsight-post-lastsharedmethod.md)|[entity](../resources/entity.md)|Add lastSharedMethod by posting to the lastSharedMethod collection.|
|[List entity](../api/sharedinsight-list-resource.md)|[entity](../resources/entity.md) collection|Get the entity resources from the resource navigation property.|
|[Add entity](../api/sharedinsight-post-resource.md)|[entity](../resources/entity.md)|Add resource by posting to the resource collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastShared|[sharingDetail](../resources/sharingdetail.md)|**TODO: Add Description**|
|resourceReference|[resourceReference](../resources/resourcereference.md)|**TODO: Add Description**|
|resourceVisualization|[resourceVisualization](../resources/resourcevisualization.md)|**TODO: Add Description**|
|sharingHistory|[sharingDetail](../resources/sharingdetail.md) collection|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|lastSharedMethod|[entity](../resources/entity.md)|**TODO: Add Description**|
|resource|[entity](../resources/entity.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sharedInsight",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sharedInsight",
  "id": "String (identifier)",
  "lastShared": {
    "@odata.type": "microsoft.graph.sharingDetail"
  },
  "resourceReference": {
    "@odata.type": "microsoft.graph.resourceReference"
  },
  "resourceVisualization": {
    "@odata.type": "microsoft.graph.resourceVisualization"
  },
  "sharingHistory": [
    {
      "@odata.type": "microsoft.graph.sharingDetail"
    }
  ]
}
```

