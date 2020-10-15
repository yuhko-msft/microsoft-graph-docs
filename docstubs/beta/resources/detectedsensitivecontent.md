---
title: "detectedSensitiveContent resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# detectedSensitiveContent resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                 | Type                                                                            | Description |
| :----------------------- | :------------------------------------------------------------------------------ | :---------- |
| classificationAttributes | [classificationAttribute](../resources/classificationattribute.md) collection   |             |
| classificationMethod     | String                                                                          |             |
| confidence               | Int32                                                                           |             |
| displayName              | String                                                                          |             |
| id                       | Guid                                                                            |             |
| matches                  | [sensitiveContentLocation](../resources/sensitivecontentlocation.md) collection |             |
| recommendedConfidence    | Int32                                                                           |             |
| scope                    | String                                                                          |             |
| sensitiveTypeSource      | String                                                                          |             |
| uniqueCount              | Int32                                                                           |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.detectedSensitiveContent",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.detectedSensitiveContent",
  "classificationAttributes": [{"@odata.type": "microsoft.graph.classificationAttribute"}],
  "classificationMethod": "patternMatch | exactDataMatch | fingerprint | machineLearning",
  "confidence": "Int32",
  "displayName": "String",
  "id": "Guid",
  "matches": [{"@odata.type": "microsoft.graph.sensitiveContentLocation"}],
  "recommendedConfidence": "Int32",
  "scope": "fullDocument | partialDocument",
  "sensitiveTypeSource": "outOfBox | tenant",
  "uniqueCount": "Int32"
}
```
