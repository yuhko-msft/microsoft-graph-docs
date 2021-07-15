---
title: "workbookChartFont resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookChartFont resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookChartFonts](../api/workbookchartfont-list.md)|[workbookChartFont](../resources/workbookchartfont.md) collection|Get a list of the [workbookChartFont](../resources/workbookchartfont.md) objects and their properties.|
|[Create workbookChartFont](../api/workbookchartfont-create.md)|[workbookChartFont](../resources/workbookchartfont.md)|Create a new [workbookChartFont](../resources/workbookchartfont.md) object.|
|[Get workbookChartFont](../api/workbookchartfont-get.md)|[workbookChartFont](../resources/workbookchartfont.md)|Read the properties and relationships of a [workbookChartFont](../resources/workbookchartfont.md) object.|
|[Update workbookChartFont](../api/workbookchartfont-update.md)|[workbookChartFont](../resources/workbookchartfont.md)|Update the properties of a [workbookChartFont](../resources/workbookchartfont.md) object.|
|[Delete workbookChartFont](../api/workbookchartfont-delete.md)|None|Deletes a [workbookChartFont](../resources/workbookchartfont.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|bold|Boolean|**TODO: Add Description**|
|color|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|italic|Boolean|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|size|Double|**TODO: Add Description**|
|underline|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookChartFont",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookChartFont",
  "id": "String (identifier)",
  "bold": "Boolean",
  "color": "String",
  "italic": "Boolean",
  "name": "String",
  "size": "Double",
  "underline": "String"
}
```

