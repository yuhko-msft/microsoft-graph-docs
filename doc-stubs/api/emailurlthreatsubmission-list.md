---
title: "List emailUrlThreatSubmissions"
description: "Get a list of the emailUrlThreatSubmission objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List emailUrlThreatSubmissions
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the [emailUrlThreatSubmission](../resources/emailurlthreatsubmission.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.emailUrlThreatSubmission not found
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

If successful, this method returns a `200 OK` response code and a collection of [emailUrlThreatSubmission](../resources/emailurlthreatsubmission.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_emailurlthreatsubmission"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for microsoft.graph.emailUrlThreatSubmission not found
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.emailUrlThreatSubmission)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
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
  ]
}
```

