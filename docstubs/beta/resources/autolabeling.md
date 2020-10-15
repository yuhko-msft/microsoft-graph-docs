---
title: "autoLabeling resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# autoLabeling resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property         | Type              | Description |
| :--------------- | :---------------- | :---------- |
| message          | String            |             |
| sensitiveTypeIds | String collection |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.autoLabeling",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.autoLabeling",
  "message": "String",
  "sensitiveTypeIds": ["String"]
}
```
