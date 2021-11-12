---
title: "mutableEntity resource type"
description: "Base entity type for all entities that can be modified by the API client."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mutableEntity resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base entity type for all entities that can be modified by the API client.
This is an abstract type.


Inherits from [entity](../resources/industrydata-entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mutableEntities](../api/industrydata-mutableentity-list.md)|[microsoft.graph.industryData.mutableEntity](../resources/industrydata-mutableentity.md) collection|Get a list of the [mutableEntity](../resources/industrydata-mutableentity.md) objects and their properties.|
|[Get mutableEntity](../api/industrydata-mutableentity-get.md)|[microsoft.graph.industryData.mutableEntity](../resources/industrydata-mutableentity.md)|Read the properties and relationships of a [mutableEntity](../resources/industrydata-mutableentity.md) object.|
|[Update mutableEntity](../api/industrydata-mutableentity-update.md)|[microsoft.graph.industryData.mutableEntity](../resources/industrydata-mutableentity.md)|Update the properties of a [mutableEntity](../resources/industrydata-mutableentity.md) object.|
|[Delete mutableEntity](../api/industrydata-mutableentity-delete.md)|None|Deletes a [mutableEntity](../resources/industrydata-mutableentity.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.mutableEntity",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.mutableEntity",
  "eTag": "String"
}
```

