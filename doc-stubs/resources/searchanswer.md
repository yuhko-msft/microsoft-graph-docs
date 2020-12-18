---
title: "searchAnswer resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# searchAnswer resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List searchAnswers](../api/searchanswer-list.md)|[searchAnswer](../resources/searchanswer.md) collection|Get a list of the [searchAnswer](../resources/searchanswer.md) objects and their properties.|
|[Create searchAnswer](../api/searchanswer-create.md)|[searchAnswer](../resources/searchanswer.md)|Create a new [searchAnswer](../resources/searchanswer.md) object.|
|[Get searchAnswer](../api/searchanswer-get.md)|[searchAnswer](../resources/searchanswer.md)|Read the properties and relationships of a [searchAnswer](../resources/searchanswer.md) object.|
|[Update searchAnswer](../api/searchanswer-update.md)|[searchAnswer](../resources/searchanswer.md)|Update the properties of a [searchAnswer](../resources/searchanswer.md) object.|
|[Delete searchAnswer](../api/searchanswer-delete.md)|None|Deletes a [searchAnswer](../resources/searchanswer.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|webUrl|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.searchAnswer",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.searchAnswer",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "webUrl": "String",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)"
}
```

