---
title: "Create emailFileSubmissionRequest"
description: "Create a new emailFileSubmissionRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create emailFileSubmissionRequest
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md) object.

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
POST ** Collection URI for microsoft.graph.emailFileSubmissionRequest not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md) object.

The following table shows the properties that are required when you create the [emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md)|
|contentType|submissionContentType|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `mail`, `url`, `file`, `unknownFutureValue`.|
|category|submissionCategory|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|reason|submissionReason|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `shouldBlock`, `shouldAllow`, `undefined`, `unknownFutureValue`.|
|status|submissionStatus|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `pending`, `completed`, `unknownFutureValue`.|
|channel|submissionChannel|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `user`, `admin`, `unknownFutureValue`.|
|createdBy|[submissionUserIdentity](../resources/submissionuseridentity.md)|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md)|
|result|[submissionResult](../resources/submissionresult.md)|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md)|
|recipientEmail|String|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md)|
|networkMessageId|String|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md)|
|emailSubject|String|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md)|
|sender|String|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md)|
|senderIP|String|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md)|
|rescanVerdict|submissionCategory|User submission rescan result Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|adminReviewInfo|[adminReviewInfo](../resources/adminreviewinfo.md)|User submission admin review info Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md)|
|receivedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md)|
|originalVerdict|submissionCategory|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|attackSimulationInfo|[attackSimulationInfo](../resources/attacksimulationinfo.md)|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md)|
|tablInfo|[tablInfo](../resources/tablinfo.md)|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md)|
|tablPayload|[tablPayload](../resources/tablpayload.md)|Used for creation. Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md)|
|fileContent|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_emailfilesubmissionrequest_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.emailFileSubmissionRequest not found
Content-Type: application/json
Content-length: 952

{
  "@odata.type": "#microsoft.graph.emailFileSubmissionRequest",
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
  "@odata.type": "microsoft.graph.emailFileSubmissionRequest"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.emailFileSubmissionRequest",
  "id": "b307a5ee-a5ee-b307-eea5-07b3eea507b3",
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

