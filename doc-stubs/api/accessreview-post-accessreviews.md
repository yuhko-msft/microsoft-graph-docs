---
title: "Create accessReview"
description: "Create a new accessReview object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create accessReview
Namespace: microsoft.graph



Create a new [accessReview](../resources/accessreview.md) object.

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
POST /accessReviews
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [accessReview](../resources/accessreview.md) object.

The following table shows the properties that are required when you create the [accessReview](../resources/accessreview.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|businessFlowTemplateId|String|**TODO: Add Description**|
|createdBy|[userIdentity](../resources/useridentity.md)|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|reviewedEntity|[identity](../resources/identity.md)|**TODO: Add Description**|
|reviewerType|String|**TODO: Add Description**|
|settings|[accessReviewSettings](../resources/accessreviewsettings.md)|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|
|status|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [accessReview](../resources/accessreview.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_accessreview_from_accessreviews"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/accessReviews
Content-Type: application/json
Content-length: 516

{
  "@odata.type": "#microsoft.graph.accessReview",
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
HTTP/1.1 201 Created
Content-Type: application/json

{
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
```

