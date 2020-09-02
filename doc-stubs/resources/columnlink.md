---
title: "columnLink resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# columnLink resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List columnLinks](../api/contenttype-list-columnlinks.md)|[columnLink](../resources/columnlink.md) collection|Get the columnLinks from the columnLinks navigation property.|
|[Create columnLinks](../api/contenttype-post-columnlinks.md)|[columnLink](../resources/columnlink.md)|Create a new columnLinks object.|
|[Update columnLinks](../api/contenttype-update-columnlinks.md)|[columnLink](../resources/columnlink.md)|Update the properties of a columnLinks object.|
|[Get columnLinks](../api/contenttype-get-columnlink.md)|[columnLink](../resources/columnlink.md)|Read the properties and relationships of a [columnLink](../resources/columnlink.md) object.|
|[Delete columnLinks](../api/contenttype-delete-columnlinks.md)|None|Delete a [columnLink](../resources/columnlink.md) object.|
|[List columnLinks](../api/columnlink-list.md)|[columnLink](../resources/columnlink.md) collection|Get a list of the [columnLink](../resources/columnlink.md) objects and their properties.|
|[Create columnLink](../api/columnlink-create.md)|[columnLink](../resources/columnlink.md)|Create a new [columnLink](../resources/columnlink.md) object.|
|[Get columnLink](../api/columnlink-get.md)|[columnLink](../resources/columnlink.md)|Read the properties and relationships of a [columnLink](../resources/columnlink.md) object.|
|[Update columnLink](../api/columnlink-update.md)|[columnLink](../resources/columnlink.md)|Update the properties of a [columnLink](../resources/columnlink.md) object.|
|[Delete columnLink](../api/columnlink-delete.md)|None|Deletes a [columnLink](../resources/columnlink.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|name|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.columnLink",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.columnLink",
  "id": "String (identifier)",
  "name": "String"
}
```

