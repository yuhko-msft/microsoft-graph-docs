---
title: "List plannerProgressTaskBoardTaskFormat"
description: "Get the plannerProgressTaskBoardTaskFormat resources from the progressTaskBoardFormat navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List plannerProgressTaskBoardTaskFormat
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the plannerProgressTaskBoardTaskFormat resources from the progressTaskBoardFormat navigation property.

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
GET /users/{usersId}/planner/favoritePlans/{plannerPlanId}/buckets/{plannerBucketId}/tasks/{plannerTaskId}/progressTaskBoardFormat
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

If successful, this method returns a `200 OK` response code and a collection of [plannerProgressTaskBoardTaskFormat](../resources/plannerprogresstaskboardtaskformat.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_plannerprogresstaskboardtaskformat"
}
-->
``` http
GET https://graph.microsoft.com/beta/users/{usersId}/planner/favoritePlans/{plannerPlanId}/buckets/{plannerBucketId}/tasks/{plannerTaskId}/progressTaskBoardFormat
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.plannerProgressTaskBoardTaskFormat)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.plannerProgressTaskBoardTaskFormat",
      "id": "a9c40395-0395-a9c4-9503-c4a99503c4a9",
      "orderHint": "String"
    }
  ]
}
```

