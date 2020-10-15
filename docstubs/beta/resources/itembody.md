---
title: "itemBody resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# itemBody resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property    | Type   | Description |
| :---------- | :----- | :---------- |
| content     | String |             |
| contentType | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.itemBody",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.itemBody",
  "content": "String",
  "contentType": "text | html"
}
```
