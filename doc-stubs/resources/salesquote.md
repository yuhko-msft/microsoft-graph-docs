---
title: "salesQuote resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# salesQuote resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List salesQuotes](../api/salesquote-list.md)|[salesQuote](../resources/salesquote.md) collection|Get a list of the [salesQuote](../resources/salesquote.md) objects and their properties.|
|[Create salesQuote](../api/salesquote-create.md)|[salesQuote](../resources/salesquote.md)|Create a new [salesQuote](../resources/salesquote.md) object.|
|[Get salesQuote](../api/salesquote-get.md)|[salesQuote](../resources/salesquote.md)|Read the properties and relationships of a [salesQuote](../resources/salesquote.md) object.|
|[Update salesQuote](../api/salesquote-update.md)|[salesQuote](../resources/salesquote.md)|Update the properties of a [salesQuote](../resources/salesquote.md) object.|
|[Delete salesQuote](../api/salesquote-delete.md)|None|Deletes a [salesQuote](../resources/salesquote.md) object.|
|[makeInvoice](../api/salesquote-makeinvoice.md)|None|**TODO: Add Description**|
|[send](../api/salesquote-send.md)|None|**TODO: Add Description**|
|[List currency](../api/salesquote-list-currency.md)|[currency](../resources/currency.md) collection|Get the currency resources from the currency navigation property.|
|[Create currency](../api/salesquote-post-currency.md)|[currency](../resources/currency.md)|Create a new currency object.|
|[List customer](../api/salesquote-list-customer.md)|[customer](../resources/customer.md) collection|Get the customer resources from the customer navigation property.|
|[Create customer](../api/salesquote-post-customer.md)|[customer](../resources/customer.md)|Create a new customer object.|
|[List paymentTerm](../api/salesquote-list-paymentterm.md)|[paymentTerm](../resources/paymentterm.md) collection|Get the paymentTerm resources from the paymentTerm navigation property.|
|[Create paymentTerm](../api/salesquote-post-paymentterm.md)|[paymentTerm](../resources/paymentterm.md)|Create a new paymentTerm object.|
|[List salesQuoteLines](../api/salesquote-list-salesquotelines.md)|[salesQuoteLine](../resources/salesquoteline.md) collection|Get the salesQuoteLine resources from the salesQuoteLines navigation property.|
|[Create salesQuoteLine](../api/salesquote-post-salesquotelines.md)|[salesQuoteLine](../resources/salesquoteline.md)|Create a new salesQuoteLine object.|
|[List shipmentMethod](../api/salesquote-list-shipmentmethod.md)|[shipmentMethod](../resources/shipmentmethod.md) collection|Get the shipmentMethod resources from the shipmentMethod navigation property.|
|[Create shipmentMethod](../api/salesquote-post-shipmentmethod.md)|[shipmentMethod](../resources/shipmentmethod.md)|Create a new shipmentMethod object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
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
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
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

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|currency|[currency](../resources/currency.md)|**TODO: Add Description**|
|customer|[customer](../resources/customer.md)|**TODO: Add Description**|
|paymentTerm|[paymentTerm](../resources/paymentterm.md)|**TODO: Add Description**|
|salesQuoteLines|[salesQuoteLine](../resources/salesquoteline.md) collection|**TODO: Add Description**|
|shipmentMethod|[shipmentMethod](../resources/shipmentmethod.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.salesQuote",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.salesQuote",
  "id": "String (identifier)",
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

