---
title: "acronym resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# acronym resource type

Namespace: microsoft.graph.search

An acronym is a tenant wide administrative answer in Microsoft search results to define common acronyms in a tenant. An acronym has a few simple properties which define an acronym for an organization.\
\



Inherits from [searchAnswer](../resources/searchanswer.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List acronyms](../api/search-acronym-list-acronyms.md)|[acronym](../resources/acronym.md) collection|Get a list of the [acronym](../resources/acronym.md) objects and their properties.|
|[Create acronym](../api/search-acronym-post-acronyms.md)|[acronym](../resources/acronym.md)|Create a new [acronym](../resources/acronym.md) object.|
|[Get acronym](../api/search-acronym-get-acronyms.md)|[acronym](../resources/acronym.md)|Read the properties and relationships of an [acronym](../resources/acronym.md) object.|
|[Update acronym](../api/search-acronym-update-acronyms.md)|[acronym](../resources/acronym.md)|Update the properties of an [acronym](../resources/acronym.md) object.|
|[Delete acronym](../api/search-acronym-delete-acronyms.md)|None|Deletes an [acronym](../resources/acronym.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|A brief description of the acronym that gives users more info about the acronym and what it stands for. Inherited from [searchAnswer](../resources/searchanswer.md).|
|displayName|String|The actual short form or acronym. Inherited from [searchAnswer](../resources/searchanswer.md).|
|id|String|Guid id of the acronym. Inherited from [entity](../resources/entity.md).|
|lastModifiedBy|[identitySet](../resources/identityset.md)|Details of the user that created or last modified the acronym. Inherited from [searchAnswer](../resources/searchanswer.md). Read only.|
|lastModifiedDateTime|DateTimeOffset|Timestamp of when the acronym is created or edited Inherited from [searchAnswer](../resources/searchanswer.md). Read only.|
|standsFor|String collection|What the acronym stands for.|
|state|answerState|State of the acronym. Possible values are: `published`, `draft`, or `excluded`.|
|webUrl|String|The url of the page or website where users can go for more information about the acronym. Inherited from [searchAnswer](../resources/searchanswer.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.acronym",
  "baseType": "microsoft.graph.searchAnswer",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.acronym",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "webUrl": "String",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "standsFor": [
    "String"
  ],
  "state": "String"
}
```

