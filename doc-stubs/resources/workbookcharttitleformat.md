---
title: "workbookChartTitleFormat resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookChartTitleFormat resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookChartTitleFormats](../api/workbookcharttitleformat-list.md)|[workbookChartTitleFormat](../resources/workbookcharttitleformat.md) collection|Get a list of the [workbookChartTitleFormat](../resources/workbookcharttitleformat.md) objects and their properties.|
|[Create workbookChartTitleFormat](../api/workbookcharttitleformat-create.md)|[workbookChartTitleFormat](../resources/workbookcharttitleformat.md)|Create a new [workbookChartTitleFormat](../resources/workbookcharttitleformat.md) object.|
|[Get workbookChartTitleFormat](../api/workbookcharttitleformat-get.md)|[workbookChartTitleFormat](../resources/workbookcharttitleformat.md)|Read the properties and relationships of a [workbookChartTitleFormat](../resources/workbookcharttitleformat.md) object.|
|[Update workbookChartTitleFormat](../api/workbookcharttitleformat-update.md)|[workbookChartTitleFormat](../resources/workbookcharttitleformat.md)|Update the properties of a [workbookChartTitleFormat](../resources/workbookcharttitleformat.md) object.|
|[Delete workbookChartTitleFormat](../api/workbookcharttitleformat-delete.md)|None|Deletes a [workbookChartTitleFormat](../resources/workbookcharttitleformat.md) object.|
|[List workbookChartFill](../api/workbookcharttitleformat-list-fill.md)|[workbookChartFill](../resources/workbookchartfill.md) collection|Get the workbookChartFill resources from the fill navigation property.|
|[Create workbookChartFill](../api/workbookcharttitleformat-post-fill.md)|[workbookChartFill](../resources/workbookchartfill.md)|Create a new workbookChartFill object.|
|[List workbookChartFont](../api/workbookcharttitleformat-list-font.md)|[workbookChartFont](../resources/workbookchartfont.md) collection|Get the workbookChartFont resources from the font navigation property.|
|[Create workbookChartFont](../api/workbookcharttitleformat-post-font.md)|[workbookChartFont](../resources/workbookchartfont.md)|Create a new workbookChartFont object.|

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
  "@odata.type": "microsoft.graph.workbookChartTitleFormat",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookChartTitleFormat",
  "id": "String (identifier)"
}
```

