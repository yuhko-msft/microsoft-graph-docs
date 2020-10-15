---
title: "addHeader resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# addHeader resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property  | Type   | Description |
| :-------- | :----- | :---------- |
| alignment | String |             |
| fontColor | String |             |
| fontSize  | Int64  |             |
| margin    | Int32  |             |
| name      | String |             |
| text      | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.addHeader",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.addHeader",
  "alignment": "left | right | center",
  "fontColor": "String",
  "fontSize": "Int64",
  "margin": "Int32",
  "name": "String",
  "text": "String"
}
```
