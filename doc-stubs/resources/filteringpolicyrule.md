---
title: "filteringPolicyRule resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# filteringPolicyRule resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [ruleBase](../resources/rulebase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List filteringPolicyRules](../api/filteringpolicyrule-list.md)|[filteringPolicyRule](../resources/filteringpolicyrule.md) collection|Get a list of the [filteringPolicyRule](../resources/filteringpolicyrule.md) objects and their properties.|
|[Create filteringPolicyRule](../api/childfilteringpolicybase-post-rules.md)|[filteringPolicyRule](../resources/filteringpolicyrule.md)|Create a new [filteringPolicyRule](../resources/filteringpolicyrule.md) object.|
|[Get filteringPolicyRule](../api/filteringpolicyrule-get.md)|[filteringPolicyRule](../resources/filteringpolicyrule.md)|Read the properties and relationships of a [filteringPolicyRule](../resources/filteringpolicyrule.md) object.|
|[Update filteringPolicyRule](../api/filteringpolicyrule-update.md)|[filteringPolicyRule](../resources/filteringpolicyrule.md)|Update the properties of a [filteringPolicyRule](../resources/filteringpolicyrule.md) object.|
|[Delete filteringPolicyRule](../api/filteringpolicyrule-delete.md)|None|Deletes a [filteringPolicyRule](../resources/filteringpolicyrule.md) object.|
|[List filteringRuleDestination](../api/filteringpolicyrule-list-destination.md)|[filteringRuleDestination](../resources/filteringruledestination.md) collection|Get the filteringRuleDestination resources from the destination navigation property.|
|[Add filteringRuleDestination](../api/filteringpolicyrule-post-destination.md)|[filteringRuleDestination](../resources/filteringruledestination.md)|Add destination by posting to the destination collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|destinationType|destinationType|**TODO: Add Description**. The possible values are: `ipGroup`.|
|id|Guid|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|name|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|ports|String|**TODO: Add Description**|
|protocol|urlProtocolType|**TODO: Add Description**. The possible values are: `http`, `https`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|destination|[filteringRuleDestination](../resources/filteringruledestination.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.filteringPolicyRule",
  "baseType": "microsoft.graph.ruleBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.filteringPolicyRule",
  "id": "String (identifier)",
  "name": "String",
  "description": "String",
  "destinationType": "String",
  "ports": "String",
  "protocol": "String"
}
```

