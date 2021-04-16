---
title: "List salesInvoices"
description: "Get a list of the salesInvoice objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List salesInvoices
Namespace: microsoft.graph



Get a list of the [salesInvoice](../resources/salesinvoice.md) objects and their properties.

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
GET /financials/companies/{companyId}/salesInvoices
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

If successful, this method returns a `200 OK` response code and a collection of [salesInvoice](../resources/salesinvoice.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_salesinvoice"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/financials/companies/{companyId}/salesInvoices
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.salesInvoice)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.salesInvoice",
      "id": "cda41612-1612-cda4-1216-a4cd1216a4cd",
      "billingPostalAddress": {
        "@odata.type": "microsoft.graph.postalAddressType"
      },
      "billToCustomerId": "Guid",
      "billToCustomerNumber": "String",
      "billToName": "String",
      "currencyCode": "String",
      "currencyId": "Guid",
      "customerId": "Guid",
      "customerName": "String",
      "customerNumber": "String",
      "customerPurchaseOrderReference": "String",
      "discountAmount": "Decimal",
      "discountAppliedBeforeTax": "Boolean",
      "dueDate": "Date",
      "email": "String",
      "externalDocumentNumber": "String",
      "invoiceDate": "Date",
      "lastModifiedDateTime": "String (timestamp)",
      "number": "String",
      "orderId": "Guid",
      "orderNumber": "String",
      "paymentTermsId": "Guid",
      "phoneNumber": "String",
      "pricesIncludeTax": "Boolean",
      "salesperson": "String",
      "sellingPostalAddress": {
        "@odata.type": "microsoft.graph.postalAddressType"
      },
      "shipmentMethodId": "Guid",
      "shippingPostalAddress": {
        "@odata.type": "microsoft.graph.postalAddressType"
      },
      "shipToContact": "String",
      "shipToName": "String",
      "status": "String",
      "totalAmountExcludingTax": "Decimal",
      "totalAmountIncludingTax": "Decimal",
      "totalTaxAmount": "Decimal"
    }
  ]
}
```

