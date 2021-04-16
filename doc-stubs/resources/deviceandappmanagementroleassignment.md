---
title: "deviceAndAppManagementRoleAssignment resource type"
description: "The Role Assignment resource. Role assignments tie together a role definition with members and scopes. There can be one or more role assignments per role. This applies to custom and built-in roles."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceAndAppManagementRoleAssignment resource type

Namespace: microsoft.graph



The Role Assignment resource. Role assignments tie together a role definition with members and scopes. There can be one or more role assignments per role. This applies to custom and built-in roles.


Inherits from [roleAssignment](../resources/roleassignment.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceAndAppManagementRoleAssignments](../api/deviceandappmanagementroleassignment-list.md)|[deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md) collection|Get a list of the [deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md) objects and their properties.|
|[Create deviceAndAppManagementRoleAssignment](../api/deviceandappmanagementroleassignment-create.md)|[deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md)|Create a new [deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md) object.|
|[Get deviceAndAppManagementRoleAssignment](../api/deviceandappmanagementroleassignment-get.md)|[deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md)|Read the properties and relationships of a [deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md) object.|
|[Update deviceAndAppManagementRoleAssignment](../api/deviceandappmanagementroleassignment-update.md)|[deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md)|Update the properties of a [deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md) object.|
|[Delete deviceAndAppManagementRoleAssignment](../api/deviceandappmanagementroleassignment-delete.md)|None|Deletes a [deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md) object.|
|[List roleScopeTags](../api/deviceandappmanagementroleassignment-list-rolescopetags.md)|[roleScopeTag](../resources/rolescopetag.md) collection|Get the roleScopeTag resources from the roleScopeTags navigation property.|
|[Add roleScopeTag](../api/deviceandappmanagementroleassignment-post-rolescopetags.md)|[roleScopeTag](../resources/rolescopetag.md)|Add roleScopeTags by posting to the roleScopeTags collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|Description of the Role Assignment. Inherited from [roleAssignment](../resources/roleassignment.md)|
|displayName|String|The display or friendly name of the role Assignment. Inherited from [roleAssignment](../resources/roleassignment.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|members|String collection|The list of ids of role member security groups. These are IDs from Azure Active Directory.|
|resourceScopes|String collection|List of ids of role scope member security groups.  These are IDs from Azure Active Directory. Inherited from [roleAssignment](../resources/roleassignment.md)|
|scopeMembers|String collection|List of ids of role scope member security groups.  These are IDs from Azure Active Directory. Inherited from [roleAssignment](../resources/roleassignment.md)|
|scopeType|roleAssignmentScopeType|Specifies the type of scope for a Role Assignment. Default type 'ResourceScope' allows assignment of ResourceScopes. For 'AllDevices', 'AllLicensedUsers', and 'AllDevicesAndLicensedUsers', the ResourceScopes property should be left empty. Inherited from [roleAssignment](../resources/roleassignment.md). Possible values are: `resourceScope`, `allDevices`, `allLicensedUsers`, `allDevicesAndLicensedUsers`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|roleDefinition|[roleDefinition](../resources/roledefinition.md)|Role definition this assignment is part of. Inherited from [roleAssignment](../resources/roleassignment.md)|
|roleScopeTags|[roleScopeTag](../resources/rolescopetag.md) collection|The set of Role Scope Tags defined on the Role Assignment.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceAndAppManagementRoleAssignment",
  "baseType": "microsoft.graph.roleAssignment",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceAndAppManagementRoleAssignment",
  "id": "String (identifier)",
  "description": "String",
  "displayName": "String",
  "resourceScopes": [
    "String"
  ],
  "scopeMembers": [
    "String"
  ],
  "scopeType": "String",
  "members": [
    "String"
  ]
}
```

