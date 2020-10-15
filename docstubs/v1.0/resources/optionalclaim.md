---
title: "optionalClaim resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# optionalClaim resource type

Namespace: microsoft.graph

## Properties

| Property             | Type              | Description |
| :------------------- | :---------------- | :---------- |
| additionalProperties | String collection |             |
| essential            | Boolean           |             |
| name                 | String            |             |
| source               | String            |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.optionalClaim",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.optionalClaim",
  "additionalProperties": ["String"],
  "essential": "Boolean",
  "name": "String",
  "source": "String"
}
```
