---
title: "List salesCreditMemos"
description: "Get the salesCreditMemo resources from the salesCreditMemos navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List salesCreditMemos
Namespace: microsoft.graph



Get the salesCreditMemo resources from the salesCreditMemos navigation property.

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
GET /financials/companies/{companyId}/salesCreditMemos
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

If successful, this method returns a `200 OK` response code and a collection of [salesCreditMemo](../resources/salescreditmemo.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_salescreditmemo"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/financials/companies/{companyId}/salesCreditMemos
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.salesCreditMemo)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.salesCreditMemo",
      "id": "4e35fe74-fe74-4e35-74fe-354e74fe354e",
      "billingPostalAddress": {
        "@odata.type": "microsoft.graph.postalAddressType"
      },
      "billToCustomerId": "Guid",
      "billToCustomerNumber": "String",
      "billToName": "String",
      "creditMemoDate": "Date",
      "currencyCode": "String",
      "currencyId": "Guid",
      "customerId": "Guid",
      "customerName": "String",
      "customerNumber": "String",
      "discountAmount": "Decimal",
      "discountAppliedBeforeTax": "Boolean",
      "dueDate": "Date",
      "email": "String",
      "externalDocumentNumber": "String",
      "invoiceId": "Guid",
      "invoiceNumber": "String",
      "lastModifiedDateTime": "String (timestamp)",
      "number": "String",
      "paymentTermsId": "Guid",
      "phoneNumber": "String",
      "pricesIncludeTax": "Boolean",
      "salesperson": "String",
      "sellingPostalAddress": {
        "@odata.type": "microsoft.graph.postalAddressType"
      },
      "status": "String",
      "totalAmountExcludingTax": "Decimal",
      "totalAmountIncludingTax": "Decimal",
      "totalTaxAmount": "Decimal"
    }
  ]
}
```

