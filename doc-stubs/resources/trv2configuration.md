---
title: "trv2Configuration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# trv2Configuration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [configurationBase](../resources/configurationbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List trv2Configuration](../api/trv2configuration-list.md)|[trv2Configuration](../resources/trv2configuration.md) collection|Get a list of the [trv2Configuration](../resources/trv2configuration.md) objects and their properties.|
|[Get trv2Configuration](../api/trv2configuration-get.md)|[trv2Configuration](../resources/trv2configuration.md)|Read the properties and relationships of a [trv2Configuration](../resources/trv2configuration.md) object.|
|[Update trv2Configuration](../api/trv2configuration-update.md)|[trv2Configuration](../resources/trv2configuration.md)|Update the properties of a [trv2Configuration](../resources/trv2configuration.md) object.|
|[Delete trv2Configuration](../api/trv2configuration-delete.md)|None|Deletes a [trv2Configuration](../resources/trv2configuration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|enablementState|enablementState|**TODO: Add Description**. The possible values are: `enabled`, `disabled`.|
|id|Guid|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|name|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.trv2Configuration",
  "baseType": "microsoft.graph.configurationBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.trv2Configuration",
  "id": "String (identifier)",
  "name": "String",
  "description": "String",
  "enablementState": "String"
}
```

