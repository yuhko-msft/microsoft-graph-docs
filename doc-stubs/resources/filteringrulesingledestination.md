---
title: "filteringRuleSingleDestination resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# filteringRuleSingleDestination resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [filteringRuleDestination](../resources/filteringruledestination.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List filteringRuleSingleDestinations](../api/filteringrulesingledestination-list.md)|[filteringRuleSingleDestination](../resources/filteringrulesingledestination.md) collection|Get a list of the [filteringRuleSingleDestination](../resources/filteringrulesingledestination.md) objects and their properties.|
|[Create filteringRuleSingleDestination](../api/filteringruledestinationgroup-post-destinations.md)|[filteringRuleSingleDestination](../resources/filteringrulesingledestination.md)|Create a new [filteringRuleSingleDestination](../resources/filteringrulesingledestination.md) object.|
|[Get filteringRuleSingleDestination](../api/filteringrulesingledestination-get.md)|[filteringRuleSingleDestination](../resources/filteringrulesingledestination.md)|Read the properties and relationships of a [filteringRuleSingleDestination](../resources/filteringrulesingledestination.md) object.|
|[Update filteringRuleSingleDestination](../api/filteringrulesingledestination-update.md)|[filteringRuleSingleDestination](../resources/filteringrulesingledestination.md)|Update the properties of a [filteringRuleSingleDestination](../resources/filteringrulesingledestination.md) object.|
|[Delete filteringRuleSingleDestination](../api/filteringrulesingledestination-delete.md)|None|Deletes a [filteringRuleSingleDestination](../resources/filteringrulesingledestination.md) object.|

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
  "@odata.type": "microsoft.graph.filteringRuleSingleDestination",
  "baseType": "microsoft.graph.filteringRuleDestination",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.filteringRuleSingleDestination",
  "id": "String (identifier)",
  "name": "String",
  "description": "String"
}
```

