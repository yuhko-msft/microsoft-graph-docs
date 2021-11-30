---
title: "incomingFlowRun resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# incomingFlowRun resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [run](../resources/run.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List incomingFlowRuns](../api/incomingflowrun-list.md)|[incomingFlowRun](../resources/incomingflowrun.md) collection|Get a list of the [incomingFlowRun](../resources/incomingflowrun.md) objects and their properties.|
|[Get incomingFlowRun](../api/incomingflowrun-get.md)|[incomingFlowRun](../resources/incomingflowrun.md)|Read the properties and relationships of an [incomingFlowRun](../resources/incomingflowrun.md) object.|
|[Update incomingFlowRun](../api/incomingflowrun-update.md)|[incomingFlowRun](../resources/incomingflowrun.md)|Update the properties of an [incomingFlowRun](../resources/incomingflowrun.md) object.|
|[Delete incomingFlowRun](../api/incomingflowrun-delete.md)|None|Deletes an [incomingFlowRun](../resources/incomingflowrun.md) object.|
|[collateExtractedData](../api/incomingflowrun-collateextracteddata.md)|None|**TODO: Add Description**|
|[collateTransformedData](../api/incomingflowrun-collatetransformeddata.md)|None|**TODO: Add Description**|
|[List runProcess](../api/incomingflowrun-list-process.md)|[runProcess](../resources/runprocess.md) collection|Get the runProcess resources from the process navigation property.|
|[Add runProcess](../api/incomingflowrun-post-process.md)|[runProcess](../resources/runprocess.md)|Add process by posting to the process collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|blockingError|[publicError](../resources/publicerror.md)|**TODO: Add Description** Inherited from [run](../resources/run.md).|
|displayName|String|**TODO: Add Description** Inherited from [run](../resources/run.md).|
|endDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [run](../resources/run.md).|
|startDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [run](../resources/run.md).|
|statistics|[runStatistics](../resources/runstatistics.md)|**TODO: Add Description** Inherited from [run](../resources/run.md).|
|status|runStatus|**TODO: Add Description** Inherited from [run](../resources/run.md). The possible values are: `running`, `failed`, `completed`, `completedWithErrors`, `completedWithWarnings`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|process|[runProcess](../resources/runprocess.md)|**TODO: Add Description** Inherited from [run](../resources/run.md)|

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

