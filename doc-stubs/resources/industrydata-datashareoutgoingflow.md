---
title: "dataShareOutgoingFlow resource type"
description: "Base class for all processes that the underlying scheduler executes in a run."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# dataShareOutgoingFlow resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base class for all processes that the underlying scheduler executes in a run.


Inherits from [outgoingFlow](../resources/industrydata-outgoingflow.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List dataShareOutgoingFlows](../api/industrydata-datashareoutgoingflow-list.md)|[microsoft.graph.industryData.dataShareOutgoingFlow](../resources/industrydata-datashareoutgoingflow.md) collection|Get a list of the [dataShareOutgoingFlow](../resources/industrydata-datashareoutgoingflow.md) objects and their properties.|
|[Create dataShareOutgoingFlow](../api/industrydata-industrydatahub-post-datashareoutgoingflows.md)|[microsoft.graph.industryData.dataShareOutgoingFlow](../resources/industrydata-datashareoutgoingflow.md)|Create a new [dataShareOutgoingFlow](../resources/industrydata-datashareoutgoingflow.md) object.|
|[Get dataShareOutgoingFlow](../api/industrydata-datashareoutgoingflow-get.md)|[microsoft.graph.industryData.dataShareOutgoingFlow](../resources/industrydata-datashareoutgoingflow.md)|Read the properties and relationships of a [dataShareOutgoingFlow](../resources/industrydata-datashareoutgoingflow.md) object.|
|[Update dataShareOutgoingFlow](../api/industrydata-datashareoutgoingflow-update.md)|[microsoft.graph.industryData.dataShareOutgoingFlow](../resources/industrydata-datashareoutgoingflow.md)|Update the properties of a [dataShareOutgoingFlow](../resources/industrydata-datashareoutgoingflow.md) object.|
|[Delete dataShareOutgoingFlow](../api/industrydata-datashareoutgoingflow-delete.md)|None|Deletes a [dataShareOutgoingFlow](../resources/industrydata-datashareoutgoingflow.md) object.|
|[getPotentialDataShareInvitees](../api/industrydata-datashareoutgoingflow-getpotentialdatashareinvitees.md)|** Unknown Type `microsoft.graph.identity` ** collection|**TODO: Add Description**|
|[List runs](../api/industrydata-datashareoutgoingflow-list-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|Get the run resources from the runs navigation property.|
|[Add run](../api/industrydata-datashareoutgoingflow-post-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md)|Add runs by posting to the runs collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Name of the process. Inherited from [process](../resources/industrydata-process.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|
|inviteeUserIds|String collection|The list of Azure Active Directory identifiers to invite to accept the share.  Must be Global Administrators in the tenant.
Currently only accepts a single identifier.|
|readinessStatus|readinessStatus|The state of the process from creation through to ready to do work. Inherited from [process](../resources/industrydata-process.md). The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`.|
|shareName|String|The name of the share that will bew mentioned in the invitation.|
|sharingState|dataShareSharingState|The status of the Azure Data Share flow after the invitation has been sent. The possible values are: `pending`, `running`, `problem`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|runs|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|The read-only set of runs that have been executed for this process. Ordered by time. Inherited from [process](../resources/process.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.dataShareOutgoingFlow",
  "baseType": "microsoft.graph.industryData.outgoingFlow",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.dataShareOutgoingFlow",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String",
  "inviteeUserIds": [
    "String"
  ],
  "sharingState": "String",
  "shareName": "String"
}
```

