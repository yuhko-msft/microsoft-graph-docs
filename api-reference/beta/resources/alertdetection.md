---
title: "alertDetection resource type"
description: "Represents detection pertinent information for alerts."
localization_priority: Normal
author: "fengzhums"
ms.prod: "security"
doc_type: resourcePageType
---

# alertDetection resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents detection pertinent information for alerts.

## Properties

| Property     | Type        | Description |
|:-------------|:------------|:------------|
|detectionType|String| Type of the detection such as IP, malware, etc. |
|method|String|Method of the detection as specified by alert providers, such as Machine Learning, Log Analytics.|
|name|String| Name or ID of the detection, as specified by alert providers. |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "optionalProperties": [

  ],
  "@odata.type": "microsoft.graph.alertDetection",
  "baseType": null
}-->

```json
{
  "detectionType": "String",
  "method": "String",
  "name": "String"
}
```

<!-- uuid: 16cd6b66-4b1a-43a1-adaf-3a886856ed98
2019-02-04 14:57:30 UTC -->
<!-- {
  "type": "#page.annotation",
  "description": "alertDetection resource",
  "keywords": "",
  "section": "documentation",
  "tocPath": ""
}-->

