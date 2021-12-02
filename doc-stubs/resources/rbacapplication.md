---
title: "rbacApplication resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# rbacApplication resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List rbacApplications](../api/rbacapplication-list.md)|[rbacApplication](../resources/rbacapplication.md) collection|Get a list of the [rbacApplication](../resources/rbacapplication.md) objects and their properties.|
|[Get rbacApplication](../api/rbacapplication-get.md)|[rbacApplication](../resources/rbacapplication.md)|Read the properties and relationships of a [rbacApplication](../resources/rbacapplication.md) object.|
|[Update rbacApplication](../api/rbacapplication-update.md)|[rbacApplication](../resources/rbacapplication.md)|Update the properties of a [rbacApplication](../resources/rbacapplication.md) object.|
|[Delete rbacApplication](../api/rbacapplication-delete.md)|None|Deletes a [rbacApplication](../resources/rbacapplication.md) object.|
|[List resourceNamespaces](../api/rbacapplication-list-resourcenamespaces.md)|[unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) collection|Get the unifiedRbacResourceNamespace resources from the resourceNamespaces navigation property.|
|[Create unifiedRbacResourceNamespace](../api/rbacapplication-post-resourcenamespaces.md)|[unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md)|Create a new unifiedRbacResourceNamespace object.|
|[List roleAssignments](../api/rbacapplication-list-roleassignments.md)|[unifiedRoleAssignment](../resources/unifiedroleassignment.md) collection|Get the unifiedRoleAssignment resources from the roleAssignments navigation property.|
|[Create unifiedRoleAssignment](../api/rbacapplication-post-roleassignments.md)|[unifiedRoleAssignment](../resources/unifiedroleassignment.md)|Create a new unifiedRoleAssignment object.|
|[List roleDefinitions](../api/rbacapplication-list-roledefinitions.md)|[unifiedRoleDefinition](../resources/unifiedroledefinition.md) collection|Get the unifiedRoleDefinition resources from the roleDefinitions navigation property.|
|[Create unifiedRoleDefinition](../api/rbacapplication-post-roledefinitions.md)|[unifiedRoleDefinition](../resources/unifiedroledefinition.md)|Create a new unifiedRoleDefinition object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|resourceNamespaces|[unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) collection|**TODO: Add Description**|
|roleAssignments|[unifiedRoleAssignment](../resources/unifiedroleassignment.md) collection|**TODO: Add Description**|
|roleDefinitions|[unifiedRoleDefinition](../resources/unifiedroledefinition.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.rbacApplication",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.rbacApplication"
}
```

