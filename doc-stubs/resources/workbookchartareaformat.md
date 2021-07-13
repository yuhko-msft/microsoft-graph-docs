---
title: "workbookChartAreaFormat resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookChartAreaFormat resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookChartAreaFormats](../api/workbookchartareaformat-list.md)|[workbookChartAreaFormat](../resources/workbookchartareaformat.md) collection|Get a list of the [workbookChartAreaFormat](../resources/workbookchartareaformat.md) objects and their properties.|
|[Create workbookChartAreaFormat](../api/workbookchartareaformat-create.md)|[workbookChartAreaFormat](../resources/workbookchartareaformat.md)|Create a new [workbookChartAreaFormat](../resources/workbookchartareaformat.md) object.|
|[Get workbookChartAreaFormat](../api/workbookchartareaformat-get.md)|[workbookChartAreaFormat](../resources/workbookchartareaformat.md)|Read the properties and relationships of a [workbookChartAreaFormat](../resources/workbookchartareaformat.md) object.|
|[Update workbookChartAreaFormat](../api/workbookchartareaformat-update.md)|[workbookChartAreaFormat](../resources/workbookchartareaformat.md)|Update the properties of a [workbookChartAreaFormat](../resources/workbookchartareaformat.md) object.|
|[Delete workbookChartAreaFormat](../api/workbookchartareaformat-delete.md)|None|Deletes a [workbookChartAreaFormat](../resources/workbookchartareaformat.md) object.|
|[List workbookChartFill](../api/workbookchartareaformat-list-fill.md)|[workbookChartFill](../resources/workbookchartfill.md) collection|Get the workbookChartFill resources from the fill navigation property.|
|[Create workbookChartFill](../api/workbookchartareaformat-post-fill.md)|[workbookChartFill](../resources/workbookchartfill.md)|Create a new workbookChartFill object.|
|[List workbookChartFont](../api/workbookchartareaformat-list-font.md)|[workbookChartFont](../resources/workbookchartfont.md) collection|Get the workbookChartFont resources from the font navigation property.|
|[Create workbookChartFont](../api/workbookchartareaformat-post-font.md)|[workbookChartFont](../resources/workbookchartfont.md)|Create a new workbookChartFont object.|

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
  "@odata.type": "microsoft.graph.workbookChartAreaFormat",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookChartAreaFormat",
  "id": "String (identifier)"
}
```

