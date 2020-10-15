---
title: "rbacApplicationMultiple resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# rbacApplicationMultiple resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                   | Return Type                                                      | Description                                                                                 |
| :--------------------------------------------------------------------------------------- | :--------------------------------------------------------------- | :------------------------------------------------------------------------------------------ |
| [List rbacApplicationMultiple](../api/rbacapplicationmultiple-list.md)                   | [rbacApplicationMultiple](rbacApplicationMultiple.md) collection | List properties and relationships of a rbacApplicationMultiple object.                      |
| [Create rbacApplicationMultiple](../api/rbacapplicationmultiple-create.md)               | [rbacApplicationMultiple](rbacApplicationMultiple.md)            | Create a new rbacApplicationMultiple object.                                                |
| [Get rbacApplicationMultiple](../api/rbacapplicationmultiple-get.md)                     | [rbacApplicationMultiple](rbacApplicationMultiple.md)            | Read properties and relationships of a rbacApplicationMultiple object.                      |
| [Update rbacApplicationMultiple](../api/rbacapplicationmultiple-update.md)               | [rbacApplicationMultiple](rbacApplicationMultiple.md)            | Update the properties of a rbacApplicationMultiple object.                                  |
| [Delete rbacApplicationMultiple](../api/rbacapplicationmultiple-delete.md)               |                                                                  | Delete a rbacApplicationMultiple object.                                                    |
| [List resourceNamespaces](../api/rbacapplicationmultiple-list-resourcenamespaces.md)     | unifiedRbacResourceNamespace                                     | Get the unifiedRbacResourceNamespace objects from a resourceNamespaces navigation property. |
| [Create resourceNamespaces](../api/rbacapplicationmultiple-post-resourcenamespaces.md)   | unifiedRbacResourceNamespace                                     | Create a new unifiedRbacResourceNamespace object.                                           |
| [Get resourceNamespaces](../api/rbacapplicationmultiple-get-resourcenamespaces.md)       | unifiedRbacResourceNamespace                                     | Read the properties and relationships of an unifiedRbacResourceNamespace object.            |
| [Update resourceNamespaces](../api/rbacapplicationmultiple-update-resourcenamespaces.md) | unifiedRbacResourceNamespace                                     | Update the properties of an unifiedRbacResourceNamespace object.                            |
| [Delete resourceNamespaces](../api/rbacapplicationmultiple-delete-resourcenamespaces.md) |                                                                  | Delete an unifiedRbacResourceNamespace object.                                              |
| [List roleAssignments](../api/rbacapplicationmultiple-list-roleassignments.md)           | unifiedRoleAssignmentMultiple                                    | Get the unifiedRoleAssignmentMultiple objects from a roleAssignments navigation property.   |
| [Create roleAssignments](../api/rbacapplicationmultiple-post-roleassignments.md)         | unifiedRoleAssignmentMultiple                                    | Create a new unifiedRoleAssignmentMultiple object.                                          |
| [Get roleAssignments](../api/rbacapplicationmultiple-get-roleassignments.md)             | unifiedRoleAssignmentMultiple                                    | Read the properties and relationships of an unifiedRoleAssignmentMultiple object.           |
| [Update roleAssignments](../api/rbacapplicationmultiple-update-roleassignments.md)       | unifiedRoleAssignmentMultiple                                    | Update the properties of an unifiedRoleAssignmentMultiple object.                           |
| [Delete roleAssignments](../api/rbacapplicationmultiple-delete-roleassignments.md)       |                                                                  | Delete an unifiedRoleAssignmentMultiple object.                                             |
| [List roleDefinitions](../api/rbacapplicationmultiple-list-roledefinitions.md)           | unifiedRoleDefinition                                            | Get the unifiedRoleDefinition objects from a roleDefinitions navigation property.           |
| [Create roleDefinitions](../api/rbacapplicationmultiple-post-roledefinitions.md)         | unifiedRoleDefinition                                            | Create a new unifiedRoleDefinition object.                                                  |
| [Get roleDefinitions](../api/rbacapplicationmultiple-get-roledefinitions.md)             | unifiedRoleDefinition                                            | Read the properties and relationships of an unifiedRoleDefinition object.                   |
| [Update roleDefinitions](../api/rbacapplicationmultiple-update-roledefinitions.md)       | unifiedRoleDefinition                                            | Update the properties of an unifiedRoleDefinition object.                                   |
| [Delete roleDefinitions](../api/rbacapplicationmultiple-delete-roledefinitions.md)       |                                                                  | Delete an unifiedRoleDefinition object.                                                     |

## Properties

| Property | Type | Description |
| :------- | :--- | :---------- |

## Relationships

| Relationship       | Type                                                                                      | Description |
| :----------------- | :---------------------------------------------------------------------------------------- | :---------- |
| resourceNamespaces | [unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) collection   |             |
| roleAssignments    | [unifiedRoleAssignmentMultiple](../resources/unifiedroleassignmentmultiple.md) collection |             |
| roleDefinitions    | [unifiedRoleDefinition](../resources/unifiedroledefinition.md) collection                 |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.rbacApplicationMultiple",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.rbacApplicationMultiple",
}
```
