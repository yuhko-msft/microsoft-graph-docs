---
title: "windowsFeatureUpdateCatalogItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsFeatureUpdateCatalogItem resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsFeatureUpdateCatalogItems](../api/intune-windowsfeatureupdatecatalogitem-list.md)|[windowsFeatureUpdateCatalogItem](../resources/intune-windowsfeatureupdatecatalogitem.md) collection|Get a list of the [windowsFeatureUpdateCatalogItem](../resources/windowsfeatureupdatecatalogitem.md) objects and their properties.|
|[Create windowsFeatureUpdateCatalogItem](../api/intune-windowsfeatureupdatecatalogitem-create.md)|[windowsFeatureUpdateCatalogItem](../resources/intune-windowsfeatureupdatecatalogitem.md)|Create a new [windowsFeatureUpdateCatalogItem](../resources/intune-windowsfeatureupdatecatalogitem.md) object.|
|[Get windowsFeatureUpdateCatalogItem](../api/intune-windowsfeatureupdatecatalogitem-get.md)|[windowsFeatureUpdateCatalogItem](../resources/intune-windowsfeatureupdatecatalogitem.md)|Read the properties and relationships of a [windowsFeatureUpdateCatalogItem](../resources/intune-windowsfeatureupdatecatalogitem.md) object.|
|[Update windowsFeatureUpdateCatalogItem](../api/intune-windowsfeatureupdatecatalogitem-update.md)|[windowsFeatureUpdateCatalogItem](../resources/intune-windowsfeatureupdatecatalogitem.md)|Update the properties of a [windowsFeatureUpdateCatalogItem](../resources/intune-windowsfeatureupdatecatalogitem.md) object.|
|[Delete windowsFeatureUpdateCatalogItem](../api/intune-windowsfeatureupdatecatalogitem-delete.md)|None|Deletes a [windowsFeatureUpdateCatalogItem](../resources/intune-windowsfeatureupdatecatalogitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Inherited from [windowsUpdateCatalogItem](../resources/intune-windowsupdatecatalogitem.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|releaseDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [windowsUpdateCatalogItem](../resources/intune-windowsupdatecatalogitem.md)|
|version|String|**TODO: Add Description**|

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

