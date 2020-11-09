---
title: "subtask resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# subtask resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List subtasks](../api/todotask-list-subtasks.md)|[subtask](../resources/subtask.md) collection|Get the subtask resources from the subtasks navigation property.|
|[Create subtasks](../api/todotask-post-subtasks.md)|[subtask](../resources/subtask.md)|Create a new subtask object.|
|[Update subtasks](../api/todotask-update-subtasks.md)|[subtask](../resources/subtask.md)|Update the properties of a subtasks object.|
|[Get subtasks](../api/todotask-get-subtask.md)|[subtask](../resources/subtask.md)|Read the properties and relationships of a [subtask](../resources/subtask.md) object.|
|[Delete subtasks](../api/todotask-delete-subtasks.md)|None|Delete a [subtask](../resources/subtask.md) object.|
|[List subtasks](../api/subtask-list.md)|[subtask](../resources/subtask.md) collection|Get a list of the [subtask](../resources/subtask.md) objects and their properties.|
|[Create subtask](../api/subtask-create.md)|[subtask](../resources/subtask.md)|Create a new [subtask](../resources/subtask.md) object.|
|[Get subtask](../api/subtask-get.md)|[subtask](../resources/subtask.md)|Read the properties and relationships of a [subtask](../resources/subtask.md) object.|
|[Update subtask](../api/subtask-update.md)|[subtask](../resources/subtask.md)|Update the properties of a [subtask](../resources/subtask.md) object.|
|[Delete subtask](../api/subtask-delete.md)|None|Deletes a [subtask](../resources/subtask.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|completedDateTime|DateTimeOffset|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|title|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.subtask",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.subtask",
  "id": "String (identifier)",
  "title": "String",
  "completedDateTime": "String (timestamp)",
  "createdDateTime": "String (timestamp)"
}
```

