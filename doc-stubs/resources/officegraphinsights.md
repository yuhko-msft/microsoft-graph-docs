---
title: "officeGraphInsights resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# officeGraphInsights resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List officeGraphInsights](../api/officegraphinsights-list.md)|[officeGraphInsights](../resources/officegraphinsights.md) collection|Get a list of the [officeGraphInsights](../resources/officegraphinsights.md) objects and their properties.|
|[Create officeGraphInsights](../api/officegraphinsights-create.md)|[officeGraphInsights](../resources/officegraphinsights.md)|Create a new [officeGraphInsights](../resources/officegraphinsights.md) object.|
|[Get officeGraphInsights](../api/officegraphinsights-get.md)|[officeGraphInsights](../resources/officegraphinsights.md)|Read the properties and relationships of an [officeGraphInsights](../resources/officegraphinsights.md) object.|
|[Update officeGraphInsights](../api/officegraphinsights-update.md)|[officeGraphInsights](../resources/officegraphinsights.md)|Update the properties of an [officeGraphInsights](../resources/officegraphinsights.md) object.|
|[Delete officeGraphInsights](../api/officegraphinsights-delete.md)|None|Deletes an [officeGraphInsights](../resources/officegraphinsights.md) object.|
|[List shared](../api/officegraphinsights-list-shared.md)|[sharedInsight](../resources/sharedinsight.md) collection|Get the sharedInsight resources from the shared navigation property.|
|[Create sharedInsight](../api/officegraphinsights-post-shared.md)|[sharedInsight](../resources/sharedinsight.md)|Create a new sharedInsight object.|
|[List trending](../api/officegraphinsights-list-trending.md)|[trending](../resources/trending.md) collection|Get the trending resources from the trending navigation property.|
|[Create trending](../api/officegraphinsights-post-trending.md)|[trending](../resources/trending.md)|Create a new trending object.|
|[List used](../api/officegraphinsights-list-used.md)|[usedInsight](../resources/usedinsight.md) collection|Get the usedInsight resources from the used navigation property.|
|[Create usedInsight](../api/officegraphinsights-post-used.md)|[usedInsight](../resources/usedinsight.md)|Create a new usedInsight object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|shared|[sharedInsight](../resources/sharedinsight.md) collection|**TODO: Add Description**|
|trending|[trending](../resources/trending.md) collection|**TODO: Add Description**|
|used|[usedInsight](../resources/usedinsight.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.officeGraphInsights",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.officeGraphInsights"
}
```

