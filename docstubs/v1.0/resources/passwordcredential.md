---
title: "passwordCredential resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# passwordCredential resource type

Namespace: microsoft.graph

## Properties

| Property            | Type           | Description |
| :------------------ | :------------- | :---------- |
| customKeyIdentifier | Binary         |             |
| displayName         | String         |             |
| endDateTime         | DateTimeOffset |             |
| hint                | String         |             |
| keyId               | Guid           |             |
| secretText          | String         |             |
| startDateTime       | DateTimeOffset |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.passwordCredential",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.passwordCredential",
  "customKeyIdentifier": "Binary",
  "displayName": "String",
  "endDateTime": "DateTimeOffset",
  "hint": "String",
  "keyId": "Guid",
  "secretText": "String",
  "startDateTime": "DateTimeOffset"
}
```
