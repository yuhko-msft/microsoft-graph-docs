---
title: "Add customer"
description: "Add customer by posting to the customer collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add customer
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Add customer by posting to the customer collection.

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
POST /customerCreationOperations/{customerCreationOperationsId}/customer/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [customer](../resources/customer.md) object.

You can specify the following properties when creating a **customer**.

|Property|Type|Description|
|:---|:---|:---|
|companyProfile|[companyProfile](../resources/companyprofile.md)|**TODO: Add Description** Required.|
|billingProfile|[billingProfile](../resources/billingprofile.md)|**TODO: Add Description** Required.|



## Response

If successful, this method returns a `204 No Content` response code and a [customer](../resources/customer.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_customer_from_customers"
}
-->
``` http
POST https://graph.microsoft.com/beta/customerCreationOperations/{customerCreationOperationsId}/customer/$ref
Content-Type: application/json
Content-length: 214

{
  "@odata.type": "#microsoft.graph.customer",
  "companyProfile": {
    "@odata.type": "microsoft.graph.companyProfile"
  },
  "billingProfile": {
    "@odata.type": "microsoft.graph.billingProfile"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.customer"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.customer",
  "companyProfile": {
    "@odata.type": "microsoft.graph.companyProfile"
  },
  "billingProfile": {
    "@odata.type": "microsoft.graph.billingProfile"
  },
  "id": "d6988eb6-8eb6-d698-b68e-98d6b68e98d6"
}
```

