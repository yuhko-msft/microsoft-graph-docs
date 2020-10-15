---
title: "downgradeJustification resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# downgradeJustification resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property             | Type    | Description |
| :------------------- | :------ | :---------- |
| isDowngradeJustified | Boolean |             |
| justificationMessage | String  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.downgradeJustification",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.downgradeJustification",
  "isDowngradeJustified": "Boolean",
  "justificationMessage": "String"
}
```
