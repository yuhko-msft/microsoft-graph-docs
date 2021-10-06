---
title: "outgoingFlowRun resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# outgoingFlowRun resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [run](../resources/industrydata-run.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List outgoingFlowRuns](../api/industrydata-outgoingflowrun-list.md)|[microsoft.graph.industryData.outgoingFlowRun](../resources/industrydata-outgoingflowrun.md) collection|Get a list of the [outgoingFlowRun](../resources/industrydata-outgoingflowrun.md) objects and their properties.|
|[Create outgoingFlowRun](../api/industrydata-outgoingflowrun-create.md)|[microsoft.graph.industryData.outgoingFlowRun](../resources/industrydata-outgoingflowrun.md)|Create a new [outgoingFlowRun](../resources/industrydata-outgoingflowrun.md) object.|
|[Get outgoingFlowRun](../api/industrydata-outgoingflowrun-get.md)|[microsoft.graph.industryData.outgoingFlowRun](../resources/industrydata-outgoingflowrun.md)|Read the properties and relationships of an [outgoingFlowRun](../resources/industrydata-outgoingflowrun.md) object.|
|[Update outgoingFlowRun](../api/industrydata-outgoingflowrun-update.md)|[microsoft.graph.industryData.outgoingFlowRun](../resources/industrydata-outgoingflowrun.md)|Update the properties of an [outgoingFlowRun](../resources/industrydata-outgoingflowrun.md) object.|
|[Delete outgoingFlowRun](../api/industrydata-outgoingflowrun-delete.md)|None|Deletes an [outgoingFlowRun](../resources/industrydata-outgoingflowrun.md) object.|
|[List process](../api/industrydata-outgoingflowrun-list-process.md)|[microsoft.graph.industryData.process](../resources/industrydata-process.md) collection|Get the process resources from the process navigation property.|
|[Add process](../api/industrydata-outgoingflowrun-post-process.md)|[microsoft.graph.industryData.process](../resources/industrydata-process.md)|Add process by posting to the process collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Inherited from [run](../resources/industrydata-run.md).|
|endDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [run](../resources/industrydata-run.md).|
|startDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [run](../resources/industrydata-run.md).|
|statistics|[microsoft.graph.industryData.runStatistics](../resources/industrydata-runstatistics.md)|**TODO: Add Description** Inherited from [run](../resources/industrydata-run.md).|
|status|runStatus|**TODO: Add Description** Inherited from [run](../resources/industrydata-run.md). The possible values are: `running`, `failed`, `completed`, `completedWithErrors`, `completedWithWarnings`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|process|[process](../resources/industrydata-process.md)|**TODO: Add Description** Inherited from [run](../resources/run.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.outgoingFlowRun",
  "baseType": "microsoft.graph.industryData.run",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.outgoingFlowRun",
  "displayName": "String",
  "startDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)",
  "status": "String",
  "statistics": {
    "@odata.type": "microsoft.graph.industryData.runStatistics"
  }
}
```

