---
title: "filteringRuleDestination resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# filteringRuleDestination resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [configurationBase](../resources/configurationbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List filteringRuleDestinations](../api/filteringruledestination-list.md)|[filteringRuleDestination](../resources/filteringruledestination.md) collection|Get a list of the [filteringRuleDestination](../resources/filteringruledestination.md) objects and their properties.|
|[Create filteringRuleDestination](../api/filteringpolicyrule-post-destination.md)|[filteringRuleDestination](../resources/filteringruledestination.md)|Create a new [filteringRuleDestination](../resources/filteringruledestination.md) object.|
|[Get filteringRuleDestination](../api/filteringruledestination-get.md)|[filteringRuleDestination](../resources/filteringruledestination.md)|Read the properties and relationships of a [filteringRuleDestination](../resources/filteringruledestination.md) object.|
|[Update filteringRuleDestination](../api/filteringruledestination-update.md)|[filteringRuleDestination](../resources/filteringruledestination.md)|Update the properties of a [filteringRuleDestination](../resources/filteringruledestination.md) object.|
|[Delete filteringRuleDestination](../api/filteringruledestination-delete.md)|None|Deletes a [filteringRuleDestination](../resources/filteringruledestination.md) object.|

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
  "@odata.type": "microsoft.graph.filteringRuleDestination",
  "baseType": "microsoft.graph.configurationBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.filteringRuleDestination",
  "id": "String (identifier)",
  "name": "String",
  "description": "String"
}
```

