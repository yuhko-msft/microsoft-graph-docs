---
title: "Create urlThreatSubmission"
description: "Create a new urlThreatSubmission object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create urlThreatSubmission
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [urlThreatSubmission](../resources/urlthreatsubmission.md) object.

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
POST /submission/urlThreats
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [urlThreatSubmission](../resources/urlthreatsubmission.md) object.

You can specify the following properties when creating an **urlThreatSubmission**.

|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|When the threat submission was created. Inherited from [threatSubmission](../resources/threatsubmission.md). Optional.|
|contentType|submissionContentType|email, url, email attachment, file or app. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `email`, `url`, `emailAttachment`, `file`, `app`, `unknownFutureValue`. Optional.|
|category|submissionCategory|not junk, spam, phishing or malware. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`. Required.|
|status|longRunningOperationStatus|If the threat submission check is finished. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `notStarted`, `running`, `succeeded`, `failed`, `skipped`, `unknownFutureValue`. Optional.|
|source|submissionSource|The threat submission source. Administrator or user. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `user`, `administrator`, `unknownFutureValue`. Optional.|
|createdBy|[submissionUserIdentity](../resources/submissionuseridentity.md)|The submitter of the threat submission. Inherited from [threatSubmission](../resources/threatsubmission.md). Optional.|
|result|[submissionResult](../resources/submissionresult.md)|The threat submission check result. Inherited from [threatSubmission](../resources/threatsubmission.md). Optional.|
|adminReview|[submissionAdminReview](../resources/submissionadminreview.md)|User submission admin review Inherited from [threatSubmission](../resources/threatsubmission.md). Optional.|
|tenantId|String|The tenant id. When creation on post, it is not necessary. Extracted from token. Inherited from [threatSubmission](../resources/threatsubmission.md). Optional.|
|clientSource|submissionClientSource|microsoft or other client. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `microsoft`, `other`, `unknownFutureValue`. Optional.|
|webUrl|String|The webUrl to be submitted. Required.|



## Response

If successful, this method returns a `201 Created` response code and an [urlThreatSubmission](../resources/urlthreatsubmission.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_urlthreatsubmission_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/submission/urlThreats
Content-Type: application/json
Content-length: 484

{
  "@odata.type": "#microsoft.graph.urlThreatSubmission",
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
HTTP/1.1 201 Created
Content-Type: application/json

{
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
```

