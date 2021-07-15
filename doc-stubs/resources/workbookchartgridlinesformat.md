---
title: "workbookChartGridlinesFormat resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookChartGridlinesFormat resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookChartGridlinesFormats](../api/workbookchartgridlinesformat-list.md)|[workbookChartGridlinesFormat](../resources/workbookchartgridlinesformat.md) collection|Get a list of the [workbookChartGridlinesFormat](../resources/workbookchartgridlinesformat.md) objects and their properties.|
|[Create workbookChartGridlinesFormat](../api/workbookchartgridlinesformat-create.md)|[workbookChartGridlinesFormat](../resources/workbookchartgridlinesformat.md)|Create a new [workbookChartGridlinesFormat](../resources/workbookchartgridlinesformat.md) object.|
|[Get workbookChartGridlinesFormat](../api/workbookchartgridlinesformat-get.md)|[workbookChartGridlinesFormat](../resources/workbookchartgridlinesformat.md)|Read the properties and relationships of a [workbookChartGridlinesFormat](../resources/workbookchartgridlinesformat.md) object.|
|[Update workbookChartGridlinesFormat](../api/workbookchartgridlinesformat-update.md)|[workbookChartGridlinesFormat](../resources/workbookchartgridlinesformat.md)|Update the properties of a [workbookChartGridlinesFormat](../resources/workbookchartgridlinesformat.md) object.|
|[Delete workbookChartGridlinesFormat](../api/workbookchartgridlinesformat-delete.md)|None|Deletes a [workbookChartGridlinesFormat](../resources/workbookchartgridlinesformat.md) object.|
|[List workbookChartLineFormat](../api/workbookchartgridlinesformat-list-line.md)|[workbookChartLineFormat](../resources/workbookchartlineformat.md) collection|Get the workbookChartLineFormat resources from the line navigation property.|
|[Create workbookChartLineFormat](../api/workbookchartgridlinesformat-post-line.md)|[workbookChartLineFormat](../resources/workbookchartlineformat.md)|Create a new workbookChartLineFormat object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|line|[workbookChartLineFormat](../resources/workbookchartlineformat.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookChartGridlinesFormat",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookChartGridlinesFormat",
  "id": "String (identifier)"
}
```

