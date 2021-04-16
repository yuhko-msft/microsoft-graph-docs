---
title: "itemInsights resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# itemInsights resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [officeGraphInsights](../resources/officegraphinsights.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List itemInsights](../api/iteminsights-list.md)|[itemInsights](../resources/iteminsights.md) collection|Get a list of the [itemInsights](../resources/iteminsights.md) objects and their properties.|
|[Create itemInsights](../api/iteminsights-create.md)|[itemInsights](../resources/iteminsights.md)|Create a new [itemInsights](../resources/iteminsights.md) object.|
|[Get itemInsights](../api/iteminsights-get.md)|[itemInsights](../resources/iteminsights.md)|Read the properties and relationships of an [itemInsights](../resources/iteminsights.md) object.|
|[Update itemInsights](../api/iteminsights-update.md)|[itemInsights](../resources/iteminsights.md)|Update the properties of an [itemInsights](../resources/iteminsights.md) object.|
|[Delete itemInsights](../api/iteminsights-delete.md)|None|Deletes an [itemInsights](../resources/iteminsights.md) object.|
|[List shared](../api/iteminsights-list-shared.md)|[sharedInsight](../resources/sharedinsight.md) collection|Get the sharedInsight resources from the shared navigation property.|
|[Create sharedInsight](../api/iteminsights-post-shared.md)|[sharedInsight](../resources/sharedinsight.md)|Create a new sharedInsight object.|
|[List trending](../api/iteminsights-list-trending.md)|[trending](../resources/trending.md) collection|Get the trending resources from the trending navigation property.|
|[Create trending](../api/iteminsights-post-trending.md)|[trending](../resources/trending.md)|Create a new trending object.|
|[List used](../api/iteminsights-list-used.md)|[usedInsight](../resources/usedinsight.md) collection|Get the usedInsight resources from the used navigation property.|
|[Create usedInsight](../api/iteminsights-post-used.md)|[usedInsight](../resources/usedinsight.md)|Create a new usedInsight object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|shared|[sharedInsight](../resources/sharedinsight.md) collection|**TODO: Add Description** Inherited from [officeGraphInsights](../resources/officegraphinsights.md)|
|trending|[trending](../resources/trending.md) collection|**TODO: Add Description** Inherited from [officeGraphInsights](../resources/officegraphinsights.md)|
|used|[usedInsight](../resources/usedinsight.md) collection|**TODO: Add Description** Inherited from [officeGraphInsights](../resources/officegraphinsights.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.itemInsights",
  "baseType": "microsoft.graph.officeGraphInsights",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.itemInsights",
  "id": "String (identifier)"
}
```

