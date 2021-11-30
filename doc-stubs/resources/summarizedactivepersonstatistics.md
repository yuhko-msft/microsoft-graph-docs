---
title: "summarizedActivePersonStatistics resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# summarizedActivePersonStatistics resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|matchedCount|[summarizedPersonCount](../resources/summarizedpersoncount.md)|**TODO: Add Description**|
|unmatchedCount|[summarizedPersonCount](../resources/summarizedpersoncount.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.summarizedActivePersonStatistics"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.summarizedActivePersonStatistics",
  "matchedCount": {
    "@odata.type": "microsoft.graph.summarizedPersonCount"
  },
  "unmatchedCount": {
    "@odata.type": "microsoft.graph.summarizedPersonCount"
  }
}
```

