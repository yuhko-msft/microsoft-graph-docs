---
title: "roleGroup resource type"
description: "Base entity type for all entities that can be modified by the API client."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# roleGroup resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base entity type for all entities that can be modified by the API client.


Inherits from [mutableEntity](../resources/industrydata-mutableentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List roleGroups](../api/industrydata-rolegroup-list.md)|[microsoft.graph.industryData.roleGroup](../resources/industrydata-rolegroup.md) collection|Get a list of the [roleGroup](../resources/industrydata-rolegroup.md) objects and their properties.|
|[Create roleGroup](../api/industrydata-industrydatahub-post-rolegroups.md)|[microsoft.graph.industryData.roleGroup](../resources/industrydata-rolegroup.md)|Create a new [roleGroup](../resources/industrydata-rolegroup.md) object.|
|[Get roleGroup](../api/industrydata-rolegroup-get.md)|[microsoft.graph.industryData.roleGroup](../resources/industrydata-rolegroup.md)|Read the properties and relationships of a [roleGroup](../resources/industrydata-rolegroup.md) object.|
|[Update roleGroup](../api/industrydata-rolegroup-update.md)|[microsoft.graph.industryData.roleGroup](../resources/industrydata-rolegroup.md)|Update the properties of a [roleGroup](../resources/industrydata-rolegroup.md) object.|
|[Delete roleGroup](../api/industrydata-rolegroup-delete.md)|None|Deletes a [roleGroup](../resources/industrydata-rolegroup.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The name of the role group.|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|
|roles|[microsoft.graph.industryData.roleReferenceValue](../resources/industrydata-rolereferencevalue.md) collection|The set of roles belonging to the role group.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.roleGroup",
  "baseType": "microsoft.graph.industryData.mutableEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.roleGroup",
  "eTag": "String",
  "displayName": "String",
  "roles": [
    {
      "@odata.type": "microsoft.graph.industryData.roleReferenceValue"
    }
  ]
}
```

