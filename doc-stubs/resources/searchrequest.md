---
title: "searchRequest resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# searchRequest resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|aggregationFilters|String collection|**TODO: Add Description**|
|aggregations|[aggregationOption](../resources/aggregationoption.md) collection|**TODO: Add Description**|
|contentSources|String collection|**TODO: Add Description**|
|enableTopResults|Boolean|**TODO: Add Description**|
|entityTypes|entityType collection|**TODO: Add Description**|
|fields|String collection|**TODO: Add Description**|
|from|Int32|**TODO: Add Description**|
|query|[searchQuery](../resources/searchquery.md)|**TODO: Add Description**|
|size|Int32|**TODO: Add Description**|
|sortProperties|[sortProperty](../resources/sortproperty.md) collection|**TODO: Add Description**|
|stored_fields|String collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.searchRequest"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.searchRequest",
  "aggregationFilters": [
    "String"
  ],
  "aggregations": [
    {
      "@odata.type": "microsoft.graph.aggregationOption"
    }
  ],
  "contentSources": [
    "String"
  ],
  "enableTopResults": "Boolean",
  "entityTypes": [
    "String"
  ],
  "fields": [
    "String"
  ],
  "from": "Integer",
  "query": {
    "@odata.type": "microsoft.graph.searchQuery"
  },
  "size": "Integer",
  "sortProperties": [
    {
      "@odata.type": "microsoft.graph.sortProperty"
    }
  ],
  "stored_fields": [
    "String"
  ]
}
```

