---
title: "customerCreationOperation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# customerCreationOperation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List customerCreationOperations](../api/customercreationoperation-list.md)|[customerCreationOperation](../resources/customercreationoperation.md) collection|Get a list of the [customerCreationOperation](../resources/customercreationoperation.md) objects and their properties.|
|[Create customerCreationOperation](../api/customercreationoperation-post-customercreationoperations.md)|[customerCreationOperation](../resources/customercreationoperation.md)|Create a new [customerCreationOperation](../resources/customercreationoperation.md) object.|
|[Get customerCreationOperation](../api/customercreationoperation-get.md)|[customerCreationOperation](../resources/customercreationoperation.md)|Read the properties and relationships of a [customerCreationOperation](../resources/customercreationoperation.md) object.|
|[Update customerCreationOperation](../api/customercreationoperation-update.md)|[customerCreationOperation](../resources/customercreationoperation.md)|Update the properties of a [customerCreationOperation](../resources/customercreationoperation.md) object.|
|[Delete customerCreationOperation](../api/customercreationoperation-delete.md)|None|Deletes a [customerCreationOperation](../resources/customercreationoperation.md) object.|
|[List customer](../api/customercreationoperation-list-customer.md)|[customer](../resources/customer.md) collection|Get the customer resources from the customer navigation property.|
|[Add customer](../api/customercreationoperation-post-customer.md)|[customer](../resources/customer.md)|Add customer by posting to the customer collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|domain|String|**TODO: Add Description**|
|status|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|customer|[customer](../resources/customer.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.customerCreationOperation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.customerCreationOperation",
  "status": "String",
  "domain": "String"
}
```

