---
title: "aadUserConversationMemberResult resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# aadUserConversationMemberResult resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property | Type                                       | Description |
| :------- | :----------------------------------------- | :---------- |
| error    | [publicError](../resources/publicerror.md) |             |
| userId   | String                                     |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.aadUserConversationMemberResult",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.aadUserConversationMemberResult",
  "error": {"@odata.type": "microsoft.graph.publicError"},
  "userId": "String"
}
```
