---
title: "caseIndexOperation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# caseIndexOperation resource type

Namespace: microsoft.graph.ediscovery

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [caseOperation](../resources/ediscovery-caseoperation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List caseIndexOperations](../api/ediscovery-caseindexoperation-list.md)|[microsoft.graph.ediscovery.caseIndexOperation](../resources/ediscovery-caseindexoperation.md) collection|Get a list of the [caseIndexOperation](../resources/ediscovery-caseindexoperation.md) objects and their properties.|
|[Create caseIndexOperation](../api/ediscovery-caseindexoperation-create.md)|[microsoft.graph.ediscovery.caseIndexOperation](../resources/ediscovery-caseindexoperation.md)|Create a new [caseIndexOperation](../resources/ediscovery-caseindexoperation.md) object.|
|[Get caseIndexOperation](../api/ediscovery-caseindexoperation-get.md)|[microsoft.graph.ediscovery.caseIndexOperation](../resources/ediscovery-caseindexoperation.md)|Read the properties and relationships of a [caseIndexOperation](../resources/ediscovery-caseindexoperation.md) object.|
|[Update caseIndexOperation](../api/ediscovery-caseindexoperation-update.md)|[microsoft.graph.ediscovery.caseIndexOperation](../resources/ediscovery-caseindexoperation.md)|Update the properties of a [caseIndexOperation](../resources/ediscovery-caseindexoperation.md) object.|
|[Delete caseIndexOperation](../api/ediscovery-caseindexoperation-delete.md)|None|Deletes a [caseIndexOperation](../resources/ediscovery-caseindexoperation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|action|caseAction|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md). The possible values are: `contentExport`, `applyTags`, `convertToPdf`, `index`, `estimateStatistics`, `addToReviewSet`, `unknownFutureValue`.|
|completedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md).|
|createdBy|[microsoft.graph.identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md).|
|percentProgress|Int32|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md).|
|resultInfo|[microsoft.graph.resultInfo](../resources/ediscovery-resultinfo.md)|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md).|
|status|caseOperationStatus|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md). The possible values are: `notStarted`, `submissionFailed`, `running`, `succeeded`, `partiallySucceeded`, `failed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.ediscovery.caseIndexOperation",
  "baseType": "microsoft.graph.ediscovery.caseOperation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.ediscovery.caseIndexOperation",
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

