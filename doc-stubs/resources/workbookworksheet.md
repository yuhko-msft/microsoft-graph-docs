---
title: "workbookWorksheet resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookWorksheet resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookWorksheets](../api/workbookworksheet-list.md)|[workbookWorksheet](../resources/workbookworksheet.md) collection|Get a list of the [workbookWorksheet](../resources/workbookworksheet.md) objects and their properties.|
|[Create workbookWorksheet](../api/workbookworksheet-create.md)|[workbookWorksheet](../resources/workbookworksheet.md)|Create a new [workbookWorksheet](../resources/workbookworksheet.md) object.|
|[Get workbookWorksheet](../api/workbookworksheet-get.md)|[workbookWorksheet](../resources/workbookworksheet.md)|Read the properties and relationships of a [workbookWorksheet](../resources/workbookworksheet.md) object.|
|[Update workbookWorksheet](../api/workbookworksheet-update.md)|[workbookWorksheet](../resources/workbookworksheet.md)|Update the properties of a [workbookWorksheet](../resources/workbookworksheet.md) object.|
|[Delete workbookWorksheet](../api/workbookworksheet-delete.md)|None|Deletes a [workbookWorksheet](../resources/workbookworksheet.md) object.|
|[add](../api/workbookworksheet-add.md)|[workbookWorksheet](../resources/workbookworksheet.md)|**TODO: Add Description**|
|[cell](../api/workbookworksheet-cell.md)|[workbookRange](../resources/workbookrange.md)|**TODO: Add Description**|
|[usedRange](../api/workbookworksheet-usedrange.md)|[workbookRange](../resources/workbookrange.md)|**TODO: Add Description**|
|[usedRange](../api/workbookworksheet-usedrange.md)|[workbookRange](../resources/workbookrange.md)|**TODO: Add Description**|
|[range](../api/workbookworksheet-range.md)|[workbookRange](../resources/workbookrange.md)|**TODO: Add Description**|
|[range](../api/workbookworksheet-range.md)|[workbookRange](../resources/workbookrange.md)|**TODO: Add Description**|
|[List charts](../api/workbookworksheet-list-charts.md)|[workbookChart](../resources/workbookchart.md) collection|Get the workbookChart resources from the charts navigation property.|
|[Create workbookChart](../api/workbookworksheet-post-charts.md)|[workbookChart](../resources/workbookchart.md)|Create a new workbookChart object.|
|[List names](../api/workbookworksheet-list-names.md)|[workbookNamedItem](../resources/workbooknameditem.md) collection|Get the workbookNamedItem resources from the names navigation property.|
|[Create workbookNamedItem](../api/workbookworksheet-post-names.md)|[workbookNamedItem](../resources/workbooknameditem.md)|Create a new workbookNamedItem object.|
|[List pivotTables](../api/workbookworksheet-list-pivottables.md)|[workbookPivotTable](../resources/workbookpivottable.md) collection|Get the workbookPivotTable resources from the pivotTables navigation property.|
|[Create workbookPivotTable](../api/workbookworksheet-post-pivottables.md)|[workbookPivotTable](../resources/workbookpivottable.md)|Create a new workbookPivotTable object.|
|[List workbookWorksheetProtection](../api/workbookworksheet-list-protection.md)|[workbookWorksheetProtection](../resources/workbookworksheetprotection.md) collection|Get the workbookWorksheetProtection resources from the protection navigation property.|
|[Create workbookWorksheetProtection](../api/workbookworksheet-post-protection.md)|[workbookWorksheetProtection](../resources/workbookworksheetprotection.md)|Create a new workbookWorksheetProtection object.|
|[List tables](../api/workbookworksheet-list-tables.md)|[workbookTable](../resources/workbooktable.md) collection|Get the workbookTable resources from the tables navigation property.|
|[Create workbookTable](../api/workbookworksheet-post-tables.md)|[workbookTable](../resources/workbooktable.md)|Create a new workbookTable object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|name|String|**TODO: Add Description**|
|position|Int32|**TODO: Add Description**|
|visibility|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|charts|[workbookChart](../resources/workbookchart.md) collection|**TODO: Add Description**|
|names|[workbookNamedItem](../resources/workbooknameditem.md) collection|**TODO: Add Description**|
|pivotTables|[workbookPivotTable](../resources/workbookpivottable.md) collection|**TODO: Add Description**|
|protection|[workbookWorksheetProtection](../resources/workbookworksheetprotection.md)|**TODO: Add Description**|
|tables|[workbookTable](../resources/workbooktable.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookWorksheet",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookWorksheet",
  "id": "String (identifier)",
  "name": "String",
  "position": "Integer",
  "visibility": "String"
}
```

