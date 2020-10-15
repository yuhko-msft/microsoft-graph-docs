---
title: "licenseAssignmentState resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# licenseAssignmentState resource type

Namespace: microsoft.graph

## Properties

| Property        | Type            | Description |
| :-------------- | :-------------- | :---------- |
| assignedByGroup | String          |             |
| disabledPlans   | Guid collection |             |
| error           | String          |             |
| skuId           | Guid            |             |
| state           | String          |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.licenseAssignmentState",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.licenseAssignmentState",
  "assignedByGroup": "String",
  "disabledPlans": ["Guid"],
  "error": "String",
  "skuId": "Guid",
  "state": "String"
}
```
