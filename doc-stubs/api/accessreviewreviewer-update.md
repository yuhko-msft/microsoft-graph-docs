---
title: "Update accessReviewReviewer"
description: "Update the properties of an accessReviewReviewer object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update accessReviewReviewer
Namespace: microsoft.graph



Update the properties of an [accessReviewReviewer](../resources/accessreviewreviewer.md) object.

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
PATCH /accessReviews/{accessReviewsId}/reviewers/{accessReviewReviewerId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [accessReviewReviewer](../resources/accessreviewreviewer.md) object.

The following table shows the properties that are required when you update the [accessReviewReviewer](../resources/accessreviewreviewer.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [accessReviewReviewer](../resources/accessreviewreviewer.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_accessreviewreviewer"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/accessReviews/{accessReviewsId}/reviewers/{accessReviewReviewerId}
Content-Type: application/json
Content-length: 124

{
  "@odata.type": "#microsoft.graph.accessReviewReviewer",
  "displayName": "String",
  "userPrincipalName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.accessReviewReviewer",
  "id": "26d666ec-66ec-26d6-ec66-d626ec66d626",
  "displayName": "String",
  "userPrincipalName": "String"
}
```

