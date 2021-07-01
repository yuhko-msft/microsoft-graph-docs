---
title: "exchange resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# exchange resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get exchange](../api/exchange-get.md)|[exchange](../resources/exchange.md)|Read the properties and relationships of an [exchange](../resources/exchange.md) object.|
|[Update exchange](../api/exchange-update.md)|[exchange](../resources/exchange.md)|Update the properties of an [exchange](../resources/exchange.md) object.|
|[List messageTraces](../api/exchange-list-messagetraces.md)|[messageTrace](../resources/messagetrace.md) collection|Get the messageTrace resources from the messageTraces navigation property.|
|[Create messageTrace](../api/exchange-post-messagetraces.md)|[messageTrace](../resources/messagetrace.md)|Create a new messageTrace object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|messageTraces|[messageTrace](../resources/messagetrace.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.exchange",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.exchange",
  "id": "String (identifier)"
}
```

