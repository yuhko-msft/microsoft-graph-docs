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

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List usedInsights](../api/usedinsight-list.md)|[usedInsight](../resources/usedinsight.md) collection|Get a list of the [usedInsight](../resources/usedinsight.md) objects and their properties.|
|[Create usedInsight](../api/usedinsight-create.md)|[usedInsight](../resources/usedinsight.md)|Create a new [usedInsight](../resources/usedinsight.md) object.|
|[Get usedInsight](../api/usedinsight-get.md)|[usedInsight](../resources/usedinsight.md)|Read the properties and relationships of an [usedInsight](../resources/usedinsight.md) object.|
|[Update usedInsight](../api/usedinsight-update.md)|[usedInsight](../resources/usedinsight.md)|Update the properties of an [usedInsight](../resources/usedinsight.md) object.|
|[Delete usedInsight](../api/usedinsight-delete.md)|None|Deletes an [usedInsight](../resources/usedinsight.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|lastUsed|[usageDetails](../resources/usagedetails.md)|**TODO: Add Description**|
|resourceReference|[resourceReference](../resources/resourcereference.md)|**TODO: Add Description**|
|resourceVisualization|[resourceVisualization](../resources/resourcevisualization.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.usedInsight",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.usedInsight",
  "lastUsed": {
    "@odata.type": "microsoft.graph.usageDetails"
  },
  "resourceVisualization": {
    "@odata.type": "microsoft.graph.resourceVisualization"
  },
  "resourceReference": {
    "@odata.type": "microsoft.graph.resourceReference"
  }
}
```

