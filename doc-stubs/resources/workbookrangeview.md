---
title: "workbookRangeView resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookRangeView resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookRangeViews](../api/workbookrangeview-list.md)|[workbookRangeView](../resources/workbookrangeview.md) collection|Get a list of the [workbookRangeView](../resources/workbookrangeview.md) objects and their properties.|
|[Create workbookRangeView](../api/workbookrangeview-create.md)|[workbookRangeView](../resources/workbookrangeview.md)|Create a new [workbookRangeView](../resources/workbookrangeview.md) object.|
|[Get workbookRangeView](../api/workbookrangeview-get.md)|[workbookRangeView](../resources/workbookrangeview.md)|Read the properties and relationships of a [workbookRangeView](../resources/workbookrangeview.md) object.|
|[Update workbookRangeView](../api/workbookrangeview-update.md)|[workbookRangeView](../resources/workbookrangeview.md)|Update the properties of a [workbookRangeView](../resources/workbookrangeview.md) object.|
|[Delete workbookRangeView](../api/workbookrangeview-delete.md)|None|Deletes a [workbookRangeView](../resources/workbookrangeview.md) object.|
|[itemAt](../api/workbookrangeview-itemat.md)|[workbookRangeView](../resources/workbookrangeview.md)|**TODO: Add Description**|
|[range](../api/workbookrangeview-range.md)|[workbookRange](../resources/workbookrange.md)|**TODO: Add Description**|
|[List rows](../api/workbookrangeview-list-rows.md)|[workbookRangeView](../resources/workbookrangeview.md) collection|Get the workbookRangeView resources from the rows navigation property.|
|[Create workbookRangeView](../api/workbookrangeview-post-rows.md)|[workbookRangeView](../resources/workbookrangeview.md)|Create a new workbookRangeView object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|cellAddresses|[Json](../resources/json.md)|**TODO: Add Description**|
|columnCount|Int32|**TODO: Add Description**|
|formulas|[Json](../resources/json.md)|**TODO: Add Description**|
|formulasLocal|[Json](../resources/json.md)|**TODO: Add Description**|
|formulasR1C1|[Json](../resources/json.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|index|Int32|**TODO: Add Description**|
|numberFormat|[Json](../resources/json.md)|**TODO: Add Description**|
|rowCount|Int32|**TODO: Add Description**|
|text|[Json](../resources/json.md)|**TODO: Add Description**|
|values|[Json](../resources/json.md)|**TODO: Add Description**|
|valueTypes|[Json](../resources/json.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|rows|[workbookRangeView](../resources/workbookrangeview.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookRangeView",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookRangeView",
  "id": "String (identifier)",
  "cellAddresses": {
    "@odata.type": "microsoft.graph.Json"
  },
  "columnCount": "Integer",
  "formulas": {
    "@odata.type": "microsoft.graph.Json"
  },
  "formulasLocal": {
    "@odata.type": "microsoft.graph.Json"
  },
  "formulasR1C1": {
    "@odata.type": "microsoft.graph.Json"
  },
  "index": "Integer",
  "numberFormat": {
    "@odata.type": "microsoft.graph.Json"
  },
  "rowCount": "Integer",
  "text": {
    "@odata.type": "microsoft.graph.Json"
  },
  "values": {
    "@odata.type": "microsoft.graph.Json"
  },
  "valueTypes": {
    "@odata.type": "microsoft.graph.Json"
  }
}
```

