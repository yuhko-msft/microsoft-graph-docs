---
title: "directory resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# directory resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List directories](../api/directory-list.md)|[directory](../resources/directory.md) collection|Get a list of the [directory](../resources/directory.md) objects and their properties.|
|[Create directory](../api/directory-create.md)|[directory](../resources/directory.md)|Create a new [directory](../resources/directory.md) object.|
|[Get directory](../api/directory-get.md)|[directory](../resources/directory.md)|Read the properties and relationships of a [directory](../resources/directory.md) object.|
|[Update directory](../api/directory-update.md)|[directory](../resources/directory.md)|Update the properties of a [directory](../resources/directory.md) object.|
|[Delete directory](../api/directory-delete.md)|None|Deletes a [directory](../resources/directory.md) object.|
|[List groupProxies](../api/directory-list-groupproxies.md)|[groupProxy](../resources/groupproxy.md) collection|Get the groupProxy resources from the groupProxies navigation property.|
|[Create groupProxies](../api/directory-post-groupproxies.md)|[groupProxy](../resources/groupproxy.md)|Create a new groupProxy object.|
|[Get groupProxies](../api/directory-get-groupproxy.md)|[groupProxy](../resources/groupproxy.md)|Read the properties and relationships of a [groupProxy](../resources/groupproxy.md) object.|
|[Update groupProxies](../api/directory-update-groupproxies.md)|[groupProxy](../resources/groupproxy.md)|Update the properties of a groupProxies object.|
|[Delete groupProxies](../api/directory-delete-groupproxies.md)|None|Delete a [groupProxy](../resources/groupproxy.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|administrativeUnits|[administrativeUnit](../resources/administrativeunit.md) collection|**TODO: Add Description**|
|deletedItems|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|groupProxies|[groupProxy](../resources/groupproxy.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.directory",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.directory"
}
```

