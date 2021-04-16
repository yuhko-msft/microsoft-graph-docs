---
title: "salesCreditMemo resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# salesCreditMemo resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List salesCreditMemoes](../api/salescreditmemo-list.md)|[salesCreditMemo](../resources/salescreditmemo.md) collection|Get a list of the [salesCreditMemo](../resources/salescreditmemo.md) objects and their properties.|
|[Create salesCreditMemo](../api/salescreditmemo-create.md)|[salesCreditMemo](../resources/salescreditmemo.md)|Create a new [salesCreditMemo](../resources/salescreditmemo.md) object.|
|[Get salesCreditMemo](../api/salescreditmemo-get.md)|[salesCreditMemo](../resources/salescreditmemo.md)|Read the properties and relationships of a [salesCreditMemo](../resources/salescreditmemo.md) object.|
|[Update salesCreditMemo](../api/salescreditmemo-update.md)|[salesCreditMemo](../resources/salescreditmemo.md)|Update the properties of a [salesCreditMemo](../resources/salescreditmemo.md) object.|
|[Delete salesCreditMemo](../api/salescreditmemo-delete.md)|None|Deletes a [salesCreditMemo](../resources/salescreditmemo.md) object.|
|[List currency](../api/salescreditmemo-list-currency.md)|[currency](../resources/currency.md) collection|Get the currency resources from the currency navigation property.|
|[Create currency](../api/salescreditmemo-post-currency.md)|[currency](../resources/currency.md)|Create a new currency object.|
|[List customer](../api/salescreditmemo-list-customer.md)|[customer](../resources/customer.md) collection|Get the customer resources from the customer navigation property.|
|[Create customer](../api/salescreditmemo-post-customer.md)|[customer](../resources/customer.md)|Create a new customer object.|
|[List paymentTerm](../api/salescreditmemo-list-paymentterm.md)|[paymentTerm](../resources/paymentterm.md) collection|Get the paymentTerm resources from the paymentTerm navigation property.|
|[Create paymentTerm](../api/salescreditmemo-post-paymentterm.md)|[paymentTerm](../resources/paymentterm.md)|Create a new paymentTerm object.|
|[List salesCreditMemoLines](../api/salescreditmemo-list-salescreditmemolines.md)|[salesCreditMemoLine](../resources/salescreditmemoline.md) collection|Get the salesCreditMemoLine resources from the salesCreditMemoLines navigation property.|
|[Create salesCreditMemoLine](../api/salescreditmemo-post-salescreditmemolines.md)|[salesCreditMemoLine](../resources/salescreditmemoline.md)|Create a new salesCreditMemoLine object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
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
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
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

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|currency|[currency](../resources/currency.md)|**TODO: Add Description**|
|customer|[customer](../resources/customer.md)|**TODO: Add Description**|
|paymentTerm|[paymentTerm](../resources/paymentterm.md)|**TODO: Add Description**|
|salesCreditMemoLines|[salesCreditMemoLine](../resources/salescreditmemoline.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.salesCreditMemo",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.salesCreditMemo",
  "id": "String (identifier)",
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

