---
title: "searchResponse resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# searchResponse resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|queryAlterationResponse|[alterationResponse](../resources/alterationresponse.md)|**TODO: Add Description**|
|value|[searchResultSet](../resources/searchresultset.md) collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.searchResponse"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.searchResponse",
  "queryAlterationResponse": {
    "@odata.type": "microsoft.graph.alterationResponse"
  },
  "value": [
    {
      "@odata.type": "microsoft.graph.searchResultSet"
    }
  ]
}
```

