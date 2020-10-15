---
title: "timeSlot resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# timeSlot resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property | Type                                                 | Description |
| :------- | :--------------------------------------------------- | :---------- |
| end      | [dateTimeTimeZone](../resources/datetimetimezone.md) |             |
| start    | [dateTimeTimeZone](../resources/datetimetimezone.md) |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.timeSlot",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.timeSlot",
  "end": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "start": {"@odata.type": "microsoft.graph.dateTimeTimeZone"}
}
```
