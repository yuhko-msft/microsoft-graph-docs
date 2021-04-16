---
title: "timeCardEntry resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# timeCardEntry resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|breaks|[timeCardBreak](../resources/timecardbreak.md) collection|**TODO: Add Description**|
|clockInEvent|[timeCardEvent](../resources/timecardevent.md)|**TODO: Add Description**|
|clockOutEvent|[timeCardEvent](../resources/timecardevent.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.timeCardEntry"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.timeCardEntry",
  "breaks": [
    {
      "@odata.type": "microsoft.graph.timeCardBreak"
    }
  ],
  "clockInEvent": {
    "@odata.type": "microsoft.graph.timeCardEvent"
  },
  "clockOutEvent": {
    "@odata.type": "microsoft.graph.timeCardEvent"
  }
}
```

