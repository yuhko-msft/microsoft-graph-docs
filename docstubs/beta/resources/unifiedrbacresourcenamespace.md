---
title: "unifiedRbacResourceNamespace resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# unifiedRbacResourceNamespace resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                  | Return Type                                                                | Description                                                                           |
| :-------------------------------------------------------------------------------------- | :------------------------------------------------------------------------- | :------------------------------------------------------------------------------------ |
| [List unifiedRbacResourceNamespace](../api/unifiedrbacresourcenamespace-list.md)        | [unifiedRbacResourceNamespace](unifiedRbacResourceNamespace.md) collection | List properties and relationships of an unifiedRbacResourceNamespace object.          |
| [Create unifiedRbacResourceNamespace](../api/unifiedrbacresourcenamespace-create.md)    | [unifiedRbacResourceNamespace](unifiedRbacResourceNamespace.md)            | Create a new unifiedRbacResourceNamespace object.                                     |
| [Get unifiedRbacResourceNamespace](../api/unifiedrbacresourcenamespace-get.md)          | [unifiedRbacResourceNamespace](unifiedRbacResourceNamespace.md)            | Read properties and relationships of an unifiedRbacResourceNamespace object.          |
| [Update unifiedRbacResourceNamespace](../api/unifiedrbacresourcenamespace-update.md)    | [unifiedRbacResourceNamespace](unifiedRbacResourceNamespace.md)            | Update the properties of an unifiedRbacResourceNamespace object.                      |
| [Delete unifiedRbacResourceNamespace](../api/unifiedrbacresourcenamespace-delete.md)    |                                                                            | Delete an unifiedRbacResourceNamespace object.                                        |
| [importResourceActions](../api/unifiedrbacresourcenamespace-importResourceActions.md)   | unifiedRbacResourceNamespace                                               |                                                                                       |
| [List resourceActions](../api/unifiedrbacresourcenamespace-list-resourceactions.md)     | unifiedRbacResourceAction                                                  | Get the unifiedRbacResourceAction objects from a resourceActions navigation property. |
| [Create resourceActions](../api/unifiedrbacresourcenamespace-post-resourceactions.md)   | unifiedRbacResourceAction                                                  | Create a new unifiedRbacResourceAction object.                                        |
| [Get resourceActions](../api/unifiedrbacresourcenamespace-get-resourceactions.md)       | unifiedRbacResourceAction                                                  | Read the properties and relationships of an unifiedRbacResourceAction object.         |
| [Update resourceActions](../api/unifiedrbacresourcenamespace-update-resourceactions.md) | unifiedRbacResourceAction                                                  | Update the properties of an unifiedRbacResourceAction object.                         |
| [Delete resourceActions](../api/unifiedrbacresourcenamespace-delete-resourceactions.md) |                                                                            | Delete an unifiedRbacResourceAction object.                                           |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |
| name     | String |             |

## Relationships

| Relationship    | Type                                                                              | Description |
| :-------------- | :-------------------------------------------------------------------------------- | :---------- |
| resourceActions | [unifiedRbacResourceAction](../resources/unifiedrbacresourceaction.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.unifiedRbacResourceNamespace",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.unifiedRbacResourceNamespace",
  "id": "String (identifier)",
  "name": "String"
}
```
