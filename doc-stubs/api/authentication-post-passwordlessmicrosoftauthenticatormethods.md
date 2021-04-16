---
title: "Create passwordlessMicrosoftAuthenticatorAuthenticationMethod"
description: "Create a new passwordlessMicrosoftAuthenticatorAuthenticationMethod object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create passwordlessMicrosoftAuthenticatorAuthenticationMethod
Namespace: microsoft.graph



Create a new passwordlessMicrosoftAuthenticatorAuthenticationMethod object.

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
POST /users/{usersId}/authentication/passwordlessMicrosoftAuthenticatorMethods
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [passwordlessMicrosoftAuthenticatorAuthenticationMethod](../resources/passwordlessmicrosoftauthenticatorauthenticationmethod.md) object.

The following table shows the properties that are required when you create the [passwordlessMicrosoftAuthenticatorAuthenticationMethod](../resources/passwordlessmicrosoftauthenticatorauthenticationmethod.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|creationDateTime|DateTimeOffset|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [passwordlessMicrosoftAuthenticatorAuthenticationMethod](../resources/passwordlessmicrosoftauthenticatorauthenticationmethod.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_passwordlessmicrosoftauthenticatorauthenticationmethod_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/users/{usersId}/authentication/passwordlessMicrosoftAuthenticatorMethods
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
  "truncated": true,
  "@odata.type": "microsoft.graph.passwordlessMicrosoftAuthenticatorAuthenticationMethod"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.passwordlessMicrosoftAuthenticatorAuthenticationMethod",
  "id": "409eba88-ba88-409e-88ba-9e4088ba9e40",
  "createdDateTime": "String (timestamp)",
  "creationDateTime": "String (timestamp)",
  "displayName": "String"
}
```

