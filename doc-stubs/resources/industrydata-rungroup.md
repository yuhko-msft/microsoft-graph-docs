---
title: "runGroup resource type"
description: "This entity is the base class for all run types. Runs provide read-only information about the execution of processes either in the past or currently executing."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# runGroup resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

This entity is the base class for all run types. Runs provide read-only information about the execution of processes either in the past or currently executing.


Inherits from [run](../resources/industrydata-run.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List runGroups](../api/industrydata-rungroup-list.md)|[microsoft.graph.industryData.runGroup](../resources/industrydata-rungroup.md) collection|Get a list of the [runGroup](../resources/industrydata-rungroup.md) objects and their properties.|
|[Create runGroup](../api/industrydata-industrydatahub-post-rungroups.md)|[microsoft.graph.industryData.runGroup](../resources/industrydata-rungroup.md)|Create a new [runGroup](../resources/industrydata-rungroup.md) object.|
|[Get runGroup](../api/industrydata-rungroup-get.md)|[microsoft.graph.industryData.runGroup](../resources/industrydata-rungroup.md)|Read the properties and relationships of a [runGroup](../resources/industrydata-rungroup.md) object.|
|[Update runGroup](../api/industrydata-rungroup-update.md)|[microsoft.graph.industryData.runGroup](../resources/industrydata-rungroup.md)|Update the properties of a [runGroup](../resources/industrydata-rungroup.md) object.|
|[Delete runGroup](../api/industrydata-rungroup-delete.md)|None|Deletes a [runGroup](../resources/industrydata-rungroup.md) object.|
|[getErrorsAndWarningsFile](../api/industrydata-rungroup-geterrorsandwarningsfile.md)|String|**TODO: Add Description**|
|[List process](../api/industrydata-rungroup-list-process.md)|[microsoft.graph.industryData.process](../resources/industrydata-process.md) collection|Get the process resources from the process navigation property.|
|[Add process](../api/industrydata-rungroup-post-process.md)|[microsoft.graph.industryData.process](../resources/industrydata-process.md)|Add process by posting to the process collection.|
|[List runs](../api/industrydata-rungroup-list-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|Get the run resources from the runs navigation property.|
|[Create run](../api/industrydata-rungroup-post-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md)|Create a new run object.|

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
|runs|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|The set of runs belonging to the runGroup.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.runGroup",
  "baseType": "microsoft.graph.industryData.run",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.runGroup",
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

