---
title: "fido2KeyRestrictions resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# fido2KeyRestrictions resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property        | Type              | Description |
| :-------------- | :---------------- | :---------- |
| aaGuids         | String collection |             |
| enforcementType | String            |             |
| isEnforced      | Boolean           |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.fido2KeyRestrictions",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.fido2KeyRestrictions",
  "aaGuids": ["String"],
  "enforcementType": "allow | block | unknownFutureValue",
  "isEnforced": "Boolean"
}
```
