---
title: "addWatermarkAction resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# addWatermarkAction resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property      | Type   | Description |
| :------------ | :----- | :---------- |
| fontColor     | String |             |
| fontName      | String |             |
| fontSize      | Int32  |             |
| layout        | String |             |
| text          | String |             |
| uiElementName | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.addWatermarkAction",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.addWatermarkAction",
  "fontColor": "String",
  "fontName": "String",
  "fontSize": "Int32",
  "layout": "horizontal | diagonal",
  "text": "String",
  "uiElementName": "String"
}
```
