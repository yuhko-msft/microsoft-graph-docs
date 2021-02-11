---
title: "personExtension resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# personExtension resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [extension](../resources/extension.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List personExtensions](../api/personextension-list.md)|[personExtension](../resources/personextension.md) collection|Get a list of the [personExtension](../resources/personextension.md) objects and their properties.|
|[Create personExtension](../api/personextension-create.md)|[personExtension](../resources/personextension.md)|Create a new [personExtension](../resources/personextension.md) object.|
|[Get personExtension](../api/personextension-get.md)|[personExtension](../resources/personextension.md)|Read the properties and relationships of a [personExtension](../resources/personextension.md) object.|
|[Update personExtension](../api/personextension-update.md)|[personExtension](../resources/personextension.md)|Update the properties of a [personExtension](../resources/personextension.md) object.|
|[Delete personExtension](../api/personextension-delete.md)|None|Deletes a [personExtension](../resources/personextension.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [extension](../resources/extension.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.personExtension",
  "baseType": "Microsoft.Fast.PI.ViewGenerator.V2.Profile.Models.extension",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.personExtension",
  "id": "String (identifier)"
}
```

