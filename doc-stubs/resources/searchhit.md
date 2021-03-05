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

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|_id|String|**TODO: Add Description**|
|_score|Int32|**TODO: Add Description**|
|_summary|String|**TODO: Add Description**|
|contentSource|String|**TODO: Add Description**|
|hitId|String|**TODO: Add Description**|
|rank|Int32|**TODO: Add Description**|
|summary|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|_source|[entity](../resources/entity.md)|**TODO: Add Description**|
|resource|[entity](../resources/entity.md)|**TODO: Add Description**|

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
  "_id": "String",
  "hitId": "String",
  "contentSource": "String",
  "_score": "Integer",
  "rank": "Integer",
  "_summary": "String",
  "summary": "String"
}
```

