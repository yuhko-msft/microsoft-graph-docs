---
title: "plannerProgressTaskBoardTaskFormat resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# plannerProgressTaskBoardTaskFormat resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [plannerDelta](../resources/plannerdelta.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List plannerProgressTaskBoardTaskFormats](../api/plannerprogresstaskboardtaskformat-list.md)|[plannerProgressTaskBoardTaskFormat](../resources/plannerprogresstaskboardtaskformat.md) collection|Get a list of the [plannerProgressTaskBoardTaskFormat](../resources/plannerprogresstaskboardtaskformat.md) objects and their properties.|
|[Create plannerProgressTaskBoardTaskFormat](../api/plannerprogresstaskboardtaskformat-create.md)|[plannerProgressTaskBoardTaskFormat](../resources/plannerprogresstaskboardtaskformat.md)|Create a new [plannerProgressTaskBoardTaskFormat](../resources/plannerprogresstaskboardtaskformat.md) object.|
|[Get plannerProgressTaskBoardTaskFormat](../api/plannerprogresstaskboardtaskformat-get.md)|[plannerProgressTaskBoardTaskFormat](../resources/plannerprogresstaskboardtaskformat.md)|Read the properties and relationships of a [plannerProgressTaskBoardTaskFormat](../resources/plannerprogresstaskboardtaskformat.md) object.|
|[Update plannerProgressTaskBoardTaskFormat](../api/plannerprogresstaskboardtaskformat-update.md)|[plannerProgressTaskBoardTaskFormat](../resources/plannerprogresstaskboardtaskformat.md)|Update the properties of a [plannerProgressTaskBoardTaskFormat](../resources/plannerprogresstaskboardtaskformat.md) object.|
|[Delete plannerProgressTaskBoardTaskFormat](../api/plannerprogresstaskboardtaskformat-delete.md)|None|Deletes a [plannerProgressTaskBoardTaskFormat](../resources/plannerprogresstaskboardtaskformat.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|orderHint|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.plannerProgressTaskBoardTaskFormat",
  "baseType": "microsoft.graph.plannerDelta",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.plannerProgressTaskBoardTaskFormat",
  "id": "String (identifier)",
  "orderHint": "String"
}
```

