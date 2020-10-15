---
title: "scheduleInformation resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# scheduleInformation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property         | Type                                                    | Description |
| :--------------- | :------------------------------------------------------ | :---------- |
| availabilityView | String                                                  |             |
| error            | [freeBusyError](../resources/freebusyerror.md)          |             |
| scheduleId       | String                                                  |             |
| scheduleItems    | [scheduleItem](../resources/scheduleitem.md) collection |             |
| workingHours     | [workingHours](../resources/workinghours.md)            |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.scheduleInformation",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.scheduleInformation",
  "availabilityView": "String",
  "error": {"@odata.type": "microsoft.graph.freeBusyError"},
  "scheduleId": "String",
  "scheduleItems": [{"@odata.type": "microsoft.graph.scheduleItem"}],
  "workingHours": {"@odata.type": "microsoft.graph.workingHours"}
}
```
