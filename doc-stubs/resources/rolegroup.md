---
title: "roleGroup resource type"
description: "Base entity type for all entities that can be modified by the API client."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# roleGroup resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base entity type for all entities that can be modified by the API client.


Inherits from [mutableEntity](../resources/mutableentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List roleGroups](../api/rolegroup-list.md)|[roleGroup](../resources/rolegroup.md) collection|Get a list of the [roleGroup](../resources/rolegroup.md) objects and their properties.|
|[Create roleGroup](../api/industrydatahub-post-rolegroups.md)|[roleGroup](../resources/rolegroup.md)|Create a new [roleGroup](../resources/rolegroup.md) object.|
|[Get roleGroup](../api/rolegroup-get.md)|[roleGroup](../resources/rolegroup.md)|Read the properties and relationships of a [roleGroup](../resources/rolegroup.md) object.|
|[Update roleGroup](../api/rolegroup-update.md)|[roleGroup](../resources/rolegroup.md)|Update the properties of a [roleGroup](../resources/rolegroup.md) object.|
|[Delete roleGroup](../api/rolegroup-delete.md)|None|Deletes a [roleGroup](../resources/rolegroup.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The name of the role group.|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md).|
|roles|String collection|The set of roles belonging to the role group.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.roleGroup",
  "baseType": "microsoft.industryData.mutableEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.roleGroup",
  "eTag": "String",
  "displayName": "String",
  "roles": [
    "String"
  ]
}
```

