---
title: "itemActivity resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# itemActivity resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List itemActivities](../api/itemactivity-list.md)|[itemActivity](../resources/itemactivity.md) collection|Get a list of the [itemActivity](../resources/itemactivity.md) objects and their properties.|
|[Create itemActivity](../api/itemactivity-create.md)|[itemActivity](../resources/itemactivity.md)|Create a new [itemActivity](../resources/itemactivity.md) object.|
|[Get itemActivity](../api/itemactivity-get.md)|[itemActivity](../resources/itemactivity.md)|Read the properties and relationships of an [itemActivity](../resources/itemactivity.md) object.|
|[Update itemActivity](../api/itemactivity-update.md)|[itemActivity](../resources/itemactivity.md)|Update the properties of an [itemActivity](../resources/itemactivity.md) object.|
|[Delete itemActivity](../api/itemactivity-delete.md)|None|Deletes an [itemActivity](../resources/itemactivity.md) object.|
|[List listItem](../api/itemactivity-list-listitem.md)|[listItem](../resources/listitem.md) collection|Get the listItem resources from the listItem navigation property.|
|[Create listItem](../api/itemactivity-post-listitem.md)|[listItem](../resources/listitem.md)|Create a new listItem object.|

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
  "@odata.type": "microsoft.graph.itemActivity",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.itemActivity",
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

