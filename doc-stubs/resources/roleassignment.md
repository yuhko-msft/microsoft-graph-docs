---
title: "roleAssignment resource type"
description: "The Role Assignment resource. Role assignments tie together a role definition with members and scopes. There can be one or more role assignments per role. This applies to custom and built-in roles."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# roleAssignment resource type

Namespace: microsoft.graph



The Role Assignment resource. Role assignments tie together a role definition with members and scopes. There can be one or more role assignments per role. This applies to custom and built-in roles.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List roleAssignments](../api/roleassignment-list.md)|[roleAssignment](../resources/roleassignment.md) collection|Get a list of the [roleAssignment](../resources/roleassignment.md) objects and their properties.|
|[Create roleAssignment](../api/roleassignment-create.md)|[roleAssignment](../resources/roleassignment.md)|Create a new [roleAssignment](../resources/roleassignment.md) object.|
|[Get roleAssignment](../api/roleassignment-get.md)|[roleAssignment](../resources/roleassignment.md)|Read the properties and relationships of a [roleAssignment](../resources/roleassignment.md) object.|
|[Update roleAssignment](../api/roleassignment-update.md)|[roleAssignment](../resources/roleassignment.md)|Update the properties of a [roleAssignment](../resources/roleassignment.md) object.|
|[Delete roleAssignment](../api/roleassignment-delete.md)|None|Deletes a [roleAssignment](../resources/roleassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|Description of the Role Assignment.|
|displayName|String|The display or friendly name of the role Assignment.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|resourceScopes|String collection|List of ids of role scope member security groups.  These are IDs from Azure Active Directory.|
|scopeMembers|String collection|List of ids of role scope member security groups.  These are IDs from Azure Active Directory.|
|scopeType|roleAssignmentScopeType|Specifies the type of scope for a Role Assignment. Default type 'ResourceScope' allows assignment of ResourceScopes. For 'AllDevices', 'AllLicensedUsers', and 'AllDevicesAndLicensedUsers', the ResourceScopes property should be left empty. Possible values are: `resourceScope`, `allDevices`, `allLicensedUsers`, `allDevicesAndLicensedUsers`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|roleDefinition|[roleDefinition](../resources/roledefinition.md)|Role definition this assignment is part of.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.roleAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.roleAssignment",
  "id": "String (identifier)",
  "description": "String",
  "displayName": "String",
  "resourceScopes": [
    "String"
  ],
  "scopeMembers": [
    "String"
  ],
  "scopeType": "String"
}
```

