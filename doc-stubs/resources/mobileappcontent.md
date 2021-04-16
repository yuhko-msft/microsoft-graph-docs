---
title: "mobileAppContent resource type"
description: "Contains content properties for a specific app version. Each mobileAppContent can have multiple mobileAppContentFile."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileAppContent resource type

Namespace: microsoft.graph



Contains content properties for a specific app version. Each mobileAppContent can have multiple mobileAppContentFile.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mobileAppContents](../api/mobileappcontent-list.md)|[mobileAppContent](../resources/mobileappcontent.md) collection|Get a list of the [mobileAppContent](../resources/mobileappcontent.md) objects and their properties.|
|[Create mobileAppContent](../api/mobileappcontent-create.md)|[mobileAppContent](../resources/mobileappcontent.md)|Create a new [mobileAppContent](../resources/mobileappcontent.md) object.|
|[Get mobileAppContent](../api/mobileappcontent-get.md)|[mobileAppContent](../resources/mobileappcontent.md)|Read the properties and relationships of a [mobileAppContent](../resources/mobileappcontent.md) object.|
|[Update mobileAppContent](../api/mobileappcontent-update.md)|[mobileAppContent](../resources/mobileappcontent.md)|Update the properties of a [mobileAppContent](../resources/mobileappcontent.md) object.|
|[Delete mobileAppContent](../api/mobileappcontent-delete.md)|None|Deletes a [mobileAppContent](../resources/mobileappcontent.md) object.|
|[List containedApps](../api/mobileappcontent-list-containedapps.md)|[mobileContainedApp](../resources/mobilecontainedapp.md) collection|Get the mobileContainedApp resources from the containedApps navigation property.|
|[Create mobileContainedApp](../api/mobileappcontent-post-containedapps.md)|[mobileContainedApp](../resources/mobilecontainedapp.md)|Create a new mobileContainedApp object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|containedApps|[mobileContainedApp](../resources/mobilecontainedapp.md) collection|The collection of contained apps in a MobileLobApp acting as a package.|
|files|[mobileAppContentFile](../resources/mobileappcontentfile.md) collection|The list of files for this app content version.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mobileAppContent",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileAppContent",
  "id": "String (identifier)"
}
```

