---
title: "standardTimeZoneOffset resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# standardTimeZoneOffset resource type

Namespace: microsoft.graph

## Properties

| Property      | Type      | Description |
| :------------ | :-------- | :---------- |
| dayOccurrence | Int32     |             |
| dayOfWeek     | String    |             |
| month         | Int32     |             |
| time          | TimeOfDay |             |
| year          | Int32     |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.standardTimeZoneOffset",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.standardTimeZoneOffset",
  "dayOccurrence": "Int32",
  "dayOfWeek": "sunday | monday | tuesday | wednesday | thursday | friday | saturday",
  "month": "Int32",
  "time": "TimeOfDay",
  "year": "Int32"
}
```
