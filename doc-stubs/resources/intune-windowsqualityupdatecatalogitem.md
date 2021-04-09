---
title: "windowsQualityUpdateCatalogItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsQualityUpdateCatalogItem resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsQualityUpdateCatalogItems](../api/intune-windowsqualityupdatecatalogitem-list.md)|[windowsQualityUpdateCatalogItem](../resources/intune-windowsqualityupdatecatalogitem.md) collection|Get a list of the [windowsQualityUpdateCatalogItem](../resources/windowsqualityupdatecatalogitem.md) objects and their properties.|
|[Create windowsQualityUpdateCatalogItem](../api/intune-windowsqualityupdatecatalogitem-create.md)|[windowsQualityUpdateCatalogItem](../resources/intune-windowsqualityupdatecatalogitem.md)|Create a new [windowsQualityUpdateCatalogItem](../resources/intune-windowsqualityupdatecatalogitem.md) object.|
|[Get windowsQualityUpdateCatalogItem](../api/intune-windowsqualityupdatecatalogitem-get.md)|[windowsQualityUpdateCatalogItem](../resources/intune-windowsqualityupdatecatalogitem.md)|Read the properties and relationships of a [windowsQualityUpdateCatalogItem](../resources/intune-windowsqualityupdatecatalogitem.md) object.|
|[Update windowsQualityUpdateCatalogItem](../api/intune-windowsqualityupdatecatalogitem-update.md)|[windowsQualityUpdateCatalogItem](../resources/intune-windowsqualityupdatecatalogitem.md)|Update the properties of a [windowsQualityUpdateCatalogItem](../resources/intune-windowsqualityupdatecatalogitem.md) object.|
|[Delete windowsQualityUpdateCatalogItem](../api/intune-windowsqualityupdatecatalogitem-delete.md)|None|Deletes a [windowsQualityUpdateCatalogItem](../resources/intune-windowsqualityupdatecatalogitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|classification|windowsQualityUpdateClassification|**TODO: Add Description**. Possible values are: `all`, `security`, `nonSecurity`.|
|displayName|String|**TODO: Add Description** Inherited from [windowsUpdateCatalogItem](../resources/intune-windowsupdatecatalogitem.md)|
|endOfSupportDate|DateTimeOffset|**TODO: Add Description** Inherited from [windowsUpdateCatalogItem](../resources/intune-windowsupdatecatalogitem.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isExpeditable|Boolean|**TODO: Add Description**|
|kbArticleId|String|**TODO: Add Description**|
|releaseDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [windowsUpdateCatalogItem](../resources/intune-windowsupdatecatalogitem.md)|

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
  "endOfSupportDate": "String (timestamp)",
  "kbArticleId": "String",
  "classification": "String",
  "isExpeditable": "Boolean"
}
```

