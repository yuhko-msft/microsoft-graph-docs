---
title: "Create documentComment"
description: "Create a new documentComment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create documentComment
Namespace: microsoft.graph



Create a new documentComment object.

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
POST /workbooks/{workbooksId}/document/comments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [documentComment](../resources/documentcomment.md) object.

The following table shows the properties that are required when you create the [documentComment](../resources/documentcomment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|content|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [documentComment](../resources/documentcomment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_documentcomment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/workbooks/{workbooksId}/document/comments
Content-Type: application/json
Content-length: 81

{
  "@odata.type": "#microsoft.graph.documentComment",
  "content": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.documentComment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.documentComment",
  "id": "6eca73d8-73d8-6eca-d873-ca6ed873ca6e",
  "content": "String"
}
```

