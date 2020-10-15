---
title: "mimeContent resource type"
description: "Contains properties for a generic mime content."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# mimeContent resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Contains properties for a generic mime content.

## Properties

| Property | Type   | Description                                      |
| :------- | :----- | :----------------------------------------------- |
| type     | String | Indicates the content mime type.                 |
| value    | Binary | The byte array that contains the actual content. |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.mimeContent",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.mimeContent",
  "type": "String",
  "value": "Binary"
}
```
