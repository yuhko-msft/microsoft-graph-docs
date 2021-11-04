---
title: "filteringRuleDestinationGroup resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# filteringRuleDestinationGroup resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [filteringRuleDestination](../resources/filteringruledestination.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List filteringRuleDestinationGroups](../api/filteringruledestinationgroup-list.md)|[filteringRuleDestinationGroup](../resources/filteringruledestinationgroup.md) collection|Get a list of the [filteringRuleDestinationGroup](../resources/filteringruledestinationgroup.md) objects and their properties.|
|[Get filteringRuleDestinationGroup](../api/filteringruledestinationgroup-get.md)|[filteringRuleDestinationGroup](../resources/filteringruledestinationgroup.md)|Read the properties and relationships of a [filteringRuleDestinationGroup](../resources/filteringruledestinationgroup.md) object.|
|[Update filteringRuleDestinationGroup](../api/filteringruledestinationgroup-update.md)|[filteringRuleDestinationGroup](../resources/filteringruledestinationgroup.md)|Update the properties of a [filteringRuleDestinationGroup](../resources/filteringruledestinationgroup.md) object.|
|[Delete filteringRuleDestinationGroup](../api/filteringruledestinationgroup-delete.md)|None|Deletes a [filteringRuleDestinationGroup](../resources/filteringruledestinationgroup.md) object.|
|[List destinations](../api/filteringruledestinationgroup-list-destinations.md)|[filteringRuleSingleDestination](../resources/filteringrulesingledestination.md) collection|Get the filteringRuleSingleDestination resources from the destinations navigation property.|
|[Add filteringRuleSingleDestination](../api/filteringruledestinationgroup-post-destinations.md)|[filteringRuleSingleDestination](../resources/filteringrulesingledestination.md)|Add destinations by posting to the destinations collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|id|Guid|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|name|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|destinations|[filteringRuleSingleDestination](../resources/filteringrulesingledestination.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.filteringRuleDestinationGroup",
  "baseType": "microsoft.graph.filteringRuleDestination",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.filteringRuleDestinationGroup",
  "id": "String (identifier)",
  "name": "String",
  "description": "String"
}
```

