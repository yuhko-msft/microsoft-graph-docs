---
title: "identitySet resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# identitySet resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property    | Type                                 | Description |
| :---------- | :----------------------------------- | :---------- |
| application | [identity](../resources/identity.md) |             |
| device      | [identity](../resources/identity.md) |             |
| user        | [identity](../resources/identity.md) |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.identitySet",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.identitySet",
  "application": {"@odata.type": "microsoft.graph.identity"},
  "device": {"@odata.type": "microsoft.graph.identity"},
  "user": {"@odata.type": "microsoft.graph.identity"}
}
```
