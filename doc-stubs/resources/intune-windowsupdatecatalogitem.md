---
title: "windowsUpdateCatalogItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsUpdateCatalogItem resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsUpdateCatalogItems](../api/intune-windowsupdatecatalogitem-list.md)|[windowsUpdateCatalogItem](../resources/intune-windowsupdatecatalogitem.md) collection|Get a list of the [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md) objects and their properties.|
|[Create windowsUpdateCatalogItem](../api/intune-windowsupdatecatalogitem-create.md)|[windowsUpdateCatalogItem](../resources/intune-windowsupdatecatalogitem.md)|Create a new [windowsUpdateCatalogItem](../resources/intune-windowsupdatecatalogitem.md) object.|
|[Get windowsUpdateCatalogItem](../api/intune-windowsupdatecatalogitem-get.md)|[windowsUpdateCatalogItem](../resources/intune-windowsupdatecatalogitem.md)|Read the properties and relationships of a [windowsUpdateCatalogItem](../resources/intune-windowsupdatecatalogitem.md) object.|
|[Update windowsUpdateCatalogItem](../api/intune-windowsupdatecatalogitem-update.md)|[windowsUpdateCatalogItem](../resources/intune-windowsupdatecatalogitem.md)|Update the properties of a [windowsUpdateCatalogItem](../resources/intune-windowsupdatecatalogitem.md) object.|
|[Delete windowsUpdateCatalogItem](../api/intune-windowsupdatecatalogitem-delete.md)|None|Deletes a [windowsUpdateCatalogItem](../resources/intune-windowsupdatecatalogitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|endOfSupportDate|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|releaseDateTime|DateTimeOffset|**TODO: Add Description**|

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
  "releaseDateTime": "String (timestamp)",
  "endOfSupportDate": "String (timestamp)"
}
```

