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

Search Answer is a base type for other search answers which includes properties that apply to other search answer entities.


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
|id|String|Guid id of the Bookmark Inherited from [entity](../resources/entity.md)|
|displayName|String|Bookmark Display Name Inherited from [searchAnswer](../resources/searchanswer.md)|
|description|String|Bookmark Description Inherited from [searchAnswer](../resources/searchanswer.md)|
|webUrl|String|Bookmark URL Inherited from [searchAnswer](../resources/searchanswer.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|Read only. Details of the user that created or last modified the bookmark Inherited from [searchAnswer](../resources/searchanswer.md)|
|lastModifiedDateTime|DateTimeOffset|Read only. Timestamp of when the bookmark is created or edited Inherited from [searchAnswer](../resources/searchanswer.md)|

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

