---
title: "Update documentCommentReply"
description: "Update the properties of a documentCommentReply object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update documentCommentReply
Namespace: microsoft.graph



Update the properties of a [documentCommentReply](../resources/documentcommentreply.md) object.

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
PATCH /workbooks/{workbooksId}/document/comments/{documentCommentId}/replies/{documentCommentReplyId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [documentCommentReply](../resources/documentcommentreply.md) object.

The following table shows the properties that are required when you update the [documentCommentReply](../resources/documentcommentreply.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|content|String|**TODO: Add Description**|
|location|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [documentCommentReply](../resources/documentcommentreply.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_documentcommentreply"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/workbooks/{workbooksId}/document/comments/{documentCommentId}/replies/{documentCommentReplyId}
Content-Type: application/json
Content-length: 111

{
  "@odata.type": "#microsoft.graph.documentCommentReply",
  "content": "String",
  "location": "String"
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
  "@odata.type": "#microsoft.graph.documentCommentReply",
  "id": "b7648488-8488-b764-8884-64b7888464b7",
  "content": "String",
  "location": "String"
}
```

