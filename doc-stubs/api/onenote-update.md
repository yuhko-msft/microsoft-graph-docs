---
title: "Update onenote"
description: "Update the properties of an onenote object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update onenote
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [onenote](../resources/onenote.md) object.

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
PATCH /me/onenote
PATCH /users/{usersId}/onenote
PATCH /sites/{sitesId}/onenote
PATCH /groups/{groupsId}/onenote
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [onenote](../resources/onenote.md) object.

The following table shows the properties that are required when you update the [onenote](../resources/onenote.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|



## Response

If successful, this method returns a `200 OK` response code and an updated [onenote](../resources/onenote.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_onenote"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/me/onenote
Content-Type: application/json
Content-length: 49

{
  "@odata.type": "#microsoft.graph.onenote"
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
  "@odata.type": "#microsoft.graph.onenote",
  "id": "e1829ddc-9ddc-e182-dc9d-82e1dc9d82e1"
}
```

