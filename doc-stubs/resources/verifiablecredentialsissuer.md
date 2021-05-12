---
title: "verifiableCredentialsIssuer resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# verifiableCredentialsIssuer resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List verifiableCredentialsIssuers](../api/verifiablecredentialsissuer-list.md)|[verifiableCredentialsIssuer](../resources/verifiablecredentialsissuer.md) collection|Get a list of the [verifiableCredentialsIssuer](../resources/verifiablecredentialsissuer.md) objects and their properties.|
|[Create verifiableCredentialsIssuer](../api/verifiablecredentialsissuer-create.md)|[verifiableCredentialsIssuer](../resources/verifiablecredentialsissuer.md)|Create a new [verifiableCredentialsIssuer](../resources/verifiablecredentialsissuer.md) object.|
|[Get verifiableCredentialsIssuer](../api/verifiablecredentialsissuer-get.md)|[verifiableCredentialsIssuer](../resources/verifiablecredentialsissuer.md)|Read the properties and relationships of a [verifiableCredentialsIssuer](../resources/verifiablecredentialsissuer.md) object.|
|[Update verifiableCredentialsIssuer](../api/verifiablecredentialsissuer-update.md)|[verifiableCredentialsIssuer](../resources/verifiablecredentialsissuer.md)|Update the properties of a [verifiableCredentialsIssuer](../resources/verifiablecredentialsissuer.md) object.|
|[Delete verifiableCredentialsIssuer](../api/verifiablecredentialsissuer-delete.md)|None|Deletes a [verifiableCredentialsIssuer](../resources/verifiablecredentialsissuer.md) object.|
|[List contracts](../api/verifiablecredentialsissuer-list-contracts.md)|[verifiableCredentialsContract](../resources/verifiablecredentialscontract.md) collection|Get the verifiableCredentialsContract resources from the contracts navigation property.|
|[Add verifiableCredentialsContract](../api/verifiablecredentialsissuer-post-contracts.md)|[verifiableCredentialsContract](../resources/verifiablecredentialscontract.md)|Add contracts by posting to the contracts collection.|
|[List didModel](../api/verifiablecredentialsissuer-list-didmodel.md)|[didModel](../resources/didmodel.md) collection|Get the didModel resources from the didModel navigation property.|
|[Add didModel](../api/verifiablecredentialsissuer-post-didmodel.md)|[didModel](../resources/didmodel.md)|Add didModel by posting to the didModel collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|issuerName|String|**TODO: Add Description**|
|keyVaultUrl|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|contracts|[verifiableCredentialsContract](../resources/verifiablecredentialscontract.md) collection|**TODO: Add Description**|
|didModel|[didModel](../resources/didmodel.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.verifiableCredentialsIssuer",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.verifiableCredentialsIssuer",
  "id": "String (identifier)",
  "issuerName": "String",
  "keyVaultUrl": "String"
}
```

