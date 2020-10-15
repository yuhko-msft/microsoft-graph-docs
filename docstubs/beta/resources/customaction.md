---
title: "customAction resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# customAction resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property   | Type                                                    | Description |
| :--------- | :------------------------------------------------------ | :---------- |
| name       | String                                                  |             |
| properties | [keyValuePair](../resources/keyvaluepair.md) collection |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.customAction",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.customAction",
  "name": "String",
  "properties": [{"@odata.type": "microsoft.graph.keyValuePair"}]
}
```
