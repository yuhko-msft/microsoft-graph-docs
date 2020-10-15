---
title: "unifiedRolePermission resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# unifiedRolePermission resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                | Type              | Description |
| :---------------------- | :---------------- | :---------- |
| allowedResourceActions  | String collection |             |
| condition               | String            |             |
| excludedResourceActions | String collection |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.unifiedRolePermission",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.unifiedRolePermission",
  "allowedResourceActions": ["String"],
  "condition": "String",
  "excludedResourceActions": ["String"]
}
```
