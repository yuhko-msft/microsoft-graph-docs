---
title: "summarizedActivePersonStatistics resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# summarizedActivePersonStatistics resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|matchedCount|[microsoft.graph.industryData.summarizedPersonCount](../resources/industrydata-summarizedpersoncount.md)|**TODO: Add Description**|
|unmatchedCount|[microsoft.graph.industryData.summarizedPersonCount](../resources/industrydata-summarizedpersoncount.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.industryData.summarizedActivePersonStatistics"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.summarizedActivePersonStatistics",
  "matchedCount": {
    "@odata.type": "microsoft.graph.industryData.summarizedPersonCount"
  },
  "unmatchedCount": {
    "@odata.type": "microsoft.graph.industryData.summarizedPersonCount"
  }
}
```

