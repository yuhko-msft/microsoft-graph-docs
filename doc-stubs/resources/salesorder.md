---
title: "salesOrder resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# salesOrder resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List salesOrders](../api/salesorder-list.md)|[salesOrder](../resources/salesorder.md) collection|Get a list of the [salesOrder](../resources/salesorder.md) objects and their properties.|
|[Create salesOrder](../api/salesorder-create.md)|[salesOrder](../resources/salesorder.md)|Create a new [salesOrder](../resources/salesorder.md) object.|
|[Get salesOrder](../api/salesorder-get.md)|[salesOrder](../resources/salesorder.md)|Read the properties and relationships of a [salesOrder](../resources/salesorder.md) object.|
|[Update salesOrder](../api/salesorder-update.md)|[salesOrder](../resources/salesorder.md)|Update the properties of a [salesOrder](../resources/salesorder.md) object.|
|[Delete salesOrder](../api/salesorder-delete.md)|None|Deletes a [salesOrder](../resources/salesorder.md) object.|
|[List currency](../api/salesorder-list-currency.md)|[currency](../resources/currency.md) collection|Get the currency resources from the currency navigation property.|
|[Create currency](../api/salesorder-post-currency.md)|[currency](../resources/currency.md)|Create a new currency object.|
|[List customer](../api/salesorder-list-customer.md)|[customer](../resources/customer.md) collection|Get the customer resources from the customer navigation property.|
|[Create customer](../api/salesorder-post-customer.md)|[customer](../resources/customer.md)|Create a new customer object.|
|[List paymentTerm](../api/salesorder-list-paymentterm.md)|[paymentTerm](../resources/paymentterm.md) collection|Get the paymentTerm resources from the paymentTerm navigation property.|
|[Create paymentTerm](../api/salesorder-post-paymentterm.md)|[paymentTerm](../resources/paymentterm.md)|Create a new paymentTerm object.|
|[List salesOrderLines](../api/salesorder-list-salesorderlines.md)|[salesOrderLine](../resources/salesorderline.md) collection|Get the salesOrderLine resources from the salesOrderLines navigation property.|
|[Create salesOrderLine](../api/salesorder-post-salesorderlines.md)|[salesOrderLine](../resources/salesorderline.md)|Create a new salesOrderLine object.|

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
|discountAmount|Decimal|**TODO: Add Description**|
|discountAppliedBeforeTax|Boolean|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|externalDocumentNumber|String|**TODO: Add Description**|
|fullyShipped|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|number|String|**TODO: Add Description**|
|orderDate|Date|**TODO: Add Description**|
|partialShipping|Boolean|**TODO: Add Description**|
|paymentTermsId|Guid|**TODO: Add Description**|
|phoneNumber|String|**TODO: Add Description**|
|pricesIncludeTax|Boolean|**TODO: Add Description**|
|requestedDeliveryDate|Date|**TODO: Add Description**|
|salesperson|String|**TODO: Add Description**|
|sellingPostalAddress|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
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
|salesOrderLines|[salesOrderLine](../resources/salesorderline.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.salesOrder",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.salesOrder",
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
```

