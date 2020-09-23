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

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List contentVersions](../api/win32lobapp-list-contentversions.md)|[mobileAppContent](../resources/mobileappcontent.md) collection|Get the mobileAppContent resources from the contentVersions navigation property.|
|[Create contentVersions](../api/win32lobapp-post-contentversions.md)|[mobileAppContent](../resources/mobileappcontent.md)|Create a new mobileAppContent object.|
|[Update contentVersions](../api/win32lobapp-update-contentversions.md)|[mobileAppContent](../resources/mobileappcontent.md)|Update the properties of a contentVersions object.|
|[Get contentVersions](../api/win32lobapp-get-mobileappcontent.md)|[mobileAppContent](../resources/mobileappcontent.md)|Read the properties and relationships of a [mobileAppContent](../resources/intune-mobileappcontent.md) object.|
|[Delete contentVersions](../api/win32lobapp-delete-contentversions.md)|None|Delete a [mobileAppContent](../resources/intune-mobileappcontent.md) object.|
|[List mobileAppContents](../api/mobileappcontent-list.md)|[mobileAppContent](../resources/mobileappcontent.md) collection|Get a list of the [mobileAppContent](../resources/mobileappcontent.md) objects and their properties.|
|[Create mobileAppContent](../api/mobileappcontent-create.md)|[mobileAppContent](../resources/mobileappcontent.md)|Create a new [mobileAppContent](../resources/mobileappcontent.md) object.|
|[Get mobileAppContent](../api/mobileappcontent-get.md)|[mobileAppContent](../resources/mobileappcontent.md)|Read the properties and relationships of a [mobileAppContent](../resources/mobileappcontent.md) object.|
|[Update mobileAppContent](../api/mobileappcontent-update.md)|[mobileAppContent](../resources/mobileappcontent.md)|Update the properties of a [mobileAppContent](../resources/mobileappcontent.md) object.|
|[Delete mobileAppContent](../api/mobileappcontent-delete.md)|None|Deletes a [mobileAppContent](../resources/mobileappcontent.md) object.|
|[List containedApps](../api/mobileappcontent-list-containedapps.md)|[mobileContainedApp](../resources/mobilecontainedapp.md) collection|Get the mobileContainedApp resources from the containedApps navigation property.|
|[Create containedApps](../api/mobileappcontent-post-containedapps.md)|[mobileContainedApp](../resources/mobilecontainedapp.md)|Create a new mobileContainedApp object.|
|[Get containedApps](../api/mobileappcontent-get-mobilecontainedapp.md)|[mobileContainedApp](../resources/mobilecontainedapp.md)|Read the properties and relationships of a [mobileContainedApp](../resources/mobilecontainedapp.md) object.|
|[Update containedApps](../api/mobileappcontent-update-containedapps.md)|[mobileContainedApp](../resources/mobilecontainedapp.md)|Update the properties of a containedApps object.|
|[Delete containedApps](../api/mobileappcontent-delete-containedapps.md)|None|Delete a [mobileContainedApp](../resources/mobilecontainedapp.md) object.|
|[List files](../api/mobileappcontent-list-files.md)|[mobileAppContentFile](../resources/mobileappcontentfile.md) collection|Get the mobileAppContentFile resources from the files navigation property.|
|[Create files](../api/mobileappcontent-post-files.md)|[mobileAppContentFile](../resources/mobileappcontentfile.md)|Create a new mobileAppContentFile object.|
|[Get files](../api/mobileappcontent-get-mobileappcontentfile.md)|[mobileAppContentFile](../resources/mobileappcontentfile.md)|Read the properties and relationships of a [mobileAppContentFile](../resources/mobileappcontentfile.md) object.|
|[Update files](../api/mobileappcontent-update-files.md)|[mobileAppContentFile](../resources/mobileappcontentfile.md)|Update the properties of a files object.|
|[Delete files](../api/mobileappcontent-delete-files.md)|None|Delete a [mobileAppContentFile](../resources/mobileappcontentfile.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|The app content version.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|containedApps|[mobileContainedApp](../resources/mobilecontainedapp.md) collection|**TODO: Add Description**|
|files|[mobileAppContentFile](../resources/mobileappcontentfile.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mobileAppContent",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileAppContent",
  "id": "String (identifier)"
}
```

