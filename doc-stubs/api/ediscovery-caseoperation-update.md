---
title: "Update caseOperation"
description: "Update the properties of a caseOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update caseOperation
Namespace: microsoft.graph.ediscovery



Update the properties of a [caseOperation](../resources/ediscovery-caseoperation.md) object.

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
PATCH /compliance/ediscovery/cases/{caseId}/operations/{caseOperationId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [caseOperation](../resources/ediscovery-caseoperation.md) object.

The following table shows the properties that are required when you update the [caseOperation](../resources/ediscovery-caseoperation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md)|
|action|caseAction|**TODO: Add Description**. Possible values are: `contentExport`, `applyTags`, `convertToPdf`, `index`, `estimateStatistics`, `addToReviewSet`, `unknownFutureValue`.|
|completedDateTime|DateTimeOffset|**TODO: Add Description**|
|createdBy|[identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|percentProgress|Int32|**TODO: Add Description**|
|resultInfo|[resultInfo](../resources/ediscovery-resultinfo.md)|**TODO: Add Description**|
|status|caseOperationStatus|**TODO: Add Description**. Possible values are: `notStarted`, `submissionFailed`, `running`, `succeeded`, `partiallySucceeded`, `failed`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [caseOperation](../resources/ediscovery-caseoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_caseoperation"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/compliance/ediscovery/cases/{caseId}/operations/{caseOperationId}
Content-Type: application/json
Content-length: 339

{
  "@odata.type": "#microsoft.graph.ediscovery.caseOperation",
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
  "@odata.type": "#microsoft.graph.ediscovery.caseOperation",
  "id": "7c86b729-b729-7c86-29b7-867c29b7867c",
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

