---
title: "deviceRestrictionAction resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# deviceRestrictionAction resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property          | Type              | Description |
| :---------------- | :---------------- | :---------- |
| action            | String            |             |
| message           | String            |             |
| restrictionAction | String            |             |
| triggers          | String collection |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceRestrictionAction",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.deviceRestrictionAction",
  "action": "notifyUser | blockAccess | deviceRestriction",
  "message": "String",
  "restrictionAction": "warn | audit | block",
  "triggers": ["copyPaste | copyToNetworkShare | copyToRemovableMedia | screenCapture | print | cloudEgress | unallowedApps"]
}
```
