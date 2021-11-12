---
title: "summarizedPersonCount resource type"
description: "The class for holding the counts of students and staff"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# summarizedPersonCount resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The class for holding the counts of students and staff

## Properties
|Property|Type|Description|
|:---|:---|:---|
|staff|Int32|Count of the staff in an organization|
|student|Int32|Count of the number of students|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.industryData.summarizedPersonCount"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.summarizedPersonCount",
  "student": "Integer",
  "staff": "Integer"
}
```

