---
title: "Create authenticationContextClassReference"
description: "Create a new authenticationContextClassReference object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create authenticationContextClassReference
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new authenticationContextClassReference object.

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
POST /conditionalAccess/authenticationContextClassReferences
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [authenticationContextClassReference](../resources/authenticationcontextclassreference.md) object.

You can specify the following properties when creating an **authenticationContextClassReference**.

|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Optional.|
|description|String|**TODO: Add Description** Optional.|
|isAvailable|Boolean|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and an [authenticationContextClassReference](../resources/authenticationcontextclassreference.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_authenticationcontextclassreference_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/conditionalAccess/authenticationContextClassReferences
Content-Type: application/json
Content-length: 183

{
  "@odata.type": "#Microsoft.IdentityProtectionServices.authenticationContextClassReference",
  "displayName": "String",
  "description": "String",
  "isAvailable": "Boolean"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.IdentityProtectionServices.authenticationContextClassReference"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.IdentityProtectionServices.authenticationContextClassReference",
  "id": "610b824a-824a-610b-4a82-0b614a820b61",
  "displayName": "String",
  "description": "String",
  "isAvailable": "Boolean"
}
```

