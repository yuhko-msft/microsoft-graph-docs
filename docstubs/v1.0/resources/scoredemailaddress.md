---
title: "scoredEmailAddress resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# scoredEmailAddress resource type

Namespace: microsoft.graph

## Properties

| Property            | Type   | Description |
| :------------------ | :----- | :---------- |
| address             | String |             |
| itemId              | String |             |
| relevanceScore      | Double |             |
| selectionLikelihood | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.scoredEmailAddress",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.scoredEmailAddress",
  "address": "String",
  "itemId": "String",
  "relevanceScore": "Double",
  "selectionLikelihood": "notSpecified | high"
}
```
