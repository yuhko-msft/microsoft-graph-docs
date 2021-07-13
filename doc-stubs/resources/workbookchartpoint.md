---
title: "workbookChartPoint resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookChartPoint resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookChartPoints](../api/workbookchartpoint-list.md)|[workbookChartPoint](../resources/workbookchartpoint.md) collection|Get a list of the [workbookChartPoint](../resources/workbookchartpoint.md) objects and their properties.|
|[Create workbookChartPoint](../api/workbookchartpoint-create.md)|[workbookChartPoint](../resources/workbookchartpoint.md)|Create a new [workbookChartPoint](../resources/workbookchartpoint.md) object.|
|[Get workbookChartPoint](../api/workbookchartpoint-get.md)|[workbookChartPoint](../resources/workbookchartpoint.md)|Read the properties and relationships of a [workbookChartPoint](../resources/workbookchartpoint.md) object.|
|[Update workbookChartPoint](../api/workbookchartpoint-update.md)|[workbookChartPoint](../resources/workbookchartpoint.md)|Update the properties of a [workbookChartPoint](../resources/workbookchartpoint.md) object.|
|[Delete workbookChartPoint](../api/workbookchartpoint-delete.md)|None|Deletes a [workbookChartPoint](../resources/workbookchartpoint.md) object.|
|[count](../api/workbookchartpoint-count.md)|Int32|**TODO: Add Description**|
|[itemAt](../api/workbookchartpoint-itemat.md)|[workbookChartPoint](../resources/workbookchartpoint.md)|**TODO: Add Description**|
|[List workbookChartPointFormat](../api/workbookchartpoint-list-format.md)|[workbookChartPointFormat](../resources/workbookchartpointformat.md) collection|Get the workbookChartPointFormat resources from the format navigation property.|
|[Create workbookChartPointFormat](../api/workbookchartpoint-post-format.md)|[workbookChartPointFormat](../resources/workbookchartpointformat.md)|Create a new workbookChartPointFormat object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|value|[Json](../resources/json.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|format|[workbookChartPointFormat](../resources/workbookchartpointformat.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookChartPoint",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookChartPoint",
  "id": "String (identifier)",
  "value": {
    "@odata.type": "microsoft.graph.Json"
  }
}
```

