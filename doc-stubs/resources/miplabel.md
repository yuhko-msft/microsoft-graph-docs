---
title: "mipLabel resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mipLabel resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [directoryObject](../resources/directoryobject.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mipLabels](../api/miplabel-list.md)|[mipLabel](../resources/miplabel.md) collection|Get a list of the [mipLabel](../resources/miplabel.md) objects and their properties.|
|[Create mipLabel](../api/miplabel-post-miplabels.md)|[mipLabel](../resources/miplabel.md)|Create a new [mipLabel](../resources/miplabel.md) object.|
|[Get mipLabel](../api/miplabel-get.md)|[mipLabel](../resources/miplabel.md)|Read the properties and relationships of a [mipLabel](../resources/miplabel.md) object.|
|[Update mipLabel](../api/miplabel-update.md)|[mipLabel](../resources/miplabel.md)|Update the properties of a [mipLabel](../resources/miplabel.md) object.|
|[Delete mipLabel](../api/miplabel-delete.md)|None|Deletes a [mipLabel](../resources/miplabel.md) object.|
|[checkMemberGroups](../api/miplabel-checkmembergroups.md)|String collection|**TODO: Add Description**|
|[checkMemberObjects](../api/miplabel-checkmemberobjects.md)|String collection|**TODO: Add Description**|
|[getMemberGroups](../api/miplabel-getmembergroups.md)|String collection|**TODO: Add Description**|
|[getMemberObjects](../api/miplabel-getmemberobjects.md)|String collection|**TODO: Add Description**|
|[restore](../api/miplabel-restore.md)|[directoryObject](../resources/directoryobject.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deletedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md)|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md)|
|labelId|String|**TODO: Add Description**|
|protectGroupAction|[mipProtectGroupLabelAction](../resources/mipprotectgrouplabelaction.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mipLabel",
  "baseType": "Microsoft.DirectoryServices.directoryObject",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mipLabel",
  "id": "String (identifier)",
  "deletedDateTime": "String (timestamp)",
  "labelId": "String",
  "displayName": "String",
  "protectGroupAction": {
    "@odata.type": "microsoft.graph.mipProtectGroupLabelAction"
  }
}
```

