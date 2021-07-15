---
title: "workbookChartGridlines resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookChartGridlines resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookChartGridlines](../api/workbookchartgridlines-list.md)|[workbookChartGridlines](../resources/workbookchartgridlines.md) collection|Get a list of the [workbookChartGridlines](../resources/workbookchartgridlines.md) objects and their properties.|
|[Create workbookChartGridlines](../api/workbookchartgridlines-create.md)|[workbookChartGridlines](../resources/workbookchartgridlines.md)|Create a new [workbookChartGridlines](../resources/workbookchartgridlines.md) object.|
|[Get workbookChartGridlines](../api/workbookchartgridlines-get.md)|[workbookChartGridlines](../resources/workbookchartgridlines.md)|Read the properties and relationships of a [workbookChartGridlines](../resources/workbookchartgridlines.md) object.|
|[Update workbookChartGridlines](../api/workbookchartgridlines-update.md)|[workbookChartGridlines](../resources/workbookchartgridlines.md)|Update the properties of a [workbookChartGridlines](../resources/workbookchartgridlines.md) object.|
|[Delete workbookChartGridlines](../api/workbookchartgridlines-delete.md)|None|Deletes a [workbookChartGridlines](../resources/workbookchartgridlines.md) object.|
|[List workbookChartGridlinesFormat](../api/workbookchartgridlines-list-format.md)|[workbookChartGridlinesFormat](../resources/workbookchartgridlinesformat.md) collection|Get the workbookChartGridlinesFormat resources from the format navigation property.|
|[Create workbookChartGridlinesFormat](../api/workbookchartgridlines-post-format.md)|[workbookChartGridlinesFormat](../resources/workbookchartgridlinesformat.md)|Create a new workbookChartGridlinesFormat object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|visible|Boolean|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|format|[workbookChartGridlinesFormat](../resources/workbookchartgridlinesformat.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookChartGridlines",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookChartGridlines",
  "id": "String (identifier)",
  "visible": "Boolean"
}
```

