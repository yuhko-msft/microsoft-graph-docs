---
title: "ruleBase resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# ruleBase resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**
This is an abstract type.


Inherits from [configurationBase](../resources/configurationbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List ruleBases](../api/rulebase-list.md)|[ruleBase](../resources/rulebase.md) collection|Get a list of the [ruleBase](../resources/rulebase.md) objects and their properties.|
|[Get ruleBase](../api/rulebase-get.md)|[ruleBase](../resources/rulebase.md)|Read the properties and relationships of a [ruleBase](../resources/rulebase.md) object.|
|[Update ruleBase](../api/rulebase-update.md)|[ruleBase](../resources/rulebase.md)|Update the properties of a [ruleBase](../resources/rulebase.md) object.|
|[Delete ruleBase](../api/rulebase-delete.md)|None|Deletes a [ruleBase](../resources/rulebase.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|id|Guid|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|name|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.ruleBase",
  "baseType": "microsoft.graph.configurationBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.ruleBase",
  "id": "String (identifier)",
  "name": "String",
  "description": "String"
}
```

