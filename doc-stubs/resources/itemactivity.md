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

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List activities](../api/itemactivitystat-list-activities.md)|[itemActivity](../resources/itemactivity.md) collection|Get the itemActivities from the activities navigation property.|
|[Add activities](../api/itemactivitystat-post-activities.md)|[itemActivity](../resources/itemactivity.md)|Add activities by posting to the activities collection.|
|[Remove activities](../api/itemactivitystat-delete-activities.md)|None|Remove an [itemActivity](../resources/itemactivity.md) object.|
|[List itemActivities](../api/itemactivity-list.md)|[itemActivity](../resources/itemactivity.md) collection|Get a list of the [itemActivity](../resources/itemactivity.md) objects and their properties.|
|[Create itemActivity](../api/itemactivity-create.md)|[itemActivity](../resources/itemactivity.md)|Create a new [itemActivity](../resources/itemactivity.md) object.|
|[Get itemActivity](../api/itemactivity-get.md)|[itemActivity](../resources/itemactivity.md)|Read the properties and relationships of an [itemActivity](../resources/itemactivity.md) object.|
|[Update itemActivity](../api/itemactivity-update.md)|[itemActivity](../resources/itemactivity.md)|Update the properties of an [itemActivity](../resources/itemactivity.md) object.|
|[Delete itemActivity](../api/itemactivity-delete.md)|None|Deletes an [itemActivity](../resources/itemactivity.md) object.|
|[List driveItem](../api/itemactivity-list-driveitem.md)|[driveItem](../resources/driveitem.md) collection|Get the driveItems from the driveItem navigation property.|
|[Create driveItem](../api/itemactivity-post-driveitem.md)|[driveItem](../resources/driveitem.md)|Create a new driveItem object.|
|[Get driveItem](../api/itemactivity-get-driveitem.md)|[driveItem](../resources/driveitem.md)|Read the properties and relationships of a [driveItem](../resources/driveitem.md) object.|
|[Update driveItem](../api/itemactivity-update-driveitem.md)|[driveItem](../resources/driveitem.md)|Update the properties of a driveItem object.|
|[Delete driveItem](../api/itemactivity-delete-driveitem.md)|None|Delete a [driveItem](../resources/driveitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|access|[accessAction](../resources/accessaction.md)|**TODO: Add Description**|
|activityDateTime|DateTimeOffset|**TODO: Add Description**|
|actor|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|driveItem|[driveItem](../resources/driveitem.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.itemActivity",
  "baseType": "microsoft.graph.entity",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.itemActivity",
  "id": "String (identifier)",
  "access": {
    "@odata.type": "microsoft.graph.accessAction"
  },
  "activityDateTime": "String (timestamp)",
  "actor": {
    "@odata.type": "microsoft.graph.identitySet"
  }
}
```

