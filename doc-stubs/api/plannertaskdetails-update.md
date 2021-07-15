---
title: "Update plannerTaskDetails"
description: "Update the properties of a plannerTaskDetails object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update plannerTaskDetails
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [plannerTaskDetails](../resources/plannertaskdetails.md) object.

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
PATCH /me/planner/favoritePlans/{plannerPlanId}/buckets/{plannerBucketId}/tasks/{plannerTaskId}/details
PATCH /users/{usersId}/planner/favoritePlans/{plannerPlanId}/buckets/{plannerBucketId}/tasks/{plannerTaskId}/details
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [plannerTaskDetails](../resources/plannertaskdetails.md) object.

The following table shows the properties that are required when you update the [plannerTaskDetails](../resources/plannertaskdetails.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|checklist|[plannerChecklistItems](../resources/plannerchecklistitems.md)|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|previewType|plannerPreviewType|**TODO: Add Description**. Possible values are: `automatic`, `noPreview`, `checklist`, `description`, `reference`.|
|references|[plannerExternalReferences](../resources/plannerexternalreferences.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [plannerTaskDetails](../resources/plannertaskdetails.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_plannertaskdetails"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/me/planner/favoritePlans/{plannerPlanId}/buckets/{plannerBucketId}/tasks/{plannerTaskId}/details
Content-Type: application/json
Content-length: 289

{
  "@odata.type": "#microsoft.graph.plannerTaskDetails",
  "checklist": {
    "@odata.type": "microsoft.graph.plannerChecklistItems"
  },
  "description": "String",
  "previewType": "String",
  "references": {
    "@odata.type": "microsoft.graph.plannerExternalReferences"
  }
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
  "@odata.type": "#microsoft.graph.plannerTaskDetails",
  "id": "b4221df4-1df4-b422-f41d-22b4f41d22b4",
  "checklist": {
    "@odata.type": "microsoft.graph.plannerChecklistItems"
  },
  "description": "String",
  "previewType": "String",
  "references": {
    "@odata.type": "microsoft.graph.plannerExternalReferences"
  }
}
```

