---
title: "unifiedRoleAssignment resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# unifiedRoleAssignment resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                         | Return Type                                                  | Description                                                                                                         |
| :----------------------------------------------------------------------------- | :----------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------ |
| [List unifiedRoleAssignment](../api/unifiedroleassignment-list.md)             | [unifiedRoleAssignment](unifiedRoleAssignment.md) collection | List properties and relationships of an unifiedRoleAssignment object.                                               |
| [Create unifiedRoleAssignment](../api/unifiedroleassignment-create.md)         | [unifiedRoleAssignment](unifiedRoleAssignment.md)            | Create a new unifiedRoleAssignment object.                                                                          |
| [Get unifiedRoleAssignment](../api/unifiedroleassignment-get.md)               | [unifiedRoleAssignment](unifiedRoleAssignment.md)            | Read properties and relationships of an unifiedRoleAssignment object.                                               |
| [Update unifiedRoleAssignment](../api/unifiedroleassignment-update.md)         | [unifiedRoleAssignment](unifiedRoleAssignment.md)            | Update the properties of an unifiedRoleAssignment object.                                                           |
| [Delete unifiedRoleAssignment](../api/unifiedroleassignment-delete.md)         |                                                              | Delete an unifiedRoleAssignment object.                                                                             |
| [List appScope](../api/unifiedroleassignment-list-appscope.md)                 | appScope                                                     | Get the appScope objects from an appScope navigation property.                                                      |
| [Create appScope](../api/unifiedroleassignment-post-appscope.md)               | appScope                                                     | Create a new appScope object.                                                                                       |
| [Get appScope](../api/unifiedroleassignment-get-appscope.md)                   | appScope                                                     | Read the properties and relationships of an appScope object.                                                        |
| [Update appScope](../api/unifiedroleassignment-update-appscope.md)             | appScope                                                     | Update the properties of an appScope object.                                                                        |
| [Delete appScope](../api/unifiedroleassignment-delete-appscope.md)             |                                                              | Delete an appScope object.                                                                                          |
| [List directoryScope](../api/unifiedroleassignment-list-directoryscope.md)     | Microsoft.EnterpriseRbac.DirectoryObject                     | Get the Microsoft.EnterpriseRbac.DirectoryObject objects from a directoryScope navigation property.                 |
| [Add directoryScope](../api/unifiedroleassignment-post-directoryscope.md)      | Microsoft.EnterpriseRbac.DirectoryObject                     | Add Microsoft.EnterpriseRbac.DirectoryObject by posting to the Microsoft.EnterpriseRbac.DirectoryObject collection. |
| [Get directoryScope](../api/unifiedroleassignment-get-directoryscope.md)       | Microsoft.EnterpriseRbac.DirectoryObject                     | Read the properties and relationships of a Microsoft.EnterpriseRbac.DirectoryObject object.                         |
| [Update directoryScope](../api/unifiedroleassignment-update-directoryscope.md) | Microsoft.EnterpriseRbac.DirectoryObject                     | Update the properties of a Microsoft.EnterpriseRbac.DirectoryObject object.                                         |
| [Remove directoryScope](../api/unifiedroleassignment-delete-directoryscope.md) |                                                              | Remove a Microsoft.EnterpriseRbac.DirectoryObject object.                                                           |
| [List principal](../api/unifiedroleassignment-list-principal.md)               | Microsoft.EnterpriseRbac.DirectoryObject                     | Get the Microsoft.EnterpriseRbac.DirectoryObject objects from a principal navigation property.                      |
| [Add principal](../api/unifiedroleassignment-post-principal.md)                | Microsoft.EnterpriseRbac.DirectoryObject                     | Add Microsoft.EnterpriseRbac.DirectoryObject by posting to the Microsoft.EnterpriseRbac.DirectoryObject collection. |
| [Get principal](../api/unifiedroleassignment-get-principal.md)                 | Microsoft.EnterpriseRbac.DirectoryObject                     | Read the properties and relationships of a Microsoft.EnterpriseRbac.DirectoryObject object.                         |
| [Update principal](../api/unifiedroleassignment-update-principal.md)           | Microsoft.EnterpriseRbac.DirectoryObject                     | Update the properties of a Microsoft.EnterpriseRbac.DirectoryObject object.                                         |
| [Remove principal](../api/unifiedroleassignment-delete-principal.md)           |                                                              | Remove a Microsoft.EnterpriseRbac.DirectoryObject object.                                                           |
| [List roleDefinition](../api/unifiedroleassignment-list-roledefinition.md)     | unifiedRoleDefinition                                        | Get the unifiedRoleDefinition objects from a roleDefinition navigation property.                                    |
| [Add roleDefinition](../api/unifiedroleassignment-post-roledefinition.md)      | unifiedRoleDefinition                                        | Add unifiedRoleDefinition by posting to the unifiedRoleDefinition collection.                                       |
| [Get roleDefinition](../api/unifiedroleassignment-get-roledefinition.md)       | unifiedRoleDefinition                                        | Read the properties and relationships of an unifiedRoleDefinition object.                                           |
| [Update roleDefinition](../api/unifiedroleassignment-update-roledefinition.md) | unifiedRoleDefinition                                        | Update the properties of an unifiedRoleDefinition object.                                                           |
| [Remove roleDefinition](../api/unifiedroleassignment-delete-roledefinition.md) |                                                              | Remove an unifiedRoleDefinition object.                                                                             |

## Properties

| Property         | Type   | Description |
| :--------------- | :----- | :---------- |
| appScopeId       | String |             |
| condition        | String |             |
| directoryScopeId | String |             |
| id               | String | Read-only.  |
| principalId      | String |             |
| resourceScope    | String |             |
| roleDefinitionId | String |             |

## Relationships

| Relationship   | Type                                                           | Description |
| :------------- | :------------------------------------------------------------- | :---------- |
| appScope       | [appScope](../resources/appscope.md)                           |             |
| directoryScope | Microsoft.EnterpriseRbac.DirectoryObject                       |             |
| principal      | Microsoft.EnterpriseRbac.DirectoryObject                       |             |
| roleDefinition | [unifiedRoleDefinition](../resources/unifiedroledefinition.md) |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.unifiedRoleAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.unifiedRoleAssignment",
  "appScopeId": "String",
  "condition": "String",
  "directoryScopeId": "String",
  "id": "String (identifier)",
  "principalId": "String",
  "resourceScope": "String",
  "roleDefinitionId": "String"
}
```
