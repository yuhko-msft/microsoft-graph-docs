---
title: "appRoleAssignment resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# appRoleAssignment resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                         | Return Type                                          | Description                                                       |
| :------------------------------------------------------------- | :--------------------------------------------------- | :---------------------------------------------------------------- |
| [List appRoleAssignment](../api/approleassignment-list.md)     | [appRoleAssignment](appRoleAssignment.md) collection | List properties and relationships of an appRoleAssignment object. |
| [Create appRoleAssignment](../api/approleassignment-create.md) | [appRoleAssignment](appRoleAssignment.md)            | Create a new appRoleAssignment object.                            |
| [Get appRoleAssignment](../api/approleassignment-get.md)       | [appRoleAssignment](appRoleAssignment.md)            | Read properties and relationships of an appRoleAssignment object. |
| [Update appRoleAssignment](../api/approleassignment-update.md) | [appRoleAssignment](appRoleAssignment.md)            | Update the properties of an appRoleAssignment object.             |
| [Delete appRoleAssignment](../api/approleassignment-delete.md) |                                                      | Delete an appRoleAssignment object.                               |

## Properties

| Property             | Type           | Description |
| :------------------- | :------------- | :---------- |
| appRoleId            | Guid           |             |
| creationTimestamp    | DateTimeOffset |             |
| id                   | String         | Read-only.  |
| principalDisplayName | String         |             |
| principalId          | Guid           |             |
| principalType        | String         |             |
| resourceDisplayName  | String         |             |
| resourceId           | Guid           |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.appRoleAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.appRoleAssignment",
  "appRoleId": "Guid",
  "creationTimestamp": "DateTimeOffset",
  "id": "String (identifier)",
  "principalDisplayName": "String",
  "principalId": "Guid",
  "principalType": "String",
  "resourceDisplayName": "String",
  "resourceId": "Guid"
}
```
