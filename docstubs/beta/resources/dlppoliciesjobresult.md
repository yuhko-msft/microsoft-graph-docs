---
title: "dlpPoliciesJobResult resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# dlpPoliciesJobResult resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property      | Type                                                          | Description |
| :------------ | :------------------------------------------------------------ | :---------- |
| matchingRules | [matchingDlpRule](../resources/matchingdlprule.md) collection |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.dlpPoliciesJobResult",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.dlpPoliciesJobResult",
  "matchingRules": [{"@odata.type": "microsoft.graph.matchingDlpRule"}]
}
```
