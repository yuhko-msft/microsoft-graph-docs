---
title: "outgoingFlow resource type"
description: "Base entity for all Outgoing Flow types."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# outgoingFlow resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base entity for all Outgoing Flow types.
This is an abstract type.


Inherits from [process](../resources/process.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List outgoingFlows](../api/outgoingflow-list.md)|[outgoingFlow](../resources/outgoingflow.md) collection|Get a list of the [outgoingFlow](../resources/outgoingflow.md) objects and their properties.|
|[Get outgoingFlow](../api/outgoingflow-get.md)|[outgoingFlow](../resources/outgoingflow.md)|Read the properties and relationships of an [outgoingFlow](../resources/outgoingflow.md) object.|
|[Update outgoingFlow](../api/outgoingflow-update.md)|[outgoingFlow](../resources/outgoingflow.md)|Update the properties of an [outgoingFlow](../resources/outgoingflow.md) object.|
|[Delete outgoingFlow](../api/outgoingflow-delete.md)|None|Deletes an [outgoingFlow](../resources/outgoingflow.md) object.|
|[List runs](../api/outgoingflow-list-runs.md)|[run](../resources/run.md) collection|Get the run resources from the runs navigation property.|
|[Add run](../api/outgoingflow-post-runs.md)|[run](../resources/run.md)|Add runs by posting to the runs collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Name of the process. Inherited from [process](../resources/process.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md).|
|id|String|Unique identifier for the entity. Read-only. Inherited from [entity](../resources/entity.md).|
|readinessStatus|readinessStatus|The state of the process from creation through to ready to do work. Inherited from [process](../resources/process.md). The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|runs|[run](../resources/run.md) collection|The read-only set of runs that have been executed for this process. Ordered by time. Inherited from [process](../resources/process.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.outgoingFlow",
  "baseType": "microsoft.industryData.process",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.outgoingFlow",
  "id": "String (identifier)",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String"
}
```

