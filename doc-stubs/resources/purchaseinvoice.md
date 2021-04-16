---
title: "purchaseInvoice resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# purchaseInvoice resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List purchaseInvoices](../api/purchaseinvoice-list.md)|[purchaseInvoice](../resources/purchaseinvoice.md) collection|Get a list of the [purchaseInvoice](../resources/purchaseinvoice.md) objects and their properties.|
|[Create purchaseInvoice](../api/purchaseinvoice-create.md)|[purchaseInvoice](../resources/purchaseinvoice.md)|Create a new [purchaseInvoice](../resources/purchaseinvoice.md) object.|
|[Get purchaseInvoice](../api/purchaseinvoice-get.md)|[purchaseInvoice](../resources/purchaseinvoice.md)|Read the properties and relationships of a [purchaseInvoice](../resources/purchaseinvoice.md) object.|
|[Update purchaseInvoice](../api/purchaseinvoice-update.md)|[purchaseInvoice](../resources/purchaseinvoice.md)|Update the properties of a [purchaseInvoice](../resources/purchaseinvoice.md) object.|
|[Delete purchaseInvoice](../api/purchaseinvoice-delete.md)|None|Deletes a [purchaseInvoice](../resources/purchaseinvoice.md) object.|
|[post](../api/purchaseinvoice-post.md)|None|**TODO: Add Description**|
|[List currency](../api/purchaseinvoice-list-currency.md)|[currency](../resources/currency.md) collection|Get the currency resources from the currency navigation property.|
|[Create currency](../api/purchaseinvoice-post-currency.md)|[currency](../resources/currency.md)|Create a new currency object.|
|[List purchaseInvoiceLines](../api/purchaseinvoice-list-purchaseinvoicelines.md)|[purchaseInvoiceLine](../resources/purchaseinvoiceline.md) collection|Get the purchaseInvoiceLine resources from the purchaseInvoiceLines navigation property.|
|[Create purchaseInvoiceLine](../api/purchaseinvoice-post-purchaseinvoicelines.md)|[purchaseInvoiceLine](../resources/purchaseinvoiceline.md)|Create a new purchaseInvoiceLine object.|
|[List vendor](../api/purchaseinvoice-list-vendor.md)|[vendor](../resources/vendor.md) collection|Get the vendor resources from the vendor navigation property.|
|[Create vendor](../api/purchaseinvoice-post-vendor.md)|[vendor](../resources/vendor.md)|Create a new vendor object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|buyFromAddress|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|currencyCode|String|**TODO: Add Description**|
|currencyId|Guid|**TODO: Add Description**|
|discountAmount|Decimal|**TODO: Add Description**|
|discountAppliedBeforeTax|Boolean|**TODO: Add Description**|
|dueDate|Date|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
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

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|currency|[currency](../resources/currency.md)|**TODO: Add Description**|
|purchaseInvoiceLines|[purchaseInvoiceLine](../resources/purchaseinvoiceline.md) collection|**TODO: Add Description**|
|vendor|[vendor](../resources/vendor.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.purchaseInvoice",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.purchaseInvoice",
  "id": "String (identifier)",
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

