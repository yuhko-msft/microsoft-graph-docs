---
title: "insightsOutgoingFlow resource type"
description: "Flow process to enable and send data to the Insights feature."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# insightsOutgoingFlow resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Flow process to enable and send data to the Insights feature.


Inherits from [outgoingFlow](../resources/outgoingflow.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List insightsOutgoingFlows](../api/insightsoutgoingflow-list.md)|[insightsOutgoingFlow](../resources/insightsoutgoingflow.md) collection|Get a list of the [insightsOutgoingFlow](../resources/insightsoutgoingflow.md) objects and their properties.|
|[Create insightsOutgoingFlow](../api/industrydatahub-post-insightsoutgoingflow.md)|[insightsOutgoingFlow](../resources/insightsoutgoingflow.md)|Create a new [insightsOutgoingFlow](../resources/insightsoutgoingflow.md) object.|
|[Get insightsOutgoingFlow](../api/insightsoutgoingflow-get.md)|[insightsOutgoingFlow](../resources/insightsoutgoingflow.md)|Read the properties and relationships of an [insightsOutgoingFlow](../resources/insightsoutgoingflow.md) object.|
|[Update insightsOutgoingFlow](../api/insightsoutgoingflow-update.md)|[insightsOutgoingFlow](../resources/insightsoutgoingflow.md)|Update the properties of an [insightsOutgoingFlow](../resources/insightsoutgoingflow.md) object.|
|[Delete insightsOutgoingFlow](../api/insightsoutgoingflow-delete.md)|None|Deletes an [insightsOutgoingFlow](../resources/insightsoutgoingflow.md) object.|
|[List runs](../api/insightsoutgoingflow-list-runs.md)|[run](../resources/run.md) collection|Get the run resources from the runs navigation property.|
|[Add run](../api/insightsoutgoingflow-post-runs.md)|[run](../resources/run.md)|Add runs by posting to the runs collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Inherited from [runProcess](../resources/runprocess.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md).|
|readinessStatus|readinessStatus|**TODO: Add Description** Inherited from [runProcess](../resources/runprocess.md). The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|runs|[run](../resources/run.md) collection|**TODO: Add Description** Inherited from [runProcess](../resources/runprocess.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.insightsOutgoingFlow",
  "baseType": "microsoft.industryData.outgoingFlow",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.insightsOutgoingFlow",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String"
}
```

