---
title: "insightsOutgoingFlow resource type"
description: "Flow process to enable and send data to the Insights feature."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# insightsOutgoingFlow resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Flow process to enable and send data to the Insights feature.


Inherits from [outgoingFlow](../resources/industrydata-outgoingflow.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List insightsOutgoingFlows](../api/industrydata-insightsoutgoingflow-list.md)|[microsoft.graph.industryData.insightsOutgoingFlow](../resources/industrydata-insightsoutgoingflow.md) collection|Get a list of the [insightsOutgoingFlow](../resources/industrydata-insightsoutgoingflow.md) objects and their properties.|
|[Create insightsOutgoingFlow](../api/industrydata-industrydatahub-post-insightsoutgoingflow.md)|[microsoft.graph.industryData.insightsOutgoingFlow](../resources/industrydata-insightsoutgoingflow.md)|Create a new [insightsOutgoingFlow](../resources/industrydata-insightsoutgoingflow.md) object.|
|[Get insightsOutgoingFlow](../api/industrydata-insightsoutgoingflow-get.md)|[microsoft.graph.industryData.insightsOutgoingFlow](../resources/industrydata-insightsoutgoingflow.md)|Read the properties and relationships of an [insightsOutgoingFlow](../resources/industrydata-insightsoutgoingflow.md) object.|
|[Update insightsOutgoingFlow](../api/industrydata-insightsoutgoingflow-update.md)|[microsoft.graph.industryData.insightsOutgoingFlow](../resources/industrydata-insightsoutgoingflow.md)|Update the properties of an [insightsOutgoingFlow](../resources/industrydata-insightsoutgoingflow.md) object.|
|[Delete insightsOutgoingFlow](../api/industrydata-insightsoutgoingflow-delete.md)|None|Deletes an [insightsOutgoingFlow](../resources/industrydata-insightsoutgoingflow.md) object.|
|[List runs](../api/industrydata-insightsoutgoingflow-list-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|Get the run resources from the runs navigation property.|
|[Add run](../api/industrydata-insightsoutgoingflow-post-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md)|Add runs by posting to the runs collection.|

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
  "@odata.type": "microsoft.graph.industryData.insightsOutgoingFlow",
  "baseType": "microsoft.graph.industryData.outgoingFlow",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.insightsOutgoingFlow",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String"
}
```

