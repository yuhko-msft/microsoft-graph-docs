---
title: "outgoingFlowRun resource type"
description: "This entity is the base class for all run types. Runs provide read-only information about the execution of processes either in the past or currently executing."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# outgoingFlowRun resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

This entity is the base class for all run types. Runs provide read-only information about the execution of processes either in the past or currently executing.


Inherits from [run](../resources/run.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List outgoingFlowRuns](../api/outgoingflowrun-list.md)|[outgoingFlowRun](../resources/outgoingflowrun.md) collection|Get a list of the [outgoingFlowRun](../resources/outgoingflowrun.md) objects and their properties.|
|[Get outgoingFlowRun](../api/outgoingflowrun-get.md)|[outgoingFlowRun](../resources/outgoingflowrun.md)|Read the properties and relationships of an [outgoingFlowRun](../resources/outgoingflowrun.md) object.|
|[Update outgoingFlowRun](../api/outgoingflowrun-update.md)|[outgoingFlowRun](../resources/outgoingflowrun.md)|Update the properties of an [outgoingFlowRun](../resources/outgoingflowrun.md) object.|
|[Delete outgoingFlowRun](../api/outgoingflowrun-delete.md)|None|Deletes an [outgoingFlowRun](../resources/outgoingflowrun.md) object.|
|[List runProcess](../api/outgoingflowrun-list-process.md)|[runProcess](../resources/runprocess.md) collection|Get the runProcess resources from the process navigation property.|
|[Add runProcess](../api/outgoingflowrun-post-process.md)|[runProcess](../resources/runprocess.md)|Add process by posting to the process collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|blockingError|[publicError](../resources/publicerror.md)|An error object to diagnose critical failures in a run. Inherited from [run](../resources/run.md).|
|displayName|String|The name of the run. Inherited from [run](../resources/run.md).|
|endDateTime|DateTimeOffset|The time the run finished in ISO 8601 format, or null if the run is still in-progress. Inherited from [run](../resources/run.md).|
|startDateTime|DateTimeOffset|The time the run started in ISO 8601 format. Inherited from [run](../resources/run.md).|
|statistics|[runStatistics](../resources/runstatistics.md)|The weakly-typed statistics log from the run. Inherited from [run](../resources/run.md).|
|status|runStatus|Current status of the run. Inherited from [run](../resources/run.md). The possible values are: `running`, `failed`, `completed`, `completedWithErrors`, `completedWithWarnings`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|process|[runProcess](../resources/runprocess.md)|The process that caused this run to exist. Inherited from [run](../resources/run.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.outgoingFlowRun",
  "baseType": "microsoft.industryData.run",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.outgoingFlowRun",
  "displayName": "String",
  "startDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)",
  "status": "String",
  "blockingError": {
    "@odata.type": "microsoft.graph.publicError"
  },
  "statistics": {
    "@odata.type": "microsoft.graph.runStatistics"
  }
}
```

