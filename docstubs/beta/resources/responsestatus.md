---
title: "responseStatus resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# responseStatus resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property | Type           | Description |
| :------- | :------------- | :---------- |
| response | String         |             |
| time     | DateTimeOffset |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.responseStatus",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.responseStatus",
  "response": "none | organizer | tentativelyAccepted | accepted | declined | notResponded",
  "time": "DateTimeOffset"
}
```
