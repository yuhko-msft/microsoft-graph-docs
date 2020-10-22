---
title: "Get emailFileAssessmentRequest"
description: "Read the properties and relationships of an emailFileAssessmentRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get emailFileAssessmentRequest
Namespace: microsoft.graph

Read the properties and relationships of an [emailFileAssessmentRequest](../resources/emailfileassessmentrequest.md) object.

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
GET ** Entity URI for microsoft.graph.emailFileAssessmentRequest not found
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

If successful, this method returns a `200 OK` response code and an [emailFileAssessmentRequest](../resources/emailfileassessmentrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_emailfileassessmentrequest"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.emailFileAssessmentRequest not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.emailFileAssessmentRequest"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.emailFileAssessmentRequest",
    "id": "0577a1bb-a1bb-0577-bba1-7705bba17705",
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
    "contentData": "String"
  }
}
```

