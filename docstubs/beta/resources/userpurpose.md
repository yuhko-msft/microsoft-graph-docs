---
title: "userPurpose resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# userPurpose resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| value    | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.userPurpose",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.userPurpose",
  "value": "unknown | user | linked | shared | room | equipment | others"
}
```
