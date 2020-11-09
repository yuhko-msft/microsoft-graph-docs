---
title: "Get subtasks"
description: "Read the properties and relationships of a subtask object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get subtasks
Namespace: microsoft.graph

Read the properties and relationships of a [subtask](../resources/subtask.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET /users/{usersId}/todo/lists/{todoTaskListId}/tasks/{todoTaskId}/subtasks
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

If successful, this method returns a `200 OK` response code and a [subtask](../resources/subtask.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_subtask"
}
-->
``` http
GET https://graph.microsoft.com/beta/users/{usersId}/todo/lists/{todoTaskListId}/tasks/{todoTaskId}/subtasks
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.subtask"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.subtask",
    "id": "f3d4bbe8-bbe8-f3d4-e8bb-d4f3e8bbd4f3",
    "title": "String",
    "completedDateTime": "String (timestamp)",
    "createdDateTime": "String (timestamp)"
  }
}
```

