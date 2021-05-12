---
title: "Add verifiableCredentialsCard"
description: "Add cards by posting to the cards collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add verifiableCredentialsCard
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Add cards by posting to the cards collection.

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
POST /verifiableCredentialsIssuer/contracts/{verifiableCredentialsContractId}/cards/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [verifiableCredentialsCard](../resources/verifiablecredentialscard.md) object.

The following table shows the properties that are required when you create the [verifiableCredentialsCard](../resources/verifiablecredentialscard.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|indexClaim|String|**TODO: Add Description**|
|status|revocationStatus|**TODO: Add Description**. Possible values are: `issuerRevoked`, `valid`, `unknownFutureValue`.|



## Response

If successful, this method returns a `204 No Content` response code and a [verifiableCredentialsCard](../resources/verifiablecredentialscard.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_verifiablecredentialscard_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/verifiableCredentialsIssuer/contracts/{verifiableCredentialsContractId}/cards/$ref
Content-Type: application/json
Content-length: 117

{
  "@odata.type": "#microsoft.graph.verifiableCredentialsCard",
  "indexClaim": "String",
  "status": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.verifiableCredentialsCard"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.verifiableCredentialsCard",
  "id": "457b5572-5572-457b-7255-7b4572557b45",
  "indexClaim": "String",
  "status": "String"
}
```

