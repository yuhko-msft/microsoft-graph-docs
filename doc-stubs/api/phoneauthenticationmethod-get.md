---
title: "Get phoneAuthenticationMethod"
description: "Read the properties and relationships of a phoneAuthenticationMethod object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get phoneAuthenticationMethod
Namespace: microsoft.graph



Read the properties and relationships of a [phoneAuthenticationMethod](../resources/phoneauthenticationmethod.md) object.

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
GET /me/authentication/phoneMethods/{phoneAuthenticationMethodId}
GET /users/{usersId}/authentication/phoneMethods/{phoneAuthenticationMethodId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [phoneAuthenticationMethod](../resources/phoneauthenticationmethod.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_phoneauthenticationmethod"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/authentication/phoneMethods/{phoneAuthenticationMethodId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.phoneAuthenticationMethod"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.phoneAuthenticationMethod",
    "id": "68420673-0673-6842-7306-426873064268",
    "phoneNumber": "String",
    "phoneType": "String",
    "smsSignInState": "String"
  }
}
```

