---
title: "groupProxy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupProxy resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [directoryObject](../resources/directoryobject.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupProxies](../api/directory-list-groupproxies.md)|[groupProxy](../resources/groupproxy.md) collection|Get the groupProxy resources from the groupProxies navigation property.|
|[Create groupProxies](../api/directory-post-groupproxies.md)|[groupProxy](../resources/groupproxy.md)|Create a new groupProxy object.|
|[Update groupProxies](../api/directory-update-groupproxies.md)|[groupProxy](../resources/groupproxy.md)|Update the properties of a groupProxies object.|
|[Get groupProxies](../api/directory-get-groupproxy.md)|[groupProxy](../resources/groupproxy.md)|Read the properties and relationships of a [groupProxy](../resources/groupproxy.md) object.|
|[Delete groupProxies](../api/directory-delete-groupproxies.md)|None|Delete a [groupProxy](../resources/groupproxy.md) object.|
|[List groupProxies](../api/groupproxy-list.md)|[groupProxy](../resources/groupproxy.md) collection|Get a list of the [groupProxy](../resources/groupproxy.md) objects and their properties.|
|[Create groupProxy](../api/groupproxy-create.md)|[groupProxy](../resources/groupproxy.md)|Create a new [groupProxy](../resources/groupproxy.md) object.|
|[Get groupProxy](../api/groupproxy-get.md)|[groupProxy](../resources/groupproxy.md)|Read the properties and relationships of a [groupProxy](../resources/groupproxy.md) object.|
|[Update groupProxy](../api/groupproxy-update.md)|[groupProxy](../resources/groupproxy.md)|Update the properties of a [groupProxy](../resources/groupproxy.md) object.|
|[Delete groupProxy](../api/groupproxy-delete.md)|None|Deletes a [groupProxy](../resources/groupproxy.md) object.|
|[checkMemberGroups](../api/groupproxy-checkmembergroups.md)|String collection|**TODO: Add Description**|
|[checkMemberObjects](../api/groupproxy-checkmemberobjects.md)|String collection|**TODO: Add Description**|
|[getMemberGroups](../api/groupproxy-getmembergroups.md)|String collection|**TODO: Add Description**|
|[getMemberObjects](../api/groupproxy-getmemberobjects.md)|String collection|**TODO: Add Description**|
|[restore](../api/groupproxy-restore.md)|[directoryObject](../resources/directoryobject.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deletedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md)|
|id|String|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md)|
|remoteGroupId|Guid|**TODO: Add Description**|
|remoteTenantId|Guid|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.groupProxy",
  "baseType": "Microsoft.DirectoryServices.directoryObject",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupProxy",
  "id": "String (identifier)",
  "deletedDateTime": "String (timestamp)",
  "remoteTenantId": "Guid",
  "remoteGroupId": "Guid"
}
```

