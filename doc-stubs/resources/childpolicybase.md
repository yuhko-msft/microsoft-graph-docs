---
title: "childPolicyBase resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# childPolicyBase resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**
This is an abstract type.


Inherits from [configurationBase](../resources/configurationbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List childPolicyBases](../api/childpolicybase-list.md)|[childPolicyBase](../resources/childpolicybase.md) collection|Get a list of the [childPolicyBase](../resources/childpolicybase.md) objects and their properties.|
|[Create childPolicyBase](../api/parentpolicybase-post-childpolicies.md)|[childPolicyBase](../resources/childpolicybase.md)|Create a new [childPolicyBase](../resources/childpolicybase.md) object.|
|[Get childPolicyBase](../api/childpolicybase-get.md)|[childPolicyBase](../resources/childpolicybase.md)|Read the properties and relationships of a [childPolicyBase](../resources/childpolicybase.md) object.|
|[Update childPolicyBase](../api/childpolicybase-update.md)|[childPolicyBase](../resources/childpolicybase.md)|Update the properties of a [childPolicyBase](../resources/childpolicybase.md) object.|
|[Delete childPolicyBase](../api/childpolicybase-delete.md)|None|Deletes a [childPolicyBase](../resources/childpolicybase.md) object.|

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
  "@odata.type": "microsoft.graph.childPolicyBase",
  "baseType": "microsoft.graph.configurationBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.childPolicyBase",
  "id": "String (identifier)",
  "name": "String",
  "description": "String"
}
```

