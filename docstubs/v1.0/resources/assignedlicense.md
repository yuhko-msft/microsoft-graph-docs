---
title: "assignedLicense resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# assignedLicense resource type

Namespace: microsoft.graph

## Properties

| Property      | Type            | Description |
| :------------ | :-------------- | :---------- |
| disabledPlans | Guid collection |             |
| skuId         | Guid            |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.assignedLicense",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.assignedLicense",
  "disabledPlans": ["Guid"],
  "skuId": "Guid"
}
```
