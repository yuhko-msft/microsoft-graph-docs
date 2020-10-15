---
title: "evaluateLabelJobResult resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# evaluateLabelJobResult resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                  | Type                                                                            | Description |
| :------------------------ | :------------------------------------------------------------------------------ | :---------- |
| responsiblePolicy         | [responsiblePolicy](../resources/responsiblepolicy.md)                          |             |
| responsibleSensitiveTypes | [responsibleSensitiveType](../resources/responsiblesensitivetype.md) collection |             |
| sensitivityLabel          | [matchingLabel](../resources/matchinglabel.md)                                  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.evaluateLabelJobResult",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.evaluateLabelJobResult",
  "responsiblePolicy": {"@odata.type": "microsoft.graph.responsiblePolicy"},
  "responsibleSensitiveTypes": [{"@odata.type": "microsoft.graph.responsibleSensitiveType"}],
  "sensitivityLabel": {"@odata.type": "microsoft.graph.matchingLabel"}
}
```
