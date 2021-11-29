---
title: "incomingFlowRun resource type"
description: "Provides information about the execution of an incomingFlow."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# incomingFlowRun resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Provides information about the execution of an incomingFlow.


Inherits from [run](../resources/run.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List incomingFlowRuns](../api/incomingflowrun-list.md)|[incomingFlowRun](../resources/incomingflowrun.md) collection|Get a list of the [incomingFlowRun](../resources/incomingflowrun.md) objects and their properties.|
|[Get incomingFlowRun](../api/incomingflowrun-get.md)|[incomingFlowRun](../resources/incomingflowrun.md)|Read the properties and relationships of an [incomingFlowRun](../resources/incomingflowrun.md) object.|
|[Update incomingFlowRun](../api/incomingflowrun-update.md)|[incomingFlowRun](../resources/incomingflowrun.md)|Update the properties of an [incomingFlowRun](../resources/incomingflowrun.md) object.|
|[Delete incomingFlowRun](../api/incomingflowrun-delete.md)|None|Deletes an [incomingFlowRun](../resources/incomingflowrun.md) object.|
|[collateExtractedData](../api/incomingflowrun-collateextracteddata.md)|None|Action to get the data ingested as part of the run.|
|[collateTransformedData](../api/incomingflowrun-collatetransformeddata.md)|None|Action to get the data after transformation as part of the run.|
|[List process](../api/incomingflowrun-list-process.md)|[process](../resources/process.md) collection|Get the process resources from the process navigation property.|
|[Add process](../api/incomingflowrun-post-process.md)|[process](../resources/process.md)|Add process by posting to the process collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|blockingError|[publicError](../resources/publicerror.md)|An error object to diagnose critical failures in a run. Inherited from [run](../resources/run.md).|
|displayName|String|The name of the run. Inherited from [run](../resources/run.md).|
|endDateTime|DateTimeOffset|The time the run finished in ISO 8601 format, or null if the run is still in-progress. Inherited from [run](../resources/run.md).|
|id|String|Unique identifier for the entity. Read-only. Inherited from [entity](../resources/entity.md).|
|startDateTime|DateTimeOffset|The time the run started in ISO 8601 format. Inherited from [run](../resources/run.md).|
|statistics|[runStatistics](../resources/runstatistics.md)|The weakly-typed statistics log from the run. Inherited from [run](../resources/run.md).|
|status|runStatus|Current status of the run. Inherited from [run](../resources/run.md). The possible values are: `running`, `failed`, `completed`, `completedWithErrors`, `completedWithWarnings`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|process|[process](../resources/process.md)|The process that caused this run to exist. Inherited from [run](../resources/run.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.incomingFlowRun",
  "baseType": "microsoft.industryData.run",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.incomingFlowRun",
  "id": "String (identifier)",
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

