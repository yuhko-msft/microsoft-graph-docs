---
title: "detectedSensitiveContentBase resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# detectedSensitiveContentBase resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property              | Type   | Description |
| :-------------------- | :----- | :---------- |
| confidence            | Int32  |             |
| displayName           | String |             |
| id                    | Guid   |             |
| recommendedConfidence | Int32  |             |
| uniqueCount           | Int32  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.detectedSensitiveContentBase",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.detectedSensitiveContentBase",
  "confidence": "Int32",
  "displayName": "String",
  "id": "Guid",
  "recommendedConfidence": "Int32",
  "uniqueCount": "Int32"
}
```
