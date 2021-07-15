---
title: "workbookChartAxisTitle resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookChartAxisTitle resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookChartAxisTitles](../api/workbookchartaxistitle-list.md)|[workbookChartAxisTitle](../resources/workbookchartaxistitle.md) collection|Get a list of the [workbookChartAxisTitle](../resources/workbookchartaxistitle.md) objects and their properties.|
|[Create workbookChartAxisTitle](../api/workbookchartaxistitle-create.md)|[workbookChartAxisTitle](../resources/workbookchartaxistitle.md)|Create a new [workbookChartAxisTitle](../resources/workbookchartaxistitle.md) object.|
|[Get workbookChartAxisTitle](../api/workbookchartaxistitle-get.md)|[workbookChartAxisTitle](../resources/workbookchartaxistitle.md)|Read the properties and relationships of a [workbookChartAxisTitle](../resources/workbookchartaxistitle.md) object.|
|[Update workbookChartAxisTitle](../api/workbookchartaxistitle-update.md)|[workbookChartAxisTitle](../resources/workbookchartaxistitle.md)|Update the properties of a [workbookChartAxisTitle](../resources/workbookchartaxistitle.md) object.|
|[Delete workbookChartAxisTitle](../api/workbookchartaxistitle-delete.md)|None|Deletes a [workbookChartAxisTitle](../resources/workbookchartaxistitle.md) object.|
|[List workbookChartAxisTitleFormat](../api/workbookchartaxistitle-list-format.md)|[workbookChartAxisTitleFormat](../resources/workbookchartaxistitleformat.md) collection|Get the workbookChartAxisTitleFormat resources from the format navigation property.|
|[Create workbookChartAxisTitleFormat](../api/workbookchartaxistitle-post-format.md)|[workbookChartAxisTitleFormat](../resources/workbookchartaxistitleformat.md)|Create a new workbookChartAxisTitleFormat object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|text|String|**TODO: Add Description**|
|visible|Boolean|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|format|[workbookChartAxisTitleFormat](../resources/workbookchartaxistitleformat.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookChartAxisTitle",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookChartAxisTitle",
  "id": "String (identifier)",
  "text": "String",
  "visible": "Boolean"
}
```

