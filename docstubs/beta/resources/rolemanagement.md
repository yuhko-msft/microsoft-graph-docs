---
title: "roleManagement resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# roleManagement resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                        | Return Type                                         | Description                                                           |
| :------------------------------------------------------------ | :-------------------------------------------------- | :-------------------------------------------------------------------- |
| [List roleManagement](../api/rolemanagement-list.md)          | [roleManagement](roleManagement.md) collection      | List properties and relationships of a roleManagement object.         |
| [Create roleManagement](../api/rolemanagement-create.md)      | [roleManagement](roleManagement.md)                 | Create a new roleManagement object.                                   |
| [Get roleManagement](../api/rolemanagement-get.md)            | [roleManagement](roleManagement.md)                 | Read properties and relationships of a roleManagement object.         |
| [Update roleManagement](../api/rolemanagement-update.md)      | [roleManagement](roleManagement.md)                 | Update the properties of a roleManagement object.                     |
| [Delete roleManagement](../api/rolemanagement-delete.md)      |                                                     | Delete a roleManagement object.                                       |
| [List directory](../api/rolemanagement-list-directory.md)     | [rbacApplication](../resources/-rbacapplication.md) | Get the rbacApplication objects from a directory navigation property. |
| [Create directory](../api/rolemanagement-post-directory.md)   | [rbacApplication](../resources/-rbacapplication.md) | Create a new rbacApplication object.                                  |
| [Get directory](../api/rolemanagement-get-directory.md)       | [rbacApplication](../resources/-rbacapplication.md) | Read the properties and relationships of a rbacApplication object.    |
| [Update directory](../api/rolemanagement-update-directory.md) | [rbacApplication](../resources/-rbacapplication.md) | Update the properties of a rbacApplication object.                    |
| [Delete directory](../api/rolemanagement-delete-directory.md) |                                                     | Delete a rbacApplication object.                                      |

## Properties

| Property | Type | Description |
| :------- | :--- | :---------- |

## Relationships

| Relationship | Type                                               | Description |
| :----------- | :------------------------------------------------- | :---------- |
| directory    | [rbacApplication](../resources/rbacapplication.md) |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.roleManagement",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.roleManagement",
}
```
