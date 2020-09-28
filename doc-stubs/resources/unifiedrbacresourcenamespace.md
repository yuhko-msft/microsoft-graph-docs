---
title: "unifiedRbacResourceNamespace resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# unifiedRbacResourceNamespace resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List resourceNamespaces](../api/rbacapplication-list-resourcenamespaces.md)|[unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) collection|Get the unifiedRbacResourceNamespace resources from the resourceNamespaces navigation property.|
|[Create resourceNamespaces](../api/rbacapplication-post-resourcenamespaces.md)|[unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md)|Create a new unifiedRbacResourceNamespace object.|
|[Update resourceNamespaces](../api/rbacapplication-update-resourcenamespaces.md)|[unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md)|Update the properties of a resourceNamespaces object.|
|[Get resourceNamespaces](../api/rbacapplication-get-unifiedrbacresourcenamespace.md)|[unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md)|Read the properties and relationships of an [unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) object.|
|[Delete resourceNamespaces](../api/rbacapplication-delete-resourcenamespaces.md)|None|Delete an [unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) object.|
|[List unifiedRbacResourceNamespaces](../api/unifiedrbacresourcenamespace-list.md)|[unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) collection|Get a list of the [unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) objects and their properties.|
|[Create unifiedRbacResourceNamespace](../api/unifiedrbacresourcenamespace-create.md)|[unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md)|Create a new [unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) object.|
|[Get unifiedRbacResourceNamespace](../api/unifiedrbacresourcenamespace-get.md)|[unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md)|Read the properties and relationships of an [unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) object.|
|[Update unifiedRbacResourceNamespace](../api/unifiedrbacresourcenamespace-update.md)|[unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md)|Update the properties of an [unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) object.|
|[Delete unifiedRbacResourceNamespace](../api/unifiedrbacresourcenamespace-delete.md)|None|Deletes an [unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) object.|
|[importResourceActions](../api/unifiedrbacresourcenamespace-importresourceactions.md)|[unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md)|**TODO: Add Description**|
|[List resourceActions](../api/unifiedrbacresourcenamespace-list-resourceactions.md)|[unifiedRbacResourceAction](../resources/unifiedrbacresourceaction.md) collection|Get the unifiedRbacResourceAction resources from the resourceActions navigation property.|
|[Create resourceActions](../api/unifiedrbacresourcenamespace-post-resourceactions.md)|[unifiedRbacResourceAction](../resources/unifiedrbacresourceaction.md)|Create a new unifiedRbacResourceAction object.|
|[Get resourceActions](../api/unifiedrbacresourcenamespace-get-unifiedrbacresourceaction.md)|[unifiedRbacResourceAction](../resources/unifiedrbacresourceaction.md)|Read the properties and relationships of an [unifiedRbacResourceAction](../resources/unifiedrbacresourceaction.md) object.|
|[Update resourceActions](../api/unifiedrbacresourcenamespace-update-resourceactions.md)|[unifiedRbacResourceAction](../resources/unifiedrbacresourceaction.md)|Update the properties of a resourceActions object.|
|[Delete resourceActions](../api/unifiedrbacresourcenamespace-delete-resourceactions.md)|None|Delete an [unifiedRbacResourceAction](../resources/unifiedrbacresourceaction.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|name|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|resourceActions|[unifiedRbacResourceAction](../resources/unifiedrbacresourceaction.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.unifiedRbacResourceNamespace",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.unifiedRbacResourceNamespace",
  "id": "String (identifier)",
  "name": "String"
}
```

