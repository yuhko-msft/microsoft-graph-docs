---
title: "Update emailUrlThreatSubmission"
description: "Update the properties of an emailUrlThreatSubmission object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update emailUrlThreatSubmission
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [emailUrlThreatSubmission](../resources/emailurlthreatsubmission.md) object.

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
PATCH /emailUrlThreatSubmission
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
|recipientEmailAddress|String|The email recipient smtp address string. Inherited from [emailThreatSubmission](../resources/emailthreatsubmission.md). Required.|
|messageId|String|The message id of the submitted email. Inherited from [emailThreatSubmission](../resources/emailthreatsubmission.md). Optional.|
|subject|String|The subject of the submitted email. Inherited from [emailThreatSubmission](../resources/emailthreatsubmission.md). Optional.|
|sender|String|The sender of the submitted email. Inherited from [emailThreatSubmission](../resources/emailthreatsubmission.md). Optional.|
|senderIP|String|The sender IP of the submitted email. Inherited from [emailThreatSubmission](../resources/emailthreatsubmission.md). Optional.|
|receivedDateTime|DateTimeOffset|The received date time of the submitted email. Inherited from [emailThreatSubmission](../resources/emailthreatsubmission.md). Optional.|
|originalCategory|submissionCategory|notJunk, spam, phishing, malware. Inherited from [emailThreatSubmission](../resources/emailthreatsubmission.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`. Optional.|
|attackSimulationInfo|[attackSimulationInfo](../resources/attacksimulationinfo.md)|If the email is phishing simulation, the field will not be null. Inherited from [emailThreatSubmission](../resources/emailthreatsubmission.md). Optional.|
|tenantAllowOrBlockListAction|[tenantAllowOrBlockListAction](../resources/tenantalloworblocklistaction.md)|Used to auto add urls/attachments/senders of the email threat submission into tenant allow block list. Inherited from [emailThreatSubmission](../resources/emailthreatsubmission.md). Optional.|
|messageUrl|String|The graph message url to be submitted. Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [emailUrlThreatSubmission](../resources/emailurlthreatsubmission.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_emailurlthreatsubmission"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/emailUrlThreatSubmission
Content-Type: application/json
Content-length: 911

{
  "@odata.type": "#microsoft.graph.emailUrlThreatSubmission",
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
  "recipientEmailAddress": "String",
  "messageId": "String",
  "subject": "String",
  "sender": "String",
  "senderIP": "String",
  "receivedDateTime": "String (timestamp)",
  "originalCategory": "String",
  "attackSimulationInfo": {
    "@odata.type": "microsoft.graph.attackSimulationInfo"
  },
  "tenantAllowOrBlockListAction": {
    "@odata.type": "microsoft.graph.tenantAllowOrBlockListAction"
  },
  "messageUrl": "String"
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
  "@odata.type": "#microsoft.graph.emailUrlThreatSubmission",
  "id": "3ac708fc-08fc-3ac7-fc08-c73afc08c73a",
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
  "recipientEmailAddress": "String",
  "messageId": "String",
  "subject": "String",
  "sender": "String",
  "senderIP": "String",
  "receivedDateTime": "String (timestamp)",
  "originalCategory": "String",
  "attackSimulationInfo": {
    "@odata.type": "microsoft.graph.attackSimulationInfo"
  },
  "tenantAllowOrBlockListAction": {
    "@odata.type": "microsoft.graph.tenantAllowOrBlockListAction"
  },
  "messageUrl": "String"
}
```

