---
title: "resourceSpecificPermission resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# resourceSpecificPermission resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property    | Type    | Description |
| :---------- | :------ | :---------- |
| description | String  |             |
| displayName | String  |             |
| id          | Guid    |             |
| isEnabled   | Boolean |             |
| value       | String  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.resourceSpecificPermission",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.resourceSpecificPermission",
  "description": "String",
  "displayName": "String",
  "id": "Guid",
  "isEnabled": "Boolean",
  "value": "String"
}
```
