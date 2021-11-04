---
title: "fqdn resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# fqdn resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [filteringRuleSingleDestination](../resources/filteringrulesingledestination.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List fqdns](../api/fqdn-list.md)|[fqdn](../resources/fqdn.md) collection|Get a list of the [fqdn](../resources/fqdn.md) objects and their properties.|
|[Get fqdn](../api/fqdn-get.md)|[fqdn](../resources/fqdn.md)|Read the properties and relationships of a [fqdn](../resources/fqdn.md) object.|
|[Update fqdn](../api/fqdn-update.md)|[fqdn](../resources/fqdn.md)|Update the properties of a [fqdn](../resources/fqdn.md) object.|
|[Delete fqdn](../api/fqdn-delete.md)|None|Deletes a [fqdn](../resources/fqdn.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|id|Guid|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|name|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|value|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.fqdn",
  "baseType": "microsoft.graph.filteringRuleSingleDestination",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.fqdn",
  "id": "String (identifier)",
  "name": "String",
  "description": "String",
  "value": "String"
}
```

