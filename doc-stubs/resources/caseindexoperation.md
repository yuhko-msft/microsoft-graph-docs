---
title: "caseIndexOperation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# caseIndexOperation resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [caseOperation](../resources/caseoperation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List caseIndexOperations](../api/caseindexoperation-list.md)|[caseIndexOperation](../resources/caseindexoperation.md) collection|Get a list of the [caseIndexOperation](../resources/caseindexoperation.md) objects and their properties.|
|[Create caseIndexOperation](../api/caseindexoperation-create.md)|[caseIndexOperation](../resources/caseindexoperation.md)|Create a new [caseIndexOperation](../resources/caseindexoperation.md) object.|
|[Get caseIndexOperation](../api/caseindexoperation-get.md)|[caseIndexOperation](../resources/caseindexoperation.md)|Read the properties and relationships of a [caseIndexOperation](../resources/caseindexoperation.md) object.|
|[Update caseIndexOperation](../api/caseindexoperation-update.md)|[caseIndexOperation](../resources/caseindexoperation.md)|Update the properties of a [caseIndexOperation](../resources/caseindexoperation.md) object.|
|[Delete caseIndexOperation](../api/caseindexoperation-delete.md)|None|Deletes a [caseIndexOperation](../resources/caseindexoperation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|action|caseAction|**TODO: Add Description** Inherited from [caseOperation](../resources/caseoperation.md). Possible values are: `contentExport`, `applyTags`, `convertToPdf`, `index`, `estimateStatistics`, `addToReviewSet`, `unknownFutureValue`.|
|completedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [caseOperation](../resources/caseoperation.md)|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [caseOperation](../resources/caseoperation.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [caseOperation](../resources/caseoperation.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|percentProgress|Int32|**TODO: Add Description** Inherited from [caseOperation](../resources/caseoperation.md)|
|resultInfo|[resultInfo](../resources/resultinfo.md)|**TODO: Add Description** Inherited from [caseOperation](../resources/caseoperation.md)|
|status|caseOperationStatus|**TODO: Add Description** Inherited from [caseOperation](../resources/caseoperation.md). Possible values are: `notStarted`, `submissionFailed`, `running`, `succeeded`, `partiallySucceeded`, `failed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.caseIndexOperation",
  "baseType": "microsoft.compliance.ediscovery.contract.caseOperation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.caseIndexOperation",
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

