---
title: "Update salesQuote"
description: "Update the properties of a salesQuote object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update salesQuote
Namespace: microsoft.graph



Update the properties of a [salesQuote](../resources/salesquote.md) object.

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
PATCH /financials/companies/{companyId}/salesQuotes/{salesQuoteId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [salesQuote](../resources/salesquote.md) object.

The following table shows the properties that are required when you update the [salesQuote](../resources/salesquote.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|acceptedDate|Date|**TODO: Add Description**|
|billingPostalAddress|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|billToCustomerId|Guid|**TODO: Add Description**|
|billToCustomerNumber|String|**TODO: Add Description**|
|billToName|String|**TODO: Add Description**|
|currencyCode|String|**TODO: Add Description**|
|currencyId|Guid|**TODO: Add Description**|
|customerId|Guid|**TODO: Add Description**|
|customerName|String|**TODO: Add Description**|
|customerNumber|String|**TODO: Add Description**|
|discountAmount|Decimal|**TODO: Add Description**|
|documentDate|Date|**TODO: Add Description**|
|dueDate|Date|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|externalDocumentNumber|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|number|String|**TODO: Add Description**|
|paymentTermsId|Guid|**TODO: Add Description**|
|phoneNumber|String|**TODO: Add Description**|
|salesperson|String|**TODO: Add Description**|
|sellingPostalAddress|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|sentDate|DateTimeOffset|**TODO: Add Description**|
|shipmentMethodId|Guid|**TODO: Add Description**|
|shippingPostalAddress|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|shipToContact|String|**TODO: Add Description**|
|shipToName|String|**TODO: Add Description**|
|status|String|**TODO: Add Description**|
|totalAmountExcludingTax|Decimal|**TODO: Add Description**|
|totalAmountIncludingTax|Decimal|**TODO: Add Description**|
|totalTaxAmount|Decimal|**TODO: Add Description**|
|validUntilDate|Date|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [salesQuote](../resources/salesquote.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_salesquote"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/financials/companies/{companyId}/salesQuotes/{salesQuoteId}
Content-Type: application/json
Content-length: 1128

{
  "@odata.type": "#microsoft.graph.salesQuote",
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
  "@odata.type": "#microsoft.graph.salesQuote",
  "id": "01d99f8e-9f8e-01d9-8e9f-d9018e9fd901",
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
```

