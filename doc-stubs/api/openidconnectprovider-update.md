---
title: "Update openIdConnectProvider"
description: "Update the properties of an openIdConnectProvider object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update openIdConnectProvider
Namespace: microsoft.graph



Update the properties of an [openIdConnectProvider](../resources/openidconnectprovider.md) object.

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
PATCH /openIdConnectProvider
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [openIdConnectProvider](../resources/openidconnectprovider.md) object.

The following table shows the properties that are required when you update the [openIdConnectProvider](../resources/openidconnectprovider.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|clientId|String|**TODO: Add Description** Inherited from [identityProvider](../resources/identityprovider.md)|
|clientSecret|String|**TODO: Add Description** Inherited from [identityProvider](../resources/identityprovider.md)|
|name|String|**TODO: Add Description** Inherited from [identityProvider](../resources/identityprovider.md)|
|type|String|**TODO: Add Description** Inherited from [identityProvider](../resources/identityprovider.md)|
|claimsMapping|[claimsMapping](../resources/claimsmapping.md)|**TODO: Add Description**|
|domainHint|String|**TODO: Add Description**|
|metadataUrl|String|**TODO: Add Description**|
|responseMode|openIdConnectResponseMode|**TODO: Add Description**. Possible values are: `form_post`, `query`, `unknownFutureValue`.|
|responseType|openIdConnectResponseTypes|**TODO: Add Description**. Possible values are: `code`, `id_token`, `token`.|
|scope|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [openIdConnectProvider](../resources/openidconnectprovider.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_openidconnectprovider"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/openIdConnectProvider
Content-Type: application/json
Content-length: 374

{
  "@odata.type": "#microsoft.graph.openIdConnectProvider",
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
```

