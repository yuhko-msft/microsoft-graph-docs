---
title: "Update purchaseInvoice"
description: "Update the properties of a purchaseInvoice object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update purchaseInvoice
Namespace: microsoft.graph



Update the properties of a [purchaseInvoice](../resources/purchaseinvoice.md) object.

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
PATCH /financials/companies/{companyId}/purchaseInvoices/{purchaseInvoiceId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [purchaseInvoice](../resources/purchaseinvoice.md) object.

The following table shows the properties that are required when you update the [purchaseInvoice](../resources/purchaseinvoice.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|buyFromAddress|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|currencyCode|String|**TODO: Add Description**|
|currencyId|Guid|**TODO: Add Description**|
|discountAmount|Decimal|**TODO: Add Description**|
|discountAppliedBeforeTax|Boolean|**TODO: Add Description**|
|dueDate|Date|**TODO: Add Description**|
|invoiceDate|Date|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|number|String|**TODO: Add Description**|
|payToAddress|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|payToContact|String|**TODO: Add Description**|
|payToName|String|**TODO: Add Description**|
|payToVendorId|Guid|**TODO: Add Description**|
|payToVendorNumber|String|**TODO: Add Description**|
|pricesIncludeTax|Boolean|**TODO: Add Description**|
|shipToAddress|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|shipToContact|String|**TODO: Add Description**|
|shipToName|String|**TODO: Add Description**|
|status|String|**TODO: Add Description**|
|totalAmountExcludingTax|Decimal|**TODO: Add Description**|
|totalAmountIncludingTax|Decimal|**TODO: Add Description**|
|totalTaxAmount|Decimal|**TODO: Add Description**|
|vendorId|Guid|**TODO: Add Description**|
|vendorInvoiceNumber|String|**TODO: Add Description**|
|vendorName|String|**TODO: Add Description**|
|vendorNumber|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [purchaseInvoice](../resources/purchaseinvoice.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_purchaseinvoice"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/financials/companies/{companyId}/purchaseInvoices/{purchaseInvoiceId}
Content-Type: application/json
Content-length: 968

{
  "@odata.type": "#microsoft.graph.purchaseInvoice",
  "buyFromAddress": {
    "@odata.type": "microsoft.graph.postalAddressType"
  },
  "currencyCode": "String",
  "currencyId": "Guid",
  "discountAmount": "Decimal",
  "discountAppliedBeforeTax": "Boolean",
  "dueDate": "Date",
  "invoiceDate": "Date",
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
```

