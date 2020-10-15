---
title: "attachmentItem resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# attachmentItem resource type

Namespace: microsoft.graph

## Properties

| Property       | Type    | Description |
| :------------- | :------ | :---------- |
| attachmentType | String  |             |
| contentType    | String  |             |
| isInline       | Boolean |             |
| name           | String  |             |
| size           | Int64   |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.attachmentItem",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.attachmentItem",
  "attachmentType": "file | item | reference",
  "contentType": "String",
  "isInline": "Boolean",
  "name": "String",
  "size": "Int64"
}
```
