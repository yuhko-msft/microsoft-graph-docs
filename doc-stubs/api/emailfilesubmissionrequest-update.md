---
title: "Update emailFileSubmissionRequest"
description: "Update the properties of an emailFileSubmissionRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update emailFileSubmissionRequest
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md) object.

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
PATCH /emailFileSubmissionRequest
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md) object.

The following table shows the properties that are required when you update the [emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md)|
|contentType|submissionContentType|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `mail`, `url`, `file`.|
|category|submissionCategory|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`.|
|reason|submissionReason|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `shouldBlock`, `shouldUnblock`.|
|status|submissionStatus|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `pending`, `completed`.|
|channel|submissionChannel|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `user`, `admin`.|
|createdBy|String|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md)|
|result|[submissionResult](../resources/submissionresult.md)|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md)|
|recipientEmail|String|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md)|
|networkMessageId|String|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md)|
|emailSubject|String|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md)|
|sender|String|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md)|
|senderIP|String|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md)|
|rescanResult|String|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md)|
|adminReviewInfo|[adminReviewInfo](../resources/adminreviewinfo.md)|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md)|
|contentData|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_emailfilesubmissionrequest"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/emailFileSubmissionRequest
Content-Type: application/json
Content-length: 575

{
  "@odata.type": "#microsoft.graph.emailFileSubmissionRequest",
  "contentType": "String",
  "category": "String",
  "reason": "String",
  "status": "String",
  "channel": "String",
  "createdBy": "String",
  "result": {
    "@odata.type": "microsoft.graph.submissionResult"
  },
  "recipientEmail": "String",
  "networkMessageId": "String",
  "emailSubject": "String",
  "sender": "String",
  "senderIP": "String",
  "rescanResult": "String",
  "adminReviewInfo": {
    "@odata.type": "microsoft.graph.adminReviewInfo"
  },
  "contentData": "String"
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
  "@odata.type": "#microsoft.graph.emailFileSubmissionRequest",
  "id": "b307a5ee-a5ee-b307-eea5-07b3eea507b3",
  "createdDateTime": "String (timestamp)",
  "contentType": "String",
  "category": "String",
  "reason": "String",
  "status": "String",
  "channel": "String",
  "createdBy": "String",
  "result": {
    "@odata.type": "microsoft.graph.submissionResult"
  },
  "recipientEmail": "String",
  "networkMessageId": "String",
  "emailSubject": "String",
  "sender": "String",
  "senderIP": "String",
  "rescanResult": "String",
  "adminReviewInfo": {
    "@odata.type": "microsoft.graph.adminReviewInfo"
  },
  "contentData": "String"
}
```

