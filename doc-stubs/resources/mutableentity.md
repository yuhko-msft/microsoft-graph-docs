---
title: "mutableEntity resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mutableEntity resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**
This is an abstract type.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mutableEntities](../api/mutableentity-list.md)|[mutableEntity](../resources/mutableentity.md) collection|Get a list of the [mutableEntity](../resources/mutableentity.md) objects and their properties.|
|[Get mutableEntity](../api/mutableentity-get.md)|[mutableEntity](../resources/mutableentity.md)|Read the properties and relationships of a [mutableEntity](../resources/mutableentity.md) object.|
|[Update mutableEntity](../api/mutableentity-update.md)|[mutableEntity](../resources/mutableentity.md)|Update the properties of a [mutableEntity](../resources/mutableentity.md) object.|
|[Delete mutableEntity](../api/mutableentity-delete.md)|None|Deletes a [mutableEntity](../resources/mutableentity.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|eTag|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mutableEntity",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mutableEntity",
  "eTag": "String"
}
```

