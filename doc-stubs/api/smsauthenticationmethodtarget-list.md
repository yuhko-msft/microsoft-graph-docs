---
title: "List smsAuthenticationMethodTargets"
description: "Get a list of the smsAuthenticationMethodTarget objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List smsAuthenticationMethodTargets
Namespace: microsoft.graph



Get a list of the [smsAuthenticationMethodTarget](../resources/smsauthenticationmethodtarget.md) objects and their properties.

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
GET /smsAuthenticationMethodConfiguration/includeTargets
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

If successful, this method returns a `200 OK` response code and a collection of [smsAuthenticationMethodTarget](../resources/smsauthenticationmethodtarget.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_smsauthenticationmethodtarget"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/smsAuthenticationMethodConfiguration/includeTargets
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.smsAuthenticationMethodTarget)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.smsAuthenticationMethodTarget",
      "id": "14e8cde7-cde7-14e8-e7cd-e814e7cde814",
      "isRegistrationRequired": "Boolean",
      "targetType": "String",
      "isUsableForSignIn": "Boolean"
    }
  ]
}
```

