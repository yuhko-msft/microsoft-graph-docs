---
title: "deviceAndAppManagementRoleDefinition resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceAndAppManagementRoleDefinition resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [roleDefinition](../resources/roledefinition.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceAndAppManagementRoleDefinitions](../api/deviceandappmanagementroledefinition-list.md)|[deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md) collection|Get a list of the [deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md) objects and their properties.|
|[Create deviceAndAppManagementRoleDefinition](../api/deviceandappmanagementroledefinition-create.md)|[deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md)|Create a new [deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md) object.|
|[Get deviceAndAppManagementRoleDefinition](../api/deviceandappmanagementroledefinition-get.md)|[deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md)|Read the properties and relationships of a [deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md) object.|
|[Update deviceAndAppManagementRoleDefinition](../api/deviceandappmanagementroledefinition-update.md)|[deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md)|Update the properties of a [deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md) object.|
|[Delete deviceAndAppManagementRoleDefinition](../api/deviceandappmanagementroledefinition-delete.md)|None|Deletes a [deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md) object.|
|[List roleAssignments](../api/deviceandappmanagementroledefinition-list-roleassignments.md)|[roleAssignment](../resources/intune-roleassignment.md) collection|Get the roleAssignment resources from the roleAssignments navigation property.|
|[Create roleAssignments](../api/deviceandappmanagementroledefinition-post-roleassignments.md)|[roleAssignment](../resources/intune-roleassignment.md)|Create a new roleAssignment object.|
|[Get roleAssignments](../api/deviceandappmanagementroledefinition-get-roleassignment.md)|[roleAssignment](../resources/intune-roleassignment.md)|Read the properties and relationships of a [roleAssignment](../resources/intune-roleassignment.md) object.|
|[Update roleAssignments](../api/deviceandappmanagementroledefinition-update-roleassignments.md)|[roleAssignment](../resources/intune-roleassignment.md)|Update the properties of a roleAssignments object.|
|[Delete roleAssignments](../api/deviceandappmanagementroledefinition-delete-roleassignments.md)|None|Delete a [roleAssignment](../resources/intune-roleassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description** Inherited from [roleDefinition](../resources/intune-roledefinition.md)|
|displayName|String|**TODO: Add Description** Inherited from [roleDefinition](../resources/intune-roledefinition.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isBuiltIn|Boolean|**TODO: Add Description** Inherited from [roleDefinition](../resources/intune-roledefinition.md)|
|isBuiltInRoleDefinition|Boolean|**TODO: Add Description** Inherited from [roleDefinition](../resources/intune-roledefinition.md)|
|permissions|[rolePermission](../resources/intune-rolepermission.md) collection|**TODO: Add Description** Inherited from [roleDefinition](../resources/intune-roledefinition.md)|
|rolePermissions|[rolePermission](../resources/intune-rolepermission.md) collection|**TODO: Add Description** Inherited from [roleDefinition](../resources/intune-roledefinition.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [roleDefinition](../resources/intune-roledefinition.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|roleAssignments|[roleAssignment](../resources/intune-roleassignment.md) collection|**TODO: Add Description** Inherited from [roleDefinition](../resources/roledefinition.md)|

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
  "displayName": "String",
  "description": "String",
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
  "isBuiltInRoleDefinition": "Boolean",
  "isBuiltIn": "Boolean",
  "roleScopeTagIds": [
    "String"
  ]
}
```

