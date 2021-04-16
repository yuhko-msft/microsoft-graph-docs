---
title: "document resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# document resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List documents](../api/document-list.md)|[document](../resources/document.md) collection|Get a list of the [document](../resources/document.md) objects and their properties.|
|[Create document](../api/document-create.md)|[document](../resources/document.md)|Create a new [document](../resources/document.md) object.|
|[Get document](../api/document-get.md)|[document](../resources/document.md)|Read the properties and relationships of a [document](../resources/document.md) object.|
|[Update document](../api/document-update.md)|[document](../resources/document.md)|Update the properties of a [document](../resources/document.md) object.|
|[Delete document](../api/document-delete.md)|None|Deletes a [document](../resources/document.md) object.|
|[List comments](../api/document-list-comments.md)|[documentComment](../resources/documentcomment.md) collection|Get the documentComment resources from the comments navigation property.|
|[Create documentComment](../api/document-post-comments.md)|[documentComment](../resources/documentcomment.md)|Create a new documentComment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|comments|[documentComment](../resources/documentcomment.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.document",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.document",
  "id": "String (identifier)"
}
```

