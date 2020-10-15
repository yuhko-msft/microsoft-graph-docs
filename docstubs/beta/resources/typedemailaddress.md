---
title: "typedEmailAddress resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# typedEmailAddress resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property   | Type   | Description |
| :--------- | :----- | :---------- |
| address    | String |             |
| name       | String |             |
| otherLabel | String |             |
| type       | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.typedEmailAddress",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.typedEmailAddress",
  "address": "String",
  "name": "String",
  "otherLabel": "String",
  "type": "unknown | work | personal | main | other"
}
```
