---
title: "directorySizeQuota resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# directorySizeQuota resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property | Type  | Description |
| :------- | :---- | :---------- |
| total    | Int32 |             |
| used     | Int32 |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.directorySizeQuota",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.directorySizeQuota",
  "total": "Int32",
  "used": "Int32"
}
```
