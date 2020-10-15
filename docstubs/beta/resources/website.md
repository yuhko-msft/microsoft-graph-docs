---
title: "website resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# website resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property    | Type   | Description |
| :---------- | :----- | :---------- |
| address     | String |             |
| displayName | String |             |
| type        | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.website",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.website",
  "address": "String",
  "displayName": "String",
  "type": "other | home | work | blog | profile"
}
```
