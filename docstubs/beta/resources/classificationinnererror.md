---
title: "classificationInnerError resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# classificationInnerError resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property        | Type           | Description |
| :-------------- | :------------- | :---------- |
| activityId      | String         |             |
| clientRequestId | String         |             |
| code            | String         |             |
| errorDateTime   | DateTimeOffset |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.classificationInnerError",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.classificationInnerError",
  "activityId": "String",
  "clientRequestId": "String",
  "code": "String",
  "errorDateTime": "DateTimeOffset"
}
```
