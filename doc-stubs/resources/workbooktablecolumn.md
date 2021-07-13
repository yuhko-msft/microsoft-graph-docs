---
title: "workbookTableColumn resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookTableColumn resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookTableColumns](../api/workbooktablecolumn-list.md)|[workbookTableColumn](../resources/workbooktablecolumn.md) collection|Get a list of the [workbookTableColumn](../resources/workbooktablecolumn.md) objects and their properties.|
|[Create workbookTableColumn](../api/workbooktablecolumn-create.md)|[workbookTableColumn](../resources/workbooktablecolumn.md)|Create a new [workbookTableColumn](../resources/workbooktablecolumn.md) object.|
|[Get workbookTableColumn](../api/workbooktablecolumn-get.md)|[workbookTableColumn](../resources/workbooktablecolumn.md)|Read the properties and relationships of a [workbookTableColumn](../resources/workbooktablecolumn.md) object.|
|[Update workbookTableColumn](../api/workbooktablecolumn-update.md)|[workbookTableColumn](../resources/workbooktablecolumn.md)|Update the properties of a [workbookTableColumn](../resources/workbooktablecolumn.md) object.|
|[Delete workbookTableColumn](../api/workbooktablecolumn-delete.md)|None|Deletes a [workbookTableColumn](../resources/workbooktablecolumn.md) object.|
|[count](../api/workbooktablecolumn-count.md)|Int32|**TODO: Add Description**|
|[add](../api/workbooktablecolumn-add.md)|[workbookTableColumn](../resources/workbooktablecolumn.md)|**TODO: Add Description**|
|[itemAt](../api/workbooktablecolumn-itemat.md)|[workbookTableColumn](../resources/workbooktablecolumn.md)|**TODO: Add Description**|
|[dataBodyRange](../api/workbooktablecolumn-databodyrange.md)|[workbookRange](../resources/workbookrange.md)|**TODO: Add Description**|
|[headerRowRange](../api/workbooktablecolumn-headerrowrange.md)|[workbookRange](../resources/workbookrange.md)|**TODO: Add Description**|
|[range](../api/workbooktablecolumn-range.md)|[workbookRange](../resources/workbookrange.md)|**TODO: Add Description**|
|[totalRowRange](../api/workbooktablecolumn-totalrowrange.md)|[workbookRange](../resources/workbookrange.md)|**TODO: Add Description**|
|[List workbookFilter](../api/workbooktablecolumn-list-filter.md)|[workbookFilter](../resources/workbookfilter.md) collection|Get the workbookFilter resources from the filter navigation property.|
|[Create workbookFilter](../api/workbooktablecolumn-post-filter.md)|[workbookFilter](../resources/workbookfilter.md)|Create a new workbookFilter object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|index|Int32|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|values|[Json](../resources/json.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|filter|[workbookFilter](../resources/workbookfilter.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookTableColumn",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookTableColumn",
  "id": "String (identifier)",
  "index": "Integer",
  "name": "String",
  "values": {
    "@odata.type": "microsoft.graph.Json"
  }
}
```

