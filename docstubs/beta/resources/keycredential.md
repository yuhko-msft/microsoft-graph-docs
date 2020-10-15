---
title: "keyCredential resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# keyCredential resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property            | Type           | Description |
| :------------------ | :------------- | :---------- |
| customKeyIdentifier | Binary         |             |
| displayName         | String         |             |
| endDateTime         | DateTimeOffset |             |
| key                 | Binary         |             |
| keyId               | Guid           |             |
| startDateTime       | DateTimeOffset |             |
| type                | String         |             |
| usage               | String         |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.keyCredential",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.keyCredential",
  "customKeyIdentifier": "Binary",
  "displayName": "String",
  "endDateTime": "DateTimeOffset",
  "key": "Binary",
  "keyId": "Guid",
  "startDateTime": "DateTimeOffset",
  "type": "String",
  "usage": "String"
}
```
