---
title: "teamInfo resource type"
description: "A teamInfo represents a team with fewer properties."
author: "devjha-ms"
ms.localizationpriority: high
ms.prod: "microsoft-teams"
doc_type: resourcePageType
---

# teamInfo resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A teamInfo represents a [team](team.md) with basic information.


## Properties

| Property | Type | Description |
|:---------------|:--------|:----------|
|displayName|string| The name of the team. |
|tenantId |string | The ID of the Azure Active Directory tenant. |


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
  "id": "string (identifier)",
  "displayName": "string",
  "tenantId": "string"
}
```

## See also
- [associatedTeamInfo](associatedTeamInfo.md)
- [sharedWithChannelTeamInfo](sharedWithChannelTeamInfo.md)
<!-- uuid: 8fcb5dbc-d5aa-4681-8e31-b001d5168d79
2021-10-04 14:57:30 UTC -->
<!--
{
  "type": "#page.annotation",
  "description": "teamInfo resource",
  "keywords": "",
  "section": "documentation",
  "tocPath": "",
  "suppressions": []
}
-->



