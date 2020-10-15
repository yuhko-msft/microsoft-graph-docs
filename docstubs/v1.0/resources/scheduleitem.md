---
title: "scheduleItem resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# scheduleItem resource type

Namespace: microsoft.graph

## Properties

| Property  | Type                                                 | Description |
| :-------- | :--------------------------------------------------- | :---------- |
| end       | [dateTimeTimeZone](../resources/datetimetimezone.md) |             |
| isPrivate | Boolean                                              |             |
| location  | String                                               |             |
| start     | [dateTimeTimeZone](../resources/datetimetimezone.md) |             |
| status    | String                                               |             |
| subject   | String                                               |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.scheduleItem",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.scheduleItem",
  "end": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "isPrivate": "Boolean",
  "location": "String",
  "start": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "status": "free | tentative | unknown | busy | oof | workingElsewhere",
  "subject": "String"
}
```
