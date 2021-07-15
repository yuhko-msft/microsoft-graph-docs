---
title: "Update plannerAssignedToTaskBoardTaskFormat"
description: "Update the properties of a plannerAssignedToTaskBoardTaskFormat object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update plannerAssignedToTaskBoardTaskFormat
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [plannerAssignedToTaskBoardTaskFormat](../resources/plannerassignedtotaskboardtaskformat.md) object.

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
PATCH /me/planner/favoritePlans/{plannerPlanId}/buckets/{plannerBucketId}/tasks/{plannerTaskId}/assignedToTaskBoardFormat
PATCH /users/{usersId}/planner/favoritePlans/{plannerPlanId}/buckets/{plannerBucketId}/tasks/{plannerTaskId}/assignedToTaskBoardFormat
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [plannerAssignedToTaskBoardTaskFormat](../resources/plannerassignedtotaskboardtaskformat.md) object.

The following table shows the properties that are required when you update the [plannerAssignedToTaskBoardTaskFormat](../resources/plannerassignedtotaskboardtaskformat.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|orderHintsByAssignee|[plannerOrderHintsByAssignee](../resources/plannerorderhintsbyassignee.md)|**TODO: Add Description**|
|unassignedOrderHint|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [plannerAssignedToTaskBoardTaskFormat](../resources/plannerassignedtotaskboardtaskformat.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_plannerassignedtotaskboardtaskformat"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/me/planner/favoritePlans/{plannerPlanId}/buckets/{plannerBucketId}/tasks/{plannerTaskId}/assignedToTaskBoardFormat
Content-Type: application/json
Content-length: 215

{
  "@odata.type": "#microsoft.graph.plannerAssignedToTaskBoardTaskFormat",
  "orderHintsByAssignee": {
    "@odata.type": "microsoft.graph.plannerOrderHintsByAssignee"
  },
  "unassignedOrderHint": "String"
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
  "@odata.type": "#microsoft.graph.plannerAssignedToTaskBoardTaskFormat",
  "id": "9b8b961a-961a-9b8b-1a96-8b9b1a968b9b",
  "orderHintsByAssignee": {
    "@odata.type": "microsoft.graph.plannerOrderHintsByAssignee"
  },
  "unassignedOrderHint": "String"
}
```

