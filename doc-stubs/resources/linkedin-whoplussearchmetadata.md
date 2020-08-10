---
title: "WhoPlusSearchMetadata resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# WhoPlusSearchMetadata resource type

Namespace: microsoft.graph.linkedIn

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|facets|[WhoPlusFacet](../resources/linkedin-whoplusfacet.md) collection|**TODO: Add Description**|
|searchMatches|[WhoPlusSearchMatch](../resources/linkedin-whoplussearchmatch.md) collection|**TODO: Add Description**|
|totalHits|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.linkedIn.WhoPlusSearchMetadata"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.linkedIn.WhoPlusSearchMetadata",
  "totalHits": "Integer",
  "searchMatches": [
    {
      "@odata.type": "microsoft.graph.linkedIn.WhoPlusSearchMatch"
    }
  ],
  "facets": [
    {
      "@odata.type": "microsoft.graph.linkedIn.WhoPlusFacet"
    }
  ]
}
```

