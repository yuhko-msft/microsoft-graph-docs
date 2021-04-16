---
title: "customUpdateTimeWindow resource type"
description: "Custom update time window"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# customUpdateTimeWindow resource type

Namespace: microsoft.graph



Custom update time window

## Properties
|Property|Type|Description|
|:---|:---|:---|
|endDay|dayOfWeek|End day of the time window. Possible values are: `sunday`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`, `saturday`.|
|endTime|TimeOfDay|End time of the time window|
|startDay|dayOfWeek|Start day of the time window. Possible values are: `sunday`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`, `saturday`.|
|startTime|TimeOfDay|Start time of the time window|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.customUpdateTimeWindow"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.customUpdateTimeWindow",
  "endDay": "String",
  "endTime": "String (time of day)",
  "startDay": "String",
  "startTime": "String (time of day)"
}
```

