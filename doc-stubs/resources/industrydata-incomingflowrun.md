---
title: "incomingFlowRun resource type"
description: "This entity is the base class for all run types. Runs provide read-only information about the execution of processes either in the past or currently executing."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# incomingFlowRun resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

This entity is the base class for all run types. Runs provide read-only information about the execution of processes either in the past or currently executing.


Inherits from [run](../resources/industrydata-run.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List incomingFlowRuns](../api/industrydata-incomingflowrun-list.md)|[microsoft.graph.industryData.incomingFlowRun](../resources/industrydata-incomingflowrun.md) collection|Get a list of the [incomingFlowRun](../resources/industrydata-incomingflowrun.md) objects and their properties.|
|[Get incomingFlowRun](../api/industrydata-incomingflowrun-get.md)|[microsoft.graph.industryData.incomingFlowRun](../resources/industrydata-incomingflowrun.md)|Read the properties and relationships of an [incomingFlowRun](../resources/industrydata-incomingflowrun.md) object.|
|[Update incomingFlowRun](../api/industrydata-incomingflowrun-update.md)|[microsoft.graph.industryData.incomingFlowRun](../resources/industrydata-incomingflowrun.md)|Update the properties of an [incomingFlowRun](../resources/industrydata-incomingflowrun.md) object.|
|[Delete incomingFlowRun](../api/industrydata-incomingflowrun-delete.md)|None|Deletes an [incomingFlowRun](../resources/industrydata-incomingflowrun.md) object.|
|[collateExtractedData](../api/industrydata-incomingflowrun-collateextracteddata.md)|None|Action to get the data ingested as part of the run.|
|[collateTransformedData](../api/industrydata-incomingflowrun-collatetransformeddata.md)|None|Action to get the data after transformation as part of the run.|
|[List process](../api/industrydata-incomingflowrun-list-process.md)|[microsoft.graph.industryData.process](../resources/industrydata-process.md) collection|Get the process resources from the process navigation property.|
|[Add process](../api/industrydata-incomingflowrun-post-process.md)|[microsoft.graph.industryData.process](../resources/industrydata-process.md)|Add process by posting to the process collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|blockingError|** Unknown Type `microsoft.graph.publicError` **|An error object to diagnose critical failures in a run. Inherited from [run](../resources/industrydata-run.md).|
|displayName|String|The name of the run. Inherited from [run](../resources/industrydata-run.md).|
|endDateTime|DateTimeOffset|The time the run finished in ISO 8601 format, or null if the run is still in-progress. Inherited from [run](../resources/industrydata-run.md).|
|startDateTime|DateTimeOffset|The time the run started in ISO 8601 format. Inherited from [run](../resources/industrydata-run.md).|
|statistics|[microsoft.graph.industryData.runStatistics](../resources/industrydata-runstatistics.md)|The weakly-typed statistics log from the run. Inherited from [run](../resources/industrydata-run.md).|
|status|runStatus|Current status of the run. Inherited from [run](../resources/industrydata-run.md). The possible values are: `running`, `failed`, `completed`, `completedWithErrors`, `completedWithWarnings`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|process|[process](../resources/industrydata-process.md)|The process that caused this run to exist. Inherited from [run](../resources/run.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.incomingFlowRun",
  "baseType": "microsoft.graph.industryData.run",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.incomingFlowRun",
  "displayName": "String",
  "startDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)",
  "status": "String",
  "blockingError": "<Unknown None>",
  "statistics": {
    "@odata.type": "microsoft.graph.industryData.runStatistics"
  }
}
```

