---
title: "Create attachment"
description: "Create a new attachment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create attachment
Namespace: microsoft.graph

Create a new [attachment](../resources/attachment.md) object.

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
POST /users/{usersId}/messages/{messageId}/attachments
POST /users/{usersId}/messages/{messageId}/event/attachments
POST /groups/{groupsId}/conversations/{conversationId}/threads/{conversationThreadId}/posts/{postId}/attachments
POST /users/{usersId}/outlook/taskGroups/{outlookTaskGroupId}/taskFolders/{outlookTaskFolderId}/tasks/{outlookTaskId}/attachments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [attachment](../resources/attachment.md) object.

The following table shows the properties that are required when you create the [attachment](../resources/attachment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|contentType|String|**TODO: Add Description**|
|size|Int32|**TODO: Add Description**|
|isInline|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [attachment](../resources/attachment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_attachment_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/users/{usersId}/messages/{messageId}/attachments
Content-Type: application/json
Content-length: 149

{
  "@odata.type": "#microsoft.graph.attachment",
  "name": "String",
  "contentType": "String",
  "size": "Integer",
  "isInline": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.attachment"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.attachment",
  "id": "587cb313-b313-587c-13b3-7c5813b37c58",
  "lastModifiedDateTime": "String (timestamp)",
  "name": "String",
  "contentType": "String",
  "size": "Integer",
  "isInline": "Boolean"
}
```

