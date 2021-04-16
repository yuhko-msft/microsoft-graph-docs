---
title: "windowsFeatureUpdateCatalogItem resource type"
description: "Windows update catalog item entity"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsFeatureUpdateCatalogItem resource type

Namespace: microsoft.graph



Windows update catalog item entity


Inherits from [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsFeatureUpdateCatalogItems](../api/windowsfeatureupdatecatalogitem-list.md)|[windowsFeatureUpdateCatalogItem](../resources/windowsfeatureupdatecatalogitem.md) collection|Get a list of the [windowsFeatureUpdateCatalogItem](../resources/windowsfeatureupdatecatalogitem.md) objects and their properties.|
|[Create windowsFeatureUpdateCatalogItem](../api/windowsfeatureupdatecatalogitem-create.md)|[windowsFeatureUpdateCatalogItem](../resources/windowsfeatureupdatecatalogitem.md)|Create a new [windowsFeatureUpdateCatalogItem](../resources/windowsfeatureupdatecatalogitem.md) object.|
|[Get windowsFeatureUpdateCatalogItem](../api/windowsfeatureupdatecatalogitem-get.md)|[windowsFeatureUpdateCatalogItem](../resources/windowsfeatureupdatecatalogitem.md)|Read the properties and relationships of a [windowsFeatureUpdateCatalogItem](../resources/windowsfeatureupdatecatalogitem.md) object.|
|[Update windowsFeatureUpdateCatalogItem](../api/windowsfeatureupdatecatalogitem-update.md)|[windowsFeatureUpdateCatalogItem](../resources/windowsfeatureupdatecatalogitem.md)|Update the properties of a [windowsFeatureUpdateCatalogItem](../resources/windowsfeatureupdatecatalogitem.md) object.|
|[Delete windowsFeatureUpdateCatalogItem](../api/windowsfeatureupdatecatalogitem-delete.md)|None|Deletes a [windowsFeatureUpdateCatalogItem](../resources/windowsfeatureupdatecatalogitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The display name for the catalog item. Inherited from [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|releaseDateTime|DateTimeOffset|The date the catalog item was released Inherited from [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md)|
|version|String|The feature update version|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsFeatureUpdateCatalogItem",
  "baseType": "microsoft.graph.windowsUpdateCatalogItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsFeatureUpdateCatalogItem",
  "id": "String (identifier)",
  "displayName": "String",
  "releaseDateTime": "String (timestamp)",
  "version": "String"
}
```

