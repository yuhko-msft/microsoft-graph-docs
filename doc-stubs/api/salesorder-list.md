---
title: "List salesOrders"
description: "Get a list of the salesOrder objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List salesOrders
Namespace: microsoft.graph



Get a list of the [salesOrder](../resources/salesorder.md) objects and their properties.

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
GET /financials/companies/{companyId}/salesOrders
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

If successful, this method returns a `200 OK` response code and a collection of [salesOrder](../resources/salesorder.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_salesorder"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/financials/companies/{companyId}/salesOrders
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.salesOrder)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.salesOrder",
      "id": "59ea4f29-4f29-59ea-294f-ea59294fea59",
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
      "discountAppliedBeforeTax": "Boolean",
      "email": "String",
      "externalDocumentNumber": "String",
      "fullyShipped": "Boolean",
      "lastModifiedDateTime": "String (timestamp)",
      "number": "String",
      "orderDate": "Date",
      "partialShipping": "Boolean",
      "paymentTermsId": "Guid",
      "phoneNumber": "String",
      "pricesIncludeTax": "Boolean",
      "requestedDeliveryDate": "Date",
      "salesperson": "String",
      "sellingPostalAddress": {
        "@odata.type": "microsoft.graph.postalAddressType"
      },
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

