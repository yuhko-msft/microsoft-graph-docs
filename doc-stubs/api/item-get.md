---
title: "Get item"
description: "Read the properties and relationships of an item object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get item
Namespace: microsoft.graph



Read the properties and relationships of an [item](../resources/item.md) object.

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
GET /financials/companies/{companyId}/items/{itemId}
GET /financials/companies/{companyId}/salesOrderLines/{salesOrderLineId}/item
GET /financials/companies/{companyId}/salesQuoteLines/{salesQuoteLineId}/item
GET /financials/companies/{companyId}/salesInvoiceLines/{salesInvoiceLineId}/item
GET /financials/companies/{companyId}/purchaseInvoiceLines/{purchaseInvoiceLineId}/item
GET /financials/companies/{companyId}/salesCreditMemoLines/{salesCreditMemoLineId}/item
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

If successful, this method returns a `200 OK` response code and an [item](../resources/item.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_item"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/financials/companies/{companyId}/items/{itemId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.item"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.item",
    "id": "58d51876-1876-58d5-7618-d5587618d558",
    "baseUnitOfMeasureId": "Guid",
    "blocked": "Boolean",
    "displayName": "String",
    "gtin": "String",
    "inventory": "Decimal",
    "itemCategoryCode": "String",
    "itemCategoryId": "Guid",
    "lastModifiedDateTime": "String (timestamp)",
    "number": "String",
    "priceIncludesTax": "Boolean",
    "taxGroupCode": "String",
    "taxGroupId": "Guid",
    "type": "String",
    "unitCost": "Decimal",
    "unitPrice": "Decimal"
  }
}
```

