---
title: "outlookItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# outlookItem resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List outlookItems](../api/outlookitem-list.md)|[outlookItem](../resources/outlookitem.md) collection|Get a list of the [outlookItem](../resources/outlookitem.md) objects and their properties.|
|[Create outlookItem](../api/outlookitem-create.md)|[outlookItem](../resources/outlookitem.md)|Create a new [outlookItem](../resources/outlookitem.md) object.|
|[Get outlookItem](../api/outlookitem-get.md)|[outlookItem](../resources/outlookitem.md)|Read the properties and relationships of an [outlookItem](../resources/outlookitem.md) object.|
|[Update outlookItem](../api/outlookitem-update.md)|[outlookItem](../resources/outlookitem.md)|Update the properties of an [outlookItem](../resources/outlookitem.md) object.|
|[Delete outlookItem](../api/outlookitem-delete.md)|None|Deletes an [outlookItem](../resources/outlookitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|categories|String collection|**TODO: Add Description**|
|changeKey|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.outlookItem",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.outlookItem",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "changeKey": "String",
  "categories": [
    "String"
  ]
}
```

