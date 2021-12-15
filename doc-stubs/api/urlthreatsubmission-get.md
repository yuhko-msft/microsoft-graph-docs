---
title: "Get urlThreatSubmission"
description: "Read the properties and relationships of an urlThreatSubmission object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get urlThreatSubmission
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of an [urlThreatSubmission](../resources/urlthreatsubmission.md) object.

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
GET /urlThreatSubmission
GET /submission/urlThreats/{urlThreatSubmissionId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and an [urlThreatSubmission](../resources/urlthreatsubmission.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_urlthreatsubmission"
}
-->
``` http
GET https://graph.microsoft.com/beta/urlThreatSubmission
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.urlThreatSubmission"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.urlThreatSubmission",
    "id": "d4316fe7-6fe7-d431-e76f-31d4e76f31d4",
    "createdDateTime": "String (timestamp)",
    "contentType": "String",
    "category": "String",
    "status": "String",
    "source": "String",
    "createdBy": {
      "@odata.type": "microsoft.graph.submissionUserIdentity"
    },
    "result": {
      "@odata.type": "microsoft.graph.submissionResult"
    },
    "adminReview": {
      "@odata.type": "microsoft.graph.submissionAdminReview"
    },
    "tenantId": "String",
    "clientSource": "String",
    "webUrl": "String"
  }
}
```

