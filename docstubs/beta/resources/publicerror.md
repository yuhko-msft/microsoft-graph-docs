---
title: "publicError resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# publicError resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property   | Type                                                              | Description |
| :--------- | :---------------------------------------------------------------- | :---------- |
| code       | String                                                            |             |
| details    | [publicErrorDetail](../resources/publicerrordetail.md) collection |             |
| innerError | [publicInnerError](../resources/publicinnererror.md)              |             |
| message    | String                                                            |             |
| target     | String                                                            |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.publicError",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.publicError",
  "code": "String",
  "details": [{"@odata.type": "microsoft.graph.publicErrorDetail"}],
  "innerError": {"@odata.type": "microsoft.graph.publicInnerError"},
  "message": "String",
  "target": "String"
}
```
