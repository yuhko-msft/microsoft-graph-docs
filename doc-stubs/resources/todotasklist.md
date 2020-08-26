---
title: "todoTaskList resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# todoTaskList resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List todoTaskLists](../api/todotasklist-list.md)|[todoTaskList](../resources/todotasklist.md) collection|Get a list of the [todoTaskList](../resources/todotasklist.md) objects and their properties.|
|[Create todoTaskList](../api/todotasklist-post-lists.md)|[todoTaskList](../resources/todotasklist.md)|Create a new [todoTaskList](../resources/todotasklist.md) object.|
|[Get todoTaskList](../api/todotasklist-get.md)|[todoTaskList](../resources/todotasklist.md)|Read the properties and relationships of a [todoTaskList](../resources/todotasklist.md) object.|
|[Update todoTaskList](../api/todotasklist-update.md)|[todoTaskList](../resources/todotasklist.md)|Update the properties of a [todoTaskList](../resources/todotasklist.md) object.|
|[Delete todoTaskList](../api/todotasklist-delete.md)|None|Deletes a [todoTaskList](../resources/todotasklist.md) object.|
|[delta](../api/todotasklist-delta.md)|[todoTaskList](../resources/todotasklist.md) collection|**TODO: Add Description**|
|[List extensions](../api/todotasklist-list-extensions.md)|[extension](../resources/extension.md) collection|Get the extensions from the extensions navigation property.|
|[Create extensions](../api/todotasklist-post-extensions.md)|[extension](../resources/extension.md)|Create a new extensions object.|
|[Get extensions](../api/todotasklist-get-extension.md)|[extension](../resources/extension.md)|Read the properties and relationships of an [extension](../resources/extension.md) object.|
|[Update extensions](../api/todotasklist-update-extensions.md)|[extension](../resources/extension.md)|Update the properties of an extensions object.|
|[Delete extensions](../api/todotasklist-delete-extensions.md)|None|Delete an [extension](../resources/extension.md) object.|
|[List tasks](../api/todotasklist-list-tasks.md)|[todoTask](../resources/todotask.md) collection|Get the todoTasks from the tasks navigation property.|
|[Create tasks](../api/todotasklist-post-tasks.md)|[todoTask](../resources/todotask.md)|Create a new tasks object.|
|[Get tasks](../api/todotasklist-get-todotask.md)|[todoTask](../resources/todotask.md)|Read the properties and relationships of a [todoTask](../resources/todotask.md) object.|
|[Update tasks](../api/todotasklist-update-tasks.md)|[todoTask](../resources/todotask.md)|Update the properties of a tasks object.|
|[Delete tasks](../api/todotasklist-delete-tasks.md)|None|Delete a [todoTask](../resources/todotask.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isOwner|Boolean|**TODO: Add Description**|
|isShared|Boolean|**TODO: Add Description**|
|wellknownListName|wellknownListName|**TODO: Add Description**. Possible values are: `none`, `defaultList`, `flaggedEmails`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|extensions|[extension](../resources/extension.md) collection|**TODO: Add Description**|
|tasks|[todoTask](../resources/todotask.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.todoTaskList",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.todoTaskList",
  "id": "String (identifier)",
  "displayName": "String",
  "isOwner": "Boolean",
  "isShared": "Boolean",
  "wellknownListName": "String"
}
```

