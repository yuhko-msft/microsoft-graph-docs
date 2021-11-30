---
title: "roleGroup resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# roleGroup resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


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
|displayName|String|**TODO: Add Description**|
|eTag|String|**TODO: Add Description** Inherited from [mutableEntity](../resources/mutableentity.md).|
|roles|String collection|**TODO: Add Description**|

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

