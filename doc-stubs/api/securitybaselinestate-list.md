---
title: "List securityBaselineStates"
description: "Get a list of the securityBaselineState objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List securityBaselineStates
Namespace: microsoft.graph



Get a list of the [securityBaselineState](../resources/securitybaselinestate.md) objects and their properties.

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
GET /me/managedDevices/{managedDeviceId}/securityBaselineStates
GET /users/{usersId}/managedDevices/{managedDeviceId}/securityBaselineStates
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

If successful, this method returns a `200 OK` response code and a collection of [securityBaselineState](../resources/securitybaselinestate.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_securitybaselinestate"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/managedDevices/{managedDeviceId}/securityBaselineStates
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.securityBaselineState)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.securityBaselineState",
      "id": "c88a1cef-1cef-c88a-ef1c-8ac8ef1c8ac8",
      "displayName": "String",
      "securityBaselineTemplateId": "String",
      "state": "String",
      "userPrincipalName": "String"
    }
  ]
}
```

