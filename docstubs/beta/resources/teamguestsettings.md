---
title: "teamGuestSettings resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# teamGuestSettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                  | Type    | Description |
| :------------------------ | :------ | :---------- |
| allowCreateUpdateChannels | Boolean |             |
| allowDeleteChannels       | Boolean |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.teamGuestSettings",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.teamGuestSettings",
  "allowCreateUpdateChannels": "Boolean",
  "allowDeleteChannels": "Boolean"
}
```
