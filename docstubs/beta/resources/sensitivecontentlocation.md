---
title: "sensitiveContentLocation resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# sensitiveContentLocation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property   | Type                                                                            | Description |
| :--------- | :------------------------------------------------------------------------------ | :---------- |
| confidence | Int32                                                                           |             |
| evidences  | [sensitiveContentEvidence](../resources/sensitivecontentevidence.md) collection |             |
| idMatch    | String                                                                          |             |
| length     | Int32                                                                           |             |
| offset     | Int32                                                                           |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.sensitiveContentLocation",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.sensitiveContentLocation",
  "confidence": "Int32",
  "evidences": [{"@odata.type": "microsoft.graph.sensitiveContentEvidence"}],
  "idMatch": "String",
  "length": "Int32",
  "offset": "Int32"
}
```
