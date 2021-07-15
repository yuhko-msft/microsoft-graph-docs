---
title: "Update accessReviewPolicy"
description: "Update the properties of an accessReviewPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update accessReviewPolicy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [accessReviewPolicy](../resources/accessreviewpolicy.md) object.

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
PATCH /policies/accessReviewPolicy
PATCH /identityGovernance/accessReviews/policy
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [accessReviewPolicy](../resources/accessreviewpolicy.md) object.

The following table shows the properties that are required when you update the [accessReviewPolicy](../resources/accessreviewpolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|isGroupOwnerManagementEnabled|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [accessReviewPolicy](../resources/accessreviewpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_accessreviewpolicy"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/policies/accessReviewPolicy
Content-Type: application/json
Content-length: 163

{
  "@odata.type": "#microsoft.graph.accessReviewPolicy",
  "description": "String",
  "displayName": "String",
  "isGroupOwnerManagementEnabled": "Boolean"
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
  "@odata.type": "#microsoft.graph.accessReviewPolicy",
  "id": "7aa6c84e-c84e-7aa6-4ec8-a67a4ec8a67a",
  "description": "String",
  "displayName": "String",
  "isGroupOwnerManagementEnabled": "Boolean"
}
```

