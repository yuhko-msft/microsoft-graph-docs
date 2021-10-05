---
title: "List tasks"
description: "Get the task resources from the tasks navigation property.of a specified wellKnownTaskList"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List tasks
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the task resources from the tasks navigation property.

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
GET /user/tasks/lists/{wellKnownTaskListId}/tasks
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

If successful, this method returns a `200 OK` response code and a collection of [task](../resources/task.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_task"
}
-->
``` http
GET https://graph.microsoft.com/beta/user/tasks/lists/AAMkADIyAAAhrbPWAAA=/tasks
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.task)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
    "@odata.etag": "W/\"NfNMZdkc9UGM8NDmq56BTAABWTaniA==\"",
    "completedDateTime": "2021-09-01T00:00:00Z",
    "importance": "high",
    "status": "completed",
    "displayName": "Test task",
    "createdDateTime": "2021-09-01T09:21:36.4465875Z",
    "lastModifiedDateTime": "2021-09-01T09:22:11.5087579Z",
    "id": "AAkALgAAAAAAHYQDEapmEc2byACqAC-EWg0ANfNMZdkc9UGM8NDmq56BTAABXUpnJwAA",
    "body": {
        "content": "",
        "contentType": "text"
    },
    "parentList@odata.context": "https://graph.microsoft.com/testprodbetataskmeta/$metadata#users('todoservicetest2412201901%40outlook.com')/tasks/lists('AAMkADIyAAAhrbPWAAA%3D')/tasks('AAkALgAAAAAAHYQDEapmEc2byACqAC-EWg0ANfNMZdkc9UGM8NDmq56BTAABXUpnJwAA')/parentList/$entity",
    "parentList": {
        "id": "AAMkADIyAAAhrbPWAAA="
    }
    }
  ]
}
```

