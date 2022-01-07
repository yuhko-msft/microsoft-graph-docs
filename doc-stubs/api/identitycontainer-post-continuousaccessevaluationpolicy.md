---
title: "Create continuousAccessEvaluationPolicy"
description: "Create a new continuousAccessEvaluationPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create continuousAccessEvaluationPolicy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [continuousAccessEvaluationPolicy](../resources/continuousaccessevaluationpolicy.md) object.

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
POST ** Collection URI for Microsoft.IdentityProtectionServices.continuousAccessEvaluationPolicy not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [continuousAccessEvaluationPolicy](../resources/continuousaccessevaluationpolicy.md) object.

You can specify the following properties when creating a **continuousAccessEvaluationPolicy**.

|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description** Required.|
|displayName|String|**TODO: Add Description** Required.|
|isEnabled|Boolean|**TODO: Add Description** Required.|
|users|String collection|**TODO: Add Description** Required.|
|groups|String collection|**TODO: Add Description** Required.|
|migrate|Boolean|**TODO: Add Description** Required.|



## Response

If successful, this method returns a `201 Created` response code and a [continuousAccessEvaluationPolicy](../resources/continuousaccessevaluationpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_continuousaccessevaluationpolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for Microsoft.IdentityProtectionServices.continuousAccessEvaluationPolicy not found
Content-Type: application/json
Content-length: 272

{
  "@odata.type": "#Microsoft.IdentityProtectionServices.continuousAccessEvaluationPolicy",
  "description": "String",
  "displayName": "String",
  "isEnabled": "Boolean",
  "users": [
    "String"
  ],
  "groups": [
    "String"
  ],
  "migrate": "Boolean"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.IdentityProtectionServices.continuousAccessEvaluationPolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.IdentityProtectionServices.continuousAccessEvaluationPolicy",
  "id": "c9149b18-9b18-c914-189b-14c9189b14c9",
  "description": "String",
  "displayName": "String",
  "isEnabled": "Boolean",
  "users": [
    "String"
  ],
  "groups": [
    "String"
  ],
  "migrate": "Boolean"
}
```

