---
title: "daylightTimeZoneOffset resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# daylightTimeZoneOffset resource type

Namespace: microsoft.graph

## Properties

| Property      | Type      | Description |
| :------------ | :-------- | :---------- |
| dayOccurrence | Int32     |             |
| dayOfWeek     | String    |             |
| daylightBias  | Int32     |             |
| month         | Int32     |             |
| time          | TimeOfDay |             |
| year          | Int32     |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.daylightTimeZoneOffset",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.daylightTimeZoneOffset",
  "dayOccurrence": "Int32",
  "dayOfWeek": "sunday | monday | tuesday | wednesday | thursday | friday | saturday",
  "daylightBias": "Int32",
  "month": "Int32",
  "time": "TimeOfDay",
  "year": "Int32"
}
```
