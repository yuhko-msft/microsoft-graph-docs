---
title: "privilegedRole resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# privilegedRole resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List privilegedRoles](../api/privilegedrole-list.md)|[privilegedRole](../resources/privilegedrole.md) collection|Get a list of the [privilegedRole](../resources/privilegedrole.md) objects and their properties.|
|[Create privilegedRole](../api/privilegedrole-post-privilegedroles.md)|[privilegedRole](../resources/privilegedrole.md)|Create a new [privilegedRole](../resources/privilegedrole.md) object.|
|[Get privilegedRole](../api/privilegedrole-get.md)|[privilegedRole](../resources/privilegedrole.md)|Read the properties and relationships of a [privilegedRole](../resources/privilegedrole.md) object.|
|[Update privilegedRole](../api/privilegedrole-update.md)|[privilegedRole](../resources/privilegedrole.md)|Update the properties of a [privilegedRole](../resources/privilegedrole.md) object.|
|[Delete privilegedRole](../api/privilegedrole-delete.md)|None|Deletes a [privilegedRole](../resources/privilegedrole.md) object.|
|[selfActivate](../api/privilegedrole-selfactivate.md)|[privilegedRoleAssignment](../resources/privilegedroleassignment.md)|**TODO: Add Description**|
|[selfDeactivate](../api/privilegedrole-selfdeactivate.md)|[privilegedRoleAssignment](../resources/privilegedroleassignment.md)|**TODO: Add Description**|
|[List assignments](../api/privilegedrole-list-assignments.md)|[privilegedRoleAssignment](../resources/privilegedroleassignment.md) collection|Get the privilegedRoleAssignment resources from the assignments navigation property.|
|[Add privilegedRoleAssignment](../api/privilegedrole-post-assignments.md)|[privilegedRoleAssignment](../resources/privilegedroleassignment.md)|Add assignments by posting to the assignments collection.|
|[List privilegedRoleSettings](../api/privilegedrole-list-settings.md)|[privilegedRoleSettings](../resources/privilegedrolesettings.md) collection|Get the privilegedRoleSettings resources from the settings navigation property.|
|[Create privilegedRoleSettings](../api/privilegedrole-post-settings.md)|[privilegedRoleSettings](../resources/privilegedrolesettings.md)|Create a new privilegedRoleSettings object.|
|[List privilegedRoleSummary](../api/privilegedrole-list-summary.md)|[privilegedRoleSummary](../resources/privilegedrolesummary.md) collection|Get the privilegedRoleSummary resources from the summary navigation property.|
|[Create privilegedRoleSummary](../api/privilegedrole-post-summary.md)|[privilegedRoleSummary](../resources/privilegedrolesummary.md)|Create a new privilegedRoleSummary object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|name|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[privilegedRoleAssignment](../resources/privilegedroleassignment.md) collection|**TODO: Add Description**|
|settings|[privilegedRoleSettings](../resources/privilegedrolesettings.md)|**TODO: Add Description**|
|summary|[privilegedRoleSummary](../resources/privilegedrolesummary.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.privilegedRole",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.privilegedRole",
  "id": "String (identifier)",
  "name": "String"
}
```

