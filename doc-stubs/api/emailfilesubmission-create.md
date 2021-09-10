---
title: "Create emailFileSubmission"
description: "Create a new emailFileSubmission object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create emailFileSubmission
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [emailFileSubmission](../resources/emailfilesubmission.md) object.

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
POST ** Collection URI for microsoft.graph.emailFileSubmission not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [emailFileSubmission](../resources/emailfilesubmission.md) object.

The following table shows the properties that are required when you create the [emailFileSubmission](../resources/emailfilesubmission.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [submission](../resources/submission.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [submission](../resources/submission.md)|
|contentType|submissionContentType|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `mail`, `url`, `file`, `unknownFutureValue`.|
|category|submissionCategory|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|reason|submissionReason|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `shouldBlock`, `shouldAllow`, `undefined`, `unknownFutureValue`.|
|status|submissionStatus|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `pending`, `completed`, `unknownFutureValue`.|
|channel|submissionChannel|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `user`, `admin`, `unknownFutureValue`.|
|createdBy|[submissionUserIdentity](../resources/submissionuseridentity.md)|**TODO: Add Description** Inherited from [submission](../resources/submission.md)|
|result|[submissionResult](../resources/submissionresult.md)|**TODO: Add Description** Inherited from [submission](../resources/submission.md)|
|recipientEmail|String|**TODO: Add Description** Inherited from [mailSubmission](../resources/mailsubmission.md)|
|networkMessageId|String|**TODO: Add Description** Inherited from [mailSubmission](../resources/mailsubmission.md)|
|emailSubject|String|**TODO: Add Description** Inherited from [mailSubmission](../resources/mailsubmission.md)|
|sender|String|**TODO: Add Description** Inherited from [mailSubmission](../resources/mailsubmission.md)|
|senderIP|String|**TODO: Add Description** Inherited from [mailSubmission](../resources/mailsubmission.md)|
|rescanVerdict|submissionCategory|User submission rescan result Inherited from [mailSubmission](../resources/mailsubmission.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|adminReviewInfo|[adminReviewInfo](../resources/adminreviewinfo.md)|User submission admin review info Inherited from [mailSubmission](../resources/mailsubmission.md)|
|receivedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [mailSubmission](../resources/mailsubmission.md)|
|originalVerdict|submissionCategory|**TODO: Add Description** Inherited from [mailSubmission](../resources/mailsubmission.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|attackSimulationInfo|[attackSimulationInfo](../resources/attacksimulationinfo.md)|**TODO: Add Description** Inherited from [mailSubmission](../resources/mailsubmission.md)|
|tablInfo|[tablInfo](../resources/tablinfo.md)|**TODO: Add Description** Inherited from [mailSubmission](../resources/mailsubmission.md)|
|tablPayload|[tablPayload](../resources/tablpayload.md)|Used for creation. Inherited from [mailSubmission](../resources/mailsubmission.md)|
|fileContent|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [emailFileSubmission](../resources/emailfilesubmission.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_emailfilesubmission_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.emailFileSubmission not found
Content-Type: application/json
Content-length: 945

{
  "@odata.type": "#microsoft.graph.emailFileSubmission",
  "contentType": "String",
  "category": "String",
  "reason": "String",
  "status": "String",
  "channel": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.submissionUserIdentity"
  },
  "result": {
    "@odata.type": "microsoft.graph.submissionResult"
  },
  "recipientEmail": "String",
  "networkMessageId": "String",
  "emailSubject": "String",
  "sender": "String",
  "senderIP": "String",
  "rescanVerdict": "String",
  "adminReviewInfo": {
    "@odata.type": "microsoft.graph.adminReviewInfo"
  },
  "receivedDateTime": "String (timestamp)",
  "originalVerdict": "String",
  "attackSimulationInfo": {
    "@odata.type": "microsoft.graph.attackSimulationInfo"
  },
  "tablInfo": {
    "@odata.type": "microsoft.graph.tablInfo"
  },
  "tablPayload": {
    "@odata.type": "microsoft.graph.tablPayload"
  },
  "fileContent": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.emailFileSubmission"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.emailFileSubmission",
  "id": "b1d27e3c-7e3c-b1d2-3c7e-d2b13c7ed2b1",
  "createdDateTime": "String (timestamp)",
  "contentType": "String",
  "category": "String",
  "reason": "String",
  "status": "String",
  "channel": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.submissionUserIdentity"
  },
  "result": {
    "@odata.type": "microsoft.graph.submissionResult"
  },
  "recipientEmail": "String",
  "networkMessageId": "String",
  "emailSubject": "String",
  "sender": "String",
  "senderIP": "String",
  "rescanVerdict": "String",
  "adminReviewInfo": {
    "@odata.type": "microsoft.graph.adminReviewInfo"
  },
  "receivedDateTime": "String (timestamp)",
  "originalVerdict": "String",
  "attackSimulationInfo": {
    "@odata.type": "microsoft.graph.attackSimulationInfo"
  },
  "tablInfo": {
    "@odata.type": "microsoft.graph.tablInfo"
  },
  "tablPayload": {
    "@odata.type": "microsoft.graph.tablPayload"
  },
  "fileContent": "String"
}
```

