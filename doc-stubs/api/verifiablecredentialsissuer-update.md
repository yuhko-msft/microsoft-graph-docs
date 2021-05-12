---
title: "Update verifiableCredentialsIssuer"
description: "Update the properties of a verifiableCredentialsIssuer object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update verifiableCredentialsIssuer
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [verifiableCredentialsIssuer](../resources/verifiablecredentialsissuer.md) object.

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
PATCH /verifiableCredentialsIssuer
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [verifiableCredentialsIssuer](../resources/verifiablecredentialsissuer.md) object.

The following table shows the properties that are required when you update the [verifiableCredentialsIssuer](../resources/verifiablecredentialsissuer.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|issuerName|String|**TODO: Add Description**|
|keyVaultUrl|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [verifiableCredentialsIssuer](../resources/verifiablecredentialsissuer.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_verifiablecredentialsissuer"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/verifiableCredentialsIssuer
Content-Type: application/json
Content-length: 124

{
  "@odata.type": "#microsoft.graph.verifiableCredentialsIssuer",
  "issuerName": "String",
  "keyVaultUrl": "String"
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
  "@odata.type": "#microsoft.graph.verifiableCredentialsIssuer",
  "id": "7b5c3966-3966-7b5c-6639-5c7b66395c7b",
  "issuerName": "String",
  "keyVaultUrl": "String"
}
```

