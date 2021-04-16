---
title: "policyBase resource type"
description: "Represents an Azure Active Directory object. The directoryObject type is the base type for many other directory entity types."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# policyBase resource type

Namespace: microsoft.graph



Represents an Azure Active Directory object. The directoryObject type is the base type for many other directory entity types.


Inherits from [directoryObject](../resources/directoryobject.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List policyBases](../api/policybase-list.md)|[policyBase](../resources/policybase.md) collection|Get a list of the [policyBase](../resources/policybase.md) objects and their properties.|
|[Create policyBase](../api/policybase-create.md)|[policyBase](../resources/policybase.md)|Create a new [policyBase](../resources/policybase.md) object.|
|[Get policyBase](../api/policybase-get.md)|[policyBase](../resources/policybase.md)|Read the properties and relationships of a [policyBase](../resources/policybase.md) object.|
|[Update policyBase](../api/policybase-update.md)|[policyBase](../resources/policybase.md)|Update the properties of a [policyBase](../resources/policybase.md) object.|
|[Delete policyBase](../api/policybase-delete.md)|None|Deletes a [policyBase](../resources/policybase.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deletedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md)|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.policyBase",
  "baseType": "microsoft.graph.directoryObject",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.policyBase",
  "id": "String (identifier)",
  "deletedDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String"
}
```

