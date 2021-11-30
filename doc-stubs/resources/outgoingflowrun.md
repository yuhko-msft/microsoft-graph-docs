---
title: "outgoingFlowRun resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# outgoingFlowRun resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


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

