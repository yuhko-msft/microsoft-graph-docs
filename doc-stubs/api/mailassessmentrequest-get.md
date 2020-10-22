---
title: "Get mailAssessmentRequest"
description: "Read the properties and relationships of a mailAssessmentRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get mailAssessmentRequest
Namespace: microsoft.graph

Read the properties and relationships of a [mailAssessmentRequest](../resources/mailassessmentrequest.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET ** Entity URI for microsoft.graph.mailAssessmentRequest not found
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

If successful, this method returns a `200 OK` response code and a [mailAssessmentRequest](../resources/mailassessmentrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_mailassessmentrequest"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.mailAssessmentRequest not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.mailAssessmentRequest"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.mailAssessmentRequest",
    "id": "e0c5f86f-f86f-e0c5-6ff8-c5e06ff8c5e0",
    "createdDateTime": "String (timestamp)",
    "contentType": "String",
    "expectedAssessment": "String",
    "category": "String",
    "status": "String",
    "requestSource": "String",
    "createdBy": {
      "@odata.type": "microsoft.graph.identitySet"
    },
    "recipientEmail": "String",
    "destinationRoutingReason": "String",
    "messageUri": "String"
  }
}
```

