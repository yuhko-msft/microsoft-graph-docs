---
title: "caseHoldOperation resource type"
description: "Represents the process of an eDiscovery case hold distribution."
ms.localizationpriority: medium
author: "mahage-msft"
ms.prod: "ediscovery"
doc_type: resourcePageType
---

# caseHoldOperation resource type

Namespace: microsoft.graph.ediscovery

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents the process of an eDiscovery case hold distribution. The **caseHoldOperation** can be retrieved from the `Location` header in the response when calling [custodian applyHolds](../api/ediscovery-custodian-applyhold.md), [custodian removeHolds](../api/ediscovery-custodian-removehold.md), [noncustodialDataSource applyHolds](../api/ediscovery-noncustodialdatasource-applyhold.md), or [noncustodialDataSource removeHolds](../api/ediscovery-noncustodialdatasource-removehold.md).

Inherits from [caseOperation](../resources/ediscovery-caseoperation.md).

## Methods

None

## Properties

|Property|Type|Description|
|:---|:---|:---|
|action|[microsoft.graph.ediscovery.caseAction](../resources/ediscovery-caseoperation.md#caseaction-values)| The case action for this entity will always be `caseHold`. Inherited from [caseOperation](../resources/ediscovery-caseoperation.md).|
|completedDateTime|DateTimeOffset| The date and time the export was completed.  Inherited from [caseOperation](../resources/ediscovery-caseoperation.md).|
|createdBy|[identitySet](../resources/identityset.md)| The user who initiated the export operation. Inherited from [caseOperation](../resources/ediscovery-caseoperation.md).|
|createdDateTime|DateTimeOffset| The date and time the export was created. Inherited from [caseOperation](../resources/ediscovery-caseoperation.md).|
|id|String| The ID for the operation. Read-only. Inherited from [caseOperation](../resources/ediscovery-caseoperation.md).|
|percentProgress|Int32| The progress of the operation. Inherited from [caseOperation](../resources/ediscovery-caseoperation.md).|
|resultInfo|[resultInfo](../resources/resultinfo.md)|Contains success and failure-specific result information. Inherited from [caseOperation](../resources/ediscovery-caseoperation.md).|
|status|[microsoft.graph.ediscovery.caseOperationStatus](../resources/ediscovery-caseoperation.md#caseoperationstatus-values)|The status of the case operation. Inherited from [caseOperation](../resources/ediscovery-caseoperation.md). Possible values are: `notStarted`, `submissionFailed`, `running`, `succeeded`, `partiallySucceeded`, `failed`.|

## Relationships

None

## JSON representation

The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.ediscovery.caseHoldOperation",
  "baseType": "microsoft.graph.ediscovery.caseOperation",
  "openType": false
}
-->

``` json
{
  "@odata.type": "#microsoft.graph.ediscovery.caseHoldOperation",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "completedDateTime": "String (timestamp)",
  "percentProgress": "Integer",
  "status": "String",
  "action": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
  }
}
```
