---
title: "List purchaseInvoices"
description: "Get a list of the purchaseInvoice objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List purchaseInvoices
Namespace: microsoft.graph



Get a list of the [purchaseInvoice](../resources/purchaseinvoice.md) objects and their properties.

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
GET /financials/companies/{companyId}/purchaseInvoices
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

If successful, this method returns a `200 OK` response code and a collection of [purchaseInvoice](../resources/purchaseinvoice.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_purchaseinvoice"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/financials/companies/{companyId}/purchaseInvoices
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.purchaseInvoice)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.purchaseInvoice",
      "id": "57630752-0752-5763-5207-635752076357",
      "buyFromAddress": {
        "@odata.type": "microsoft.graph.postalAddressType"
      },
      "currencyCode": "String",
      "currencyId": "Guid",
      "discountAmount": "Decimal",
      "discountAppliedBeforeTax": "Boolean",
      "dueDate": "Date",
      "invoiceDate": "Date",
      "lastModifiedDateTime": "String (timestamp)",
      "number": "String",
      "payToAddress": {
        "@odata.type": "microsoft.graph.postalAddressType"
      },
      "payToContact": "String",
      "payToName": "String",
      "payToVendorId": "Guid",
      "payToVendorNumber": "String",
      "pricesIncludeTax": "Boolean",
      "shipToAddress": {
        "@odata.type": "microsoft.graph.postalAddressType"
      },
      "shipToContact": "String",
      "shipToName": "String",
      "status": "String",
      "totalAmountExcludingTax": "Decimal",
      "totalAmountIncludingTax": "Decimal",
      "totalTaxAmount": "Decimal",
      "vendorId": "Guid",
      "vendorInvoiceNumber": "String",
      "vendorName": "String",
      "vendorNumber": "String"
    }
  ]
}
```

