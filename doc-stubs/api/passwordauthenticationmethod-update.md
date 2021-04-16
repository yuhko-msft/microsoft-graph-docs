---
title: "Update passwordAuthenticationMethod"
description: "Update the properties of a passwordAuthenticationMethod object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update passwordAuthenticationMethod
Namespace: microsoft.graph



Update the properties of a [passwordAuthenticationMethod](../resources/passwordauthenticationmethod.md) object.

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
PATCH /me/authentication/passwordMethods/{passwordAuthenticationMethodId}
PATCH /users/{usersId}/authentication/passwordMethods/{passwordAuthenticationMethodId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [passwordAuthenticationMethod](../resources/passwordauthenticationmethod.md) object.

The following table shows the properties that are required when you update the [passwordAuthenticationMethod](../resources/passwordauthenticationmethod.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|creationDateTime|DateTimeOffset|**TODO: Add Description**|
|password|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [passwordAuthenticationMethod](../resources/passwordauthenticationmethod.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_passwordauthenticationmethod"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/authentication/passwordMethods/{passwordAuthenticationMethodId}
Content-Type: application/json
Content-length: 140

{
  "@odata.type": "#microsoft.graph.passwordAuthenticationMethod",
  "creationDateTime": "String (timestamp)",
  "password": "String"
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
  "@odata.type": "#microsoft.graph.passwordAuthenticationMethod",
  "id": "3e9d3531-3531-3e9d-3135-9d3e31359d3e",
  "createdDateTime": "String (timestamp)",
  "creationDateTime": "String (timestamp)",
  "password": "String"
}
```

