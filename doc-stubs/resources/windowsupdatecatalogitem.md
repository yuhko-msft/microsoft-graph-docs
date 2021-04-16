---
title: "windowsUpdateCatalogItem resource type"
description: "Windows update catalog item entity"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsUpdateCatalogItem resource type

Namespace: microsoft.graph



Windows update catalog item entity


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsUpdateCatalogItems](../api/windowsupdatecatalogitem-list.md)|[windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md) collection|Get a list of the [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md) objects and their properties.|
|[Create windowsUpdateCatalogItem](../api/windowsupdatecatalogitem-create.md)|[windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md)|Create a new [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md) object.|
|[Get windowsUpdateCatalogItem](../api/windowsupdatecatalogitem-get.md)|[windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md)|Read the properties and relationships of a [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md) object.|
|[Update windowsUpdateCatalogItem](../api/windowsupdatecatalogitem-update.md)|[windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md)|Update the properties of a [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md) object.|
|[Delete windowsUpdateCatalogItem](../api/windowsupdatecatalogitem-delete.md)|None|Deletes a [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The display name for the catalog item.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|releaseDateTime|DateTimeOffset|The date the catalog item was released|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsUpdateCatalogItem",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUpdateCatalogItem",
  "id": "String (identifier)",
  "displayName": "String",
  "releaseDateTime": "String (timestamp)"
}
```

