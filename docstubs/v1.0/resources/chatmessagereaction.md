---
title: "chatMessageReaction resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# chatMessageReaction resource type

Namespace: microsoft.graph

## Properties

| Property        | Type                                       | Description |
| :-------------- | :----------------------------------------- | :---------- |
| createdDateTime | DateTimeOffset                             |             |
| reactionType    | String                                     |             |
| user            | [identitySet](../resources/identityset.md) |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.chatMessageReaction",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.chatMessageReaction",
  "createdDateTime": "DateTimeOffset",
  "reactionType": "String",
  "user": {"@odata.type": "microsoft.graph.identitySet"}
}
```
