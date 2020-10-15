---
title: "licenseUnitsDetail resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# licenseUnitsDetail resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property  | Type  | Description |
| :-------- | :---- | :---------- |
| enabled   | Int32 |             |
| suspended | Int32 |             |
| warning   | Int32 |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.licenseUnitsDetail",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.licenseUnitsDetail",
  "enabled": "Int32",
  "suspended": "Int32",
  "warning": "Int32"
}
```
