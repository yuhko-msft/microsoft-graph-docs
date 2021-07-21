---
title: "itemAnalytics resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# itemAnalytics resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List itemAnalytics](../api/itemanalytics-list.md)|[itemAnalytics](../resources/itemanalytics.md) collection|Get a list of the [itemAnalytics](../resources/itemanalytics.md) objects and their properties.|
|[Create itemAnalytics](../api/itemanalytics-create.md)|[itemAnalytics](../resources/itemanalytics.md)|Create a new [itemAnalytics](../resources/itemanalytics.md) object.|
|[Get itemAnalytics](../api/itemanalytics-get.md)|[itemAnalytics](../resources/itemanalytics.md)|Read the properties and relationships of an [itemAnalytics](../resources/itemanalytics.md) object.|
|[Update itemAnalytics](../api/itemanalytics-update.md)|[itemAnalytics](../resources/itemanalytics.md)|Update the properties of an [itemAnalytics](../resources/itemanalytics.md) object.|
|[Delete itemAnalytics](../api/itemanalytics-delete.md)|None|Deletes an [itemAnalytics](../resources/itemanalytics.md) object.|
|[List itemActivityStat](../api/itemanalytics-list-alltime.md)|[itemActivityStat](../resources/itemactivitystat.md) collection|Get the itemActivityStat resources from the allTime navigation property.|
|[Add itemActivityStat](../api/itemanalytics-post-alltime.md)|[itemActivityStat](../resources/itemactivitystat.md)|Add allTime by posting to the allTime collection.|
|[List itemActivityStats](../api/itemanalytics-list-itemactivitystats.md)|[itemActivityStat](../resources/itemactivitystat.md) collection|Get the itemActivityStat resources from the itemActivityStats navigation property.|
|[Create itemActivityStat](../api/itemanalytics-post-itemactivitystats.md)|[itemActivityStat](../resources/itemactivitystat.md)|Create a new itemActivityStat object.|
|[List itemActivityStat](../api/itemanalytics-list-lastsevendays.md)|[itemActivityStat](../resources/itemactivitystat.md) collection|Get the itemActivityStat resources from the lastSevenDays navigation property.|
|[Add itemActivityStat](../api/itemanalytics-post-lastsevendays.md)|[itemActivityStat](../resources/itemactivitystat.md)|Add lastSevenDays by posting to the lastSevenDays collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|allTime|[itemActivityStat](../resources/itemactivitystat.md)|**TODO: Add Description**|
|itemActivityStats|[itemActivityStat](../resources/itemactivitystat.md) collection|**TODO: Add Description**|
|lastSevenDays|[itemActivityStat](../resources/itemactivitystat.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.itemAnalytics",
  "baseType": "microsoft.graph.entity",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.itemAnalytics",
  "id": "String (identifier)"
}
```

