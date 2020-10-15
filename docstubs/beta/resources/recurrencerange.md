---
title: "recurrenceRange resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# recurrenceRange resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property            | Type   | Description |
| :------------------ | :----- | :---------- |
| endDate             | Date   |             |
| numberOfOccurrences | Int32  |             |
| recurrenceTimeZone  | String |             |
| startDate           | Date   |             |
| type                | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.recurrenceRange",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.recurrenceRange",
  "endDate": "Date",
  "numberOfOccurrences": "Int32",
  "recurrenceTimeZone": "String",
  "startDate": "Date",
  "type": "endDate | noEnd | numbered"
}
```
