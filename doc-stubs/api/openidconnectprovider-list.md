---
title: "List openIdConnectProviders"
description: "Get a list of the openIdConnectProvider objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List openIdConnectProviders
Namespace: microsoft.graph



Get a list of the [openIdConnectProvider](../resources/openidconnectprovider.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.openIdConnectProvider not found
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

If successful, this method returns a `200 OK` response code and a collection of [openIdConnectProvider](../resources/openidconnectprovider.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_openidconnectprovider"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.openIdConnectProvider not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.openIdConnectProvider)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.openIdConnectProvider",
      "id": "15d1f210-f210-15d1-10f2-d11510f2d115",
      "clientId": "String",
      "clientSecret": "String",
      "name": "String",
      "type": "String",
      "claimsMapping": {
        "@odata.type": "microsoft.graph.claimsMapping"
      },
      "domainHint": "String",
      "metadataUrl": "String",
      "responseMode": "String",
      "responseType": "String",
      "scope": "String"
    }
  ]
}
```

