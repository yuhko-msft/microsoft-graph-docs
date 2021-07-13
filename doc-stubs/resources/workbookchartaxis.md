---
title: "workbookChartAxis resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookChartAxis resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookChartAxis](../api/workbookchartaxis-list.md)|[workbookChartAxis](../resources/workbookchartaxis.md) collection|Get a list of the [workbookChartAxis](../resources/workbookchartaxis.md) objects and their properties.|
|[Create workbookChartAxis](../api/workbookchartaxis-create.md)|[workbookChartAxis](../resources/workbookchartaxis.md)|Create a new [workbookChartAxis](../resources/workbookchartaxis.md) object.|
|[Get workbookChartAxis](../api/workbookchartaxis-get.md)|[workbookChartAxis](../resources/workbookchartaxis.md)|Read the properties and relationships of a [workbookChartAxis](../resources/workbookchartaxis.md) object.|
|[Update workbookChartAxis](../api/workbookchartaxis-update.md)|[workbookChartAxis](../resources/workbookchartaxis.md)|Update the properties of a [workbookChartAxis](../resources/workbookchartaxis.md) object.|
|[Delete workbookChartAxis](../api/workbookchartaxis-delete.md)|None|Deletes a [workbookChartAxis](../resources/workbookchartaxis.md) object.|
|[List workbookChartAxisFormat](../api/workbookchartaxis-list-format.md)|[workbookChartAxisFormat](../resources/workbookchartaxisformat.md) collection|Get the workbookChartAxisFormat resources from the format navigation property.|
|[Create workbookChartAxisFormat](../api/workbookchartaxis-post-format.md)|[workbookChartAxisFormat](../resources/workbookchartaxisformat.md)|Create a new workbookChartAxisFormat object.|
|[List workbookChartGridlines](../api/workbookchartaxis-list-majorgridlines.md)|[workbookChartGridlines](../resources/workbookchartgridlines.md) collection|Get the workbookChartGridlines resources from the majorGridlines navigation property.|
|[Create workbookChartGridlines](../api/workbookchartaxis-post-majorgridlines.md)|[workbookChartGridlines](../resources/workbookchartgridlines.md)|Create a new workbookChartGridlines object.|
|[List workbookChartGridlines](../api/workbookchartaxis-list-minorgridlines.md)|[workbookChartGridlines](../resources/workbookchartgridlines.md) collection|Get the workbookChartGridlines resources from the minorGridlines navigation property.|
|[Create workbookChartGridlines](../api/workbookchartaxis-post-minorgridlines.md)|[workbookChartGridlines](../resources/workbookchartgridlines.md)|Create a new workbookChartGridlines object.|
|[List workbookChartAxisTitle](../api/workbookchartaxis-list-title.md)|[workbookChartAxisTitle](../resources/workbookchartaxistitle.md) collection|Get the workbookChartAxisTitle resources from the title navigation property.|
|[Create workbookChartAxisTitle](../api/workbookchartaxis-post-title.md)|[workbookChartAxisTitle](../resources/workbookchartaxistitle.md)|Create a new workbookChartAxisTitle object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|majorUnit|[Json](../resources/json.md)|**TODO: Add Description**|
|maximum|[Json](../resources/json.md)|**TODO: Add Description**|
|minimum|[Json](../resources/json.md)|**TODO: Add Description**|
|minorUnit|[Json](../resources/json.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|format|[workbookChartAxisFormat](../resources/workbookchartaxisformat.md)|**TODO: Add Description**|
|majorGridlines|[workbookChartGridlines](../resources/workbookchartgridlines.md)|**TODO: Add Description**|
|minorGridlines|[workbookChartGridlines](../resources/workbookchartgridlines.md)|**TODO: Add Description**|
|title|[workbookChartAxisTitle](../resources/workbookchartaxistitle.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookChartAxis",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookChartAxis",
  "id": "String (identifier)",
  "majorUnit": {
    "@odata.type": "microsoft.graph.Json"
  },
  "maximum": {
    "@odata.type": "microsoft.graph.Json"
  },
  "minimum": {
    "@odata.type": "microsoft.graph.Json"
  },
  "minorUnit": {
    "@odata.type": "microsoft.graph.Json"
  }
}
```

