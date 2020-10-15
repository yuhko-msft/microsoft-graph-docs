---
title: "classificationResult resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# classificationResult resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property        | Type  | Description |
| :-------------- | :---- | :---------- |
| confidenceLevel | Int32 |             |
| count           | Int32 |             |
| sensitiveTypeId | Guid  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.classificationResult",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.classificationResult",
  "confidenceLevel": "Int32",
  "count": "Int32",
  "sensitiveTypeId": "Guid"
}
```
