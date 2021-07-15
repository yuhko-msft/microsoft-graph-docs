---
title: "workbookChartLegend resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookChartLegend resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookChartLegends](../api/workbookchartlegend-list.md)|[workbookChartLegend](../resources/workbookchartlegend.md) collection|Get a list of the [workbookChartLegend](../resources/workbookchartlegend.md) objects and their properties.|
|[Create workbookChartLegend](../api/workbookchartlegend-create.md)|[workbookChartLegend](../resources/workbookchartlegend.md)|Create a new [workbookChartLegend](../resources/workbookchartlegend.md) object.|
|[Get workbookChartLegend](../api/workbookchartlegend-get.md)|[workbookChartLegend](../resources/workbookchartlegend.md)|Read the properties and relationships of a [workbookChartLegend](../resources/workbookchartlegend.md) object.|
|[Update workbookChartLegend](../api/workbookchartlegend-update.md)|[workbookChartLegend](../resources/workbookchartlegend.md)|Update the properties of a [workbookChartLegend](../resources/workbookchartlegend.md) object.|
|[Delete workbookChartLegend](../api/workbookchartlegend-delete.md)|None|Deletes a [workbookChartLegend](../resources/workbookchartlegend.md) object.|
|[List workbookChartLegendFormat](../api/workbookchartlegend-list-format.md)|[workbookChartLegendFormat](../resources/workbookchartlegendformat.md) collection|Get the workbookChartLegendFormat resources from the format navigation property.|
|[Create workbookChartLegendFormat](../api/workbookchartlegend-post-format.md)|[workbookChartLegendFormat](../resources/workbookchartlegendformat.md)|Create a new workbookChartLegendFormat object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|overlay|Boolean|**TODO: Add Description**|
|position|String|**TODO: Add Description**|
|visible|Boolean|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|format|[workbookChartLegendFormat](../resources/workbookchartlegendformat.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookChartLegend",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookChartLegend",
  "id": "String (identifier)",
  "overlay": "Boolean",
  "position": "String",
  "visible": "Boolean"
}
```

