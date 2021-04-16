---
title: "roleScopeTag resource type"
description: "Role Scope Tag"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# roleScopeTag resource type

Namespace: microsoft.graph



Role Scope Tag


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List roleScopeTags](../api/rolescopetag-list.md)|[roleScopeTag](../resources/rolescopetag.md) collection|Get a list of the [roleScopeTag](../resources/rolescopetag.md) objects and their properties.|
|[Create roleScopeTag](../api/rolescopetag-create.md)|[roleScopeTag](../resources/rolescopetag.md)|Create a new [roleScopeTag](../resources/rolescopetag.md) object.|
|[Get roleScopeTag](../api/rolescopetag-get.md)|[roleScopeTag](../resources/rolescopetag.md)|Read the properties and relationships of a [roleScopeTag](../resources/rolescopetag.md) object.|
|[Update roleScopeTag](../api/rolescopetag-update.md)|[roleScopeTag](../resources/rolescopetag.md)|Update the properties of a [roleScopeTag](../resources/rolescopetag.md) object.|
|[Delete roleScopeTag](../api/rolescopetag-delete.md)|None|Deletes a [roleScopeTag](../resources/rolescopetag.md) object.|
|[assign](../api/rolescopetag-assign.md)|[roleScopeTagAutoAssignment](../resources/rolescopetagautoassignment.md) collection|**TODO: Add Description**|
|[getRoleScopeTagsById](../api/rolescopetag-getrolescopetagsbyid.md)|[roleScopeTag](../resources/rolescopetag.md) collection|**TODO: Add Description**|
|[hasCustomRoleScopeTag](../api/rolescopetag-hascustomrolescopetag.md)|Boolean|**TODO: Add Description**|
|[List assignments](../api/rolescopetag-list-assignments.md)|[roleScopeTagAutoAssignment](../resources/rolescopetagautoassignment.md) collection|Get the roleScopeTagAutoAssignment resources from the assignments navigation property.|
|[Create roleScopeTagAutoAssignment](../api/rolescopetag-post-assignments.md)|[roleScopeTagAutoAssignment](../resources/rolescopetagautoassignment.md)|Create a new roleScopeTagAutoAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|Description of the Role Scope Tag.|
|displayName|String|The display or friendly name of the Role Scope Tag.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isBuiltIn|Boolean|Description of the Role Scope Tag.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[roleScopeTagAutoAssignment](../resources/rolescopetagautoassignment.md) collection|The list of assignments for this Role Scope Tag.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.roleScopeTag",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.roleScopeTag",
  "id": "String (identifier)",
  "description": "String",
  "displayName": "String",
  "isBuiltIn": "Boolean"
}
```

