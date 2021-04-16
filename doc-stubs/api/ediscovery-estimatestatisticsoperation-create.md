---
title: "Create estimateStatisticsOperation"
description: "Create a new estimateStatisticsOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create estimateStatisticsOperation
Namespace: microsoft.graph.ediscovery



Create a new [estimateStatisticsOperation](../resources/ediscovery-estimatestatisticsoperation.md) object.

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
POST ** Collection URI for microsoft.graph.ediscovery.estimateStatisticsOperation not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [estimateStatisticsOperation](../resources/ediscovery-estimatestatisticsoperation.md) object.

The following table shows the properties that are required when you create the [estimateStatisticsOperation](../resources/ediscovery-estimatestatisticsoperation.md).

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
|indexedItemCount|Int64|**TODO: Add Description**|
|indexedItemsSize|Int64|**TODO: Add Description**|
|mailboxCount|Int32|**TODO: Add Description**|
|siteCount|Int32|**TODO: Add Description**|
|unindexedItemCount|Int64|**TODO: Add Description**|
|unindexedItemsSize|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [estimateStatisticsOperation](../resources/ediscovery-estimatestatisticsoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_estimatestatisticsoperation_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.ediscovery.estimateStatisticsOperation not found
Content-Type: application/json
Content-length: 550

{
  "@odata.type": "#microsoft.graph.ediscovery.estimateStatisticsOperation",
  "action": "String",
  "completedDateTime": "String (timestamp)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "percentProgress": "Integer",
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
  },
  "status": "String",
  "indexedItemCount": "Integer",
  "indexedItemsSize": "Integer",
  "mailboxCount": "Integer",
  "siteCount": "Integer",
  "unindexedItemCount": "Integer",
  "unindexedItemsSize": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.ediscovery.estimateStatisticsOperation"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.ediscovery.estimateStatisticsOperation",
  "id": "d7b21e1e-1e1e-d7b2-1e1e-b2d71e1eb2d7",
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
  "status": "String",
  "indexedItemCount": "Integer",
  "indexedItemsSize": "Integer",
  "mailboxCount": "Integer",
  "siteCount": "Integer",
  "unindexedItemCount": "Integer",
  "unindexedItemsSize": "Integer"
}
```

