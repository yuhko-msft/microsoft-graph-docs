---
title: "insightsSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# insightsSettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List insightsSettings](../api/insightssettings-list.md)|[insightsSettings](../resources/insightssettings.md) collection|Get a list of the [insightsSettings](../resources/insightssettings.md) objects and their properties.|
|[Create insightsSettings](../api/insightssettings-create.md)|[insightsSettings](../resources/insightssettings.md)|Create a new [insightsSettings](../resources/insightssettings.md) object.|
|[Get insightsSettings](../api/insightssettings-get.md)|[insightsSettings](../resources/insightssettings.md)|Read the properties and relationships of an [insightsSettings](../resources/insightssettings.md) object.|
|[Update insightsSettings](../api/insightssettings-update.md)|[insightsSettings](../resources/insightssettings.md)|Update the properties of an [insightsSettings](../resources/insightssettings.md) object.|
|[Delete insightsSettings](../api/insightssettings-delete.md)|None|Deletes an [insightsSettings](../resources/insightssettings.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|disabledForGroup|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|isEnabledInOrganization|Boolean|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.insightsSettings",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.insightsSettings",
  "id": "String (identifier)",
  "isEnabledInOrganization": "Boolean",
  "disabledForGroup": "String"
}
```

