---
title: "dlpEvaluationInput resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# dlpEvaluationInput resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                 | Type                                                                          | Description |
| :----------------------- | :---------------------------------------------------------------------------- | :---------- |
| accessScope              | String                                                                        |             |
| currentLabel             | [currentLabel](../resources/currentlabel.md)                                  |             |
| discoveredSensitiveTypes | [discoveredSensitiveType](../resources/discoveredsensitivetype.md) collection |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.dlpEvaluationInput",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.dlpEvaluationInput",
  "accessScope": "inOrganization | notInOrganization",
  "currentLabel": {"@odata.type": "microsoft.graph.currentLabel"},
  "discoveredSensitiveTypes": [{"@odata.type": "microsoft.graph.discoveredSensitiveType"}]
}
```
