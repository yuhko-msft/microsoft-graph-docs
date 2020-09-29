---
title: "Create passwordlessMicrosoftAuthenticatorMethods"
description: "Create a new passwordlessMicrosoftAuthenticatorAuthenticationMethod object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create passwordlessMicrosoftAuthenticatorMethods
Namespace: microsoft.graph

Create a new passwordlessMicrosoftAuthenticatorAuthenticationMethod object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
POST /user/authentication/passwordlessMicrosoftAuthenticatorMethods
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
|id|String|**TODO: Add Description** Inherited from [authenticationMethod](../resources/authenticationmethod.md)|
|displayName|String|**TODO: Add Description**|
|creationDateTime|DateTimeOffset|**TODO: Add Description**|



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
POST https://graph.microsoft.com/beta/user/authentication/passwordlessMicrosoftAuthenticatorMethods
Content-Type: application/json
Content-length: 184

{
  "@odata.type": "#microsoft.strongAuthentication.passwordlessMicrosoftAuthenticatorAuthenticationMethod",
  "displayName": "String",
  "creationDateTime": "String (timestamp)"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.strongAuthentication.passwordlessMicrosoftAuthenticatorAuthenticationMethod"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.strongAuthentication.passwordlessMicrosoftAuthenticatorAuthenticationMethod",
  "id": "f6fcc02c-c02c-f6fc-2cc0-fcf62cc0fcf6",
  "displayName": "String",
  "creationDateTime": "String (timestamp)"
}
```

