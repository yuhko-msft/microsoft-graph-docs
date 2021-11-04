---
title: "parentPolicyBase resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# parentPolicyBase resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**
This is an abstract type.


Inherits from [configurationBase](../resources/configurationbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List parentPolicyBases](../api/parentpolicybase-list.md)|[parentPolicyBase](../resources/parentpolicybase.md) collection|Get a list of the [parentPolicyBase](../resources/parentpolicybase.md) objects and their properties.|
|[Get parentPolicyBase](../api/parentpolicybase-get.md)|[parentPolicyBase](../resources/parentpolicybase.md)|Read the properties and relationships of a [parentPolicyBase](../resources/parentpolicybase.md) object.|
|[Update parentPolicyBase](../api/parentpolicybase-update.md)|[parentPolicyBase](../resources/parentpolicybase.md)|Update the properties of a [parentPolicyBase](../resources/parentpolicybase.md) object.|
|[Delete parentPolicyBase](../api/parentpolicybase-delete.md)|None|Deletes a [parentPolicyBase](../resources/parentpolicybase.md) object.|
|[List childPolicies](../api/parentpolicybase-list-childpolicies.md)|[childPolicyBase](../resources/childpolicybase.md) collection|Get the childPolicyBase resources from the childPolicies navigation property.|
|[Add childPolicyBase](../api/parentpolicybase-post-childpolicies.md)|[childPolicyBase](../resources/childpolicybase.md)|Add childPolicies by posting to the childPolicies collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|id|Guid|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|name|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|childPolicies|[childPolicyBase](../resources/childpolicybase.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.parentPolicyBase",
  "baseType": "microsoft.graph.configurationBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.parentPolicyBase",
  "id": "String (identifier)",
  "name": "String",
  "description": "String"
}
```

