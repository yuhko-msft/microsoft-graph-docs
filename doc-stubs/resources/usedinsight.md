---
title: "usedInsight resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# usedInsight resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List usedInsights](../api/usedinsight-list.md)|[usedInsight](../resources/usedinsight.md) collection|Get a list of the [usedInsight](../resources/usedinsight.md) objects and their properties.|
|[Create usedInsight](../api/usedinsight-create.md)|[usedInsight](../resources/usedinsight.md)|Create a new [usedInsight](../resources/usedinsight.md) object.|
|[Get usedInsight](../api/usedinsight-get.md)|[usedInsight](../resources/usedinsight.md)|Read the properties and relationships of an [usedInsight](../resources/usedinsight.md) object.|
|[Update usedInsight](../api/usedinsight-update.md)|[usedInsight](../resources/usedinsight.md)|Update the properties of an [usedInsight](../resources/usedinsight.md) object.|
|[Delete usedInsight](../api/usedinsight-delete.md)|None|Deletes an [usedInsight](../resources/usedinsight.md) object.|
|[List entity](../api/usedinsight-list-resource.md)|[entity](../resources/entity.md) collection|Get the entity resources from the resource navigation property.|
|[Add entity](../api/usedinsight-post-resource.md)|[entity](../resources/entity.md)|Add resource by posting to the resource collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastUsed|[usageDetails](../resources/usagedetails.md)|**TODO: Add Description**|
|resourceReference|[resourceReference](../resources/resourcereference.md)|**TODO: Add Description**|
|resourceVisualization|[resourceVisualization](../resources/resourcevisualization.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|resource|[entity](../resources/entity.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.usedInsight",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.usedInsight",
  "id": "String (identifier)",
  "lastUsed": {
    "@odata.type": "microsoft.graph.usageDetails"
  },
  "resourceReference": {
    "@odata.type": "microsoft.graph.resourceReference"
  },
  "resourceVisualization": {
    "@odata.type": "microsoft.graph.resourceVisualization"
  }
}
```

