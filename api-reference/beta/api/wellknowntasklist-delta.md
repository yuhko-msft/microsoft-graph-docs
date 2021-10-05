---
title: "wellKnownTaskList: delta"
description: "Get a set of wellKnownTaskList resources that have been added, deleted, or removed in Microsoft Tasks."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# wellKnownTaskList: delta
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a set of [wellKnownTaskList](../resources/wellKnownTaskList.md) resources that have been added, deleted, or removed in Microsoft Tasks.
A **delta** function call for **wellKnownTaskList** is similar to a GET request, except that by appropriately applying [state tokens](/graph/delta-query-overview) in one or more of these calls, 
you can query for incremental changes in the **wellKnownTaskList**. This allows you to maintain and synchronize a local store of a user's **wellKnownTaskList** without having to fetch all the **wellKnownTaskList** from the server every time.

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
GET /me/tasks/lists/delta
GET /users/{id|userPrincipalName}/tasks/lists/delta
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this function returns a `200 OK` response code and a [wellKnownTaskList](../resources/wellknowntasklist.md) collection in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "wellknowntasklist_delta"
}
-->
``` http
GET https://graph.microsoft.com/beta/user/tasks/lists/delta
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.wellKnownTaskList)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.wellKnownTaskList",
      "displayName": "String",
      "id": "String (identifier)",
      "wellKnownListName": "String"
    }
  ]
}
```

