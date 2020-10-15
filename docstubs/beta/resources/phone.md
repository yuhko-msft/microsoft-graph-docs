---
title: "phone resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# phone resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| number   | String |             |
| type     | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.phone",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.phone",
  "number": "String",
  "type": "home | business | mobile | other | assistant | homeFax | businessFax | otherFax | pager | radio"
}
```
