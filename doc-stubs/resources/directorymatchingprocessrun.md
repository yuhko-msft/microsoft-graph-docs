---
title: "directoryMatchingProcessRun resource type"
description: "TODO:Description"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# directoryMatchingProcessRun resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

TODO:Description


Inherits from [run](../resources/run.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List directoryMatchingProcessRuns](../api/directorymatchingprocessrun-list.md)|[directoryMatchingProcessRun](../resources/directorymatchingprocessrun.md) collection|Get a list of the [directoryMatchingProcessRun](../resources/directorymatchingprocessrun.md) objects and their properties.|
|[Get directoryMatchingProcessRun](../api/directorymatchingprocessrun-get.md)|[directoryMatchingProcessRun](../resources/directorymatchingprocessrun.md)|Read the properties and relationships of a [directoryMatchingProcessRun](../resources/directorymatchingprocessrun.md) object.|
|[Update directoryMatchingProcessRun](../api/directorymatchingprocessrun-update.md)|[directoryMatchingProcessRun](../resources/directorymatchingprocessrun.md)|Update the properties of a [directoryMatchingProcessRun](../resources/directorymatchingprocessrun.md) object.|
|[Delete directoryMatchingProcessRun](../api/directorymatchingprocessrun-delete.md)|None|Deletes a [directoryMatchingProcessRun](../resources/directorymatchingprocessrun.md) object.|
|[List process](../api/directorymatchingprocessrun-list-process.md)|[process](../resources/process.md) collection|Get the process resources from the process navigation property.|
|[Add process](../api/directorymatchingprocessrun-post-process.md)|[process](../resources/process.md)|Add process by posting to the process collection.|

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
  "@odata.type": "microsoft.graph.directoryMatchingProcessRun",
  "baseType": "microsoft.industryData.run",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.directoryMatchingProcessRun",
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

