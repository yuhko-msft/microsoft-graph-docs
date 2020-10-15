---
title: "defaultUserRolePermissions resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# defaultUserRolePermissions resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                      | Type    | Description |
| :---------------------------- | :------ | :---------- |
| allowedToCreateApps           | Boolean |             |
| allowedToCreateSecurityGroups | Boolean |             |
| allowedToReadOtherUsers       | Boolean |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.defaultUserRolePermissions",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.defaultUserRolePermissions",
  "allowedToCreateApps": "Boolean",
  "allowedToCreateSecurityGroups": "Boolean",
  "allowedToReadOtherUsers": "Boolean"
}
```
