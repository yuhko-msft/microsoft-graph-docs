---
title: "Update salesCreditMemo"
description: "Update the properties of a salesCreditMemo object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update salesCreditMemo
Namespace: microsoft.graph



Update the properties of a [salesCreditMemo](../resources/salescreditmemo.md) object.

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
PATCH /financials/companies/{companyId}/salesCreditMemos/{salesCreditMemoId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [salesCreditMemo](../resources/salescreditmemo.md) object.

The following table shows the properties that are required when you update the [salesCreditMemo](../resources/salescreditmemo.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|billingPostalAddress|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|billToCustomerId|Guid|**TODO: Add Description**|
|billToCustomerNumber|String|**TODO: Add Description**|
|billToName|String|**TODO: Add Description**|
|creditMemoDate|Date|**TODO: Add Description**|
|currencyCode|String|**TODO: Add Description**|
|currencyId|Guid|**TODO: Add Description**|
|customerId|Guid|**TODO: Add Description**|
|customerName|String|**TODO: Add Description**|
|customerNumber|String|**TODO: Add Description**|
|discountAmount|Decimal|**TODO: Add Description**|
|discountAppliedBeforeTax|Boolean|**TODO: Add Description**|
|dueDate|Date|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|externalDocumentNumber|String|**TODO: Add Description**|
|invoiceId|Guid|**TODO: Add Description**|
|invoiceNumber|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|number|String|**TODO: Add Description**|
|paymentTermsId|Guid|**TODO: Add Description**|
|phoneNumber|String|**TODO: Add Description**|
|pricesIncludeTax|Boolean|**TODO: Add Description**|
|salesperson|String|**TODO: Add Description**|
|sellingPostalAddress|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|status|String|**TODO: Add Description**|
|totalAmountExcludingTax|Decimal|**TODO: Add Description**|
|totalAmountIncludingTax|Decimal|**TODO: Add Description**|
|totalTaxAmount|Decimal|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [salesCreditMemo](../resources/salescreditmemo.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_salescreditmemo"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/financials/companies/{companyId}/salesCreditMemos/{salesCreditMemoId}
Content-Type: application/json
Content-length: 992

{
  "@odata.type": "#microsoft.graph.salesCreditMemo",
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
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

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
```

