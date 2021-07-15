---
title: "workbookChartSeriesFormat resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookChartSeriesFormat resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookChartSeriesFormats](../api/workbookchartseriesformat-list.md)|[workbookChartSeriesFormat](../resources/workbookchartseriesformat.md) collection|Get a list of the [workbookChartSeriesFormat](../resources/workbookchartseriesformat.md) objects and their properties.|
|[Create workbookChartSeriesFormat](../api/workbookchartseriesformat-create.md)|[workbookChartSeriesFormat](../resources/workbookchartseriesformat.md)|Create a new [workbookChartSeriesFormat](../resources/workbookchartseriesformat.md) object.|
|[Get workbookChartSeriesFormat](../api/workbookchartseriesformat-get.md)|[workbookChartSeriesFormat](../resources/workbookchartseriesformat.md)|Read the properties and relationships of a [workbookChartSeriesFormat](../resources/workbookchartseriesformat.md) object.|
|[Update workbookChartSeriesFormat](../api/workbookchartseriesformat-update.md)|[workbookChartSeriesFormat](../resources/workbookchartseriesformat.md)|Update the properties of a [workbookChartSeriesFormat](../resources/workbookchartseriesformat.md) object.|
|[Delete workbookChartSeriesFormat](../api/workbookchartseriesformat-delete.md)|None|Deletes a [workbookChartSeriesFormat](../resources/workbookchartseriesformat.md) object.|
|[List workbookChartFill](../api/workbookchartseriesformat-list-fill.md)|[workbookChartFill](../resources/workbookchartfill.md) collection|Get the workbookChartFill resources from the fill navigation property.|
|[Create workbookChartFill](../api/workbookchartseriesformat-post-fill.md)|[workbookChartFill](../resources/workbookchartfill.md)|Create a new workbookChartFill object.|
|[List workbookChartLineFormat](../api/workbookchartseriesformat-list-line.md)|[workbookChartLineFormat](../resources/workbookchartlineformat.md) collection|Get the workbookChartLineFormat resources from the line navigation property.|
|[Create workbookChartLineFormat](../api/workbookchartseriesformat-post-line.md)|[workbookChartLineFormat](../resources/workbookchartlineformat.md)|Create a new workbookChartLineFormat object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|fill|[workbookChartFill](../resources/workbookchartfill.md)|**TODO: Add Description**|
|line|[workbookChartLineFormat](../resources/workbookchartlineformat.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookChartSeriesFormat",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookChartSeriesFormat",
  "id": "String (identifier)"
}
```

