---
title: "Create b2cAuthenticationMethodsPolicy"
description: "Create a new b2cAuthenticationMethodsPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create b2cAuthenticationMethodsPolicy
Namespace: microsoft.graph



Create a new b2cAuthenticationMethodsPolicy object.

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
POST /policies/b2cAuthenticationMethodsPolicy
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [b2cAuthenticationMethodsPolicy](../resources/b2cauthenticationmethodspolicy.md) object.

The following table shows the properties that are required when you create the [b2cAuthenticationMethodsPolicy](../resources/b2cauthenticationmethodspolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isEmailPasswordAuthenticationEnabled|Boolean|**TODO: Add Description**|
|isPhoneOneTimePasswordAuthenticationEnabled|Boolean|**TODO: Add Description**|
|isUserNameAuthenticationEnabled|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [b2cAuthenticationMethodsPolicy](../resources/b2cauthenticationmethodspolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_b2cauthenticationmethodspolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/policies/b2cAuthenticationMethodsPolicy
Content-Type: application/json
Content-length: 236

{
  "@odata.type": "#microsoft.graph.b2cAuthenticationMethodsPolicy",
  "isEmailPasswordAuthenticationEnabled": "Boolean",
  "isPhoneOneTimePasswordAuthenticationEnabled": "Boolean",
  "isUserNameAuthenticationEnabled": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.b2cAuthenticationMethodsPolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.b2cAuthenticationMethodsPolicy",
  "id": "4e721e69-1e69-4e72-691e-724e691e724e",
  "isEmailPasswordAuthenticationEnabled": "Boolean",
  "isPhoneOneTimePasswordAuthenticationEnabled": "Boolean",
  "isUserNameAuthenticationEnabled": "Boolean"
}
```

