---
title: "workingHours resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# workingHours resource type

Namespace: microsoft.graph

## Properties

| Property   | Type                                         | Description |
| :--------- | :------------------------------------------- | :---------- |
| daysOfWeek | String collection                            |             |
| endTime    | TimeOfDay                                    |             |
| startTime  | TimeOfDay                                    |             |
| timeZone   | [timeZoneBase](../resources/timezonebase.md) |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.workingHours",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.workingHours",
  "daysOfWeek": ["sunday | monday | tuesday | wednesday | thursday | friday | saturday"],
  "endTime": "TimeOfDay",
  "startTime": "TimeOfDay",
  "timeZone": {"@odata.type": "microsoft.graph.timeZoneBase"}
}
```
