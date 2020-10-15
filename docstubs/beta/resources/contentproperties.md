---
title: "contentProperties resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# contentProperties resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property             | Type                                               | Description |
| :------------------- | :------------------------------------------------- | :---------- |
| extensions           | String collection                                  |             |
| lastModifiedBy       | String                                             |             |
| lastModifiedDateTime | DateTimeOffset                                     |             |
| metadata             | [contentMetadata](../resources/contentmetadata.md) |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.contentProperties",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.contentProperties",
  "extensions": ["String"],
  "lastModifiedBy": "String",
  "lastModifiedDateTime": "DateTimeOffset",
  "metadata": {"@odata.type": "microsoft.graph.contentMetadata"}
}
```
