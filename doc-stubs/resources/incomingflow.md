---
title: "incomingFlow resource type"
description: "Abstract base type for all flows bring data into the canonical store."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# incomingFlow resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Abstract base type for all flows bring data into the canonical store.
This is an abstract type.


Inherits from [process](../resources/process.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List incomingFlows](../api/incomingflow-list.md)|[incomingFlow](../resources/incomingflow.md) collection|Get a list of the [incomingFlow](../resources/incomingflow.md) objects and their properties.|
|[Create incomingFlow](../api/industrydatahub-post-incomingflows.md)|[incomingFlow](../resources/incomingflow.md)|Create a new [incomingFlow](../resources/incomingflow.md) object.|
|[Get incomingFlow](../api/incomingflow-get.md)|[incomingFlow](../resources/incomingflow.md)|Read the properties and relationships of an [incomingFlow](../resources/incomingflow.md) object.|
|[Update incomingFlow](../api/incomingflow-update.md)|[incomingFlow](../resources/incomingflow.md)|Update the properties of an [incomingFlow](../resources/incomingflow.md) object.|
|[Delete incomingFlow](../api/incomingflow-delete.md)|None|Deletes an [incomingFlow](../resources/incomingflow.md) object.|
|[pause](../api/incomingflow-pause.md)|None|Pause the flow after the current run completes.|
|[resume](../api/incomingflow-resume.md)|None|Resume running the flow next time it is scheduled.|
|[runNow](../api/incomingflow-runnow.md)|None|Run the flow as soon as possible.|
|[List dataConnector](../api/incomingflow-list-dataconnector.md)|[dataConnector](../resources/dataconnector.md) collection|Get the dataConnector resources from the dataConnector navigation property.|
|[Add dataConnector](../api/incomingflow-post-dataconnector.md)|[dataConnector](../resources/dataconnector.md)|Add dataConnector by posting to the dataConnector collection.|
|[List runs](../api/incomingflow-list-runs.md)|[run](../resources/run.md) collection|Get the run resources from the runs navigation property.|
|[Add run](../api/incomingflow-post-runs.md)|[run](../resources/run.md)|Add runs by posting to the runs collection.|
|[List yearTimePeriodDefinition](../api/incomingflow-list-year.md)|[yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md) collection|Get the yearTimePeriodDefinition resources from the year navigation property.|
|[Add yearTimePeriodDefinition](../api/incomingflow-post-year.md)|[yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md)|Add year by posting to the year collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|dataDomain|incomingDomain|The broad category of data that is being imported by this flow. The possible values are: `educationRostering`, `unknownFutureValue`.|
|displayName|String|Name of the process. Inherited from [process](../resources/process.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md).|
|id|String|Unique identifier for the entity. Read-only. Inherited from [entity](../resources/entity.md).|
|readinessStatus|readinessStatus|The state of the process from creation through to ready to do work. Inherited from [process](../resources/process.md). The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`.|
|recurrenceEffectiveDateTime|DateTimeOffset|The start of the time window when the flow is allowed to run. ISO 8601 format.|
|recurrenceExpirationDateTime|DateTimeOffset|The end of the time window when the flow is allowed to run. ISO 8601 format.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|dataConnector|[dataConnector](../resources/dataconnector.md)|The data connector in the context of which this flow will pull in data from a source system|
|runs|[run](../resources/run.md) collection|The read-only set of runs that have been executed for this process. Ordered by time. Inherited from [process](../resources/process.md)|
|year|[yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md)|The year that the data being brought in via this flow applies to. ISO-8601 4-digit year.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.incomingFlow",
  "baseType": "microsoft.industryData.process",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.incomingFlow",
  "id": "String (identifier)",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String",
  "dataDomain": "String",
  "recurrenceEffectiveDateTime": "String (timestamp)",
  "recurrenceExpirationDateTime": "String (timestamp)"
}
```

