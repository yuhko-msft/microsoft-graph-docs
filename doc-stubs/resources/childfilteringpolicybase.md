---
title: "childFilteringPolicyBase resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# childFilteringPolicyBase resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**
This is an abstract type.


Inherits from [childPolicyBase](../resources/childpolicybase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List childFilteringPolicyBases](../api/childfilteringpolicybase-list.md)|[childFilteringPolicyBase](../resources/childfilteringpolicybase.md) collection|Get a list of the [childFilteringPolicyBase](../resources/childfilteringpolicybase.md) objects and their properties.|
|[Get childFilteringPolicyBase](../api/childfilteringpolicybase-get.md)|[childFilteringPolicyBase](../resources/childfilteringpolicybase.md)|Read the properties and relationships of a [childFilteringPolicyBase](../resources/childfilteringpolicybase.md) object.|
|[Update childFilteringPolicyBase](../api/childfilteringpolicybase-update.md)|[childFilteringPolicyBase](../resources/childfilteringpolicybase.md)|Update the properties of a [childFilteringPolicyBase](../resources/childfilteringpolicybase.md) object.|
|[Delete childFilteringPolicyBase](../api/childfilteringpolicybase-delete.md)|None|Deletes a [childFilteringPolicyBase](../resources/childfilteringpolicybase.md) object.|
|[List rules](../api/childfilteringpolicybase-list-rules.md)|[filteringPolicyRule](../resources/filteringpolicyrule.md) collection|Get the filteringPolicyRule resources from the rules navigation property.|
|[Create filteringPolicyRule](../api/childfilteringpolicybase-post-rules.md)|[filteringPolicyRule](../resources/filteringpolicyrule.md)|Create a new filteringPolicyRule object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|action|filteringPolicyAction|**TODO: Add Description**. The possible values are: `block`, `allow`, `alert`, `redirect`.|
|description|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|id|Guid|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|loggingState|enablementState|**TODO: Add Description**. The possible values are: `enabled`, `disabled`.|
|name|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|priority|Int64|**TODO: Add Description**|
|state|enablementState|**TODO: Add Description**. The possible values are: `enabled`, `disabled`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|rules|[filteringPolicyRule](../resources/filteringpolicyrule.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.childFilteringPolicyBase",
  "baseType": "microsoft.graph.childPolicyBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.childFilteringPolicyBase",
  "id": "String (identifier)",
  "name": "String",
  "description": "String",
  "priority": "Integer",
  "action": "String",
  "state": "String",
  "loggingState": "String"
}
```

