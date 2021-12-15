---
title: "Get fileThreatSubmission"
description: "Read the properties and relationships of a fileThreatSubmission object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get fileThreatSubmission
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [fileThreatSubmission](../resources/filethreatsubmission.md) object.

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
GET /fileThreatSubmission
GET /submission/fileThreats/{fileThreatSubmissionId}
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

If successful, this method returns a `200 OK` response code and a [fileThreatSubmission](../resources/filethreatsubmission.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_filethreatsubmission"
}
-->
``` http
GET https://graph.microsoft.com/beta/fileThreatSubmission
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.fileThreatSubmission"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.fileThreatSubmission",
    "id": "49c11cf6-1cf6-49c1-f61c-c149f61cc149",
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
    "fileName": "String",
    "fileContent": "String"
  }
}
```

