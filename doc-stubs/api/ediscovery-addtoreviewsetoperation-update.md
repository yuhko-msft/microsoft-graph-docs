---
title: "Update addToReviewSetOperation"
description: "Update the properties of an addToReviewSetOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update addToReviewSetOperation
Namespace: microsoft.graph.ediscovery



Update the properties of an [addToReviewSetOperation](../resources/ediscovery-addtoreviewsetoperation.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /compliance/ediscovery/cases/{caseId}/sourceCollections/{sourceCollectionId}/addToReviewSetOperation
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [addToReviewSetOperation](../resources/ediscovery-addtoreviewsetoperation.md) object.

The following table shows the properties that are required when you update the [addToReviewSetOperation](../resources/ediscovery-addtoreviewsetoperation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md)|
|action|caseAction|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md). Possible values are: `contentExport`, `applyTags`, `convertToPdf`, `index`, `estimateStatistics`, `addToReviewSet`, `unknownFutureValue`.|
|completedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md)|
|createdBy|[identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md)|
|percentProgress|Int32|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md)|
|resultInfo|[resultInfo](../resources/ediscovery-resultinfo.md)|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md)|
|status|caseOperationStatus|**TODO: Add Description** Inherited from [caseOperation](../resources/ediscovery-caseoperation.md). Possible values are: `notStarted`, `submissionFailed`, `running`, `succeeded`, `partiallySucceeded`, `failed`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [addToReviewSetOperation](../resources/ediscovery-addtoreviewsetoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_addtoreviewsetoperation"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/compliance/ediscovery/cases/{caseId}/sourceCollections/{sourceCollectionId}/addToReviewSetOperation
Content-Type: application/json
Content-length: 349

{
  "@odata.type": "#microsoft.graph.ediscovery.addToReviewSetOperation",
  "action": "String",
  "completedDateTime": "String (timestamp)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "percentProgress": "Integer",
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
  },
  "status": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.ediscovery.addToReviewSetOperation",
  "id": "8f63e0d0-e0d0-8f63-d0e0-638fd0e0638f",
  "action": "String",
  "completedDateTime": "String (timestamp)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "percentProgress": "Integer",
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
  },
  "status": "String"
}
```

