---
title: "labelingOptions resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# labelingOptions resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property               | Type                                                             | Description |
| :--------------------- | :--------------------------------------------------------------- | :---------- |
| assignmentMethod       | String                                                           |             |
| downgradeJustification | [downgradeJustification](../resources/downgradejustification.md) |             |
| extendedProperties     | [keyValuePair](../resources/keyvaluepair.md) collection          |             |
| labelId                | Guid                                                             |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.labelingOptions",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.labelingOptions",
  "assignmentMethod": "standard | privileged | auto",
  "downgradeJustification": {"@odata.type": "microsoft.graph.downgradeJustification"},
  "extendedProperties": [{"@odata.type": "microsoft.graph.keyValuePair"}],
  "labelId": "Guid"
}
```
