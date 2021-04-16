---
title: "Create account"
description: "Create a new account object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create account
Namespace: microsoft.graph



Create a new account object.

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
POST /financials/companies/{companyId}/salesCreditMemoLines/{salesCreditMemoLineId}/account
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [account](../resources/account.md) object.

The following table shows the properties that are required when you create the [account](../resources/account.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|blocked|Boolean|**TODO: Add Description**|
|category|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|number|String|**TODO: Add Description**|
|subCategory|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [account](../resources/account.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_account_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/financials/companies/{companyId}/salesCreditMemoLines/{salesCreditMemoLineId}/account
Content-Type: application/json
Content-length: 178

{
  "@odata.type": "#microsoft.graph.account",
  "blocked": "Boolean",
  "category": "String",
  "displayName": "String",
  "number": "String",
  "subCategory": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.account"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.account",
  "id": "229ac6d3-c6d3-229a-d3c6-9a22d3c69a22",
  "blocked": "Boolean",
  "category": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "number": "String",
  "subCategory": "String"
}
```

