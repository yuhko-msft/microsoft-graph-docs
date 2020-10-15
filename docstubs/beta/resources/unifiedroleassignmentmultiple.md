---
title: "unifiedRoleAssignmentMultiple resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# unifiedRoleAssignmentMultiple resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                   | Return Type                                                                  | Description                                                                                                         |
| :--------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------ |
| [List unifiedRoleAssignmentMultiple](../api/unifiedroleassignmentmultiple-list.md)       | [unifiedRoleAssignmentMultiple](unifiedRoleAssignmentMultiple.md) collection | List properties and relationships of an unifiedRoleAssignmentMultiple object.                                       |
| [Create unifiedRoleAssignmentMultiple](../api/unifiedroleassignmentmultiple-create.md)   | [unifiedRoleAssignmentMultiple](unifiedRoleAssignmentMultiple.md)            | Create a new unifiedRoleAssignmentMultiple object.                                                                  |
| [Get unifiedRoleAssignmentMultiple](../api/unifiedroleassignmentmultiple-get.md)         | [unifiedRoleAssignmentMultiple](unifiedRoleAssignmentMultiple.md)            | Read properties and relationships of an unifiedRoleAssignmentMultiple object.                                       |
| [Update unifiedRoleAssignmentMultiple](../api/unifiedroleassignmentmultiple-update.md)   | [unifiedRoleAssignmentMultiple](unifiedRoleAssignmentMultiple.md)            | Update the properties of an unifiedRoleAssignmentMultiple object.                                                   |
| [Delete unifiedRoleAssignmentMultiple](../api/unifiedroleassignmentmultiple-delete.md)   |                                                                              | Delete an unifiedRoleAssignmentMultiple object.                                                                     |
| [List appScopes](../api/unifiedroleassignmentmultiple-list-appscopes.md)                 | appScope                                                                     | Get the appScope objects from an appScopes navigation property.                                                     |
| [Create appScopes](../api/unifiedroleassignmentmultiple-post-appscopes.md)               | appScope                                                                     | Create a new appScope object.                                                                                       |
| [Get appScopes](../api/unifiedroleassignmentmultiple-get-appscopes.md)                   | appScope                                                                     | Read the properties and relationships of an appScope object.                                                        |
| [Update appScopes](../api/unifiedroleassignmentmultiple-update-appscopes.md)             | appScope                                                                     | Update the properties of an appScope object.                                                                        |
| [Delete appScopes](../api/unifiedroleassignmentmultiple-delete-appscopes.md)             |                                                                              | Delete an appScope object.                                                                                          |
| [List directoryScopes](../api/unifiedroleassignmentmultiple-list-directoryscopes.md)     | Microsoft.EnterpriseRbac.DirectoryObject                                     | Get the Microsoft.EnterpriseRbac.DirectoryObject objects from a directoryScopes navigation property.                |
| [Add directoryScopes](../api/unifiedroleassignmentmultiple-post-directoryscopes.md)      | Microsoft.EnterpriseRbac.DirectoryObject                                     | Add Microsoft.EnterpriseRbac.DirectoryObject by posting to the Microsoft.EnterpriseRbac.DirectoryObject collection. |
| [Get directoryScopes](../api/unifiedroleassignmentmultiple-get-directoryscopes.md)       | Microsoft.EnterpriseRbac.DirectoryObject                                     | Read the properties and relationships of a Microsoft.EnterpriseRbac.DirectoryObject object.                         |
| [Update directoryScopes](../api/unifiedroleassignmentmultiple-update-directoryscopes.md) | Microsoft.EnterpriseRbac.DirectoryObject                                     | Update the properties of a Microsoft.EnterpriseRbac.DirectoryObject object.                                         |
| [Remove directoryScopes](../api/unifiedroleassignmentmultiple-delete-directoryscopes.md) |                                                                              | Remove a Microsoft.EnterpriseRbac.DirectoryObject object.                                                           |
| [List principals](../api/unifiedroleassignmentmultiple-list-principals.md)               | Microsoft.EnterpriseRbac.DirectoryObject                                     | Get the Microsoft.EnterpriseRbac.DirectoryObject objects from a principals navigation property.                     |
| [Add principals](../api/unifiedroleassignmentmultiple-post-principals.md)                | Microsoft.EnterpriseRbac.DirectoryObject                                     | Add Microsoft.EnterpriseRbac.DirectoryObject by posting to the Microsoft.EnterpriseRbac.DirectoryObject collection. |
| [Get principals](../api/unifiedroleassignmentmultiple-get-principals.md)                 | Microsoft.EnterpriseRbac.DirectoryObject                                     | Read the properties and relationships of a Microsoft.EnterpriseRbac.DirectoryObject object.                         |
| [Update principals](../api/unifiedroleassignmentmultiple-update-principals.md)           | Microsoft.EnterpriseRbac.DirectoryObject                                     | Update the properties of a Microsoft.EnterpriseRbac.DirectoryObject object.                                         |
| [Remove principals](../api/unifiedroleassignmentmultiple-delete-principals.md)           |                                                                              | Remove a Microsoft.EnterpriseRbac.DirectoryObject object.                                                           |
| [List roleDefinition](../api/unifiedroleassignmentmultiple-list-roledefinition.md)       | unifiedRoleDefinition                                                        | Get the unifiedRoleDefinition objects from a roleDefinition navigation property.                                    |
| [Add roleDefinition](../api/unifiedroleassignmentmultiple-post-roledefinition.md)        | unifiedRoleDefinition                                                        | Add unifiedRoleDefinition by posting to the unifiedRoleDefinition collection.                                       |
| [Get roleDefinition](../api/unifiedroleassignmentmultiple-get-roledefinition.md)         | unifiedRoleDefinition                                                        | Read the properties and relationships of an unifiedRoleDefinition object.                                           |
| [Update roleDefinition](../api/unifiedroleassignmentmultiple-update-roledefinition.md)   | unifiedRoleDefinition                                                        | Update the properties of an unifiedRoleDefinition object.                                                           |
| [Remove roleDefinition](../api/unifiedroleassignmentmultiple-delete-roledefinition.md)   |                                                                              | Remove an unifiedRoleDefinition object.                                                                             |

## Properties

| Property          | Type              | Description |
| :---------------- | :---------------- | :---------- |
| appScopeIds       | String collection |             |
| condition         | String            |             |
| description       | String            |             |
| directoryScopeIds | String collection |             |
| displayName       | String            |             |
| id                | String            | Read-only.  |
| principalIds      | String collection |             |
| roleDefinitionId  | String            |             |

## Relationships

| Relationship    | Type                                                           | Description |
| :-------------- | :------------------------------------------------------------- | :---------- |
| appScopes       | [appScope](../resources/appscope.md) collection                |             |
| directoryScopes | Microsoft.EnterpriseRbac.DirectoryObject collection            |             |
| principals      | Microsoft.EnterpriseRbac.DirectoryObject collection            |             |
| roleDefinition  | [unifiedRoleDefinition](../resources/unifiedroledefinition.md) |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.unifiedRoleAssignmentMultiple",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.unifiedRoleAssignmentMultiple",
  "appScopeIds": ["String"],
  "condition": "String",
  "description": "String",
  "directoryScopeIds": ["String"],
  "displayName": "String",
  "id": "String (identifier)",
  "principalIds": ["String"],
  "roleDefinitionId": "String"
}
```
