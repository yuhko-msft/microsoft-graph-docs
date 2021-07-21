---
title: "workbookChartLegendFormat resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookChartLegendFormat resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookChartLegendFormats](../api/workbookchartlegendformat-list.md)|[workbookChartLegendFormat](../resources/workbookchartlegendformat.md) collection|Get a list of the [workbookChartLegendFormat](../resources/workbookchartlegendformat.md) objects and their properties.|
|[Create workbookChartLegendFormat](../api/workbookchartlegendformat-create.md)|[workbookChartLegendFormat](../resources/workbookchartlegendformat.md)|Create a new [workbookChartLegendFormat](../resources/workbookchartlegendformat.md) object.|
|[Get workbookChartLegendFormat](../api/workbookchartlegendformat-get.md)|[workbookChartLegendFormat](../resources/workbookchartlegendformat.md)|Read the properties and relationships of a [workbookChartLegendFormat](../resources/workbookchartlegendformat.md) object.|
|[Update workbookChartLegendFormat](../api/workbookchartlegendformat-update.md)|[workbookChartLegendFormat](../resources/workbookchartlegendformat.md)|Update the properties of a [workbookChartLegendFormat](../resources/workbookchartlegendformat.md) object.|
|[Delete workbookChartLegendFormat](../api/workbookchartlegendformat-delete.md)|None|Deletes a [workbookChartLegendFormat](../resources/workbookchartlegendformat.md) object.|
|[List workbookChartFill](../api/workbookchartlegendformat-list-fill.md)|[workbookChartFill](../resources/workbookchartfill.md) collection|Get the workbookChartFill resources from the fill navigation property.|
|[Create workbookChartFill](../api/workbookchartlegendformat-post-fill.md)|[workbookChartFill](../resources/workbookchartfill.md)|Create a new workbookChartFill object.|
|[List workbookChartFont](../api/workbookchartlegendformat-list-font.md)|[workbookChartFont](../resources/workbookchartfont.md) collection|Get the workbookChartFont resources from the font navigation property.|
|[Create workbookChartFont](../api/workbookchartlegendformat-post-font.md)|[workbookChartFont](../resources/workbookchartfont.md)|Create a new workbookChartFont object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|fill|[workbookChartFill](../resources/workbookchartfill.md)|**TODO: Add Description**|
|font|[workbookChartFont](../resources/workbookchartfont.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookChartLegendFormat",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookChartLegendFormat",
  "id": "String (identifier)"
}
```

