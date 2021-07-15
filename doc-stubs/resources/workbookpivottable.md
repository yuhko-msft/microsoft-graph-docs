---
title: "workbookPivotTable resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookPivotTable resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookPivotTables](../api/workbookpivottable-list.md)|[workbookPivotTable](../resources/workbookpivottable.md) collection|Get a list of the [workbookPivotTable](../resources/workbookpivottable.md) objects and their properties.|
|[Create workbookPivotTable](../api/workbookpivottable-create.md)|[workbookPivotTable](../resources/workbookpivottable.md)|Create a new [workbookPivotTable](../resources/workbookpivottable.md) object.|
|[Get workbookPivotTable](../api/workbookpivottable-get.md)|[workbookPivotTable](../resources/workbookpivottable.md)|Read the properties and relationships of a [workbookPivotTable](../resources/workbookpivottable.md) object.|
|[Update workbookPivotTable](../api/workbookpivottable-update.md)|[workbookPivotTable](../resources/workbookpivottable.md)|Update the properties of a [workbookPivotTable](../resources/workbookpivottable.md) object.|
|[Delete workbookPivotTable](../api/workbookpivottable-delete.md)|None|Deletes a [workbookPivotTable](../resources/workbookpivottable.md) object.|
|[refresh](../api/workbookpivottable-refresh.md)|None|**TODO: Add Description**|
|[refreshAll](../api/workbookpivottable-refreshall.md)|None|**TODO: Add Description**|
|[List workbookWorksheet](../api/workbookpivottable-list-worksheet.md)|[workbookWorksheet](../resources/workbookworksheet.md) collection|Get the workbookWorksheet resources from the worksheet navigation property.|
|[Create workbookWorksheet](../api/workbookpivottable-post-worksheet.md)|[workbookWorksheet](../resources/workbookworksheet.md)|Create a new workbookWorksheet object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|name|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|worksheet|[workbookWorksheet](../resources/workbookworksheet.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookPivotTable",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookPivotTable",
  "id": "String (identifier)",
  "name": "String"
}
```

