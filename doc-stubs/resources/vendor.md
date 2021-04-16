---
title: "vendor resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# vendor resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List vendors](../api/vendor-list.md)|[vendor](../resources/vendor.md) collection|Get a list of the [vendor](../resources/vendor.md) objects and their properties.|
|[Create vendor](../api/vendor-create.md)|[vendor](../resources/vendor.md)|Create a new [vendor](../resources/vendor.md) object.|
|[Get vendor](../api/vendor-get.md)|[vendor](../resources/vendor.md)|Read the properties and relationships of a [vendor](../resources/vendor.md) object.|
|[Update vendor](../api/vendor-update.md)|[vendor](../resources/vendor.md)|Update the properties of a [vendor](../resources/vendor.md) object.|
|[Delete vendor](../api/vendor-delete.md)|None|Deletes a [vendor](../resources/vendor.md) object.|
|[List currency](../api/vendor-list-currency.md)|[currency](../resources/currency.md) collection|Get the currency resources from the currency navigation property.|
|[Create currency](../api/vendor-post-currency.md)|[currency](../resources/currency.md)|Create a new currency object.|
|[List paymentMethod](../api/vendor-list-paymentmethod.md)|[paymentMethod](../resources/paymentmethod.md) collection|Get the paymentMethod resources from the paymentMethod navigation property.|
|[Create paymentMethod](../api/vendor-post-paymentmethod.md)|[paymentMethod](../resources/paymentmethod.md)|Create a new paymentMethod object.|
|[List paymentTerm](../api/vendor-list-paymentterm.md)|[paymentTerm](../resources/paymentterm.md) collection|Get the paymentTerm resources from the paymentTerm navigation property.|
|[Create paymentTerm](../api/vendor-post-paymentterm.md)|[paymentTerm](../resources/paymentterm.md)|Create a new paymentTerm object.|
|[List picture](../api/vendor-list-picture.md)|[picture](../resources/picture.md) collection|Get the picture resources from the picture navigation property.|
|[Create picture](../api/vendor-post-picture.md)|[picture](../resources/picture.md)|Create a new picture object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|address|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|balance|Decimal|**TODO: Add Description**|
|blocked|String|**TODO: Add Description**|
|currencyCode|String|**TODO: Add Description**|
|currencyId|Guid|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|number|String|**TODO: Add Description**|
|paymentMethodId|Guid|**TODO: Add Description**|
|paymentTermsId|Guid|**TODO: Add Description**|
|phoneNumber|String|**TODO: Add Description**|
|taxLiable|Boolean|**TODO: Add Description**|
|taxRegistrationNumber|String|**TODO: Add Description**|
|website|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|currency|[currency](../resources/currency.md)|**TODO: Add Description**|
|paymentMethod|[paymentMethod](../resources/paymentmethod.md)|**TODO: Add Description**|
|paymentTerm|[paymentTerm](../resources/paymentterm.md)|**TODO: Add Description**|
|picture|[picture](../resources/picture.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.vendor",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.vendor",
  "id": "String (identifier)",
  "address": {
    "@odata.type": "microsoft.graph.postalAddressType"
  },
  "balance": "Decimal",
  "blocked": "String",
  "currencyCode": "String",
  "currencyId": "Guid",
  "displayName": "String",
  "email": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "number": "String",
  "paymentMethodId": "Guid",
  "paymentTermsId": "Guid",
  "phoneNumber": "String",
  "taxLiable": "Boolean",
  "taxRegistrationNumber": "String",
  "website": "String"
}
```

