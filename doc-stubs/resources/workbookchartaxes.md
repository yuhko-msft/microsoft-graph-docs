---
title: "workbookChartAxes resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookChartAxes resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookChartAxes](../api/workbookchartaxes-list.md)|[workbookChartAxes](../resources/workbookchartaxes.md) collection|Get a list of the [workbookChartAxes](../resources/workbookchartaxes.md) objects and their properties.|
|[Create workbookChartAxes](../api/workbookchartaxes-create.md)|[workbookChartAxes](../resources/workbookchartaxes.md)|Create a new [workbookChartAxes](../resources/workbookchartaxes.md) object.|
|[Get workbookChartAxes](../api/workbookchartaxes-get.md)|[workbookChartAxes](../resources/workbookchartaxes.md)|Read the properties and relationships of a [workbookChartAxes](../resources/workbookchartaxes.md) object.|
|[Update workbookChartAxes](../api/workbookchartaxes-update.md)|[workbookChartAxes](../resources/workbookchartaxes.md)|Update the properties of a [workbookChartAxes](../resources/workbookchartaxes.md) object.|
|[Delete workbookChartAxes](../api/workbookchartaxes-delete.md)|None|Deletes a [workbookChartAxes](../resources/workbookchartaxes.md) object.|
|[List workbookChartAxis](../api/workbookchartaxes-list-categoryaxis.md)|[workbookChartAxis](../resources/workbookchartaxis.md) collection|Get the workbookChartAxis resources from the categoryAxis navigation property.|
|[Create workbookChartAxis](../api/workbookchartaxes-post-categoryaxis.md)|[workbookChartAxis](../resources/workbookchartaxis.md)|Create a new workbookChartAxis object.|
|[List workbookChartAxis](../api/workbookchartaxes-list-seriesaxis.md)|[workbookChartAxis](../resources/workbookchartaxis.md) collection|Get the workbookChartAxis resources from the seriesAxis navigation property.|
|[Create workbookChartAxis](../api/workbookchartaxes-post-seriesaxis.md)|[workbookChartAxis](../resources/workbookchartaxis.md)|Create a new workbookChartAxis object.|
|[List workbookChartAxis](../api/workbookchartaxes-list-valueaxis.md)|[workbookChartAxis](../resources/workbookchartaxis.md) collection|Get the workbookChartAxis resources from the valueAxis navigation property.|
|[Create workbookChartAxis](../api/workbookchartaxes-post-valueaxis.md)|[workbookChartAxis](../resources/workbookchartaxis.md)|Create a new workbookChartAxis object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|categoryAxis|[workbookChartAxis](../resources/workbookchartaxis.md)|**TODO: Add Description**|
|seriesAxis|[workbookChartAxis](../resources/workbookchartaxis.md)|**TODO: Add Description**|
|valueAxis|[workbookChartAxis](../resources/workbookchartaxis.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookChartAxes",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookChartAxes",
  "id": "String (identifier)"
}
```

