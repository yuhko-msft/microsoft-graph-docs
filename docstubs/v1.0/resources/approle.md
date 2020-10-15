---
title: "appRole resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# appRole resource type

Namespace: microsoft.graph

## Properties

| Property           | Type              | Description |
| :----------------- | :---------------- | :---------- |
| allowedMemberTypes | String collection |             |
| description        | String            |             |
| displayName        | String            |             |
| id                 | Guid              |             |
| isEnabled          | Boolean           |             |
| origin             | String            |             |
| value              | String            |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.appRole",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.appRole",
  "allowedMemberTypes": ["String"],
  "description": "String",
  "displayName": "String",
  "id": "Guid",
  "isEnabled": "Boolean",
  "origin": "String",
  "value": "String"
}
```
