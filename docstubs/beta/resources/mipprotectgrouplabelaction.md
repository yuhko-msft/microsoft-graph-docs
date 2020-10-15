---
title: "mipProtectGroupLabelAction resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# mipProtectGroupLabelAction resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                    | Type    | Description |
| :-------------------------- | :------ | :---------- |
| isAccessAllowedToGuestUsers | Boolean |             |
| privacy                     | String  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.mipProtectGroupLabelAction",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.mipProtectGroupLabelAction",
  "isAccessAllowedToGuestUsers": "Boolean",
  "privacy": "String"
}
```
