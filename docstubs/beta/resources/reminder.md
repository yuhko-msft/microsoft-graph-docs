---
title: "reminder resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# reminder resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property         | Type                                                 | Description |
| :--------------- | :--------------------------------------------------- | :---------- |
| changeKey        | String                                               |             |
| eventEndTime     | [dateTimeTimeZone](../resources/datetimetimezone.md) |             |
| eventId          | String                                               |             |
| eventLocation    | [location](../resources/location.md)                 |             |
| eventStartTime   | [dateTimeTimeZone](../resources/datetimetimezone.md) |             |
| eventSubject     | String                                               |             |
| eventWebLink     | String                                               |             |
| reminderFireTime | [dateTimeTimeZone](../resources/datetimetimezone.md) |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.reminder",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.reminder",
  "changeKey": "String",
  "eventEndTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "eventId": "String",
  "eventLocation": {"@odata.type": "microsoft.graph.location"},
  "eventStartTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "eventSubject": "String",
  "eventWebLink": "String",
  "reminderFireTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"}
}
```
