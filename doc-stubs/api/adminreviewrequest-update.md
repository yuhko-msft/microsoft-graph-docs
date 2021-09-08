---
title: "Update adminReviewRequest"
description: "Update the properties of an adminReviewRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update adminReviewRequest
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [adminReviewRequest](../resources/adminreviewrequest.md) object.

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
PATCH /adminReviewRequests/{adminReviewRequestsId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [adminReviewRequest](../resources/adminreviewrequest.md) object.

The following table shows the properties that are required when you update the [adminReviewRequest](../resources/adminreviewrequest.md).

|Property|Type|Description|
|:---|:---|:---|
|submissionId|String|**TODO: Add Description**|
|reviewResult|submissionCategory|**TODO: Add Description**. The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|id|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [adminReviewRequest](../resources/adminreviewrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_adminreviewrequest"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/adminReviewRequests/{adminReviewRequestsId}
Content-Type: application/json
Content-length: 118

{
  "@odata.type": "#microsoft.graph.adminReviewRequest",
  "submissionId": "String",
  "reviewResult": "String"
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
  "@odata.type": "#microsoft.graph.adminReviewRequest",
  "submissionId": "String",
  "reviewResult": "String",
  "id": "faa1d60b-d60b-faa1-0bd6-a1fa0bd6a1fa"
}
```

