---
title: "workbookNamedItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookNamedItem resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookNamedItems](../api/workbooknameditem-list.md)|[workbookNamedItem](../resources/workbooknameditem.md) collection|Get a list of the [workbookNamedItem](../resources/workbooknameditem.md) objects and their properties.|
|[Create workbookNamedItem](../api/workbooknameditem-create.md)|[workbookNamedItem](../resources/workbooknameditem.md)|Create a new [workbookNamedItem](../resources/workbooknameditem.md) object.|
|[Get workbookNamedItem](../api/workbooknameditem-get.md)|[workbookNamedItem](../resources/workbooknameditem.md)|Read the properties and relationships of a [workbookNamedItem](../resources/workbooknameditem.md) object.|
|[Update workbookNamedItem](../api/workbooknameditem-update.md)|[workbookNamedItem](../resources/workbooknameditem.md)|Update the properties of a [workbookNamedItem](../resources/workbooknameditem.md) object.|
|[Delete workbookNamedItem](../api/workbooknameditem-delete.md)|None|Deletes a [workbookNamedItem](../resources/workbooknameditem.md) object.|
|[add](../api/workbooknameditem-add.md)|[workbookNamedItem](../resources/workbooknameditem.md)|**TODO: Add Description**|
|[addFormulaLocal](../api/workbooknameditem-addformulalocal.md)|[workbookNamedItem](../resources/workbooknameditem.md)|**TODO: Add Description**|
|[range](../api/workbooknameditem-range.md)|[workbookRange](../resources/workbookrange.md)|**TODO: Add Description**|
|[List workbookWorksheet](../api/workbooknameditem-list-worksheet.md)|[workbookWorksheet](../resources/workbookworksheet.md) collection|Get the workbookWorksheet resources from the worksheet navigation property.|
|[Create workbookWorksheet](../api/workbooknameditem-post-worksheet.md)|[workbookWorksheet](../resources/workbookworksheet.md)|Create a new workbookWorksheet object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|comment|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|name|String|**TODO: Add Description**|
|scope|String|**TODO: Add Description**|
|type|String|**TODO: Add Description**|
|value|[Json](../resources/json.md)|**TODO: Add Description**|
|visible|Boolean|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|worksheet|[workbookWorksheet](../resources/workbookworksheet.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookNamedItem",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookNamedItem",
  "id": "String (identifier)",
  "comment": "String",
  "name": "String",
  "scope": "String",
  "type": "String",
  "value": {
    "@odata.type": "microsoft.graph.Json"
  },
  "visible": "Boolean"
}
```

