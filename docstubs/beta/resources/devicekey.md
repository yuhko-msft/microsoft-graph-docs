---
title: "deviceKey resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# deviceKey resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property    | Type   | Description |
| :---------- | :----- | :---------- |
| deviceId    | Guid   |             |
| keyMaterial | Binary |             |
| keyType     | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceKey",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.deviceKey",
  "deviceId": "Guid",
  "keyMaterial": "Binary",
  "keyType": "String"
}
```
