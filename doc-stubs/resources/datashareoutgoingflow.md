---
title: "dataShareOutgoingFlow resource type"
description: "An outgoing flow which sends data from the canonical store to an external Azure Data Lake."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# dataShareOutgoingFlow resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

An outgoing flow which sends data from the canonical store to an external Azure Data Lake.


Inherits from [outgoingFlow](../resources/outgoingflow.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List dataShareOutgoingFlows](../api/datashareoutgoingflow-list.md)|[dataShareOutgoingFlow](../resources/datashareoutgoingflow.md) collection|Get a list of the [dataShareOutgoingFlow](../resources/datashareoutgoingflow.md) objects and their properties.|
|[Create dataShareOutgoingFlow](../api/industrydatahub-post-datashareoutgoingflows.md)|[dataShareOutgoingFlow](../resources/datashareoutgoingflow.md)|Create a new [dataShareOutgoingFlow](../resources/datashareoutgoingflow.md) object.|
|[Get dataShareOutgoingFlow](../api/datashareoutgoingflow-get.md)|[dataShareOutgoingFlow](../resources/datashareoutgoingflow.md)|Read the properties and relationships of a [dataShareOutgoingFlow](../resources/datashareoutgoingflow.md) object.|
|[Update dataShareOutgoingFlow](../api/datashareoutgoingflow-update.md)|[dataShareOutgoingFlow](../resources/datashareoutgoingflow.md)|Update the properties of a [dataShareOutgoingFlow](../resources/datashareoutgoingflow.md) object.|
|[Delete dataShareOutgoingFlow](../api/datashareoutgoingflow-delete.md)|None|Deletes a [dataShareOutgoingFlow](../resources/datashareoutgoingflow.md) object.|
|[getPotentialDataShareInvitees](../api/datashareoutgoingflow-getpotentialdatashareinvitees.md)|[identity](../resources/identity.md) collection|TODO:Description|
|[List runs](../api/datashareoutgoingflow-list-runs.md)|[run](../resources/run.md) collection|Get the run resources from the runs navigation property.|
|[Add run](../api/datashareoutgoingflow-post-runs.md)|[run](../resources/run.md)|Add runs by posting to the runs collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Name of the process. Inherited from [process](../resources/process.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md).|
|id|String|Unique identifier for the entity. Read-only. Inherited from [entity](../resources/entity.md).|
|inviteeUserIds|String collection|The list of Azure Active Directory identifiers to invite to accept the share.  Must be Global Administrators in the tenant.
Currently only accepts a single identifier.|
|readinessStatus|readinessStatus|The state of the process from creation through to ready to do work. Inherited from [process](../resources/process.md). The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`.|
|shareName|String|The name of the share that will bew mentioned in the invitation.|
|sharingState|dataShareSharingState|The status of the Azure Data Share flow after the invitation has been sent. The possible values are: `pending`, `running`, `problem`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|runs|[run](../resources/run.md) collection|The read-only set of runs that have been executed for this process. Ordered by time. Inherited from [process](../resources/process.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.dataShareOutgoingFlow",
  "baseType": "microsoft.industryData.outgoingFlow",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.dataShareOutgoingFlow",
  "id": "String (identifier)",
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

