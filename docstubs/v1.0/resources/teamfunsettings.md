---
title: "teamFunSettings resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# teamFunSettings resource type

Namespace: microsoft.graph

## Properties

| Property              | Type    | Description |
| :-------------------- | :------ | :---------- |
| allowCustomMemes      | Boolean |             |
| allowGiphy            | Boolean |             |
| allowStickersAndMemes | Boolean |             |
| giphyContentRating    | String  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.teamFunSettings",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.teamFunSettings",
  "allowCustomMemes": "Boolean",
  "allowGiphy": "Boolean",
  "allowStickersAndMemes": "Boolean",
  "giphyContentRating": "strict | moderate | unknownFutureValue"
}
```
