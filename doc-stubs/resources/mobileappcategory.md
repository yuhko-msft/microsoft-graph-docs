---
title: "mobileAppCategory resource type"
description: "Contains properties for a single Intune app category."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileAppCategory resource type

Namespace: microsoft.graph

Contains properties for a single Intune app category.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List categories](../api/win32lobapp-list-categories.md)|[mobileAppCategory](../resources/mobileappcategory.md) collection|Get the mobileAppCategory resources from the categories navigation property.|
|[Add categories](../api/win32lobapp-post-categories.md)|[mobileAppCategory](../resources/mobileappcategory.md)|Add categories by posting to the categories collection.|
|[Remove categories](../api/win32lobapp-delete-categories.md)|None|Remove a [mobileAppCategory](../resources/intune-mobileappcategory.md) object.|
|[List mobileAppCategories](../api/mobileappcategory-list.md)|[mobileAppCategory](../resources/mobileappcategory.md) collection|Get a list of the [mobileAppCategory](../resources/mobileappcategory.md) objects and their properties.|
|[Create mobileAppCategory](../api/mobileappcategory-create.md)|[mobileAppCategory](../resources/mobileappcategory.md)|Create a new [mobileAppCategory](../resources/mobileappcategory.md) object.|
|[Get mobileAppCategory](../api/mobileappcategory-get.md)|[mobileAppCategory](../resources/mobileappcategory.md)|Read the properties and relationships of a [mobileAppCategory](../resources/mobileappcategory.md) object.|
|[Update mobileAppCategory](../api/mobileappcategory-update.md)|[mobileAppCategory](../resources/mobileappcategory.md)|Update the properties of a [mobileAppCategory](../resources/mobileappcategory.md) object.|
|[Delete mobileAppCategory](../api/mobileappcategory-delete.md)|None|Deletes a [mobileAppCategory](../resources/mobileappcategory.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The name of the app category.|
|id|String|The key of the entity.|
|lastModifiedDateTime|DateTimeOffset|The date and time the mobileAppCategory was last modified.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mobileAppCategory",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileAppCategory",
  "id": "String (identifier)",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

