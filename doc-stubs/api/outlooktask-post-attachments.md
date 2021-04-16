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



Create a new attachment object.

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
POST /users/{usersId}/outlook/taskFolders/{outlookTaskFolderId}/tasks/{outlookTaskId}/attachments
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
|contentType|String|**TODO: Add Description**|
|isInline|Boolean|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|size|Int32|**TODO: Add Description**|



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
POST https://graph.microsoft.com/v1.0/users/{usersId}/outlook/taskFolders/{outlookTaskFolderId}/tasks/{outlookTaskId}/attachments
Content-Type: application/json
Content-length: 149

{
  "@odata.type": "#microsoft.graph.attachment",
  "contentType": "String",
  "isInline": "Boolean",
  "name": "String",
  "size": "Integer"
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
  "id": "a3cf4c25-4c25-a3cf-254c-cfa3254ccfa3",
  "contentType": "String",
  "isInline": "Boolean",
  "lastModifiedDateTime": "String (timestamp)",
  "name": "String",
  "size": "Integer"
}
```

