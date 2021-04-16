---
title: "Get accessReview"
description: "Read the properties and relationships of an accessReview object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get accessReview
Namespace: microsoft.graph



Read the properties and relationships of an [accessReview](../resources/accessreview.md) object.

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
GET /accessReviews/{accessReviewsId}
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

If successful, this method returns a `200 OK` response code and an [accessReview](../resources/accessreview.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_accessreview"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/accessReviews/{accessReviewsId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.accessReview"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.accessReview",
    "id": "e1f2b1f9-b1f9-e1f2-f9b1-f2e1f9b1f2e1",
    "businessFlowTemplateId": "String",
    "createdBy": {
      "@odata.type": "microsoft.graph.userIdentity"
    },
    "description": "String",
    "displayName": "String",
    "endDateTime": "String (timestamp)",
    "reviewedEntity": {
      "@odata.type": "microsoft.graph.identity"
    },
    "reviewerType": "String",
    "settings": {
      "@odata.type": "microsoft.graph.accessReviewSettings"
    },
    "startDateTime": "String (timestamp)",
    "status": "String"
  }
}
```

