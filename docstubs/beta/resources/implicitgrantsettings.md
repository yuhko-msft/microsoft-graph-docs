---
title: "implicitGrantSettings resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# implicitGrantSettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                  | Type    | Description |
| :------------------------ | :------ | :---------- |
| enableAccessTokenIssuance | Boolean |             |
| enableIdTokenIssuance     | Boolean |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.implicitGrantSettings",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.implicitGrantSettings",
  "enableAccessTokenIssuance": "Boolean",
  "enableIdTokenIssuance": "Boolean"
}
```
