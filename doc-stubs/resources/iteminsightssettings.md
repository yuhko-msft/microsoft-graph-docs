---
title: "itemInsightsSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# itemInsightsSettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List itemInsightsSettings](../api/iteminsightssettings-list.md)|[itemInsightsSettings](../resources/iteminsightssettings.md) collection|Get a list of the [itemInsightsSettings](../resources/iteminsightssettings.md) objects and their properties.|
|[Create itemInsightsSettings](../api/iteminsightssettings-create.md)|[itemInsightsSettings](../resources/iteminsightssettings.md)|Create a new [itemInsightsSettings](../resources/iteminsightssettings.md) object.|
|[Get itemInsightsSettings](../api/iteminsightssettings-get.md)|[itemInsightsSettings](../resources/iteminsightssettings.md)|Read the properties and relationships of an [itemInsightsSettings](../resources/iteminsightssettings.md) object.|
|[Update itemInsightsSettings](../api/iteminsightssettings-update.md)|[itemInsightsSettings](../resources/iteminsightssettings.md)|Update the properties of an [itemInsightsSettings](../resources/iteminsightssettings.md) object.|
|[Delete itemInsightsSettings](../api/iteminsightssettings-delete.md)|None|Deletes an [itemInsightsSettings](../resources/iteminsightssettings.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|disabledForGroup|String|**TODO: Add Description**|
|isEnabledInOrganization|Boolean|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.itemInsightsSettings",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.itemInsightsSettings",
  "isEnabledInOrganization": "Boolean",
  "disabledForGroup": "String"
}
```

