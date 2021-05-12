---
title: "verifiableCredentialsContract resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# verifiableCredentialsContract resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List verifiableCredentialsContracts](../api/verifiablecredentialscontract-list.md)|[verifiableCredentialsContract](../resources/verifiablecredentialscontract.md) collection|Get a list of the [verifiableCredentialsContract](../resources/verifiablecredentialscontract.md) objects and their properties.|
|[Create verifiableCredentialsContract](../api/verifiablecredentialscontract-create.md)|[verifiableCredentialsContract](../resources/verifiablecredentialscontract.md)|Create a new [verifiableCredentialsContract](../resources/verifiablecredentialscontract.md) object.|
|[Get verifiableCredentialsContract](../api/verifiablecredentialscontract-get.md)|[verifiableCredentialsContract](../resources/verifiablecredentialscontract.md)|Read the properties and relationships of a [verifiableCredentialsContract](../resources/verifiablecredentialscontract.md) object.|
|[Update verifiableCredentialsContract](../api/verifiablecredentialscontract-update.md)|[verifiableCredentialsContract](../resources/verifiablecredentialscontract.md)|Update the properties of a [verifiableCredentialsContract](../resources/verifiablecredentialscontract.md) object.|
|[Delete verifiableCredentialsContract](../api/verifiablecredentialscontract-delete.md)|None|Deletes a [verifiableCredentialsContract](../resources/verifiablecredentialscontract.md) object.|
|[List verifiableCredentialsCard](../api/verifiablecredentialscontract-list-cards.md)|[verifiableCredentialsCard](../resources/verifiablecredentialscard.md) collection|Get the verifiableCredentialsCard resources from the cards navigation property.|
|[Add verifiableCredentialsCard](../api/verifiablecredentialscontract-post-cards.md)|[verifiableCredentialsCard](../resources/verifiablecredentialscard.md)|Add cards by posting to the cards collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|contractName|String|**TODO: Add Description**|
|displayFileUrl|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|rulesFileUrl|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|cards|[verifiableCredentialsCard](../resources/verifiablecredentialscard.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.verifiableCredentialsContract",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.verifiableCredentialsContract",
  "id": "String (identifier)",
  "contractName": "String",
  "rulesFileUrl": "String",
  "displayFileUrl": "String"
}
```

