---
title: "workbookChartTitle resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookChartTitle resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookChartTitles](../api/workbookcharttitle-list.md)|[workbookChartTitle](../resources/workbookcharttitle.md) collection|Get a list of the [workbookChartTitle](../resources/workbookcharttitle.md) objects and their properties.|
|[Create workbookChartTitle](../api/workbookcharttitle-create.md)|[workbookChartTitle](../resources/workbookcharttitle.md)|Create a new [workbookChartTitle](../resources/workbookcharttitle.md) object.|
|[Get workbookChartTitle](../api/workbookcharttitle-get.md)|[workbookChartTitle](../resources/workbookcharttitle.md)|Read the properties and relationships of a [workbookChartTitle](../resources/workbookcharttitle.md) object.|
|[Update workbookChartTitle](../api/workbookcharttitle-update.md)|[workbookChartTitle](../resources/workbookcharttitle.md)|Update the properties of a [workbookChartTitle](../resources/workbookcharttitle.md) object.|
|[Delete workbookChartTitle](../api/workbookcharttitle-delete.md)|None|Deletes a [workbookChartTitle](../resources/workbookcharttitle.md) object.|
|[List workbookChartTitleFormat](../api/workbookcharttitle-list-format.md)|[workbookChartTitleFormat](../resources/workbookcharttitleformat.md) collection|Get the workbookChartTitleFormat resources from the format navigation property.|
|[Create workbookChartTitleFormat](../api/workbookcharttitle-post-format.md)|[workbookChartTitleFormat](../resources/workbookcharttitleformat.md)|Create a new workbookChartTitleFormat object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|overlay|Boolean|**TODO: Add Description**|
|text|String|**TODO: Add Description**|
|visible|Boolean|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|format|[workbookChartTitleFormat](../resources/workbookcharttitleformat.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookChartTitle",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookChartTitle",
  "id": "String (identifier)",
  "overlay": "Boolean",
  "text": "String",
  "visible": "Boolean"
}
```

