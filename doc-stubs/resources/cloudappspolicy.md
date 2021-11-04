---
title: "cloudAppsPolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# cloudAppsPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [childFilteringPolicyBase](../resources/childfilteringpolicybase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List cloudAppsPolicies](../api/cloudappspolicy-list.md)|[cloudAppsPolicy](../resources/cloudappspolicy.md) collection|Get a list of the [cloudAppsPolicy](../resources/cloudappspolicy.md) objects and their properties.|
|[Get cloudAppsPolicy](../api/cloudappspolicy-get.md)|[cloudAppsPolicy](../resources/cloudappspolicy.md)|Read the properties and relationships of a [cloudAppsPolicy](../resources/cloudappspolicy.md) object.|
|[Update cloudAppsPolicy](../api/cloudappspolicy-update.md)|[cloudAppsPolicy](../resources/cloudappspolicy.md)|Update the properties of a [cloudAppsPolicy](../resources/cloudappspolicy.md) object.|
|[Delete cloudAppsPolicy](../api/cloudappspolicy-delete.md)|None|Deletes a [cloudAppsPolicy](../resources/cloudappspolicy.md) object.|
|[List rules](../api/cloudappspolicy-list-rules.md)|[filteringPolicyRule](../resources/filteringpolicyrule.md) collection|Get the filteringPolicyRule resources from the rules navigation property.|
|[Create filteringPolicyRule](../api/cloudappspolicy-post-rules.md)|[filteringPolicyRule](../resources/filteringpolicyrule.md)|Create a new filteringPolicyRule object.|

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
  "@odata.type": "microsoft.graph.cloudAppsPolicy",
  "baseType": "microsoft.graph.childFilteringPolicyBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.cloudAppsPolicy",
  "id": "String (identifier)",
  "name": "String",
  "description": "String",
  "priority": "Integer",
  "action": "String",
  "state": "String",
  "loggingState": "String"
}
```

