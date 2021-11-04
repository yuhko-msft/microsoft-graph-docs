---
title: "threatIntelligence resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# threatIntelligence resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [childFilteringPolicyBase](../resources/childfilteringpolicybase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List threatIntelligences](../api/threatintelligence-list.md)|[threatIntelligence](../resources/threatintelligence.md) collection|Get a list of the [threatIntelligence](../resources/threatintelligence.md) objects and their properties.|
|[Get threatIntelligence](../api/threatintelligence-get.md)|[threatIntelligence](../resources/threatintelligence.md)|Read the properties and relationships of a [threatIntelligence](../resources/threatintelligence.md) object.|
|[Update threatIntelligence](../api/threatintelligence-update.md)|[threatIntelligence](../resources/threatintelligence.md)|Update the properties of a [threatIntelligence](../resources/threatintelligence.md) object.|
|[Delete threatIntelligence](../api/threatintelligence-delete.md)|None|Deletes a [threatIntelligence](../resources/threatintelligence.md) object.|
|[List rules](../api/threatintelligence-list-rules.md)|[filteringPolicyRule](../resources/filteringpolicyrule.md) collection|Get the filteringPolicyRule resources from the rules navigation property.|
|[Create filteringPolicyRule](../api/threatintelligence-post-rules.md)|[filteringPolicyRule](../resources/filteringpolicyrule.md)|Create a new filteringPolicyRule object.|

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
  "@odata.type": "microsoft.graph.threatIntelligence",
  "baseType": "microsoft.graph.childFilteringPolicyBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.threatIntelligence",
  "id": "String (identifier)",
  "name": "String",
  "description": "String",
  "priority": "Integer",
  "action": "String",
  "state": "String",
  "loggingState": "String"
}
```

