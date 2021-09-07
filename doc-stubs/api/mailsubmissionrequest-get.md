---
title: "Get mailSubmissionRequest"
description: "Read the properties and relationships of a mailSubmissionRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get mailSubmissionRequest
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [mailSubmissionRequest](../resources/mailsubmissionrequest.md) object.

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
GET /mailSubmissionRequest
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

If successful, this method returns a `200 OK` response code and a [mailSubmissionRequest](../resources/mailsubmissionrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_mailsubmissionrequest"
}
-->
``` http
GET https://graph.microsoft.com/beta/mailSubmissionRequest
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.mailSubmissionRequest"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.mailSubmissionRequest",
    "id": "56cef9f0-f9f0-56ce-f0f9-ce56f0f9ce56",
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
    }
  }
}
```

