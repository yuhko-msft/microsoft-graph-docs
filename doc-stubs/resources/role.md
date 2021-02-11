---
title: "role resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# role resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List roles](../api/role-list.md)|[role](../resources/role.md) collection|Get a list of the [role](../resources/role.md) objects and their properties.|
|[Create role](../api/role-create.md)|[role](../resources/role.md)|Create a new [role](../resources/role.md) object.|
|[Get role](../api/role-get.md)|[role](../resources/role.md)|Read the properties and relationships of a [role](../resources/role.md) object.|
|[Update role](../api/role-update.md)|[role](../resources/role.md)|Update the properties of a [role](../resources/role.md) object.|
|[Delete role](../api/role-delete.md)|None|Deletes a [role](../resources/role.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|name|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.role",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.role",
  "id": "String (identifier)",
  "name": "String"
}
```

