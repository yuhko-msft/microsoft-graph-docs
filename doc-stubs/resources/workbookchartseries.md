---
title: "workbookChartSeries resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookChartSeries resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookChartSeries](../api/workbookchartseries-list.md)|[workbookChartSeries](../resources/workbookchartseries.md) collection|Get a list of the [workbookChartSeries](../resources/workbookchartseries.md) objects and their properties.|
|[Create workbookChartSeries](../api/workbookchartseries-create.md)|[workbookChartSeries](../resources/workbookchartseries.md)|Create a new [workbookChartSeries](../resources/workbookchartseries.md) object.|
|[Get workbookChartSeries](../api/workbookchartseries-get.md)|[workbookChartSeries](../resources/workbookchartseries.md)|Read the properties and relationships of a [workbookChartSeries](../resources/workbookchartseries.md) object.|
|[Update workbookChartSeries](../api/workbookchartseries-update.md)|[workbookChartSeries](../resources/workbookchartseries.md)|Update the properties of a [workbookChartSeries](../resources/workbookchartseries.md) object.|
|[Delete workbookChartSeries](../api/workbookchartseries-delete.md)|None|Deletes a [workbookChartSeries](../resources/workbookchartseries.md) object.|
|[count](../api/workbookchartseries-count.md)|Int32|**TODO: Add Description**|
|[itemAt](../api/workbookchartseries-itemat.md)|[workbookChartSeries](../resources/workbookchartseries.md)|**TODO: Add Description**|
|[List workbookChartSeriesFormat](../api/workbookchartseries-list-format.md)|[workbookChartSeriesFormat](../resources/workbookchartseriesformat.md) collection|Get the workbookChartSeriesFormat resources from the format navigation property.|
|[Create workbookChartSeriesFormat](../api/workbookchartseries-post-format.md)|[workbookChartSeriesFormat](../resources/workbookchartseriesformat.md)|Create a new workbookChartSeriesFormat object.|
|[List points](../api/workbookchartseries-list-points.md)|[workbookChartPoint](../resources/workbookchartpoint.md) collection|Get the workbookChartPoint resources from the points navigation property.|
|[Create workbookChartPoint](../api/workbookchartseries-post-points.md)|[workbookChartPoint](../resources/workbookchartpoint.md)|Create a new workbookChartPoint object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|name|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|format|[workbookChartSeriesFormat](../resources/workbookchartseriesformat.md)|**TODO: Add Description**|
|points|[workbookChartPoint](../resources/workbookchartpoint.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookChartSeries",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookChartSeries",
  "id": "String (identifier)",
  "name": "String"
}
```

