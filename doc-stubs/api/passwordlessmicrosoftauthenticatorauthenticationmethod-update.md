---
title: "Update passwordlessMicrosoftAuthenticatorAuthenticationMethod"
description: "Update the properties of a passwordlessMicrosoftAuthenticatorAuthenticationMethod object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update passwordlessMicrosoftAuthenticatorAuthenticationMethod
Namespace: microsoft.graph



Update the properties of a [passwordlessMicrosoftAuthenticatorAuthenticationMethod](../resources/passwordlessmicrosoftauthenticatorauthenticationmethod.md) object.

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
PATCH /me/authentication/passwordlessMicrosoftAuthenticatorMethods/{passwordlessMicrosoftAuthenticatorAuthenticationMethodId}
PATCH /users/{usersId}/authentication/passwordlessMicrosoftAuthenticatorMethods/{passwordlessMicrosoftAuthenticatorAuthenticationMethodId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [passwordlessMicrosoftAuthenticatorAuthenticationMethod](../resources/passwordlessmicrosoftauthenticatorauthenticationmethod.md) object.

The following table shows the properties that are required when you update the [passwordlessMicrosoftAuthenticatorAuthenticationMethod](../resources/passwordlessmicrosoftauthenticatorauthenticationmethod.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|creationDateTime|DateTimeOffset|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [passwordlessMicrosoftAuthenticatorAuthenticationMethod](../resources/passwordlessmicrosoftauthenticatorauthenticationmethod.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_passwordlessmicrosoftauthenticatorauthenticationmethod"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/authentication/passwordlessMicrosoftAuthenticatorMethods/{passwordlessMicrosoftAuthenticatorAuthenticationMethodId}
Content-Type: application/json
Content-length: 169

{
  "@odata.type": "#microsoft.graph.passwordlessMicrosoftAuthenticatorAuthenticationMethod",
  "creationDateTime": "String (timestamp)",
  "displayName": "String"
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
  "@odata.type": "#microsoft.graph.passwordlessMicrosoftAuthenticatorAuthenticationMethod",
  "id": "409eba88-ba88-409e-88ba-9e4088ba9e40",
  "createdDateTime": "String (timestamp)",
  "creationDateTime": "String (timestamp)",
  "displayName": "String"
}
```

