---
title: "unifiedRoleDefinition resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# unifiedRoleDefinition resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                           | Return Type                                                  | Description                                                                                |
| :----------------------------------------------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------------------------------------- |
| [List unifiedRoleDefinition](../api/unifiedroledefinition-list.md)                               | [unifiedRoleDefinition](unifiedRoleDefinition.md) collection | List properties and relationships of an unifiedRoleDefinition object.                      |
| [Create unifiedRoleDefinition](../api/unifiedroledefinition-create.md)                           | [unifiedRoleDefinition](unifiedRoleDefinition.md)            | Create a new unifiedRoleDefinition object.                                                 |
| [Get unifiedRoleDefinition](../api/unifiedroledefinition-get.md)                                 | [unifiedRoleDefinition](unifiedRoleDefinition.md)            | Read properties and relationships of an unifiedRoleDefinition object.                      |
| [Update unifiedRoleDefinition](../api/unifiedroledefinition-update.md)                           | [unifiedRoleDefinition](unifiedRoleDefinition.md)            | Update the properties of an unifiedRoleDefinition object.                                  |
| [Delete unifiedRoleDefinition](../api/unifiedroledefinition-delete.md)                           |                                                              | Delete an unifiedRoleDefinition object.                                                    |
| [List inheritsPermissionsFrom](../api/unifiedroledefinition-list-inheritspermissionsfrom.md)     | unifiedRoleDefinition                                        | Get the unifiedRoleDefinition objects from an inheritsPermissionsFrom navigation property. |
| [Create inheritsPermissionsFrom](../api/unifiedroledefinition-post-inheritspermissionsfrom.md)   | unifiedRoleDefinition                                        | Create a new unifiedRoleDefinition object.                                                 |
| [Get inheritsPermissionsFrom](../api/unifiedroledefinition-get-inheritspermissionsfrom.md)       | unifiedRoleDefinition                                        | Read the properties and relationships of an unifiedRoleDefinition object.                  |
| [Update inheritsPermissionsFrom](../api/unifiedroledefinition-update-inheritspermissionsfrom.md) | unifiedRoleDefinition                                        | Update the properties of an unifiedRoleDefinition object.                                  |
| [Delete inheritsPermissionsFrom](../api/unifiedroledefinition-delete-inheritspermissionsfrom.md) |                                                              | Delete an unifiedRoleDefinition object.                                                    |

## Properties

| Property        | Type                                                                      | Description |
| :-------------- | :------------------------------------------------------------------------ | :---------- |
| description     | String                                                                    |             |
| displayName     | String                                                                    |             |
| id              | String                                                                    | Read-only.  |
| isBuiltIn       | Boolean                                                                   |             |
| isEnabled       | Boolean                                                                   |             |
| resourceScopes  | String collection                                                         |             |
| rolePermissions | [unifiedRolePermission](../resources/unifiedrolepermission.md) collection |             |
| templateId      | String                                                                    |             |
| version         | String                                                                    |             |

## Relationships

| Relationship            | Type                                                                      | Description |
| :---------------------- | :------------------------------------------------------------------------ | :---------- |
| inheritsPermissionsFrom | [unifiedRoleDefinition](../resources/unifiedroledefinition.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.unifiedRoleDefinition",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.unifiedRoleDefinition",
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)",
  "isBuiltIn": "Boolean",
  "isEnabled": "Boolean",
  "resourceScopes": ["String"],
  "rolePermissions": [{"@odata.type": "microsoft.graph.unifiedRolePermission"}],
  "templateId": "String",
  "version": "String"
}
```
