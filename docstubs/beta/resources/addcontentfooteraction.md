---
title: "addContentFooterAction resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# addContentFooterAction resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property      | Type   | Description |
| :------------ | :----- | :---------- |
| alignment     | String |             |
| fontColor     | String |             |
| fontName      | String |             |
| fontSize      | Int32  |             |
| margin        | Int32  |             |
| text          | String |             |
| uiElementName | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.addContentFooterAction",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.addContentFooterAction",
  "alignment": "left | right | center",
  "fontColor": "String",
  "fontName": "String",
  "fontSize": "Int32",
  "margin": "Int32",
  "text": "String",
  "uiElementName": "String"
}
```
