---
title: "detectedSensitiveContentWrapper resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# detectedSensitiveContentWrapper resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property       | Type                                                                            | Description |
| :------------- | :------------------------------------------------------------------------------ | :---------- |
| classification | [detectedSensitiveContent](../resources/detectedsensitivecontent.md) collection |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.detectedSensitiveContentWrapper",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.detectedSensitiveContentWrapper",
  "classification": [{"@odata.type": "microsoft.graph.detectedSensitiveContent"}]
}
```
