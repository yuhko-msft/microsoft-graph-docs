---
title: "incomingApiFlow resource type"
description: "This entity represents a flow to import data via an external API into the canonical store."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# incomingApiFlow resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

This entity represents a flow to import data via an external API into the canonical store.


Inherits from [incomingFlow](../resources/incomingflow.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List incomingApiFlows](../api/incomingapiflow-list.md)|[incomingApiFlow](../resources/incomingapiflow.md) collection|Get a list of the [incomingApiFlow](../resources/incomingapiflow.md) objects and their properties.|
|[Get incomingApiFlow](../api/incomingapiflow-get.md)|[incomingApiFlow](../resources/incomingapiflow.md)|Read the properties and relationships of an [incomingApiFlow](../resources/incomingapiflow.md) object.|
|[Update incomingApiFlow](../api/incomingapiflow-update.md)|[incomingApiFlow](../resources/incomingapiflow.md)|Update the properties of an [incomingApiFlow](../resources/incomingapiflow.md) object.|
|[Delete incomingApiFlow](../api/incomingapiflow-delete.md)|None|Deletes an [incomingApiFlow](../resources/incomingapiflow.md) object.|
|[pause](../api/incomingapiflow-pause.md)|None|Pause the flow after the current run completes.|
|[resume](../api/incomingapiflow-resume.md)|None|Resume running the flow next time it is scheduled.|
|[runNow](../api/incomingapiflow-runnow.md)|None|Run the flow as soon as possible.|
|[List dataConnector](../api/incomingapiflow-list-dataconnector.md)|[dataConnector](../resources/dataconnector.md) collection|Get the dataConnector resources from the dataConnector navigation property.|
|[Add dataConnector](../api/incomingapiflow-post-dataconnector.md)|[dataConnector](../resources/dataconnector.md)|Add dataConnector by posting to the dataConnector collection.|
|[List runs](../api/incomingapiflow-list-runs.md)|[run](../resources/run.md) collection|Get the run resources from the runs navigation property.|
|[Add run](../api/incomingapiflow-post-runs.md)|[run](../resources/run.md)|Add runs by posting to the runs collection.|
|[List yearTimePeriodDefinition](../api/incomingapiflow-list-year.md)|[yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md) collection|Get the yearTimePeriodDefinition resources from the year navigation property.|
|[Add yearTimePeriodDefinition](../api/incomingapiflow-post-year.md)|[yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md)|Add year by posting to the year collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|apiFilter|[apiFilter](../resources/apifilter.md)|A filter to reduce the amount of data imported via the API.|
|dataDomain|incomingDomain|The broad category of data that is being imported by this flow. Inherited from [incomingFlow](../resources/incomingflow.md). The possible values are: `educationRostering`, `unknownFutureValue`.|
|displayName|String|Name of the process. Inherited from [process](../resources/process.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md).|
|id|String|Unique identifier for the entity. Read-only. Inherited from [entity](../resources/entity.md).|
|readinessStatus|readinessStatus|The state of the process from creation through to ready to do work. Inherited from [process](../resources/process.md). The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`.|
|recurrenceEffectiveDateTime|DateTimeOffset|The start of the time window when the flow is allowed to run. ISO 8601 format. Inherited from [incomingFlow](../resources/incomingflow.md).|
|recurrenceExpirationDateTime|DateTimeOffset|The end of the time window when the flow is allowed to run. ISO 8601 format. Inherited from [incomingFlow](../resources/incomingflow.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|dataConnector|[dataConnector](../resources/dataconnector.md)|The data connector in the context of which this flow will pull in data from a source system Inherited from [incomingFlow](../resources/incomingflow.md)|
|runs|[run](../resources/run.md) collection|The read-only set of runs that have been executed for this process. Ordered by time. Inherited from [process](../resources/process.md)|
|year|[yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md)|The year that the data being brought in via this flow applies to. ISO-8601 4-digit year. Inherited from [incomingFlow](../resources/incomingflow.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.incomingApiFlow",
  "baseType": "microsoft.industryData.incomingFlow",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.incomingApiFlow",
  "id": "String (identifier)",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String",
  "dataDomain": "String",
  "recurrenceEffectiveDateTime": "String (timestamp)",
  "recurrenceExpirationDateTime": "String (timestamp)",
  "apiFilter": {
    "@odata.type": "microsoft.graph.apiFilter"
  }
}
```

