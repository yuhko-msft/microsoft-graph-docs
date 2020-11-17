---
title: "searchHit resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# searchHit resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|contentSource|String|**TODO: Add Description**|
|hitId|String|**TODO: Add Description**|
|rank|Int32|**TODO: Add Description**|
|resource|[entity](../resources/entity.md)|**TODO: Add Description**|
|summary|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.searchHit"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.searchHit",
  "hitId": "String",
  "contentSource": "String",
  "rank": "Integer",
  "summary": "String",
  "resource": {
    "@odata.type": "#microsoft.graph.entity",
    "id": "String (identifier)"
  }
}
```

