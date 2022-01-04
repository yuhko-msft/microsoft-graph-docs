---
title: "customer resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# customer resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List customers](../api/customer-list.md)|[customer](../resources/customer.md) collection|Get a list of the [customer](../resources/customer.md) objects and their properties.|
|[Create customer](../api/customer-post-customers.md)|[customer](../resources/customer.md)|Create a new [customer](../resources/customer.md) object.|
|[Get customer](../api/customer-get.md)|[customer](../resources/customer.md)|Read the properties and relationships of a [customer](../resources/customer.md) object.|
|[Update customer](../api/customer-update.md)|[customer](../resources/customer.md)|Update the properties of a [customer](../resources/customer.md) object.|
|[Delete customer](../api/customer-delete.md)|None|Deletes a [customer](../resources/customer.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|billingProfile|[billingProfile](../resources/billingprofile.md)|**TODO: Add Description**|
|companyProfile|[companyProfile](../resources/companyprofile.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.customer",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.customer",
  "companyProfile": {
    "@odata.type": "microsoft.graph.companyProfile"
  },
  "billingProfile": {
    "@odata.type": "microsoft.graph.billingProfile"
  },
  "id": "String (identifier)"
}
```

