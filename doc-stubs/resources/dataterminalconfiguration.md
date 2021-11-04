---
title: "dataTerminalConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# dataTerminalConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [configurationBase](../resources/configurationbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List dataTerminalConfigurations](../api/dataterminalconfiguration-list.md)|[dataTerminalConfiguration](../resources/dataterminalconfiguration.md) collection|Get a list of the [dataTerminalConfiguration](../resources/dataterminalconfiguration.md) objects and their properties.|
|[Get dataTerminalConfiguration](../api/dataterminalconfiguration-get.md)|[dataTerminalConfiguration](../resources/dataterminalconfiguration.md)|Read the properties and relationships of a [dataTerminalConfiguration](../resources/dataterminalconfiguration.md) object.|
|[Update dataTerminalConfiguration](../api/dataterminalconfiguration-update.md)|[dataTerminalConfiguration](../resources/dataterminalconfiguration.md)|Update the properties of a [dataTerminalConfiguration](../resources/dataterminalconfiguration.md) object.|
|[Delete dataTerminalConfiguration](../api/dataterminalconfiguration-delete.md)|None|Deletes a [dataTerminalConfiguration](../resources/dataterminalconfiguration.md) object.|

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
  "@odata.type": "microsoft.graph.dataTerminalConfiguration",
  "baseType": "microsoft.graph.configurationBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.dataTerminalConfiguration",
  "id": "String (identifier)",
  "name": "String",
  "description": "String",
  "enablementState": "String"
}
```

