---
title: "dlpEvaluatePoliciesRequest resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# dlpEvaluatePoliciesRequest resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property         | Type                                                     | Description |
| :--------------- | :------------------------------------------------------- | :---------- |
| evaluationInput  | [dlpEvaluationInput](../resources/dlpevaluationinput.md) |             |
| notificationInfo | [dlpNotification](../resources/dlpnotification.md)       |             |
| target           | String                                                   |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.dlpEvaluatePoliciesRequest",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.dlpEvaluatePoliciesRequest",
  "evaluationInput": {"@odata.type": "microsoft.graph.dlpEvaluationInput"},
  "notificationInfo": {"@odata.type": "microsoft.graph.dlpNotification"},
  "target": "String"
}
```
