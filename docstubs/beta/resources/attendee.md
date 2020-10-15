---
title: "attendee resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# attendee resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property        | Type                                             | Description |
| :-------------- | :----------------------------------------------- | :---------- |
| emailAddress    | [emailAddress](../resources/emailaddress.md)     |             |
| proposedNewTime | [timeSlot](../resources/timeslot.md)             |             |
| status          | [responseStatus](../resources/responsestatus.md) |             |
| type            | String                                           |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.attendee",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.attendee",
  "emailAddress": {"@odata.type": "microsoft.graph.emailAddress"},
  "proposedNewTime": {"@odata.type": "microsoft.graph.timeSlot"},
  "status": {"@odata.type": "microsoft.graph.responseStatus"},
  "type": "required | optional | resource"
}
```
