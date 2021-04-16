---
title: "privilegedRoleAssignment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# privilegedRoleAssignment resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List privilegedRoleAssignments](../api/privilegedroleassignment-list.md)|[privilegedRoleAssignment](../resources/privilegedroleassignment.md) collection|Get a list of the [privilegedRoleAssignment](../resources/privilegedroleassignment.md) objects and their properties.|
|[Create privilegedRoleAssignment](../api/privilegedroleassignment-post-privilegedroleassignments.md)|[privilegedRoleAssignment](../resources/privilegedroleassignment.md)|Create a new [privilegedRoleAssignment](../resources/privilegedroleassignment.md) object.|
|[Get privilegedRoleAssignment](../api/privilegedroleassignment-get.md)|[privilegedRoleAssignment](../resources/privilegedroleassignment.md)|Read the properties and relationships of a [privilegedRoleAssignment](../resources/privilegedroleassignment.md) object.|
|[Update privilegedRoleAssignment](../api/privilegedroleassignment-update.md)|[privilegedRoleAssignment](../resources/privilegedroleassignment.md)|Update the properties of a [privilegedRoleAssignment](../resources/privilegedroleassignment.md) object.|
|[Delete privilegedRoleAssignment](../api/privilegedroleassignment-delete.md)|None|Deletes a [privilegedRoleAssignment](../resources/privilegedroleassignment.md) object.|
|[makeEligible](../api/privilegedroleassignment-makeeligible.md)|[privilegedRoleAssignment](../resources/privilegedroleassignment.md)|**TODO: Add Description**|
|[makePermanent](../api/privilegedroleassignment-makepermanent.md)|[privilegedRoleAssignment](../resources/privilegedroleassignment.md)|**TODO: Add Description**|
|[my](../api/privilegedroleassignment-my.md)|[privilegedRoleAssignment](../resources/privilegedroleassignment.md) collection|**TODO: Add Description**|
|[List privilegedRole](../api/privilegedroleassignment-list-roleinfo.md)|[privilegedRole](../resources/privilegedrole.md) collection|Get the privilegedRole resources from the roleInfo navigation property.|
|[Create privilegedRole](../api/privilegedroleassignment-post-roleinfo.md)|[privilegedRole](../resources/privilegedrole.md)|Create a new privilegedRole object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isElevated|Boolean|**TODO: Add Description**|
|resultMessage|String|**TODO: Add Description**|
|roleId|String|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|roleInfo|[privilegedRole](../resources/privilegedrole.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.privilegedRoleAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.privilegedRoleAssignment",
  "id": "String (identifier)",
  "expirationDateTime": "String (timestamp)",
  "isElevated": "Boolean",
  "resultMessage": "String",
  "roleId": "String",
  "userId": "String"
}
```

