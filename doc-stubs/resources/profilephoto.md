---
title: "profilePhoto resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# profilePhoto resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List photo](../api/contact-list-photo.md)|[profilePhoto](../resources/profilephoto.md) collection|Get the profilePhotoes from the photo navigation property.|
|[Create photo](../api/contact-post-photo.md)|[profilePhoto](../resources/profilephoto.md)|Create a new photo object.|
|[Update photo](../api/contact-update-photo.md)|[profilePhoto](../resources/profilephoto.md)|Update the properties of a photo object.|
|[Get photo](../api/contact-get-profilephoto.md)|[profilePhoto](../resources/profilephoto.md)|Read the properties and relationships of a [profilePhoto](../resources/profilephoto.md) object.|
|[Delete photo](../api/contact-delete-photo.md)|None|Delete a [profilePhoto](../resources/profilephoto.md) object.|
|[List profilePhotoes](../api/profilephoto-list.md)|[profilePhoto](../resources/profilephoto.md) collection|Get a list of the [profilePhoto](../resources/profilephoto.md) objects and their properties.|
|[Create profilePhoto](../api/profilephoto-create.md)|[profilePhoto](../resources/profilephoto.md)|Create a new [profilePhoto](../resources/profilephoto.md) object.|
|[Get profilePhoto](../api/profilephoto-get.md)|[profilePhoto](../resources/profilephoto.md)|Read the properties and relationships of a [profilePhoto](../resources/profilephoto.md) object.|
|[Update profilePhoto](../api/profilephoto-update.md)|[profilePhoto](../resources/profilephoto.md)|Update the properties of a [profilePhoto](../resources/profilephoto.md) object.|
|[Delete profilePhoto](../api/profilephoto-delete.md)|None|Deletes a [profilePhoto](../resources/profilephoto.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|height|Int32|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|width|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.profilePhoto",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.profilePhoto",
  "id": "String (identifier)",
  "height": "Integer",
  "width": "Integer"
}
```

