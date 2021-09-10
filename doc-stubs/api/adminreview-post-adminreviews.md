---
title: "Create adminReview"
description: "Create a new adminReview object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create adminReview
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [adminReview](../resources/adminreview.md) object.

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
POST /adminReviews
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [adminReview](../resources/adminreview.md) object.

The following table shows the properties that are required when you create the [adminReview](../resources/adminreview.md).

|Property|Type|Description|
|:---|:---|:---|
|submissionId|String|**TODO: Add Description**|
|reviewResult|submissionCategory|**TODO: Add Description**. The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|id|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [adminReview](../resources/adminreview.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_adminreview_from_adminreviews"
}
-->
``` http
POST https://graph.microsoft.com/beta/adminReviews
Content-Type: application/json
Content-length: 111

{
  "@odata.type": "#microsoft.graph.adminReview",
  "submissionId": "String",
  "reviewResult": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.adminReview"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.adminReview",
  "submissionId": "String",
  "reviewResult": "String",
  "id": "f760d6c5-d6c5-f760-c5d6-60f7c5d660f7"
}
```

