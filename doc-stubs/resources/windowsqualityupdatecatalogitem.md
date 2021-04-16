---
title: "windowsQualityUpdateCatalogItem resource type"
description: "Windows update catalog item entity"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsQualityUpdateCatalogItem resource type

Namespace: microsoft.graph



Windows update catalog item entity


Inherits from [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsQualityUpdateCatalogItems](../api/windowsqualityupdatecatalogitem-list.md)|[windowsQualityUpdateCatalogItem](../resources/windowsqualityupdatecatalogitem.md) collection|Get a list of the [windowsQualityUpdateCatalogItem](../resources/windowsqualityupdatecatalogitem.md) objects and their properties.|
|[Create windowsQualityUpdateCatalogItem](../api/windowsqualityupdatecatalogitem-create.md)|[windowsQualityUpdateCatalogItem](../resources/windowsqualityupdatecatalogitem.md)|Create a new [windowsQualityUpdateCatalogItem](../resources/windowsqualityupdatecatalogitem.md) object.|
|[Get windowsQualityUpdateCatalogItem](../api/windowsqualityupdatecatalogitem-get.md)|[windowsQualityUpdateCatalogItem](../resources/windowsqualityupdatecatalogitem.md)|Read the properties and relationships of a [windowsQualityUpdateCatalogItem](../resources/windowsqualityupdatecatalogitem.md) object.|
|[Update windowsQualityUpdateCatalogItem](../api/windowsqualityupdatecatalogitem-update.md)|[windowsQualityUpdateCatalogItem](../resources/windowsqualityupdatecatalogitem.md)|Update the properties of a [windowsQualityUpdateCatalogItem](../resources/windowsqualityupdatecatalogitem.md) object.|
|[Delete windowsQualityUpdateCatalogItem](../api/windowsqualityupdatecatalogitem-delete.md)|None|Deletes a [windowsQualityUpdateCatalogItem](../resources/windowsqualityupdatecatalogitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|classification|windowsQualityUpdateClassification|Classification of the quality update. Possible values are: `all`, `security`, `nonSecurity`.|
|displayName|String|The display name for the catalog item. Inherited from [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isExpeditable|Boolean|Flag indicating if update qualifies for expedite|
|kbArticleId|String|Knowledge base article id|
|releaseDateTime|DateTimeOffset|The date the catalog item was released Inherited from [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsQualityUpdateCatalogItem",
  "baseType": "microsoft.graph.windowsUpdateCatalogItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsQualityUpdateCatalogItem",
  "id": "String (identifier)",
  "displayName": "String",
  "releaseDateTime": "String (timestamp)",
  "classification": "String",
  "isExpeditable": "Boolean",
  "kbArticleId": "String"
}
```

