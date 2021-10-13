---
title: "associatedTeamInfo resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# associatedTeamInfo resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [teamInfo](../resources/teaminfo.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List associatedTeamInfoes](../api/associatedteaminfo-list.md)|[associatedTeamInfo](../resources/associatedteaminfo.md) collection|Get a list of the [associatedTeamInfo](../resources/associatedteaminfo.md) objects and their properties.|
|[Create associatedTeamInfo](../api/userteamwork-post-associatedteams.md)|[associatedTeamInfo](../resources/associatedteaminfo.md)|Create a new [associatedTeamInfo](../resources/associatedteaminfo.md) object.|
|[Get associatedTeamInfo](../api/associatedteaminfo-get.md)|[associatedTeamInfo](../resources/associatedteaminfo.md)|Read the properties and relationships of an [associatedTeamInfo](../resources/associatedteaminfo.md) object.|
|[Update associatedTeamInfo](../api/associatedteaminfo-update.md)|[associatedTeamInfo](../resources/associatedteaminfo.md)|Update the properties of an [associatedTeamInfo](../resources/associatedteaminfo.md) object.|
|[Delete associatedTeamInfo](../api/associatedteaminfo-delete.md)|None|Deletes an [associatedTeamInfo](../resources/associatedteaminfo.md) object.|
|[List team](../api/associatedteaminfo-list-team.md)|[team](../resources/team.md) collection|Get the team resources from the team navigation property.|
|[Add team](../api/associatedteaminfo-post-team.md)|[team](../resources/team.md)|Add team by posting to the team collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Inherited from [teamInfo](../resources/teaminfo.md).|
|id|String|**TODO: Add Description** Inherited from [teamInfo](../resources/teaminfo.md).|
|tenantId|String|**TODO: Add Description** Inherited from [teamInfo](../resources/teaminfo.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|team|[team](../resources/team.md)|**TODO: Add Description** Inherited from [teamInfo](../resources/teaminfo.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.associatedTeamInfo",
  "baseType": "Microsoft.Teams.GraphSvc.teamInfo",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.associatedTeamInfo",
  "id": "String (identifier)",
  "tenantId": "String",
  "displayName": "String"
}
```

