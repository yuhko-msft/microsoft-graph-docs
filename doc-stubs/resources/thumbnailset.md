---
title: "thumbnailSet resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# thumbnailSet resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List thumbnails](../api/driveitem-list-thumbnails.md)|[thumbnailSet](../resources/thumbnailset.md) collection|Get the thumbnailSets from the thumbnails navigation property.|
|[Create thumbnails](../api/driveitem-post-thumbnails.md)|[thumbnailSet](../resources/thumbnailset.md)|Create a new thumbnails object.|
|[Update thumbnails](../api/driveitem-update-thumbnails.md)|[thumbnailSet](../resources/thumbnailset.md)|Update the properties of a thumbnails object.|
|[Get thumbnails](../api/driveitem-get-thumbnailset.md)|[thumbnailSet](../resources/thumbnailset.md)|Read the properties and relationships of a [thumbnailSet](../resources/thumbnailset.md) object.|
|[Delete thumbnails](../api/driveitem-delete-thumbnails.md)|None|Delete a [thumbnailSet](../resources/thumbnailset.md) object.|
|[List thumbnailSets](../api/thumbnailset-list.md)|[thumbnailSet](../resources/thumbnailset.md) collection|Get a list of the [thumbnailSet](../resources/thumbnailset.md) objects and their properties.|
|[Create thumbnailSet](../api/thumbnailset-create.md)|[thumbnailSet](../resources/thumbnailset.md)|Create a new [thumbnailSet](../resources/thumbnailset.md) object.|
|[Get thumbnailSet](../api/thumbnailset-get.md)|[thumbnailSet](../resources/thumbnailset.md)|Read the properties and relationships of a [thumbnailSet](../resources/thumbnailset.md) object.|
|[Update thumbnailSet](../api/thumbnailset-update.md)|[thumbnailSet](../resources/thumbnailset.md)|Update the properties of a [thumbnailSet](../resources/thumbnailset.md) object.|
|[Delete thumbnailSet](../api/thumbnailset-delete.md)|None|Deletes a [thumbnailSet](../resources/thumbnailset.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|large|[thumbnail](../resources/thumbnail.md)|**TODO: Add Description**|
|medium|[thumbnail](../resources/thumbnail.md)|**TODO: Add Description**|
|small|[thumbnail](../resources/thumbnail.md)|**TODO: Add Description**|
|source|[thumbnail](../resources/thumbnail.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.thumbnailSet",
  "baseType": "microsoft.graph.entity",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.thumbnailSet",
  "id": "String (identifier)",
  "large": {
    "@odata.type": "microsoft.graph.thumbnail"
  },
  "medium": {
    "@odata.type": "microsoft.graph.thumbnail"
  },
  "small": {
    "@odata.type": "microsoft.graph.thumbnail"
  },
  "source": {
    "@odata.type": "microsoft.graph.thumbnail"
  }
}
```

