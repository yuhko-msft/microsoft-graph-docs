---
title: "assignedPlan resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# assignedPlan resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property         | Type           | Description |
| :--------------- | :------------- | :---------- |
| assignedDateTime | DateTimeOffset |             |
| capabilityStatus | String         |             |
| service          | String         |             |
| servicePlanId    | Guid           |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.assignedPlan",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.assignedPlan",
  "assignedDateTime": "DateTimeOffset",
  "capabilityStatus": "String",
  "service": "String",
  "servicePlanId": "Guid"
}
```
