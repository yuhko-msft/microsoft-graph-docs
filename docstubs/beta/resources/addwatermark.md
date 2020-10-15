---
title: "addWatermark resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# addWatermark resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property    | Type   | Description |
| :---------- | :----- | :---------- |
| fontColor   | String |             |
| fontSize    | Int64  |             |
| name        | String |             |
| orientation | String |             |
| text        | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.addWatermark",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.addWatermark",
  "fontColor": "String",
  "fontSize": "Int64",
  "name": "String",
  "orientation": "horizontal | diagonal",
  "text": "String"
}
```
