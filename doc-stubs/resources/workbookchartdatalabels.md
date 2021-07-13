---
title: "workbookChartDataLabels resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookChartDataLabels resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookChartDataLabels](../api/workbookchartdatalabels-list.md)|[workbookChartDataLabels](../resources/workbookchartdatalabels.md) collection|Get a list of the [workbookChartDataLabels](../resources/workbookchartdatalabels.md) objects and their properties.|
|[Create workbookChartDataLabels](../api/workbookchartdatalabels-create.md)|[workbookChartDataLabels](../resources/workbookchartdatalabels.md)|Create a new [workbookChartDataLabels](../resources/workbookchartdatalabels.md) object.|
|[Get workbookChartDataLabels](../api/workbookchartdatalabels-get.md)|[workbookChartDataLabels](../resources/workbookchartdatalabels.md)|Read the properties and relationships of a [workbookChartDataLabels](../resources/workbookchartdatalabels.md) object.|
|[Update workbookChartDataLabels](../api/workbookchartdatalabels-update.md)|[workbookChartDataLabels](../resources/workbookchartdatalabels.md)|Update the properties of a [workbookChartDataLabels](../resources/workbookchartdatalabels.md) object.|
|[Delete workbookChartDataLabels](../api/workbookchartdatalabels-delete.md)|None|Deletes a [workbookChartDataLabels](../resources/workbookchartdatalabels.md) object.|
|[List workbookChartDataLabelFormat](../api/workbookchartdatalabels-list-format.md)|[workbookChartDataLabelFormat](../resources/workbookchartdatalabelformat.md) collection|Get the workbookChartDataLabelFormat resources from the format navigation property.|
|[Create workbookChartDataLabelFormat](../api/workbookchartdatalabels-post-format.md)|[workbookChartDataLabelFormat](../resources/workbookchartdatalabelformat.md)|Create a new workbookChartDataLabelFormat object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|position|String|**TODO: Add Description**|
|separator|String|**TODO: Add Description**|
|showBubbleSize|Boolean|**TODO: Add Description**|
|showCategoryName|Boolean|**TODO: Add Description**|
|showLegendKey|Boolean|**TODO: Add Description**|
|showPercentage|Boolean|**TODO: Add Description**|
|showSeriesName|Boolean|**TODO: Add Description**|
|showValue|Boolean|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|format|[workbookChartDataLabelFormat](../resources/workbookchartdatalabelformat.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookChartDataLabels",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookChartDataLabels",
  "id": "String (identifier)",
  "position": "String",
  "separator": "String",
  "showBubbleSize": "Boolean",
  "showCategoryName": "Boolean",
  "showLegendKey": "Boolean",
  "showPercentage": "Boolean",
  "showSeriesName": "Boolean",
  "showValue": "Boolean"
}
```

