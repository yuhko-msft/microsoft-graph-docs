---
title: "wellKnownTaskList resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# wellKnownTaskList resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [baseTaskList](../resources/basetasklist.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List wellKnownTaskLists](../api/wellknowntasklist-list.md)|[wellKnownTaskList](../resources/wellknowntasklist.md) collection|Get a list of the [wellKnownTaskList](../resources/wellknowntasklist.md) objects and their properties.|
|[Create wellKnownTaskList](../api/wellknowntasklist-create.md)|[wellKnownTaskList](../resources/wellknowntasklist.md)|Create a new [wellKnownTaskList](../resources/wellknowntasklist.md) object.|
|[Get wellKnownTaskList](../api/wellknowntasklist-get.md)|[wellKnownTaskList](../resources/wellknowntasklist.md)|Read the properties and relationships of a [wellKnownTaskList](../resources/wellknowntasklist.md) object.|
|[Update wellKnownTaskList](../api/wellknowntasklist-update.md)|[wellKnownTaskList](../resources/wellknowntasklist.md)|Update the properties of a [wellKnownTaskList](../resources/wellknowntasklist.md) object.|
|[Delete wellKnownTaskList](../api/wellknowntasklist-delete.md)|None|Deletes a [wellKnownTaskList](../resources/wellknowntasklist.md) object.|
|[delta](../api/wellknowntasklist-delta.md)|[wellKnownTaskList](../resources/wellknowntasklist.md) collection|**TODO: Add Description**|
|[List extensions](../api/wellknowntasklist-list-extensions.md)|[extension](../resources/extension.md) collection|Get the extension resources from the extensions navigation property.|
|[Create extension](../api/wellknowntasklist-post-extensions.md)|[extension](../resources/extension.md)|Create a new extension object.|
|[List tasks](../api/wellknowntasklist-list-tasks.md)|[task](../resources/task.md) collection|Get the task resources from the tasks navigation property.|
|[Create task](../api/wellknowntasklist-post-tasks.md)|[task](../resources/task.md)|Create a new task object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Inherited from [baseTaskList](../resources/basetasklist.md).|
|id|String|**TODO: Add Description** Inherited from [baseTaskList](../resources/basetasklist.md).|
|wellKnownListName|wellKnownListName_v2|**TODO: Add Description**. The possible values are: `none`, `defaultList`, `flaggedEmails`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|extensions|[extension](../resources/extension.md) collection|**TODO: Add Description** Inherited from [baseTaskList](../resources/basetasklist.md)|
|tasks|[task](../resources/task.md) collection|**TODO: Add Description** Inherited from [baseTaskList](../resources/basetasklist.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.wellKnownTaskList",
  "baseType": "microsoft.graph.baseTaskList",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.wellKnownTaskList",
  "displayName": "String",
  "id": "String (identifier)",
  "wellKnownListName": "String"
}
```

