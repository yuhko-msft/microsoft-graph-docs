---
title: "workbookChartPointFormat resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookChartPointFormat resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookChartPointFormats](../api/workbookchartpointformat-list.md)|[workbookChartPointFormat](../resources/workbookchartpointformat.md) collection|Get a list of the [workbookChartPointFormat](../resources/workbookchartpointformat.md) objects and their properties.|
|[Create workbookChartPointFormat](../api/workbookchartpointformat-create.md)|[workbookChartPointFormat](../resources/workbookchartpointformat.md)|Create a new [workbookChartPointFormat](../resources/workbookchartpointformat.md) object.|
|[Get workbookChartPointFormat](../api/workbookchartpointformat-get.md)|[workbookChartPointFormat](../resources/workbookchartpointformat.md)|Read the properties and relationships of a [workbookChartPointFormat](../resources/workbookchartpointformat.md) object.|
|[Update workbookChartPointFormat](../api/workbookchartpointformat-update.md)|[workbookChartPointFormat](../resources/workbookchartpointformat.md)|Update the properties of a [workbookChartPointFormat](../resources/workbookchartpointformat.md) object.|
|[Delete workbookChartPointFormat](../api/workbookchartpointformat-delete.md)|None|Deletes a [workbookChartPointFormat](../resources/workbookchartpointformat.md) object.|
|[List workbookChartFill](../api/workbookchartpointformat-list-fill.md)|[workbookChartFill](../resources/workbookchartfill.md) collection|Get the workbookChartFill resources from the fill navigation property.|
|[Create workbookChartFill](../api/workbookchartpointformat-post-fill.md)|[workbookChartFill](../resources/workbookchartfill.md)|Create a new workbookChartFill object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|fill|[workbookChartFill](../resources/workbookchartfill.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookChartPointFormat",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookChartPointFormat",
  "id": "String (identifier)"
}
```

