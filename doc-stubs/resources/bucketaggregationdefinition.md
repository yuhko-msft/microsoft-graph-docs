---
title: "bucketAggregationDefinition resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# bucketAggregationDefinition resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|isDescending|Boolean|**TODO: Add Description**|
|minimumCount|Int32|**TODO: Add Description**|
|prefixFilter|String|**TODO: Add Description**|
|ranges|[bucketAggregationRange](../resources/bucketaggregationrange.md) collection|**TODO: Add Description**|
|sortBy|bucketAggregationSortProperty|**TODO: Add Description**. Possible values are: `count`, `keyAsString`, `keyAsNumber`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.bucketAggregationDefinition"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.bucketAggregationDefinition",
  "isDescending": "Boolean",
  "minimumCount": "Integer",
  "prefixFilter": "String",
  "ranges": [
    {
      "@odata.type": "microsoft.graph.bucketAggregationRange"
    }
  ],
  "sortBy": "String"
}
```

