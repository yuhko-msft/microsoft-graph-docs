---
title: "rbacApplicationMultiple resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# rbacApplicationMultiple resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List rbacApplicationMultiples](../api/rbacapplicationmultiple-list.md)|[rbacApplicationMultiple](../resources/rbacapplicationmultiple.md) collection|Get a list of the [rbacApplicationMultiple](../resources/rbacapplicationmultiple.md) objects and their properties.|
|[Create rbacApplicationMultiple](../api/rbacapplicationmultiple-create.md)|[rbacApplicationMultiple](../resources/rbacapplicationmultiple.md)|Create a new [rbacApplicationMultiple](../resources/rbacapplicationmultiple.md) object.|
|[Get rbacApplicationMultiple](../api/rbacapplicationmultiple-get.md)|[rbacApplicationMultiple](../resources/rbacapplicationmultiple.md)|Read the properties and relationships of a [rbacApplicationMultiple](../resources/rbacapplicationmultiple.md) object.|
|[Update rbacApplicationMultiple](../api/rbacapplicationmultiple-update.md)|[rbacApplicationMultiple](../resources/rbacapplicationmultiple.md)|Update the properties of a [rbacApplicationMultiple](../resources/rbacapplicationmultiple.md) object.|
|[Delete rbacApplicationMultiple](../api/rbacapplicationmultiple-delete.md)|None|Deletes a [rbacApplicationMultiple](../resources/rbacapplicationmultiple.md) object.|
|[List resourceNamespaces](../api/rbacapplicationmultiple-list-resourcenamespaces.md)|[unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) collection|Get the unifiedRbacResourceNamespace resources from the resourceNamespaces navigation property.|
|[Create unifiedRbacResourceNamespace](../api/rbacapplicationmultiple-post-resourcenamespaces.md)|[unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md)|Create a new unifiedRbacResourceNamespace object.|
|[List roleAssignments](../api/rbacapplicationmultiple-list-roleassignments.md)|[unifiedRoleAssignmentMultiple](../resources/unifiedroleassignmentmultiple.md) collection|Get the unifiedRoleAssignmentMultiple resources from the roleAssignments navigation property.|
|[Create unifiedRoleAssignmentMultiple](../api/rbacapplicationmultiple-post-roleassignments.md)|[unifiedRoleAssignmentMultiple](../resources/unifiedroleassignmentmultiple.md)|Create a new unifiedRoleAssignmentMultiple object.|
|[List roleDefinitions](../api/rbacapplicationmultiple-list-roledefinitions.md)|[unifiedRoleDefinition](../resources/unifiedroledefinition.md) collection|Get the unifiedRoleDefinition resources from the roleDefinitions navigation property.|
|[Create unifiedRoleDefinition](../api/rbacapplicationmultiple-post-roledefinitions.md)|[unifiedRoleDefinition](../resources/unifiedroledefinition.md)|Create a new unifiedRoleDefinition object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|resourceNamespaces|[unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) collection|**TODO: Add Description**|
|roleAssignments|[unifiedRoleAssignmentMultiple](../resources/unifiedroleassignmentmultiple.md) collection|**TODO: Add Description**|
|roleDefinitions|[unifiedRoleDefinition](../resources/unifiedroledefinition.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.rbacApplicationMultiple",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.rbacApplicationMultiple",
  "id": "String (identifier)"
}
```

