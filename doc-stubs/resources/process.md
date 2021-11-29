---
title: "process resource type"
description: "Base class for all processes that the underlying scheduler executes."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# process resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base class for all processes that the underlying scheduler executes.
This is an abstract type.


Inherits from [mutableEntity](../resources/mutableentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List processes](../api/process-list.md)|[process](../resources/process.md) collection|Get a list of the [process](../resources/process.md) objects and their properties.|
|[Create process](../api/run-post-process.md)|[process](../resources/process.md)|Create a new [process](../resources/process.md) object.|
|[Get process](../api/process-get.md)|[process](../resources/process.md)|Read the properties and relationships of a [process](../resources/process.md) object.|
|[Update process](../api/process-update.md)|[process](../resources/process.md)|Update the properties of a [process](../resources/process.md) object.|
|[Delete process](../api/process-delete.md)|None|Deletes a [process](../resources/process.md) object.|
|[List runs](../api/process-list-runs.md)|[run](../resources/run.md) collection|Get the run resources from the runs navigation property.|
|[Add run](../api/process-post-runs.md)|[run](../resources/run.md)|Add runs by posting to the runs collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Name of the process.|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md).|
|id|String|Unique identifier for the entity. Read-only. Inherited from [entity](../resources/entity.md).|
|readinessStatus|readinessStatus|The state of the process from creation through to ready to do work. The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|runs|[run](../resources/run.md) collection|The read-only set of runs that have been executed for this process. Ordered by time.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.process",
  "baseType": "microsoft.industryData.mutableEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.process",
  "id": "String (identifier)",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String"
}
```

