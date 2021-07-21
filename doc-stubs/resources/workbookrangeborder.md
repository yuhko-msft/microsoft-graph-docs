---
title: "workbookRangeBorder resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookRangeBorder resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookRangeBorders](../api/workbookrangeborder-list.md)|[workbookRangeBorder](../resources/workbookrangeborder.md) collection|Get a list of the [workbookRangeBorder](../resources/workbookrangeborder.md) objects and their properties.|
|[Create workbookRangeBorder](../api/workbookrangeborder-create.md)|[workbookRangeBorder](../resources/workbookrangeborder.md)|Create a new [workbookRangeBorder](../resources/workbookrangeborder.md) object.|
|[Get workbookRangeBorder](../api/workbookrangeborder-get.md)|[workbookRangeBorder](../resources/workbookrangeborder.md)|Read the properties and relationships of a [workbookRangeBorder](../resources/workbookrangeborder.md) object.|
|[Update workbookRangeBorder](../api/workbookrangeborder-update.md)|[workbookRangeBorder](../resources/workbookrangeborder.md)|Update the properties of a [workbookRangeBorder](../resources/workbookrangeborder.md) object.|
|[Delete workbookRangeBorder](../api/workbookrangeborder-delete.md)|None|Deletes a [workbookRangeBorder](../resources/workbookrangeborder.md) object.|
|[count](../api/workbookrangeborder-count.md)|Int32|**TODO: Add Description**|
|[itemAt](../api/workbookrangeborder-itemat.md)|[workbookRangeBorder](../resources/workbookrangeborder.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|color|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|sideIndex|String|**TODO: Add Description**|
|style|String|**TODO: Add Description**|
|weight|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookRangeBorder",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookRangeBorder",
  "id": "String (identifier)",
  "color": "String",
  "sideIndex": "String",
  "style": "String",
  "weight": "String"
}
```

