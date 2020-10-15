---
title: "rankedEmailAddress resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# rankedEmailAddress resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| address  | String |             |
| rank     | Double |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.rankedEmailAddress",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.rankedEmailAddress",
  "address": "String",
  "rank": "Double"
}
```
