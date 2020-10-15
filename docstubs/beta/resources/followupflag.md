---
title: "followupFlag resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# followupFlag resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property          | Type                                                 | Description |
| :---------------- | :--------------------------------------------------- | :---------- |
| completedDateTime | [dateTimeTimeZone](../resources/datetimetimezone.md) |             |
| dueDateTime       | [dateTimeTimeZone](../resources/datetimetimezone.md) |             |
| flagStatus        | String                                               |             |
| startDateTime     | [dateTimeTimeZone](../resources/datetimetimezone.md) |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.followupFlag",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.followupFlag",
  "completedDateTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "dueDateTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "flagStatus": "notFlagged | complete | flagged",
  "startDateTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"}
}
```
