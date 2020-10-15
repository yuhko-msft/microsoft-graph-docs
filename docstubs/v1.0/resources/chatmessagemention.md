---
title: "chatMessageMention resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# chatMessageMention resource type

Namespace: microsoft.graph

## Properties

| Property    | Type                                       | Description |
| :---------- | :----------------------------------------- | :---------- |
| id          | Int32                                      |             |
| mentionText | String                                     |             |
| mentioned   | [identitySet](../resources/identityset.md) |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.chatMessageMention",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.chatMessageMention",
  "id": "Int32",
  "mentionText": "String",
  "mentioned": {"@odata.type": "microsoft.graph.identitySet"}
}
```
