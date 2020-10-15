---
title: "convertIdResult resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# convertIdResult resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property     | Type                                         | Description |
| :----------- | :------------------------------------------- | :---------- |
| errorDetails | [genericError](../resources/genericerror.md) |             |
| sourceId     | String                                       |             |
| targetId     | String                                       |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.convertIdResult",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.convertIdResult",
  "errorDetails": {"@odata.type": "microsoft.graph.genericError"},
  "sourceId": "String",
  "targetId": "String"
}
```
