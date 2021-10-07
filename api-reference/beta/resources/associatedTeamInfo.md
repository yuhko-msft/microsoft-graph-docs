---
title: "associatedTeamInfo resource type"
description: "A associatedTeamInfo represents a team that is associated with a user."
author: "devjha-ms"
ms.localizationpriority: high
ms.prod: "microsoft-teams"
doc_type: resourcePageType
---

# associatedTeamInfo resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A associatedTeamInfo represents a [team](team.md) that is associated with a user. 
Today, there are two types of association a user could have with a team:
  1. User can be a direct member of a [team](../resources/team.md).
  2. User can be a member of [shared channel](../resources/channel.md) that is hosted inside a [team](../resources/team.md).


## Properties

| Property | Type | Description |
|:---------------|:--------|:----------|
|displayName|string| The name of the team. |
|tenantId |string | The ID of the Azure Active Directory tenant. |


## JSON representation

The following is a JSON representation of the resource.

>**Note:** If the team is of type class, a **classSettings** property is applied on the team.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.associatedTeamInfo",
  "baseType": "microsoft.graph.teamInfo",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.associatedTeamInfo",
  "id": "string (identifier)",
  "displayName": "string",
  "tenantId": "string"
}
```

## See also
- [List associated teams](../api/userteamwork-list-associatedteams.md)
- [Get team](../api/team-get.md)
<!-- uuid: 8fcb5dbc-d5aa-4681-8e31-b001d5168d79
2021-10-04 14:57:30 UTC -->
<!--
{
  "type": "#page.annotation",
  "description": "associatedTeamInfo resource",
  "keywords": "",
  "section": "documentation",
  "tocPath": "",
  "suppressions": []
}
-->



