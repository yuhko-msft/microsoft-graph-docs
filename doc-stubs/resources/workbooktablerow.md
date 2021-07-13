---
title: "workbookTableRow resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookTableRow resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookTableRows](../api/workbooktablerow-list.md)|[workbookTableRow](../resources/workbooktablerow.md) collection|Get a list of the [workbookTableRow](../resources/workbooktablerow.md) objects and their properties.|
|[Create workbookTableRow](../api/workbooktablerow-create.md)|[workbookTableRow](../resources/workbooktablerow.md)|Create a new [workbookTableRow](../resources/workbooktablerow.md) object.|
|[Get workbookTableRow](../api/workbooktablerow-get.md)|[workbookTableRow](../resources/workbooktablerow.md)|Read the properties and relationships of a [workbookTableRow](../resources/workbooktablerow.md) object.|
|[Update workbookTableRow](../api/workbooktablerow-update.md)|[workbookTableRow](../resources/workbooktablerow.md)|Update the properties of a [workbookTableRow](../resources/workbooktablerow.md) object.|
|[Delete workbookTableRow](../api/workbooktablerow-delete.md)|None|Deletes a [workbookTableRow](../resources/workbooktablerow.md) object.|
|[count](../api/workbooktablerow-count.md)|Int32|**TODO: Add Description**|
|[add](../api/workbooktablerow-add.md)|[workbookTableRow](../resources/workbooktablerow.md)|**TODO: Add Description**|
|[itemAt](../api/workbooktablerow-itemat.md)|[workbookTableRow](../resources/workbooktablerow.md)|**TODO: Add Description**|
|[range](../api/workbooktablerow-range.md)|[workbookRange](../resources/workbookrange.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|index|Int32|**TODO: Add Description**|
|values|[Json](../resources/json.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookTableRow",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookTableRow",
  "id": "String (identifier)",
  "index": "Integer",
  "values": {
    "@odata.type": "microsoft.graph.Json"
  }
}
```

