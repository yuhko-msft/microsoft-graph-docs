---
title: "Update onenoteResource"
description: "Update the properties of an onenoteResource object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update onenoteResource
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [onenoteResource](../resources/onenoteresource.md) object.

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
PATCH /me/onenote/resources/{onenoteResourceId}
PATCH /users/{usersId}/onenote/resources/{onenoteResourceId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [onenoteResource](../resources/onenoteresource.md) object.

The following table shows the properties that are required when you update the [onenoteResource](../resources/onenoteresource.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|self|String|**TODO: Add Description** Inherited from [onenoteEntityBaseModel](../resources/onenoteentitybasemodel.md)|
|content|Stream|**TODO: Add Description**|
|contentUrl|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [onenoteResource](../resources/onenoteresource.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_onenoteresource"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/me/onenote/resources/{onenoteResourceId}
Content-Type: application/json
Content-length: 129

{
  "@odata.type": "#microsoft.graph.onenoteResource",
  "self": "String",
  "content": "Stream",
  "contentUrl": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.onenoteResource",
  "id": "7b0d5e08-5e08-7b0d-085e-0d7b085e0d7b",
  "self": "String",
  "content": "Stream",
  "contentUrl": "String"
}
```

