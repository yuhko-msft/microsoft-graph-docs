---
title: "domainState resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# domainState resource type

Namespace: microsoft.graph

## Properties

| Property           | Type           | Description |
| :----------------- | :------------- | :---------- |
| lastActionDateTime | DateTimeOffset |             |
| operation          | String         |             |
| status             | String         |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.domainState",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.domainState",
  "lastActionDateTime": "DateTimeOffset",
  "operation": "String",
  "status": "String"
}
```
