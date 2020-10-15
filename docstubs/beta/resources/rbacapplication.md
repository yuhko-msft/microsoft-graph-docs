---
title: "rbacApplication resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# rbacApplication resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                           | Return Type                                      | Description                                                                                 |
| :------------------------------------------------------------------------------- | :----------------------------------------------- | :------------------------------------------------------------------------------------------ |
| [List rbacApplication](../api/rbacapplication-list.md)                           | [rbacApplication](rbacApplication.md) collection | List properties and relationships of a rbacApplication object.                              |
| [Create rbacApplication](../api/rbacapplication-create.md)                       | [rbacApplication](rbacApplication.md)            | Create a new rbacApplication object.                                                        |
| [Get rbacApplication](../api/rbacapplication-get.md)                             | [rbacApplication](rbacApplication.md)            | Read properties and relationships of a rbacApplication object.                              |
| [Update rbacApplication](../api/rbacapplication-update.md)                       | [rbacApplication](rbacApplication.md)            | Update the properties of a rbacApplication object.                                          |
| [Delete rbacApplication](../api/rbacapplication-delete.md)                       |                                                  | Delete a rbacApplication object.                                                            |
| [List resourceNamespaces](../api/rbacapplication-list-resourcenamespaces.md)     | unifiedRbacResourceNamespace                     | Get the unifiedRbacResourceNamespace objects from a resourceNamespaces navigation property. |
| [Create resourceNamespaces](../api/rbacapplication-post-resourcenamespaces.md)   | unifiedRbacResourceNamespace                     | Create a new unifiedRbacResourceNamespace object.                                           |
| [Get resourceNamespaces](../api/rbacapplication-get-resourcenamespaces.md)       | unifiedRbacResourceNamespace                     | Read the properties and relationships of an unifiedRbacResourceNamespace object.            |
| [Update resourceNamespaces](../api/rbacapplication-update-resourcenamespaces.md) | unifiedRbacResourceNamespace                     | Update the properties of an unifiedRbacResourceNamespace object.                            |
| [Delete resourceNamespaces](../api/rbacapplication-delete-resourcenamespaces.md) |                                                  | Delete an unifiedRbacResourceNamespace object.                                              |
| [List roleAssignments](../api/rbacapplication-list-roleassignments.md)           | unifiedRoleAssignment                            | Get the unifiedRoleAssignment objects from a roleAssignments navigation property.           |
| [Create roleAssignments](../api/rbacapplication-post-roleassignments.md)         | unifiedRoleAssignment                            | Create a new unifiedRoleAssignment object.                                                  |
| [Get roleAssignments](../api/rbacapplication-get-roleassignments.md)             | unifiedRoleAssignment                            | Read the properties and relationships of an unifiedRoleAssignment object.                   |
| [Update roleAssignments](../api/rbacapplication-update-roleassignments.md)       | unifiedRoleAssignment                            | Update the properties of an unifiedRoleAssignment object.                                   |
| [Delete roleAssignments](../api/rbacapplication-delete-roleassignments.md)       |                                                  | Delete an unifiedRoleAssignment object.                                                     |
| [List roleDefinitions](../api/rbacapplication-list-roledefinitions.md)           | unifiedRoleDefinition                            | Get the unifiedRoleDefinition objects from a roleDefinitions navigation property.           |
| [Create roleDefinitions](../api/rbacapplication-post-roledefinitions.md)         | unifiedRoleDefinition                            | Create a new unifiedRoleDefinition object.                                                  |
| [Get roleDefinitions](../api/rbacapplication-get-roledefinitions.md)             | unifiedRoleDefinition                            | Read the properties and relationships of an unifiedRoleDefinition object.                   |
| [Update roleDefinitions](../api/rbacapplication-update-roledefinitions.md)       | unifiedRoleDefinition                            | Update the properties of an unifiedRoleDefinition object.                                   |
| [Delete roleDefinitions](../api/rbacapplication-delete-roledefinitions.md)       |                                                  | Delete an unifiedRoleDefinition object.                                                     |

## Properties

| Property | Type | Description |
| :------- | :--- | :---------- |

## Relationships

| Relationship       | Type                                                                                    | Description |
| :----------------- | :-------------------------------------------------------------------------------------- | :---------- |
| resourceNamespaces | [unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) collection |             |
| roleAssignments    | [unifiedRoleAssignment](../resources/unifiedroleassignment.md) collection               |             |
| roleDefinitions    | [unifiedRoleDefinition](../resources/unifiedroledefinition.md) collection               |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.rbacApplication",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.rbacApplication",
}
```
