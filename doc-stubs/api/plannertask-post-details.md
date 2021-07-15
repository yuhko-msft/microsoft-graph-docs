---
title: "Create plannerTaskDetails"
description: "Create a new plannerTaskDetails object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create plannerTaskDetails
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new plannerTaskDetails object.

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
POST /users/{usersId}/planner/favoritePlans/{plannerPlanId}/buckets/{plannerBucketId}/tasks/{plannerTaskId}/details
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [plannerTaskDetails](../resources/plannertaskdetails.md) object.

The following table shows the properties that are required when you create the [plannerTaskDetails](../resources/plannertaskdetails.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|checklist|[plannerChecklistItems](../resources/plannerchecklistitems.md)|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|previewType|plannerPreviewType|**TODO: Add Description**. Possible values are: `automatic`, `noPreview`, `checklist`, `description`, `reference`.|
|references|[plannerExternalReferences](../resources/plannerexternalreferences.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [plannerTaskDetails](../resources/plannertaskdetails.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_plannertaskdetails_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/users/{usersId}/planner/favoritePlans/{plannerPlanId}/buckets/{plannerBucketId}/tasks/{plannerTaskId}/details
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
  "truncated": true,
  "@odata.type": "microsoft.graph.plannerTaskDetails"
}
-->
``` http
HTTP/1.1 201 Created
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

