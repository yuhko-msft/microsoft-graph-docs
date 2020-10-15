---
title: "patternedRecurrence resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# patternedRecurrence resource type

Namespace: microsoft.graph

## Properties

| Property | Type                                                   | Description |
| :------- | :----------------------------------------------------- | :---------- |
| pattern  | [recurrencePattern](../resources/recurrencepattern.md) |             |
| range    | [recurrenceRange](../resources/recurrencerange.md)     |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.patternedRecurrence",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.patternedRecurrence",
  "pattern": {"@odata.type": "microsoft.graph.recurrencePattern"},
  "range": {"@odata.type": "microsoft.graph.recurrenceRange"}
}
```
