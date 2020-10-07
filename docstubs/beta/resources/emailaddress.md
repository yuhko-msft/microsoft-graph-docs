---
title: "emailAddress resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# emailAddress resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| address  | String |             |
| name     | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.emailAddress",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.emailAddress",
  "address": "String",
  "name": "String"
}
```