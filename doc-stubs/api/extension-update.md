---
title: "Update extension"
description: "Update the properties of an extension object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update extension
Namespace: microsoft.graph

Update the properties of an [extension](../resources/extension.md) object.

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
PATCH /user/todo/lists/{todoTaskListId}/tasks/{todoTaskId}/extensions/{extensionId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [extension](../resources/extension.md) object.

The following table shows the properties that are required when you update the [extension](../resources/extension.md).

|Property|Type|Description|
|:---|:---|:---|



## Response

If successful, this method returns a `200 OK` response code and an updated [extension](../resources/extension.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_extension"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/user/todo/lists/{todoTaskListId}/tasks/{todoTaskId}/extensions/{extensionId}
Content-Type: application/json
Content-length: 51

{
  "@odata.type": "#microsoft.graph.extension"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.extension"
}
```

