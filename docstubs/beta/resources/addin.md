---
title: "addIn resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# addIn resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property   | Type                                            | Description |
| :--------- | :---------------------------------------------- | :---------- |
| id         | Guid                                            |             |
| properties | [keyValue](../resources/keyvalue.md) collection |             |
| type       | String                                          |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.addIn",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.addIn",
  "id": "Guid",
  "properties": [{"@odata.type": "microsoft.graph.keyValue"}],
  "type": "String"
}
```
