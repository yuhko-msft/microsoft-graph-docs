---
title: "recurrencePattern resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# recurrencePattern resource type

Namespace: microsoft.graph

## Properties

| Property       | Type              | Description |
| :------------- | :---------------- | :---------- |
| dayOfMonth     | Int32             |             |
| daysOfWeek     | String collection |             |
| firstdayOfWeek | String            |             |
| index          | String            |             |
| interval       | Int32             |             |
| month          | Int32             |             |
| type           | String            |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.recurrencePattern",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.recurrencePattern",
  "dayOfMonth": "Int32",
  "daysOfWeek": ["sunday | monday | tuesday | wednesday | thursday | friday | saturday"],
  "firstdayOfWeek": "sunday | monday | tuesday | wednesday | thursday | friday | saturday",
  "index": "first | second | third | fourth | last",
  "interval": "Int32",
  "month": "Int32",
  "type": "daily | weekly | absoluteMonthly | relativeMonthly | absoluteYearly | relativeYearly"
}
```
