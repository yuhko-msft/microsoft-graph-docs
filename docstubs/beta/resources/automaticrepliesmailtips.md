---
title: "automaticRepliesMailTips resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# automaticRepliesMailTips resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property           | Type                                                 | Description |
| :----------------- | :--------------------------------------------------- | :---------- |
| message            | String                                               |             |
| messageLanguage    | [localeInfo](../resources/localeinfo.md)             |             |
| scheduledEndTime   | [dateTimeTimeZone](../resources/datetimetimezone.md) |             |
| scheduledStartTime | [dateTimeTimeZone](../resources/datetimetimezone.md) |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.automaticRepliesMailTips",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.automaticRepliesMailTips",
  "message": "String",
  "messageLanguage": {"@odata.type": "microsoft.graph.localeInfo"},
  "scheduledEndTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "scheduledStartTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"}
}
```
