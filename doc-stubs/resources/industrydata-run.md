---
title: "run resource type"
description: "This entity is the base class for all run types. Runs provide read-only information about the execution of processes either in the past or currently executing."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# run resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

This entity is the base class for all run types. Runs provide read-only information about the execution of processes either in the past or currently executing.
This is an abstract type.


Inherits from [entity](../resources/industrydata-entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List runs](../api/industrydata-run-list.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|Get a list of the [run](../resources/industrydata-run.md) objects and their properties.|
|[Create run](../api/industrydata-incomingflow-post-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md)|Create a new [run](../resources/industrydata-run.md) object.|
|[Get run](../api/industrydata-run-get.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md)|Read the properties and relationships of a [run](../resources/industrydata-run.md) object.|
|[Update run](../api/industrydata-run-update.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md)|Update the properties of a [run](../resources/industrydata-run.md) object.|
|[Delete run](../api/industrydata-run-delete.md)|None|Deletes a [run](../resources/industrydata-run.md) object.|
|[List process](../api/industrydata-run-list-process.md)|[microsoft.graph.industryData.process](../resources/industrydata-process.md) collection|Get the process resources from the process navigation property.|
|[Add process](../api/industrydata-run-post-process.md)|[microsoft.graph.industryData.process](../resources/industrydata-process.md)|Add process by posting to the process collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|blockingError|** Unknown Type `microsoft.graph.publicError` **|An error object to diagnose critical failures in a run.|
|displayName|String|The name of the run.|
|endDateTime|DateTimeOffset|The time the run finished in ISO 8601 format, or null if the run is still in-progress.|
|startDateTime|DateTimeOffset|The time the run started in ISO 8601 format.|
|statistics|[microsoft.graph.industryData.runStatistics](../resources/industrydata-runstatistics.md)|The weakly-typed statistics log from the run.|
|status|runStatus|Current status of the run. The possible values are: `running`, `failed`, `completed`, `completedWithErrors`, `completedWithWarnings`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|process|[process](../resources/industrydata-process.md)|The process that caused this run to exist.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.run",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.run",
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

