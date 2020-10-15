---
title: "discoveredSensitiveType resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# discoveredSensitiveType resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                 | Type                                                                          | Description |
| :----------------------- | :---------------------------------------------------------------------------- | :---------- |
| classificationAttributes | [classificationAttribute](../resources/classificationattribute.md) collection |             |
| confidence               | Int32                                                                         |             |
| count                    | Int32                                                                         |             |
| id                       | Guid                                                                          |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.discoveredSensitiveType",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.discoveredSensitiveType",
  "classificationAttributes": [{"@odata.type": "microsoft.graph.classificationAttribute"}],
  "confidence": "Int32",
  "count": "Int32",
  "id": "Guid"
}
```
