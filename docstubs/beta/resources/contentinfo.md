---
title: "contentInfo resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# contentInfo resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property   | Type                                                    | Description |
| :--------- | :------------------------------------------------------ | :---------- |
| format     | String                                                  |             |
| identifier | String                                                  |             |
| metadata   | [keyValuePair](../resources/keyvaluepair.md) collection |             |
| state      | String                                                  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.contentInfo",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.contentInfo",
  "format": "default | email",
  "identifier": "String",
  "metadata": [{"@odata.type": "microsoft.graph.keyValuePair"}],
  "state": "rest | motion | use"
}
```
