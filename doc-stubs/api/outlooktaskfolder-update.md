---
title: "Update outlookTaskFolder"
description: "Update the properties of an outlookTaskFolder object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update outlookTaskFolder
Namespace: microsoft.graph



Update the properties of an [outlookTaskFolder](../resources/outlooktaskfolder.md) object.

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
PATCH /me/outlook/taskFolders/{outlookTaskFolderId}
PATCH /users/{usersId}/outlook/taskFolders/{outlookTaskFolderId}
PATCH /me/outlook/taskGroups/{outlookTaskGroupId}/taskFolders/{outlookTaskFolderId}
PATCH /users/{usersId}/outlook/taskGroups/{outlookTaskGroupId}/taskFolders/{outlookTaskFolderId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [outlookTaskFolder](../resources/outlooktaskfolder.md) object.

The following table shows the properties that are required when you update the [outlookTaskFolder](../resources/outlooktaskfolder.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|changeKey|String|**TODO: Add Description**|
|isDefaultFolder|Boolean|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|parentGroupKey|Guid|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [outlookTaskFolder](../resources/outlooktaskfolder.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_outlooktaskfolder"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/outlook/taskFolders/{outlookTaskFolderId}
Content-Type: application/json
Content-length: 168

{
  "@odata.type": "#microsoft.graph.outlookTaskFolder",
  "changeKey": "String",
  "isDefaultFolder": "Boolean",
  "name": "String",
  "parentGroupKey": "Guid"
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
  "@odata.type": "#microsoft.graph.outlookTaskFolder",
  "id": "3d16c09b-c09b-3d16-9bc0-163d9bc0163d",
  "changeKey": "String",
  "isDefaultFolder": "Boolean",
  "name": "String",
  "parentGroupKey": "Guid"
}
```

