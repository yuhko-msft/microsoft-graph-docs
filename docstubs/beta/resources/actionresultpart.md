---
title: "actionResultPart resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# actionResultPart resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property | Type                                       | Description |
| :------- | :----------------------------------------- | :---------- |
| error    | [publicError](../resources/publicerror.md) |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.actionResultPart",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.actionResultPart",
  "error": {"@odata.type": "microsoft.graph.publicError"}
}
```
