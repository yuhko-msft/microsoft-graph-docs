---
title: "Update authenticationMethod"
description: "Update the properties of an authenticationMethod object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update authenticationMethod
Namespace: microsoft.graph



Update the properties of an [authenticationMethod](../resources/authenticationmethod.md) object.

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
PATCH /me/authentication/methods/{authenticationMethodId}
PATCH /users/{usersId}/authentication/methods/{authenticationMethodId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [authenticationMethod](../resources/authenticationmethod.md) object.

The following table shows the properties that are required when you update the [authenticationMethod](../resources/authenticationmethod.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|



## Response

If successful, this method returns a `200 OK` response code and an updated [authenticationMethod](../resources/authenticationmethod.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_authenticationmethod"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/authentication/methods/{authenticationMethodId}
Content-Type: application/json
Content-length: 62

{
  "@odata.type": "#microsoft.graph.authenticationMethod"
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
  "@odata.type": "#microsoft.graph.authenticationMethod",
  "id": "689628b4-28b4-6896-b428-9668b4289668"
}
```

