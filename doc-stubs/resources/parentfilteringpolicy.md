---
title: "parentFilteringPolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# parentFilteringPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**
This is an abstract type.


Inherits from [parentPolicyBase](../resources/parentpolicybase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List parentFilteringPolicies](../api/parentfilteringpolicy-list.md)|[parentFilteringPolicy](../resources/parentfilteringpolicy.md) collection|Get a list of the [parentFilteringPolicy](../resources/parentfilteringpolicy.md) objects and their properties.|
|[Get parentFilteringPolicy](../api/parentfilteringpolicy-get.md)|[parentFilteringPolicy](../resources/parentfilteringpolicy.md)|Read the properties and relationships of a [parentFilteringPolicy](../resources/parentfilteringpolicy.md) object.|
|[Update parentFilteringPolicy](../api/parentfilteringpolicy-update.md)|[parentFilteringPolicy](../resources/parentfilteringpolicy.md)|Update the properties of a [parentFilteringPolicy](../resources/parentfilteringpolicy.md) object.|
|[Delete parentFilteringPolicy](../api/parentfilteringpolicy-delete.md)|None|Deletes a [parentFilteringPolicy](../resources/parentfilteringpolicy.md) object.|
|[List childPolicies](../api/parentfilteringpolicy-list-childpolicies.md)|[childPolicyBase](../resources/childpolicybase.md) collection|Get the childPolicyBase resources from the childPolicies navigation property.|
|[Add childPolicyBase](../api/parentfilteringpolicy-post-childpolicies.md)|[childPolicyBase](../resources/childpolicybase.md)|Add childPolicies by posting to the childPolicies collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|id|Guid|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|name|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|priority|Int64|**TODO: Add Description**|
|version|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|childPolicies|[childPolicyBase](../resources/childpolicybase.md) collection|**TODO: Add Description** Inherited from [parentPolicyBase](../resources/parentpolicybase.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.parentFilteringPolicy",
  "baseType": "microsoft.graph.parentPolicyBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.parentFilteringPolicy",
  "id": "String (identifier)",
  "name": "String",
  "description": "String",
  "version": "String",
  "priority": "Integer"
}
```

