---
title: "List salesQuotes"
description: "Get a list of the salesQuote objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List salesQuotes
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the [salesQuote](../resources/salesquote.md) objects and their properties.

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
GET /financials/companies/{companyId}/salesQuotes
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

If successful, this method returns a `200 OK` response code and a collection of [salesQuote](../resources/salesquote.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_salesquote"
}
-->
``` http
GET https://graph.microsoft.com/beta/financials/companies/{companyId}/salesQuotes
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.salesQuote)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.salesQuote",
      "id": "bb423b92-3b92-bb42-923b-42bb923b42bb",
      "acceptedDate": "Date",
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
      "discountAmount": "Decimal",
      "documentDate": "Date",
      "dueDate": "Date",
      "email": "String",
      "externalDocumentNumber": "String",
      "lastModifiedDateTime": "String (timestamp)",
      "number": "String",
      "paymentTermsId": "Guid",
      "phoneNumber": "String",
      "salesperson": "String",
      "sellingPostalAddress": {
        "@odata.type": "microsoft.graph.postalAddressType"
      },
      "sentDate": "String (timestamp)",
      "shipmentMethodId": "Guid",
      "shippingPostalAddress": {
        "@odata.type": "microsoft.graph.postalAddressType"
      },
      "shipToContact": "String",
      "shipToName": "String",
      "status": "String",
      "totalAmountExcludingTax": "Decimal",
      "totalAmountIncludingTax": "Decimal",
      "totalTaxAmount": "Decimal",
      "validUntilDate": "Date"
    }
  ]
}
```

