---
title: "workbookRangeFont resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookRangeFont resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookRangeFonts](../api/workbookrangefont-list.md)|[workbookRangeFont](../resources/workbookrangefont.md) collection|Get a list of the [workbookRangeFont](../resources/workbookrangefont.md) objects and their properties.|
|[Create workbookRangeFont](../api/workbookrangefont-create.md)|[workbookRangeFont](../resources/workbookrangefont.md)|Create a new [workbookRangeFont](../resources/workbookrangefont.md) object.|
|[Get workbookRangeFont](../api/workbookrangefont-get.md)|[workbookRangeFont](../resources/workbookrangefont.md)|Read the properties and relationships of a [workbookRangeFont](../resources/workbookrangefont.md) object.|
|[Update workbookRangeFont](../api/workbookrangefont-update.md)|[workbookRangeFont](../resources/workbookrangefont.md)|Update the properties of a [workbookRangeFont](../resources/workbookrangefont.md) object.|
|[Delete workbookRangeFont](../api/workbookrangefont-delete.md)|None|Deletes a [workbookRangeFont](../resources/workbookrangefont.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|bold|Boolean|**TODO: Add Description**|
|color|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|italic|Boolean|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|size|Double|**TODO: Add Description**|
|underline|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookRangeFont",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookRangeFont",
  "id": "String (identifier)",
  "bold": "Boolean",
  "color": "String",
  "italic": "Boolean",
  "name": "String",
  "size": "Double",
  "underline": "String"
}
```

