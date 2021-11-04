---
title: "configurationBase resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# configurationBase resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**
This is an abstract type.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List configurationBases](../api/configurationbase-list.md)|[configurationBase](../resources/configurationbase.md) collection|Get a list of the [configurationBase](../resources/configurationbase.md) objects and their properties.|
|[Get configurationBase](../api/configurationbase-get.md)|[configurationBase](../resources/configurationbase.md)|Read the properties and relationships of a [configurationBase](../resources/configurationbase.md) object.|
|[Update configurationBase](../api/configurationbase-update.md)|[configurationBase](../resources/configurationbase.md)|Update the properties of a [configurationBase](../resources/configurationbase.md) object.|
|[Delete configurationBase](../api/configurationbase-delete.md)|None|Deletes a [configurationBase](../resources/configurationbase.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description**|
|id|Guid|**TODO: Add Description**|
|name|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.configurationBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.configurationBase",
  "id": "String (identifier)",
  "name": "String",
  "description": "String"
}
```

