---
title: "acronym resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# acronym resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [searchAnswer](../resources/searchanswer.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List acronyms](../api/acronym-list.md)|[acronym](../resources/acronym.md) collection|Get a list of the [acronym](../resources/acronym.md) objects and their properties.|
|[Create acronym](../api/acronym-create.md)|[acronym](../resources/acronym.md)|Create a new [acronym](../resources/acronym.md) object.|
|[Get acronym](../api/acronym-get.md)|[acronym](../resources/acronym.md)|Read the properties and relationships of an [acronym](../resources/acronym.md) object.|
|[Update acronym](../api/acronym-update.md)|[acronym](../resources/acronym.md)|Update the properties of an [acronym](../resources/acronym.md) object.|
|[Delete acronym](../api/acronym-delete.md)|None|Deletes an [acronym](../resources/acronym.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description** Inherited from [searchAnswer](../resources/searchanswer.md)|
|displayName|String|**TODO: Add Description** Inherited from [searchAnswer](../resources/searchanswer.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [searchAnswer](../resources/searchanswer.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [searchAnswer](../resources/searchanswer.md)|
|standsFor|String collection|**TODO: Add Description**|
|state|answerState|**TODO: Add Description**. Possible values are: `Published`, `Draft`, `Excluded`.|
|webUrl|String|**TODO: Add Description** Inherited from [searchAnswer](../resources/searchanswer.md)|

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

