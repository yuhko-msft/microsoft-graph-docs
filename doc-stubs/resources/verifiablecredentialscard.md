---
title: "verifiableCredentialsCard resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# verifiableCredentialsCard resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List verifiableCredentialsCards](../api/verifiablecredentialscard-list.md)|[verifiableCredentialsCard](../resources/verifiablecredentialscard.md) collection|Get a list of the [verifiableCredentialsCard](../resources/verifiablecredentialscard.md) objects and their properties.|
|[Create verifiableCredentialsCard](../api/verifiablecredentialscard-create.md)|[verifiableCredentialsCard](../resources/verifiablecredentialscard.md)|Create a new [verifiableCredentialsCard](../resources/verifiablecredentialscard.md) object.|
|[Get verifiableCredentialsCard](../api/verifiablecredentialscard-get.md)|[verifiableCredentialsCard](../resources/verifiablecredentialscard.md)|Read the properties and relationships of a [verifiableCredentialsCard](../resources/verifiablecredentialscard.md) object.|
|[Update verifiableCredentialsCard](../api/verifiablecredentialscard-update.md)|[verifiableCredentialsCard](../resources/verifiablecredentialscard.md)|Update the properties of a [verifiableCredentialsCard](../resources/verifiablecredentialscard.md) object.|
|[Delete verifiableCredentialsCard](../api/verifiablecredentialscard-delete.md)|None|Deletes a [verifiableCredentialsCard](../resources/verifiablecredentialscard.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|indexClaim|String|**TODO: Add Description**|
|status|revocationStatus|**TODO: Add Description**. Possible values are: `issuerRevoked`, `valid`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.verifiableCredentialsCard",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.verifiableCredentialsCard",
  "id": "String (identifier)",
  "indexClaim": "String",
  "status": "String"
}
```

