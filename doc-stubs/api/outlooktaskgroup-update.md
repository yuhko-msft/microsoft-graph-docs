---
title: "Update outlookTaskGroup"
description: "Update the properties of an outlookTaskGroup object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update outlookTaskGroup
Namespace: microsoft.graph



Update the properties of an [outlookTaskGroup](../resources/outlooktaskgroup.md) object.

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
PATCH /me/outlook/taskGroups/{outlookTaskGroupId}
PATCH /users/{usersId}/outlook/taskGroups/{outlookTaskGroupId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [outlookTaskGroup](../resources/outlooktaskgroup.md) object.

The following table shows the properties that are required when you update the [outlookTaskGroup](../resources/outlooktaskgroup.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|changeKey|String|**TODO: Add Description**|
|groupKey|Guid|**TODO: Add Description**|
|isDefaultGroup|Boolean|**TODO: Add Description**|
|name|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [outlookTaskGroup](../resources/outlooktaskgroup.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_outlooktaskgroup"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/outlook/taskGroups/{outlookTaskGroupId}
Content-Type: application/json
Content-length: 160

{
  "@odata.type": "#microsoft.graph.outlookTaskGroup",
  "changeKey": "String",
  "groupKey": "Guid",
  "isDefaultGroup": "Boolean",
  "name": "String"
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
  "@odata.type": "#microsoft.graph.outlookTaskGroup",
  "id": "05a7a94c-a94c-05a7-4ca9-a7054ca9a705",
  "changeKey": "String",
  "groupKey": "Guid",
  "isDefaultGroup": "Boolean",
  "name": "String"
}
```

