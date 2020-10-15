---
title: "publicInnerError resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# publicInnerError resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property | Type                                                              | Description |
| :------- | :---------------------------------------------------------------- | :---------- |
| code     | String                                                            |             |
| details  | [publicErrorDetail](../resources/publicerrordetail.md) collection |             |
| message  | String                                                            |             |
| target   | String                                                            |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.publicInnerError",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.publicInnerError",
  "code": "String",
  "details": [{"@odata.type": "microsoft.graph.publicErrorDetail"}],
  "message": "String",
  "target": "String"
}
```
