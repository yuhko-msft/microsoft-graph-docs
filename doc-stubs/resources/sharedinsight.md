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

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sharedInsights](../api/sharedinsight-list.md)|[sharedInsight](../resources/sharedinsight.md) collection|Get a list of the [sharedInsight](../resources/sharedinsight.md) objects and their properties.|
|[Create sharedInsight](../api/sharedinsight-create.md)|[sharedInsight](../resources/sharedinsight.md)|Create a new [sharedInsight](../resources/sharedinsight.md) object.|
|[Get sharedInsight](../api/sharedinsight-get.md)|[sharedInsight](../resources/sharedinsight.md)|Read the properties and relationships of a [sharedInsight](../resources/sharedinsight.md) object.|
|[Update sharedInsight](../api/sharedinsight-update.md)|[sharedInsight](../resources/sharedinsight.md)|Update the properties of a [sharedInsight](../resources/sharedinsight.md) object.|
|[Delete sharedInsight](../api/sharedinsight-delete.md)|None|Deletes a [sharedInsight](../resources/sharedinsight.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|lastShared|[sharingDetail](../resources/sharingdetail.md)|**TODO: Add Description**|
|resourceReference|[resourceReference](../resources/resourcereference.md)|**TODO: Add Description**|
|resourceVisualization|[resourceVisualization](../resources/resourcevisualization.md)|**TODO: Add Description**|
|sharingHistory|[sharingDetail](../resources/sharingdetail.md) collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sharedInsight",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sharedInsight",
  "lastShared": {
    "@odata.type": "microsoft.graph.sharingDetail"
  },
  "sharingHistory": [
    {
      "@odata.type": "microsoft.graph.sharingDetail"
    }
  ],
  "resourceVisualization": {
    "@odata.type": "microsoft.graph.resourceVisualization"
  },
  "resourceReference": {
    "@odata.type": "microsoft.graph.resourceReference"
  }
}
```

