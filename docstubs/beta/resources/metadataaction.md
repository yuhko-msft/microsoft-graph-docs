---
title: "metadataAction resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# metadataAction resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property         | Type                                                    | Description |
| :--------------- | :------------------------------------------------------ | :---------- |
| metadataToAdd    | [keyValuePair](../resources/keyvaluepair.md) collection |             |
| metadataToRemove | String collection                                       |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.metadataAction",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.metadataAction",
  "metadataToAdd": [{"@odata.type": "microsoft.graph.keyValuePair"}],
  "metadataToRemove": ["String"]
}
```
