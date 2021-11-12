---
title: "outgoingFlow resource type"
description: "Base class for all processes that the underlying scheduler executes in a run."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# outgoingFlow resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base class for all processes that the underlying scheduler executes in a run.
This is an abstract type.


Inherits from [process](../resources/industrydata-process.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List outgoingFlows](../api/industrydata-outgoingflow-list.md)|[microsoft.graph.industryData.outgoingFlow](../resources/industrydata-outgoingflow.md) collection|Get a list of the [outgoingFlow](../resources/industrydata-outgoingflow.md) objects and their properties.|
|[Get outgoingFlow](../api/industrydata-outgoingflow-get.md)|[microsoft.graph.industryData.outgoingFlow](../resources/industrydata-outgoingflow.md)|Read the properties and relationships of an [outgoingFlow](../resources/industrydata-outgoingflow.md) object.|
|[Update outgoingFlow](../api/industrydata-outgoingflow-update.md)|[microsoft.graph.industryData.outgoingFlow](../resources/industrydata-outgoingflow.md)|Update the properties of an [outgoingFlow](../resources/industrydata-outgoingflow.md) object.|
|[Delete outgoingFlow](../api/industrydata-outgoingflow-delete.md)|None|Deletes an [outgoingFlow](../resources/industrydata-outgoingflow.md) object.|
|[List runs](../api/industrydata-outgoingflow-list-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|Get the run resources from the runs navigation property.|
|[Add run](../api/industrydata-outgoingflow-post-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md)|Add runs by posting to the runs collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Name of the process. Inherited from [process](../resources/industrydata-process.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|
|readinessStatus|readinessStatus|The state of the process from creation through to ready to do work. Inherited from [process](../resources/industrydata-process.md). The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|runs|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|The read-only set of runs that have been executed for this process. Ordered by time. Inherited from [process](../resources/process.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.outgoingFlow",
  "baseType": "microsoft.graph.industryData.process",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.outgoingFlow",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String"
}
```

