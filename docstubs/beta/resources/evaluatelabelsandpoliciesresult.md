---
title: "evaluateLabelsAndPoliciesResult resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# evaluateLabelsAndPoliciesResult resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                         | Type                                                                               | Description |
| :------------------------------- | :--------------------------------------------------------------------------------- | :---------- |
| classificationResult             | [detectedSensitiveContentWrapper](../resources/detectedsensitivecontentwrapper.md) |             |
| dataLossPreventionPoliciesResult | [dlpPoliciesJobResult](../resources/dlppoliciesjobresult.md)                       |             |
| sensitivityLabelsResult          | [evaluateLabelJobResultGroup](../resources/evaluatelabeljobresultgroup.md)         |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.evaluateLabelsAndPoliciesResult",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.evaluateLabelsAndPoliciesResult",
  "classificationResult": {"@odata.type": "microsoft.graph.detectedSensitiveContentWrapper"},
  "dataLossPreventionPoliciesResult": {"@odata.type": "microsoft.graph.dlpPoliciesJobResult"},
  "sensitivityLabelsResult": {"@odata.type": "microsoft.graph.evaluateLabelJobResultGroup"}
}
```
