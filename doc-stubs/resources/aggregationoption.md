---
title: "aggregationOption resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# aggregationOption resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|bucketDefinition|[bucketAggregationDefinition](../resources/bucketaggregationdefinition.md)|**TODO: Add Description**|
|field|String|**TODO: Add Description**|
|size|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.aggregationOption"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.aggregationOption",
  "bucketDefinition": {
    "@odata.type": "microsoft.graph.bucketAggregationDefinition"
  },
  "field": "String",
  "size": "Integer"
}
```

