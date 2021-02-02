---
title: "deviceAndAppManagementRoleAssignment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceAndAppManagementRoleAssignment resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [roleAssignment](../resources/roleassignment.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceAndAppManagementRoleAssignments](../api/deviceandappmanagementroleassignment-list.md)|[deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md) collection|Get a list of the [deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md) objects and their properties.|
|[Create deviceAndAppManagementRoleAssignment](../api/deviceandappmanagementroleassignment-create.md)|[deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md)|Create a new [deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md) object.|
|[Get deviceAndAppManagementRoleAssignment](../api/deviceandappmanagementroleassignment-get.md)|[deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md)|Read the properties and relationships of a [deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md) object.|
|[Update deviceAndAppManagementRoleAssignment](../api/deviceandappmanagementroleassignment-update.md)|[deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md)|Update the properties of a [deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md) object.|
|[Delete deviceAndAppManagementRoleAssignment](../api/deviceandappmanagementroleassignment-delete.md)|None|Deletes a [deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description** Inherited from [roleAssignment](../resources/intune-roleassignment.md)|
|displayName|String|**TODO: Add Description** Inherited from [roleAssignment](../resources/intune-roleassignment.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|members|String collection|**TODO: Add Description**|
|resourceScopes|String collection|**TODO: Add Description** Inherited from [roleAssignment](../resources/intune-roleassignment.md)|
|scopeMembers|String collection|**TODO: Add Description** Inherited from [roleAssignment](../resources/intune-roleassignment.md)|
|scopeTags|String collection|**TODO: Add Description**|
|scopeType|roleAssignmentScopeType|**TODO: Add Description** Inherited from [roleAssignment](../resources/intune-roleassignment.md). Possible values are: `resourceScope`, `allDevices`, `allLicensedUsers`, `allDevicesAndLicensedUsers`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|roleDefinition|[roleDefinition](../resources/intune-roledefinition.md)|**TODO: Add Description** Inherited from [roleAssignment](../resources/roleassignment.md)|
|roleScopeTags|[roleScopeTag](../resources/intune-rolescopetag.md) collection|**TODO: Add Description**|

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
  "displayName": "String",
  "description": "String",
  "scopeMembers": [
    "String"
  ],
  "scopeType": "String",
  "resourceScopes": [
    "String"
  ],
  "members": [
    "String"
  ],
  "scopeTags": [
    "String"
  ]
}
```

