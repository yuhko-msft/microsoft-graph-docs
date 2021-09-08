---
title: "Get emailFileSubmissionRequest"
description: "Read the properties and relationships of an emailFileSubmissionRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get emailFileSubmissionRequest
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of an [emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md) object.

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
GET /emailFileSubmissionRequest
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

If successful, this method returns a `200 OK` response code and an [emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_emailfilesubmissionrequest"
}
-->
``` http
GET https://graph.microsoft.com/beta/emailFileSubmissionRequest
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

