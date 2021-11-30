---
title: "incomingFlow resource type"
description: "Base class for all processes that the underlying scheduler executes in a run."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# incomingFlow resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base class for all processes that the underlying scheduler executes in a run.
This is an abstract type.


Inherits from [runProcess](../resources/runprocess.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List incomingFlows](../api/incomingflow-list.md)|[incomingFlow](../resources/incomingflow.md) collection|Get a list of the [incomingFlow](../resources/incomingflow.md) objects and their properties.|
|[Create incomingFlow](../api/industrydatahub-post-incomingflows.md)|[incomingFlow](../resources/incomingflow.md)|Create a new [incomingFlow](../resources/incomingflow.md) object.|
|[Get incomingFlow](../api/incomingflow-get.md)|[incomingFlow](../resources/incomingflow.md)|Read the properties and relationships of an [incomingFlow](../resources/incomingflow.md) object.|
|[Update incomingFlow](../api/incomingflow-update.md)|[incomingFlow](../resources/incomingflow.md)|Update the properties of an [incomingFlow](../resources/incomingflow.md) object.|
|[Delete incomingFlow](../api/incomingflow-delete.md)|None|Deletes an [incomingFlow](../resources/incomingflow.md) object.|
|[List dataConnector](../api/incomingflow-list-dataconnector.md)|[dataConnector](../resources/dataconnector.md) collection|Get the dataConnector resources from the dataConnector navigation property.|
|[Add dataConnector](../api/incomingflow-post-dataconnector.md)|[dataConnector](../resources/dataconnector.md)|Add dataConnector by posting to the dataConnector collection.|
|[List runs](../api/incomingflow-list-runs.md)|[run](../resources/run.md) collection|Get the run resources from the runs navigation property.|
|[Add run](../api/incomingflow-post-runs.md)|[run](../resources/run.md)|Add runs by posting to the runs collection.|
|[List yearTimePeriodDefinition](../api/incomingflow-list-year.md)|[yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md) collection|Get the yearTimePeriodDefinition resources from the year navigation property.|
|[Add yearTimePeriodDefinition](../api/incomingflow-post-year.md)|[yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md)|Add year by posting to the year collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|dataDomain|incomingDomain|**TODO: Add Description**. The possible values are: `educationRostering`, `unknownFutureValue`.|
|displayName|String|**TODO: Add Description** Inherited from [runProcess](../resources/runprocess.md).|
|eTag|String|**TODO: Add Description** Inherited from [mutableEntity](../resources/mutableentity.md).|
|readinessStatus|readinessStatus|**TODO: Add Description** Inherited from [runProcess](../resources/runprocess.md). The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`.|
|recurrenceEffectiveDateTime|DateTimeOffset|**TODO: Add Description**|
|recurrenceExpirationDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|dataConnector|[dataConnector](../resources/dataconnector.md)|**TODO: Add Description**|
|runs|[run](../resources/run.md) collection|**TODO: Add Description** Inherited from [runProcess](../resources/runprocess.md)|
|year|[yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.incomingFlow",
  "baseType": "microsoft.industryData.runProcess",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.incomingFlow",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String",
  "dataDomain": "String",
  "recurrenceEffectiveDateTime": "String (timestamp)",
  "recurrenceExpirationDateTime": "String (timestamp)"
}
```

