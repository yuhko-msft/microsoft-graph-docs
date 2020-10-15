---
title: "evaluateLabelJobResultGroup resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# evaluateLabelJobResultGroup resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property    | Type                                                             | Description |
| :---------- | :--------------------------------------------------------------- | :---------- |
| automatic   | [evaluateLabelJobResult](../resources/evaluatelabeljobresult.md) |             |
| recommended | [evaluateLabelJobResult](../resources/evaluatelabeljobresult.md) |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.evaluateLabelJobResultGroup",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.evaluateLabelJobResultGroup",
  "automatic": {"@odata.type": "microsoft.graph.evaluateLabelJobResult"},
  "recommended": {"@odata.type": "microsoft.graph.evaluateLabelJobResult"}
}
```
