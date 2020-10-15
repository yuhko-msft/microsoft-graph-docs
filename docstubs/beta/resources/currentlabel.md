---
title: "currentLabel resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# currentLabel resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property        | Type   | Description |
| :-------------- | :----- | :---------- |
| applicationMode | String |             |
| id              | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.currentLabel",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.currentLabel",
  "applicationMode": "manual | automatic | recommended",
  "id": "String"
}
```
