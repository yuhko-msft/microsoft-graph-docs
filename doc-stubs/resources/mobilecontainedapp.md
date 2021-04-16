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


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mobileContainedApps](../api/mobilecontainedapp-list.md)|[mobileContainedApp](../resources/mobilecontainedapp.md) collection|Get a list of the [mobileContainedApp](../resources/mobilecontainedapp.md) objects and their properties.|
|[Create mobileContainedApp](../api/mobilecontainedapp-create.md)|[mobileContainedApp](../resources/mobilecontainedapp.md)|Create a new [mobileContainedApp](../resources/mobilecontainedapp.md) object.|
|[Get mobileContainedApp](../api/mobilecontainedapp-get.md)|[mobileContainedApp](../resources/mobilecontainedapp.md)|Read the properties and relationships of a [mobileContainedApp](../resources/mobilecontainedapp.md) object.|
|[Update mobileContainedApp](../api/mobilecontainedapp-update.md)|[mobileContainedApp](../resources/mobilecontainedapp.md)|Update the properties of a [mobileContainedApp](../resources/mobilecontainedapp.md) object.|
|[Delete mobileContainedApp](../api/mobilecontainedapp-delete.md)|None|Deletes a [mobileContainedApp](../resources/mobilecontainedapp.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mobileContainedApp",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileContainedApp",
  "id": "String (identifier)"
}
```

