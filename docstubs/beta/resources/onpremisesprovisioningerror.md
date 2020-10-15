---
title: "onPremisesProvisioningError resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# onPremisesProvisioningError resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property             | Type           | Description |
| :------------------- | :------------- | :---------- |
| category             | String         |             |
| occurredDateTime     | DateTimeOffset |             |
| propertyCausingError | String         |             |
| value                | String         |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.onPremisesProvisioningError",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.onPremisesProvisioningError",
  "category": "String",
  "occurredDateTime": "DateTimeOffset",
  "propertyCausingError": "String",
  "value": "String"
}
```
