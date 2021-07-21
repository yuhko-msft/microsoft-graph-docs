---
title: "workbookChartAxisFormat resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookChartAxisFormat resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookChartAxisFormats](../api/workbookchartaxisformat-list.md)|[workbookChartAxisFormat](../resources/workbookchartaxisformat.md) collection|Get a list of the [workbookChartAxisFormat](../resources/workbookchartaxisformat.md) objects and their properties.|
|[Create workbookChartAxisFormat](../api/workbookchartaxisformat-create.md)|[workbookChartAxisFormat](../resources/workbookchartaxisformat.md)|Create a new [workbookChartAxisFormat](../resources/workbookchartaxisformat.md) object.|
|[Get workbookChartAxisFormat](../api/workbookchartaxisformat-get.md)|[workbookChartAxisFormat](../resources/workbookchartaxisformat.md)|Read the properties and relationships of a [workbookChartAxisFormat](../resources/workbookchartaxisformat.md) object.|
|[Update workbookChartAxisFormat](../api/workbookchartaxisformat-update.md)|[workbookChartAxisFormat](../resources/workbookchartaxisformat.md)|Update the properties of a [workbookChartAxisFormat](../resources/workbookchartaxisformat.md) object.|
|[Delete workbookChartAxisFormat](../api/workbookchartaxisformat-delete.md)|None|Deletes a [workbookChartAxisFormat](../resources/workbookchartaxisformat.md) object.|
|[List workbookChartFont](../api/workbookchartaxisformat-list-font.md)|[workbookChartFont](../resources/workbookchartfont.md) collection|Get the workbookChartFont resources from the font navigation property.|
|[Create workbookChartFont](../api/workbookchartaxisformat-post-font.md)|[workbookChartFont](../resources/workbookchartfont.md)|Create a new workbookChartFont object.|
|[List workbookChartLineFormat](../api/workbookchartaxisformat-list-line.md)|[workbookChartLineFormat](../resources/workbookchartlineformat.md) collection|Get the workbookChartLineFormat resources from the line navigation property.|
|[Create workbookChartLineFormat](../api/workbookchartaxisformat-post-line.md)|[workbookChartLineFormat](../resources/workbookchartlineformat.md)|Create a new workbookChartLineFormat object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|font|[workbookChartFont](../resources/workbookchartfont.md)|**TODO: Add Description**|
|line|[workbookChartLineFormat](../resources/workbookchartlineformat.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookChartAxisFormat",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookChartAxisFormat",
  "id": "String (identifier)"
}
```

