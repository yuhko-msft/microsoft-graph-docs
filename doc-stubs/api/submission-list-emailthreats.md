---
title: "List emailThreats"
description: "Get the emailThreatSubmission resources from the emailThreats navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List emailThreats
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the emailThreatSubmission resources from the emailThreats navigation property.

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
GET /submission/emailThreats
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

If successful, this method returns a `200 OK` response code and a collection of [emailThreatSubmission](../resources/emailthreatsubmission.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_emailthreatsubmission"
}
-->
``` http
GET https://graph.microsoft.com/beta/submission/emailThreats
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.emailThreatSubmission)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.emailThreatSubmission",
      "id": "1fff6028-6028-1fff-2860-ff1f2860ff1f",
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
      }
    }
  ]
}
```

