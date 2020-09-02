---
title: "itemActivityOLD resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# itemActivityOLD resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List itemActivityOLDs](../api/itemactivityold-list.md)|[itemActivityOLD](../resources/itemactivityold.md) collection|Get a list of the [itemActivityOLD](../resources/itemactivityold.md) objects and their properties.|
|[Create itemActivityOLD](../api/itemactivityold-create.md)|[itemActivityOLD](../resources/itemactivityold.md)|Create a new [itemActivityOLD](../resources/itemactivityold.md) object.|
|[Get itemActivityOLD](../api/itemactivityold-get.md)|[itemActivityOLD](../resources/itemactivityold.md)|Read the properties and relationships of an [itemActivityOLD](../resources/itemactivityold.md) object.|
|[Update itemActivityOLD](../api/itemactivityold-update.md)|[itemActivityOLD](../resources/itemactivityold.md)|Update the properties of an [itemActivityOLD](../resources/itemactivityold.md) object.|
|[Delete itemActivityOLD](../api/itemactivityold-delete.md)|None|Deletes an [itemActivityOLD](../resources/itemactivityold.md) object.|
|[List driveItem](../api/itemactivityold-list-driveitem.md)|[driveItem](../resources/driveitem.md) collection|Get the driveItems from the driveItem navigation property.|
|[Create driveItem](../api/itemactivityold-post-driveitem.md)|[driveItem](../resources/driveitem.md)|Create a new driveItem object.|
|[Get driveItem](../api/itemactivityold-get-driveitem.md)|[driveItem](../resources/driveitem.md)|Read the properties and relationships of a [driveItem](../resources/driveitem.md) object.|
|[Update driveItem](../api/itemactivityold-update-driveitem.md)|[driveItem](../resources/driveitem.md)|Update the properties of a driveItem object.|
|[Delete driveItem](../api/itemactivityold-delete-driveitem.md)|None|Delete a [driveItem](../resources/driveitem.md) object.|
|[List listItem](../api/itemactivityold-list-listitem.md)|[listItem](../resources/listitem.md) collection|Get the listItems from the listItem navigation property.|
|[Create listItem](../api/itemactivityold-post-listitem.md)|[listItem](../resources/listitem.md)|Create a new listItem object.|
|[Get listItem](../api/itemactivityold-get-listitem.md)|[listItem](../resources/listitem.md)|Read the properties and relationships of a [listItem](../resources/listitem.md) object.|
|[Update listItem](../api/itemactivityold-update-listitem.md)|[listItem](../resources/listitem.md)|Update the properties of a listItem object.|
|[Delete listItem](../api/itemactivityold-delete-listitem.md)|None|Delete a [listItem](../resources/listitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|action|[itemActionSet](../resources/itemactionset.md)|**TODO: Add Description**|
|actor|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|times|[itemActivityTimeSet](../resources/itemactivitytimeset.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|driveItem|[driveItem](../resources/driveitem.md)|**TODO: Add Description**|
|listItem|[listItem](../resources/listitem.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.itemActivityOLD",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.itemActivityOLD",
  "id": "String (identifier)",
  "action": {
    "@odata.type": "microsoft.graph.itemActionSet"
  },
  "actor": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "times": {
    "@odata.type": "microsoft.graph.itemActivityTimeSet"
  }
}
```

