---
title: "protectGroup resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# protectGroup resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                 | Type    | Description |
| :----------------------- | :------ | :---------- |
| allowEmailFromGuestUsers | Boolean |             |
| allowGuestUsers          | Boolean |             |
| name                     | String  |             |
| privacy                  | String  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.protectGroup",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.protectGroup",
  "allowEmailFromGuestUsers": "Boolean",
  "allowGuestUsers": "Boolean",
  "name": "String",
  "privacy": "unspecified | public | private | unknownFutureValue"
}
```
