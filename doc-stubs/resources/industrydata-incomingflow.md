---
title: "incomingFlow resource type"
description: "Abstract base type for all flows bring data into the canonical store."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# incomingFlow resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Abstract base type for all flows bring data into the canonical store.
This is an abstract type.


Inherits from [process](../resources/industrydata-process.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List incomingFlows](../api/industrydata-incomingflow-list.md)|[microsoft.graph.industryData.incomingFlow](../resources/industrydata-incomingflow.md) collection|Get a list of the [incomingFlow](../resources/industrydata-incomingflow.md) objects and their properties.|
|[Create incomingFlow](../api/industrydata-industrydatahub-post-incomingflows.md)|[microsoft.graph.industryData.incomingFlow](../resources/industrydata-incomingflow.md)|Create a new [incomingFlow](../resources/industrydata-incomingflow.md) object.|
|[Get incomingFlow](../api/industrydata-incomingflow-get.md)|[microsoft.graph.industryData.incomingFlow](../resources/industrydata-incomingflow.md)|Read the properties and relationships of an [incomingFlow](../resources/industrydata-incomingflow.md) object.|
|[Update incomingFlow](../api/industrydata-incomingflow-update.md)|[microsoft.graph.industryData.incomingFlow](../resources/industrydata-incomingflow.md)|Update the properties of an [incomingFlow](../resources/industrydata-incomingflow.md) object.|
|[Delete incomingFlow](../api/industrydata-incomingflow-delete.md)|None|Deletes an [incomingFlow](../resources/industrydata-incomingflow.md) object.|
|[pause](../api/industrydata-incomingflow-pause.md)|None|Pause the flow after the current run completes.|
|[resume](../api/industrydata-incomingflow-resume.md)|None|Resume running the flow next time it is scheduled.|
|[runNow](../api/industrydata-incomingflow-runnow.md)|None|Run the flow as soon as possible.|
|[List dataConnector](../api/industrydata-incomingflow-list-dataconnector.md)|[microsoft.graph.industryData.dataConnector](../resources/industrydata-dataconnector.md) collection|Get the dataConnector resources from the dataConnector navigation property.|
|[Add dataConnector](../api/industrydata-incomingflow-post-dataconnector.md)|[microsoft.graph.industryData.dataConnector](../resources/industrydata-dataconnector.md)|Add dataConnector by posting to the dataConnector collection.|
|[List runs](../api/industrydata-incomingflow-list-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|Get the run resources from the runs navigation property.|
|[Add run](../api/industrydata-incomingflow-post-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md)|Add runs by posting to the runs collection.|
|[List yearTimePeriodDefinition](../api/industrydata-incomingflow-list-year.md)|[microsoft.graph.industryData.yearTimePeriodDefinition](../resources/industrydata-yeartimeperioddefinition.md) collection|Get the yearTimePeriodDefinition resources from the year navigation property.|
|[Add yearTimePeriodDefinition](../api/industrydata-incomingflow-post-year.md)|[microsoft.graph.industryData.yearTimePeriodDefinition](../resources/industrydata-yeartimeperioddefinition.md)|Add year by posting to the year collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|dataDomain|incomingDomain|The broad category of data that is being imported by this flow. The possible values are: `educationRostering`, `unknownFutureValue`.|
|displayName|String|Name of the process. Inherited from [process](../resources/industrydata-process.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|
|readinessStatus|readinessStatus|The state of the process from creation through to ready to do work. Inherited from [process](../resources/industrydata-process.md). The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`.|
|recurrenceEffectiveDateTime|DateTimeOffset|The start of the time window when the flow is allowed to run. ISO 8601 format.|
|recurrenceExpirationDateTime|DateTimeOffset|The end of the time window when the flow is allowed to run. ISO 8601 format.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|dataConnector|[dataConnector](../resources/industrydata-dataconnector.md)|The data connector in the context of which this flow will pull in data from a source system|
|runs|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|The read-only set of runs that have been executed for this process. Ordered by time. Inherited from [process](../resources/process.md)|
|year|[yearTimePeriodDefinition](../resources/industrydata-yeartimeperioddefinition.md)|The year that the data being brought in via this flow applies to. ISO-8601 4-digit year.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.incomingFlow",
  "baseType": "microsoft.graph.industryData.process",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.incomingFlow",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String",
  "dataDomain": "String",
  "recurrenceEffectiveDateTime": "String (timestamp)",
  "recurrenceExpirationDateTime": "String (timestamp)"
}
```

