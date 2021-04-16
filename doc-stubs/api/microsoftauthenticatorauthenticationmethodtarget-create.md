---
title: "Create microsoftAuthenticatorAuthenticationMethodTarget"
description: "Create a new microsoftAuthenticatorAuthenticationMethodTarget object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create microsoftAuthenticatorAuthenticationMethodTarget
Namespace: microsoft.graph



Create a new [microsoftAuthenticatorAuthenticationMethodTarget](../resources/microsoftauthenticatorauthenticationmethodtarget.md) object.

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
POST /microsoftAuthenticatorAuthenticationMethodConfiguration/includeTargets
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [microsoftAuthenticatorAuthenticationMethodTarget](../resources/microsoftauthenticatorauthenticationmethodtarget.md) object.

The following table shows the properties that are required when you create the [microsoftAuthenticatorAuthenticationMethodTarget](../resources/microsoftauthenticatorauthenticationmethodtarget.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isRegistrationRequired|Boolean|**TODO: Add Description** Inherited from [authenticationMethodTarget](../resources/authenticationmethodtarget.md)|
|targetType|authenticationMethodTargetType|**TODO: Add Description** Inherited from [authenticationMethodTarget](../resources/authenticationmethodtarget.md). Possible values are: `user`, `group`, `unknownFutureValue`.|
|authenticationMode|microsoftAuthenticatorAuthenticationMode|**TODO: Add Description**. Possible values are: `deviceBasedPush`, `push`, `any`.|
|featureSettings|authenticatorAppFeatureSettings|**TODO: Add Description**. Possible values are: `requireNumberMatching`.|
|shownContext|authenticatorAppContextType|**TODO: Add Description**. Possible values are: `location`, `app`, `unknownFutureValue`.|



## Response

If successful, this method returns a `201 Created` response code and a [microsoftAuthenticatorAuthenticationMethodTarget](../resources/microsoftauthenticatorauthenticationmethodtarget.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_microsoftauthenticatorauthenticationmethodtarget_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/microsoftAuthenticatorAuthenticationMethodConfiguration/includeTargets
Content-Type: application/json
Content-length: 253

{
  "@odata.type": "#microsoft.graph.microsoftAuthenticatorAuthenticationMethodTarget",
  "isRegistrationRequired": "Boolean",
  "targetType": "String",
  "authenticationMode": "String",
  "featureSettings": "String",
  "shownContext": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.microsoftAuthenticatorAuthenticationMethodTarget"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.microsoftAuthenticatorAuthenticationMethodTarget",
  "id": "bca7d351-d351-bca7-51d3-a7bc51d3a7bc",
  "isRegistrationRequired": "Boolean",
  "targetType": "String",
  "authenticationMode": "String",
  "featureSettings": "String",
  "shownContext": "String"
}
```

