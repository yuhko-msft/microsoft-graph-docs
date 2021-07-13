---
title: "workbookRangeFill resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookRangeFill resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookRangeFills](../api/workbookrangefill-list.md)|[workbookRangeFill](../resources/workbookrangefill.md) collection|Get a list of the [workbookRangeFill](../resources/workbookrangefill.md) objects and their properties.|
|[Create workbookRangeFill](../api/workbookrangefill-create.md)|[workbookRangeFill](../resources/workbookrangefill.md)|Create a new [workbookRangeFill](../resources/workbookrangefill.md) object.|
|[Get workbookRangeFill](../api/workbookrangefill-get.md)|[workbookRangeFill](../resources/workbookrangefill.md)|Read the properties and relationships of a [workbookRangeFill](../resources/workbookrangefill.md) object.|
|[Update workbookRangeFill](../api/workbookrangefill-update.md)|[workbookRangeFill](../resources/workbookrangefill.md)|Update the properties of a [workbookRangeFill](../resources/workbookrangefill.md) object.|
|[Delete workbookRangeFill](../api/workbookrangefill-delete.md)|None|Deletes a [workbookRangeFill](../resources/workbookrangefill.md) object.|
|[clear](../api/workbookrangefill-clear.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|color|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookRangeFill",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookRangeFill",
  "id": "String (identifier)",
  "color": "String"
}
```

