---
title: "teamMessagingSettings resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# teamMessagingSettings resource type

Namespace: microsoft.graph

## Properties

| Property                 | Type    | Description |
| :----------------------- | :------ | :---------- |
| allowChannelMentions     | Boolean |             |
| allowOwnerDeleteMessages | Boolean |             |
| allowTeamMentions        | Boolean |             |
| allowUserDeleteMessages  | Boolean |             |
| allowUserEditMessages    | Boolean |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.teamMessagingSettings",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.teamMessagingSettings",
  "allowChannelMentions": "Boolean",
  "allowOwnerDeleteMessages": "Boolean",
  "allowTeamMentions": "Boolean",
  "allowUserDeleteMessages": "Boolean",
  "allowUserEditMessages": "Boolean"
}
```
