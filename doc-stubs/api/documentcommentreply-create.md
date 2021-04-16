---
title: "Create documentCommentReply"
description: "Create a new documentCommentReply object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create documentCommentReply
Namespace: microsoft.graph



Create a new [documentCommentReply](../resources/documentcommentreply.md) object.

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
POST /workbooks/{workbooksId}/document/comments/{documentCommentId}/replies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [documentCommentReply](../resources/documentcommentreply.md) object.

The following table shows the properties that are required when you create the [documentCommentReply](../resources/documentcommentreply.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|content|String|**TODO: Add Description**|
|location|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [documentCommentReply](../resources/documentcommentreply.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_documentcommentreply_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/workbooks/{workbooksId}/document/comments/{documentCommentId}/replies
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
  "truncated": true,
  "@odata.type": "microsoft.graph.documentCommentReply"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.documentCommentReply",
  "id": "b7648488-8488-b764-8884-64b7888464b7",
  "content": "String",
  "location": "String"
}
```

