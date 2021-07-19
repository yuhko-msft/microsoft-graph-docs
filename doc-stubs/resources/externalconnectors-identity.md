---
title: "identity resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# identity resource type

Namespace: microsoft.graph.externalConnectors



**TODO: Add Description**


Inherits from [entity](../resources/externalconnectors-entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List identities](../api/externalconnectors-identity-list.md)|[microsoft.graph.externalConnectors.identity](../resources/externalconnectors-identity.md) collection|Get a list of the [identity](../resources/externalconnectors-identity.md) objects and their properties.|
|[Create identity](../api/externalconnectors-identity-create.md)|[microsoft.graph.externalConnectors.identity](../resources/externalconnectors-identity.md)|Create a new [identity](../resources/externalconnectors-identity.md) object.|
|[Get identity](../api/externalconnectors-identity-get.md)|[microsoft.graph.externalConnectors.identity](../resources/externalconnectors-identity.md)|Read the properties and relationships of an [identity](../resources/externalconnectors-identity.md) object.|
|[Update identity](../api/externalconnectors-identity-update.md)|[microsoft.graph.externalConnectors.identity](../resources/externalconnectors-identity.md)|Update the properties of an [identity](../resources/externalconnectors-identity.md) object.|
|[Delete identity](../api/externalconnectors-identity-delete.md)|None|Deletes an [identity](../resources/externalconnectors-identity.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/externalconnectors-entity.md).|
|type|identityType|**TODO: Add Description**. Possible values are: `user`, `group`, `externalGroup`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.externalConnectors.identity",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.externalConnectors.identity",
  "id": "String (identifier)",
  "type": "String"
}
```

