---
title: "Create subtasks"
description: "Create a new subtask object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create subtasks
Namespace: microsoft.graph

Create a new subtask object.

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
POST /me/todo/lists/{todoTaskListId}/tasks/{todoTaskId}/subtasks
POST /users/{usersId}/todo/lists/{todoTaskListId}/tasks/{todoTaskId}/subtasks
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [subtask](../resources/subtask.md) object.

The following table shows the properties that are required when you create the [subtask](../resources/subtask.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|title|String|**TODO: Add Description**|
|completedDateTime|DateTimeOffset|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [subtask](../resources/subtask.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_subtask_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/me/todo/lists/{todoTaskListId}/tasks/{todoTaskId}/subtasks
Content-Type: application/json
Content-length: 117

{
  "@odata.type": "#microsoft.graph.subtask",
  "title": "String",
  "completedDateTime": "String (timestamp)"
}
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
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.subtask",
  "id": "f3d4bbe8-bbe8-f3d4-e8bb-d4f3e8bbd4f3",
  "title": "String",
  "completedDateTime": "String (timestamp)",
  "createdDateTime": "String (timestamp)"
}
```

