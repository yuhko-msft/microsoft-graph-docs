---
title: "deviceAndAppManagementRoleDefinition resource type"
description: "The Role Definition resource. The role definition is the foundation of role based access in Intune. The role combines an Intune resource such as a Mobile App and associated role permissions such as Create or Read for the resource. There are two types of roles, built-in and custom. Built-in roles cannot be modified. Both built-in roles and custom roles must have assignments to be enforced. Create custom roles if you want to define a role that allows any of the available resources and role permissions to be combined into a single role."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceAndAppManagementRoleDefinition resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The Role Definition resource. The role definition is the foundation of role based access in Intune. The role combines an Intune resource such as a Mobile App and associated role permissions such as Create or Read for the resource. There are two types of roles, built-in and custom. Built-in roles cannot be modified. Both built-in roles and custom roles must have assignments to be enforced. Create custom roles if you want to define a role that allows any of the available resources and role permissions to be combined into a single role.


Inherits from [roleDefinition](../resources/roledefinition.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceAndAppManagementRoleDefinitions](../api/deviceandappmanagementroledefinition-list.md)|[deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md) collection|Get a list of the [deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md) objects and their properties.|
|[Create deviceAndAppManagementRoleDefinition](../api/deviceandappmanagementroledefinition-create.md)|[deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md)|Create a new [deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md) object.|
|[Get deviceAndAppManagementRoleDefinition](../api/deviceandappmanagementroledefinition-get.md)|[deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md)|Read the properties and relationships of a [deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md) object.|
|[Update deviceAndAppManagementRoleDefinition](../api/deviceandappmanagementroledefinition-update.md)|[deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md)|Update the properties of a [deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md) object.|
|[Delete deviceAndAppManagementRoleDefinition](../api/deviceandappmanagementroledefinition-delete.md)|None|Deletes a [deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md) object.|
|[List roleAssignments](../api/deviceandappmanagementroledefinition-list-roleassignments.md)|[roleAssignment](../resources/roleassignment.md) collection|Get the roleAssignment resources from the roleAssignments navigation property.|
|[Create roleAssignment](../api/deviceandappmanagementroledefinition-post-roleassignments.md)|[roleAssignment](../resources/roleassignment.md)|Create a new roleAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|Description of the Role definition. Inherited from [roleDefinition](../resources/roledefinition.md).|
|displayName|String|Display Name of the Role definition. Inherited from [roleDefinition](../resources/roledefinition.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|isBuiltIn|Boolean|Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition. Inherited from [roleDefinition](../resources/roledefinition.md).|
|isBuiltInRoleDefinition|Boolean|Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition. Inherited from [roleDefinition](../resources/roledefinition.md).|
|permissions|[rolePermission](../resources/rolepermission.md) collection|List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of the rolePermission. Inherited from [roleDefinition](../resources/roledefinition.md).|
|rolePermissions|[rolePermission](../resources/rolepermission.md) collection|List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of the rolePermission. Inherited from [roleDefinition](../resources/roledefinition.md).|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [roleDefinition](../resources/roledefinition.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|roleAssignments|[roleAssignment](../resources/roleassignment.md) collection|List of Role assignments for this role definition. Inherited from [roleDefinition](../resources/roledefinition.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceAndAppManagementRoleDefinition",
  "baseType": "microsoft.graph.roleDefinition",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceAndAppManagementRoleDefinition",
  "id": "String (identifier)",
  "description": "String",
  "displayName": "String",
  "isBuiltIn": "Boolean",
  "isBuiltInRoleDefinition": "Boolean",
  "permissions": [
    {
      "@odata.type": "microsoft.graph.rolePermission"
    }
  ],
  "rolePermissions": [
    {
      "@odata.type": "microsoft.graph.rolePermission"
    }
  ],
  "roleScopeTagIds": [
    "String"
  ]
}
```

