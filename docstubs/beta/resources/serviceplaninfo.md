---
title: "servicePlanInfo resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# servicePlanInfo resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property           | Type   | Description |
| :----------------- | :----- | :---------- |
| appliesTo          | String |             |
| provisioningStatus | String |             |
| servicePlanId      | Guid   |             |
| servicePlanName    | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.servicePlanInfo",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.servicePlanInfo",
  "appliesTo": "String",
  "provisioningStatus": "String",
  "servicePlanId": "Guid",
  "servicePlanName": "String"
}
```
