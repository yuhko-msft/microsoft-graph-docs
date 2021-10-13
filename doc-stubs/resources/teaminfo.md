---
title: "teamInfo resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# teamInfo resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List teamInfoes](../api/teaminfo-list.md)|[teamInfo](../resources/teaminfo.md) collection|Get a list of the [teamInfo](../resources/teaminfo.md) objects and their properties.|
|[Get teamInfo](../api/teaminfo-get.md)|[teamInfo](../resources/teaminfo.md)|Read the properties and relationships of a [teamInfo](../resources/teaminfo.md) object.|
|[Update teamInfo](../api/teaminfo-update.md)|[teamInfo](../resources/teaminfo.md)|Update the properties of a [teamInfo](../resources/teaminfo.md) object.|
|[Delete teamInfo](../api/teaminfo-delete.md)|None|Deletes a [teamInfo](../resources/teaminfo.md) object.|
|[List team](../api/teaminfo-list-team.md)|[team](../resources/team.md) collection|Get the team resources from the team navigation property.|
|[Add team](../api/teaminfo-post-team.md)|[team](../resources/team.md)|Add team by posting to the team collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|tenantId|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|team|[team](../resources/team.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.teamInfo",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.teamInfo",
  "id": "String (identifier)",
  "tenantId": "String",
  "displayName": "String"
}
```

