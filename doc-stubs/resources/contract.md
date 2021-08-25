---
title: "contract resource type"
description: "Describes how to issue and display a Verifiable Credential."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# contract resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Describes how to issue and display a Verifiable Credential.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List contracts](../api/contract-list.md)|[contract](../resources/contract.md) collection|Get a list of the [contract](../resources/contract.md) objects and their properties.|
|[Create contract](../api/contract-create.md)|[contract](../resources/contract.md)|Create a new [contract](../resources/contract.md) object.|
|[Get contract](../api/contract-get.md)|[contract](../resources/contract.md)|Read the properties and relationships of a [contract](../resources/contract.md) object.|
|[Update contract](../api/contract-update.md)|[contract](../resources/contract.md)|Update the properties of a [contract](../resources/contract.md) object.|
|[Delete contract](../api/contract-delete.md)|None|Deletes a [contract](../resources/contract.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|display|[display](../resources/display.md)|**TODO: Add Description**|
|id|String|Contract name.|
|input|[input](../resources/input.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.contract",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.contract",
  "id": "String (identifier)",
  "display": {
    "@odata.type": "microsoft.graph.display"
  },
  "input": {
    "@odata.type": "microsoft.graph.input"
  }
}
```

