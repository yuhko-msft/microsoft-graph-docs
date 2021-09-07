---
title: "List mailUriSubmissionRequests"
description: "Get a list of the mailUriSubmissionRequest objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List mailUriSubmissionRequests
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the [mailUriSubmissionRequest](../resources/mailurisubmissionrequest.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.mailUriSubmissionRequest not found
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

If successful, this method returns a `200 OK` response code and a collection of [mailUriSubmissionRequest](../resources/mailurisubmissionrequest.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_mailurisubmissionrequest"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for microsoft.graph.mailUriSubmissionRequest not found
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.mailUriSubmissionRequest)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.mailUriSubmissionRequest",
      "id": "1f25f84e-f84e-1f25-4ef8-251f4ef8251f",
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
      "messageUri": "String"
    }
  ]
}
```

