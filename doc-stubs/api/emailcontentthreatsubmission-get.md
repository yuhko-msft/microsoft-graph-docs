---
title: "Get emailContentThreatSubmission"
description: "Read the properties and relationships of an emailContentThreatSubmission object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get emailContentThreatSubmission
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of an [emailContentThreatSubmission](../resources/emailcontentthreatsubmission.md) object.

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
GET /emailContentThreatSubmission
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

If successful, this method returns a `200 OK` response code and an [emailContentThreatSubmission](../resources/emailcontentthreatsubmission.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_emailcontentthreatsubmission"
}
-->
``` http
GET https://graph.microsoft.com/beta/emailContentThreatSubmission
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.emailContentThreatSubmission"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.emailContentThreatSubmission",
    "id": "d71dbd7b-bd7b-d71d-7bbd-1dd77bbd1dd7",
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
    "fileContent": "String"
  }
}
```

