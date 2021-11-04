---
title: "tlsTerminationPolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# tlsTerminationPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [childFilteringPolicyBase](../resources/childfilteringpolicybase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List tlsTerminationPolicies](../api/tlsterminationpolicy-list.md)|[tlsTerminationPolicy](../resources/tlsterminationpolicy.md) collection|Get a list of the [tlsTerminationPolicy](../resources/tlsterminationpolicy.md) objects and their properties.|
|[Get tlsTerminationPolicy](../api/tlsterminationpolicy-get.md)|[tlsTerminationPolicy](../resources/tlsterminationpolicy.md)|Read the properties and relationships of a [tlsTerminationPolicy](../resources/tlsterminationpolicy.md) object.|
|[Update tlsTerminationPolicy](../api/tlsterminationpolicy-update.md)|[tlsTerminationPolicy](../resources/tlsterminationpolicy.md)|Update the properties of a [tlsTerminationPolicy](../resources/tlsterminationpolicy.md) object.|
|[Delete tlsTerminationPolicy](../api/tlsterminationpolicy-delete.md)|None|Deletes a [tlsTerminationPolicy](../resources/tlsterminationpolicy.md) object.|
|[List rules](../api/tlsterminationpolicy-list-rules.md)|[filteringPolicyRule](../resources/filteringpolicyrule.md) collection|Get the filteringPolicyRule resources from the rules navigation property.|
|[Create filteringPolicyRule](../api/tlsterminationpolicy-post-rules.md)|[filteringPolicyRule](../resources/filteringpolicyrule.md)|Create a new filteringPolicyRule object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|action|filteringPolicyAction|**TODO: Add Description** Inherited from [childFilteringPolicyBase](../resources/childfilteringpolicybase.md). The possible values are: `block`, `allow`, `alert`, `redirect`.|
|description|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|id|Guid|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|loggingState|enablementState|**TODO: Add Description** Inherited from [childFilteringPolicyBase](../resources/childfilteringpolicybase.md). The possible values are: `enabled`, `disabled`.|
|name|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|priority|Int64|**TODO: Add Description** Inherited from [childFilteringPolicyBase](../resources/childfilteringpolicybase.md).|
|state|enablementState|**TODO: Add Description** Inherited from [childFilteringPolicyBase](../resources/childfilteringpolicybase.md). The possible values are: `enabled`, `disabled`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|rules|[filteringPolicyRule](../resources/filteringpolicyrule.md) collection|**TODO: Add Description** Inherited from [childFilteringPolicyBase](../resources/childfilteringpolicybase.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.tlsTerminationPolicy",
  "baseType": "microsoft.graph.childFilteringPolicyBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.tlsTerminationPolicy",
  "id": "String (identifier)",
  "name": "String",
  "description": "String",
  "priority": "Integer",
  "action": "String",
  "state": "String",
  "loggingState": "String"
}
```

