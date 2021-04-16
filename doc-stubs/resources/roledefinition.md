---
title: "roleDefinition resource type"
description: "The Role Definition resource. The role definition is the foundation of role based access in Intune. The role combines an Intune resource such as a Mobile App and associated role permissions such as Create or Read for the resource. There are two types of roles, built-in and custom. Built-in roles cannot be modified. Both built-in roles and custom roles must have assignments to be enforced. Create custom roles if you want to define a role that allows any of the available resources and role permissions to be combined into a single role."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# roleDefinition resource type

Namespace: microsoft.graph



The Role Definition resource. The role definition is the foundation of role based access in Intune. The role combines an Intune resource such as a Mobile App and associated role permissions such as Create or Read for the resource. There are two types of roles, built-in and custom. Built-in roles cannot be modified. Both built-in roles and custom roles must have assignments to be enforced. Create custom roles if you want to define a role that allows any of the available resources and role permissions to be combined into a single role.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List roleDefinitions](../api/roledefinition-list.md)|[roleDefinition](../resources/roledefinition.md) collection|Get a list of the [roleDefinition](../resources/roledefinition.md) objects and their properties.|
|[Create roleDefinition](../api/roledefinition-create.md)|[roleDefinition](../resources/roledefinition.md)|Create a new [roleDefinition](../resources/roledefinition.md) object.|
|[Get roleDefinition](../api/roledefinition-get.md)|[roleDefinition](../resources/roledefinition.md)|Read the properties and relationships of a [roleDefinition](../resources/roledefinition.md) object.|
|[Update roleDefinition](../api/roledefinition-update.md)|[roleDefinition](../resources/roledefinition.md)|Update the properties of a [roleDefinition](../resources/roledefinition.md) object.|
|[Delete roleDefinition](../api/roledefinition-delete.md)|None|Deletes a [roleDefinition](../resources/roledefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|Description of the Role definition.|
|displayName|String|Display Name of the Role definition.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isBuiltIn|Boolean|Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition.|
|isBuiltInRoleDefinition|Boolean|Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition.|
|permissions|[rolePermission](../resources/rolepermission.md) collection|List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of the rolePermission.|
|rolePermissions|[rolePermission](../resources/rolepermission.md) collection|List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of the rolePermission.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|roleAssignments|[roleAssignment](../resources/roleassignment.md) collection|List of Role assignments for this role definition.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.roleDefinition",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.roleDefinition",
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

