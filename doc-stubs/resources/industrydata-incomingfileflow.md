---
title: "incomingFileFlow resource type"
description: "This entity represents a flow to import data via a set of files into the canonical store."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# incomingFileFlow resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

This entity represents a flow to import data via a set of files into the canonical store.


Inherits from [incomingFlow](../resources/industrydata-incomingflow.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List incomingFileFlows](../api/industrydata-incomingfileflow-list.md)|[microsoft.graph.industryData.incomingFileFlow](../resources/industrydata-incomingfileflow.md) collection|Get a list of the [incomingFileFlow](../resources/industrydata-incomingfileflow.md) objects and their properties.|
|[Get incomingFileFlow](../api/industrydata-incomingfileflow-get.md)|[microsoft.graph.industryData.incomingFileFlow](../resources/industrydata-incomingfileflow.md)|Read the properties and relationships of an [incomingFileFlow](../resources/industrydata-incomingfileflow.md) object.|
|[Update incomingFileFlow](../api/industrydata-incomingfileflow-update.md)|[microsoft.graph.industryData.incomingFileFlow](../resources/industrydata-incomingfileflow.md)|Update the properties of an [incomingFileFlow](../resources/industrydata-incomingfileflow.md) object.|
|[Delete incomingFileFlow](../api/industrydata-incomingfileflow-delete.md)|None|Deletes an [incomingFileFlow](../resources/industrydata-incomingfileflow.md) object.|
|[pause](../api/industrydata-incomingfileflow-pause.md)|None|Pause the flow after the current run completes.|
|[resume](../api/industrydata-incomingfileflow-resume.md)|None|Resume running the flow next time it is scheduled.|
|[runNow](../api/industrydata-incomingfileflow-runnow.md)|None|Run the flow as soon as possible.|
|[List dataConnector](../api/industrydata-incomingfileflow-list-dataconnector.md)|[microsoft.graph.industryData.dataConnector](../resources/industrydata-dataconnector.md) collection|Get the dataConnector resources from the dataConnector navigation property.|
|[Add dataConnector](../api/industrydata-incomingfileflow-post-dataconnector.md)|[microsoft.graph.industryData.dataConnector](../resources/industrydata-dataconnector.md)|Add dataConnector by posting to the dataConnector collection.|
|[List fileDataConnector](../api/industrydata-incomingfileflow-list-filedataconnector.md)|[microsoft.graph.industryData.fileDataConnector](../resources/industrydata-filedataconnector.md) collection|Get the fileDataConnector resources from the fileDataConnector navigation property.|
|[Add fileDataConnector](../api/industrydata-incomingfileflow-post-filedataconnector.md)|[microsoft.graph.industryData.fileDataConnector](../resources/industrydata-filedataconnector.md)|Add fileDataConnector by posting to the fileDataConnector collection.|
|[List runs](../api/industrydata-incomingfileflow-list-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|Get the run resources from the runs navigation property.|
|[Add run](../api/industrydata-incomingfileflow-post-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md)|Add runs by posting to the runs collection.|
|[List yearTimePeriodDefinition](../api/industrydata-incomingfileflow-list-year.md)|[microsoft.graph.industryData.yearTimePeriodDefinition](../resources/industrydata-yeartimeperioddefinition.md) collection|Get the yearTimePeriodDefinition resources from the year navigation property.|
|[Add yearTimePeriodDefinition](../api/industrydata-incomingfileflow-post-year.md)|[microsoft.graph.industryData.yearTimePeriodDefinition](../resources/industrydata-yeartimeperioddefinition.md)|Add year by posting to the year collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|dataDomain|incomingDomain|The broad category of data that is being imported by this flow. Inherited from [incomingFlow](../resources/industrydata-incomingflow.md). The possible values are: `educationRostering`, `unknownFutureValue`.|
|displayName|String|Name of the process. Inherited from [process](../resources/industrydata-process.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|
|readinessStatus|readinessStatus|The state of the process from creation through to ready to do work. Inherited from [process](../resources/industrydata-process.md). The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`.|
|recurrenceEffectiveDateTime|DateTimeOffset|The start of the time window when the flow is allowed to run. ISO 8601 format. Inherited from [incomingFlow](../resources/industrydata-incomingflow.md).|
|recurrenceExpirationDateTime|DateTimeOffset|The end of the time window when the flow is allowed to run. ISO 8601 format. Inherited from [incomingFlow](../resources/industrydata-incomingflow.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|dataConnector|[dataConnector](../resources/industrydata-dataconnector.md)|The data connector in the context of which this flow will pull in data from a source system Inherited from [incomingFlow](../resources/incomingflow.md)|
|fileDataConnector|[fileDataConnector](../resources/industrydata-filedataconnector.md)|The connector this flow uses to import files.|
|runs|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|The read-only set of runs that have been executed for this process. Ordered by time. Inherited from [process](../resources/process.md)|
|year|[yearTimePeriodDefinition](../resources/industrydata-yeartimeperioddefinition.md)|The year that the data being brought in via this flow applies to. ISO-8601 4-digit year. Inherited from [incomingFlow](../resources/incomingflow.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.incomingFileFlow",
  "baseType": "microsoft.graph.industryData.incomingFlow",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.incomingFileFlow",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String",
  "dataDomain": "String",
  "recurrenceEffectiveDateTime": "String (timestamp)",
  "recurrenceExpirationDateTime": "String (timestamp)"
}
```

