---
title: "teamsTab resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# teamsTab resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List teamsTabs](../api/teamstab-list.md)|[teamsTab](../resources/teamstab.md) collection|Get a list of the [teamsTab](../resources/teamstab.md) objects and their properties.|
|[Create teamsTab](../api/teamstab-create.md)|[teamsTab](../resources/teamstab.md)|Create a new [teamsTab](../resources/teamstab.md) object.|
|[Get teamsTab](../api/teamstab-get.md)|[teamsTab](../resources/teamstab.md)|Read the properties and relationships of a [teamsTab](../resources/teamstab.md) object.|
|[Update teamsTab](../api/teamstab-update.md)|[teamsTab](../resources/teamstab.md)|Update the properties of a [teamsTab](../resources/teamstab.md) object.|
|[Delete teamsTab](../api/teamstab-delete.md)|None|Deletes a [teamsTab](../resources/teamstab.md) object.|
|[List teamsApp](../api/teamstab-list-teamsapp.md)|[teamsApp](../resources/teamsapp.md) collection|Get the teamsApp resources from the teamsApp navigation property.|
|[Add teamsApp](../api/teamstab-post-teamsapp.md)|[teamsApp](../resources/teamsapp.md)|Add teamsApp by posting to the teamsApp collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|configuration|[teamsTabConfiguration](../resources/teamstabconfiguration.md)|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|messageId|String|**TODO: Add Description**|
|sortOrderIndex|String|**TODO: Add Description**|
|teamsAppId|String|**TODO: Add Description**|
|webUrl|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|teamsApp|[teamsApp](../resources/teamsapp.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.teamsTab",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.teamsTab",
  "id": "String (identifier)",
  "configuration": {
    "@odata.type": "microsoft.graph.teamsTabConfiguration"
  },
  "displayName": "String",
  "messageId": "String",
  "sortOrderIndex": "String",
  "teamsAppId": "String",
  "webUrl": "String"
}
```

