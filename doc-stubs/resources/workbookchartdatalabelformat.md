---
title: "workbookChartDataLabelFormat resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookChartDataLabelFormat resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookChartDataLabelFormats](../api/workbookchartdatalabelformat-list.md)|[workbookChartDataLabelFormat](../resources/workbookchartdatalabelformat.md) collection|Get a list of the [workbookChartDataLabelFormat](../resources/workbookchartdatalabelformat.md) objects and their properties.|
|[Create workbookChartDataLabelFormat](../api/workbookchartdatalabelformat-create.md)|[workbookChartDataLabelFormat](../resources/workbookchartdatalabelformat.md)|Create a new [workbookChartDataLabelFormat](../resources/workbookchartdatalabelformat.md) object.|
|[Get workbookChartDataLabelFormat](../api/workbookchartdatalabelformat-get.md)|[workbookChartDataLabelFormat](../resources/workbookchartdatalabelformat.md)|Read the properties and relationships of a [workbookChartDataLabelFormat](../resources/workbookchartdatalabelformat.md) object.|
|[Update workbookChartDataLabelFormat](../api/workbookchartdatalabelformat-update.md)|[workbookChartDataLabelFormat](../resources/workbookchartdatalabelformat.md)|Update the properties of a [workbookChartDataLabelFormat](../resources/workbookchartdatalabelformat.md) object.|
|[Delete workbookChartDataLabelFormat](../api/workbookchartdatalabelformat-delete.md)|None|Deletes a [workbookChartDataLabelFormat](../resources/workbookchartdatalabelformat.md) object.|
|[List workbookChartFill](../api/workbookchartdatalabelformat-list-fill.md)|[workbookChartFill](../resources/workbookchartfill.md) collection|Get the workbookChartFill resources from the fill navigation property.|
|[Create workbookChartFill](../api/workbookchartdatalabelformat-post-fill.md)|[workbookChartFill](../resources/workbookchartfill.md)|Create a new workbookChartFill object.|
|[List workbookChartFont](../api/workbookchartdatalabelformat-list-font.md)|[workbookChartFont](../resources/workbookchartfont.md) collection|Get the workbookChartFont resources from the font navigation property.|
|[Create workbookChartFont](../api/workbookchartdatalabelformat-post-font.md)|[workbookChartFont](../resources/workbookchartfont.md)|Create a new workbookChartFont object.|

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
  "@odata.type": "microsoft.graph.workbookChartDataLabelFormat",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookChartDataLabelFormat",
  "id": "String (identifier)"
}
```

