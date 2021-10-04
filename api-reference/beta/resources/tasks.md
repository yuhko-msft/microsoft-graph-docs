---
title: "tasks resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# tasks resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List tasks](../api/tasks-list.md)|[tasks](../resources/tasks.md) collection|Get a list of the [tasks](../resources/tasks.md) objects and their properties.|
|[Create tasks](../api/tasks-create.md)|[tasks](../resources/tasks.md)|Create a new [tasks](../resources/tasks.md) object.|
|[Get tasks](../api/tasks-get.md)|[tasks](../resources/tasks.md)|Read the properties and relationships of a [tasks](../resources/tasks.md) object.|
|[Update tasks](../api/tasks-update.md)|[tasks](../resources/tasks.md)|Update the properties of a [tasks](../resources/tasks.md) object.|
|[Delete tasks](../api/tasks-delete.md)|None|Deletes a [tasks](../resources/tasks.md) object.|
|[List alltasks](../api/tasks-list-alltasks.md)|[task](../resources/task.md) collection|Get the task resources from the alltasks navigation property.|
|[Create task](../api/tasks-post-alltasks.md)|[task](../resources/task.md)|Create a new task object.|
|[List lists](../api/tasks-list-lists.md)|[wellKnownTaskList](../resources/wellknowntasklist.md) collection|Get the wellKnownTaskList resources from the lists navigation property.|
|[Create wellKnownTaskList](../api/tasks-post-lists.md)|[wellKnownTaskList](../resources/wellknowntasklist.md)|Create a new wellKnownTaskList object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|alltasks|[task](../resources/task.md) collection|**TODO: Add Description**|
|lists|[wellKnownTaskList](../resources/wellknowntasklist.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.tasks",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.tasks",
  "id": "String (identifier)"
}
```

