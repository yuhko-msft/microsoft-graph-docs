---
title: "rbacApplication resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# rbacApplication resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List rbacApplications](../api/rbacapplication-list.md)|[rbacApplication](../resources/rbacapplication.md) collection|Get a list of the [rbacApplication](../resources/rbacapplication.md) objects and their properties.|
|[Create rbacApplication](../api/rbacapplication-create.md)|[rbacApplication](../resources/rbacapplication.md)|Create a new [rbacApplication](../resources/rbacapplication.md) object.|
|[Get rbacApplication](../api/rbacapplication-get.md)|[rbacApplication](../resources/rbacapplication.md)|Read the properties and relationships of a [rbacApplication](../resources/rbacapplication.md) object.|
|[Update rbacApplication](../api/rbacapplication-update.md)|[rbacApplication](../resources/rbacapplication.md)|Update the properties of a [rbacApplication](../resources/rbacapplication.md) object.|
|[Delete rbacApplication](../api/rbacapplication-delete.md)|None|Deletes a [rbacApplication](../resources/rbacapplication.md) object.|
|[List roleAssignments](../api/rbacapplication-list-roleassignments.md)|[unifiedRoleAssignment](../resources/unifiedroleassignment.md) collection|Get the unifiedRoleAssignment resources from the roleAssignments navigation property.|
|[Create unifiedRoleAssignment](../api/rbacapplication-post-roleassignments.md)|[unifiedRoleAssignment](../resources/unifiedroleassignment.md)|Create a new unifiedRoleAssignment object.|
|[List roleDefinitions](../api/rbacapplication-list-roledefinitions.md)|[unifiedRoleDefinition](../resources/unifiedroledefinition.md) collection|Get the unifiedRoleDefinition resources from the roleDefinitions navigation property.|
|[Create unifiedRoleDefinition](../api/rbacapplication-post-roledefinitions.md)|[unifiedRoleDefinition](../resources/unifiedroledefinition.md)|Create a new unifiedRoleDefinition object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|roleAssignments|[unifiedRoleAssignment](../resources/unifiedroleassignment.md) collection|**TODO: Add Description**|
|roleDefinitions|[unifiedRoleDefinition](../resources/unifiedroledefinition.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.rbacApplication",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.rbacApplication",
  "id": "String (identifier)"
}
```

