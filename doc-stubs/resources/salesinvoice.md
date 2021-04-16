---
title: "salesInvoice resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# salesInvoice resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List salesInvoices](../api/salesinvoice-list.md)|[salesInvoice](../resources/salesinvoice.md) collection|Get a list of the [salesInvoice](../resources/salesinvoice.md) objects and their properties.|
|[Create salesInvoice](../api/salesinvoice-create.md)|[salesInvoice](../resources/salesinvoice.md)|Create a new [salesInvoice](../resources/salesinvoice.md) object.|
|[Get salesInvoice](../api/salesinvoice-get.md)|[salesInvoice](../resources/salesinvoice.md)|Read the properties and relationships of a [salesInvoice](../resources/salesinvoice.md) object.|
|[Update salesInvoice](../api/salesinvoice-update.md)|[salesInvoice](../resources/salesinvoice.md)|Update the properties of a [salesInvoice](../resources/salesinvoice.md) object.|
|[Delete salesInvoice](../api/salesinvoice-delete.md)|None|Deletes a [salesInvoice](../resources/salesinvoice.md) object.|
|[cancel](../api/salesinvoice-cancel.md)|None|**TODO: Add Description**|
|[cancelAndSend](../api/salesinvoice-cancelandsend.md)|None|**TODO: Add Description**|
|[post](../api/salesinvoice-post.md)|None|**TODO: Add Description**|
|[postAndSend](../api/salesinvoice-postandsend.md)|None|**TODO: Add Description**|
|[send](../api/salesinvoice-send.md)|None|**TODO: Add Description**|
|[List currency](../api/salesinvoice-list-currency.md)|[currency](../resources/currency.md) collection|Get the currency resources from the currency navigation property.|
|[Create currency](../api/salesinvoice-post-currency.md)|[currency](../resources/currency.md)|Create a new currency object.|
|[List customer](../api/salesinvoice-list-customer.md)|[customer](../resources/customer.md) collection|Get the customer resources from the customer navigation property.|
|[Create customer](../api/salesinvoice-post-customer.md)|[customer](../resources/customer.md)|Create a new customer object.|
|[List paymentTerm](../api/salesinvoice-list-paymentterm.md)|[paymentTerm](../resources/paymentterm.md) collection|Get the paymentTerm resources from the paymentTerm navigation property.|
|[Create paymentTerm](../api/salesinvoice-post-paymentterm.md)|[paymentTerm](../resources/paymentterm.md)|Create a new paymentTerm object.|
|[List salesInvoiceLines](../api/salesinvoice-list-salesinvoicelines.md)|[salesInvoiceLine](../resources/salesinvoiceline.md) collection|Get the salesInvoiceLine resources from the salesInvoiceLines navigation property.|
|[Create salesInvoiceLine](../api/salesinvoice-post-salesinvoicelines.md)|[salesInvoiceLine](../resources/salesinvoiceline.md)|Create a new salesInvoiceLine object.|
|[List shipmentMethod](../api/salesinvoice-list-shipmentmethod.md)|[shipmentMethod](../resources/shipmentmethod.md) collection|Get the shipmentMethod resources from the shipmentMethod navigation property.|
|[Create shipmentMethod](../api/salesinvoice-post-shipmentmethod.md)|[shipmentMethod](../resources/shipmentmethod.md)|Create a new shipmentMethod object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|billingPostalAddress|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|billToCustomerId|Guid|**TODO: Add Description**|
|billToCustomerNumber|String|**TODO: Add Description**|
|billToName|String|**TODO: Add Description**|
|currencyCode|String|**TODO: Add Description**|
|currencyId|Guid|**TODO: Add Description**|
|customerId|Guid|**TODO: Add Description**|
|customerName|String|**TODO: Add Description**|
|customerNumber|String|**TODO: Add Description**|
|customerPurchaseOrderReference|String|**TODO: Add Description**|
|discountAmount|Decimal|**TODO: Add Description**|
|discountAppliedBeforeTax|Boolean|**TODO: Add Description**|
|dueDate|Date|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|externalDocumentNumber|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|invoiceDate|Date|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|number|String|**TODO: Add Description**|
|orderId|Guid|**TODO: Add Description**|
|orderNumber|String|**TODO: Add Description**|
|paymentTermsId|Guid|**TODO: Add Description**|
|phoneNumber|String|**TODO: Add Description**|
|pricesIncludeTax|Boolean|**TODO: Add Description**|
|salesperson|String|**TODO: Add Description**|
|sellingPostalAddress|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|shipmentMethodId|Guid|**TODO: Add Description**|
|shippingPostalAddress|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|shipToContact|String|**TODO: Add Description**|
|shipToName|String|**TODO: Add Description**|
|status|String|**TODO: Add Description**|
|totalAmountExcludingTax|Decimal|**TODO: Add Description**|
|totalAmountIncludingTax|Decimal|**TODO: Add Description**|
|totalTaxAmount|Decimal|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|currency|[currency](../resources/currency.md)|**TODO: Add Description**|
|customer|[customer](../resources/customer.md)|**TODO: Add Description**|
|paymentTerm|[paymentTerm](../resources/paymentterm.md)|**TODO: Add Description**|
|salesInvoiceLines|[salesInvoiceLine](../resources/salesinvoiceline.md) collection|**TODO: Add Description**|
|shipmentMethod|[shipmentMethod](../resources/shipmentmethod.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.salesInvoice",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.salesInvoice",
  "id": "String (identifier)",
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
```

