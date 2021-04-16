---
title: "Get fido2AuthenticationMethod"
description: "Read the properties and relationships of a fido2AuthenticationMethod object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get fido2AuthenticationMethod
Namespace: microsoft.graph



Read the properties and relationships of a [fido2AuthenticationMethod](../resources/fido2authenticationmethod.md) object.

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
GET /me/authentication/fido2Methods/{fido2AuthenticationMethodId}
GET /users/{usersId}/authentication/fido2Methods/{fido2AuthenticationMethodId}
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

If successful, this method returns a `200 OK` response code and a [fido2AuthenticationMethod](../resources/fido2authenticationmethod.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_fido2authenticationmethod"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/authentication/fido2Methods/{fido2AuthenticationMethodId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.fido2AuthenticationMethod"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.fido2AuthenticationMethod",
    "id": "4e651501-1501-4e65-0115-654e0115654e",
    "aaGuid": "String",
    "attestationCertificates": [
      "String"
    ],
    "attestationLevel": "String",
    "createdDateTime": "String (timestamp)",
    "creationDateTime": "String (timestamp)",
    "displayName": "String",
    "model": "String"
  }
}
```

