---
title: "person resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# person resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List people](../api/person-list.md)|[person](../resources/person.md) collection|Get a list of the [person](../resources/person.md) objects and their properties.|
|[Create person](../api/person-create.md)|[person](../resources/person.md)|Create a new [person](../resources/person.md) object.|
|[Get person](../api/person-get.md)|[person](../resources/person.md)|Read the properties and relationships of a [person](../resources/person.md) object.|
|[Update person](../api/person-update.md)|[person](../resources/person.md)|Update the properties of a [person](../resources/person.md) object.|
|[Delete person](../api/person-delete.md)|None|Deletes a [person](../resources/person.md) object.|
|[List role](../api/person-list-role.md)|[role](../resources/role.md) collection|Get the role resources from the role navigation property.|
|[Add role](../api/person-post-role.md)|[role](../resources/role.md)|Add role by posting to the role collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|emailaddress|String|**TODO: Add Description**|
|id|Int32|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|phone|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|role|[role](../resources/role.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.person",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.person",
  "id": "String (identifier)",
  "name": "String",
  "phone": "String",
  "emailaddress": "String"
}
```

