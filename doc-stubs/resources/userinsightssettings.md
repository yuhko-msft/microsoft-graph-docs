---
title: "userInsightsSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userInsightsSettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userInsightsSettings](../api/userinsightssettings-list.md)|[userInsightsSettings](../resources/userinsightssettings.md) collection|Get a list of the [userInsightsSettings](../resources/userinsightssettings.md) objects and their properties.|
|[Create userInsightsSettings](../api/userinsightssettings-create.md)|[userInsightsSettings](../resources/userinsightssettings.md)|Create a new [userInsightsSettings](../resources/userinsightssettings.md) object.|
|[Get userInsightsSettings](../api/userinsightssettings-get.md)|[userInsightsSettings](../resources/userinsightssettings.md)|Read the properties and relationships of a [userInsightsSettings](../resources/userinsightssettings.md) object.|
|[Update userInsightsSettings](../api/userinsightssettings-update.md)|[userInsightsSettings](../resources/userinsightssettings.md)|Update the properties of a [userInsightsSettings](../resources/userinsightssettings.md) object.|
|[Delete userInsightsSettings](../api/userinsightssettings-delete.md)|None|Deletes a [userInsightsSettings](../resources/userinsightssettings.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|isEnabled|Boolean|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userInsightsSettings",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userInsightsSettings",
  "isEnabled": "Boolean"
}
```

