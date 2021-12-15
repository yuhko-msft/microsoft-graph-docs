---
title: "Update threatSubmission"
description: "Update the properties of a threatSubmission object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update threatSubmission
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [threatSubmission](../resources/threatsubmission.md) object.

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
PATCH /threatSubmission
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|When the threat submission was created. Optional.|
|contentType|submissionContentType|email, url, email attachment, file or app. The possible values are: `email`, `url`, `emailAttachment`, `file`, `app`, `unknownFutureValue`. Optional.|
|category|submissionCategory|not junk, spam, phishing or malware. The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`. Required.|
|status|longRunningOperationStatus|If the threat submission check is finished. The possible values are: `notStarted`, `running`, `succeeded`, `failed`, `skipped`, `unknownFutureValue`. Optional.|
|source|submissionSource|The threat submission source. Administrator or user. The possible values are: `user`, `administrator`, `unknownFutureValue`. Optional.|
|createdBy|[submissionUserIdentity](../resources/submissionuseridentity.md)|The submitter of the threat submission. Optional.|
|result|[submissionResult](../resources/submissionresult.md)|The threat submission check result. Optional.|
|adminReview|[submissionAdminReview](../resources/submissionadminreview.md)|User submission admin review Optional.|
|tenantId|String|The tenant id. When creation on post, it is not necessary. Extracted from token. Optional.|
|clientSource|submissionClientSource|microsoft or other client. The possible values are: `microsoft`, `other`, `unknownFutureValue`. Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [threatSubmission](../resources/threatsubmission.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_threatsubmission"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/threatSubmission
Content-Type: application/json
Content-length: 458

{
  "@odata.type": "#microsoft.graph.threatSubmission",
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
  "clientSource": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.threatSubmission",
  "id": "ae6bb7e3-b7e3-ae6b-e3b7-6baee3b76bae",
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
  "clientSource": "String"
}
```

