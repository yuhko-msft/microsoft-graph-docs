---
title: "mobileContainedApp resource type"
description: "An abstract class that represents a contained app in a mobileApp acting as a package."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileContainedApp resource type

Namespace: microsoft.graph

An abstract class that represents a contained app in a mobileApp acting as a package.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List containedApps](../api/mobileappcontent-list-containedapps.md)|[mobileContainedApp](../resources/mobilecontainedapp.md) collection|Get the mobileContainedApp resources from the containedApps navigation property.|
|[Create containedApps](../api/mobileappcontent-post-containedapps.md)|[mobileContainedApp](../resources/mobilecontainedapp.md)|Create a new mobileContainedApp object.|
|[Update containedApps](../api/mobileappcontent-update-containedapps.md)|[mobileContainedApp](../resources/mobilecontainedapp.md)|Update the properties of a containedApps object.|
|[Get containedApps](../api/mobileappcontent-get-mobilecontainedapp.md)|[mobileContainedApp](../resources/mobilecontainedapp.md)|Read the properties and relationships of a [mobileContainedApp](../resources/mobilecontainedapp.md) object.|
|[Delete containedApps](../api/mobileappcontent-delete-containedapps.md)|None|Delete a [mobileContainedApp](../resources/mobilecontainedapp.md) object.|
|[List mobileContainedApps](../api/mobilecontainedapp-list.md)|[mobileContainedApp](../resources/mobilecontainedapp.md) collection|Get a list of the [mobileContainedApp](../resources/mobilecontainedapp.md) objects and their properties.|
|[Create mobileContainedApp](../api/mobilecontainedapp-create.md)|[mobileContainedApp](../resources/mobilecontainedapp.md)|Create a new [mobileContainedApp](../resources/mobilecontainedapp.md) object.|
|[Get mobileContainedApp](../api/mobilecontainedapp-get.md)|[mobileContainedApp](../resources/mobilecontainedapp.md)|Read the properties and relationships of a [mobileContainedApp](../resources/mobilecontainedapp.md) object.|
|[Update mobileContainedApp](../api/mobilecontainedapp-update.md)|[mobileContainedApp](../resources/mobilecontainedapp.md)|Update the properties of a [mobileContainedApp](../resources/mobilecontainedapp.md) object.|
|[Delete mobileContainedApp](../api/mobilecontainedapp-delete.md)|None|Deletes a [mobileContainedApp](../resources/mobilecontainedapp.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|Key of the entity.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mobileContainedApp",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileContainedApp",
  "id": "String (identifier)"
}
```

