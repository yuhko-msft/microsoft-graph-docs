---
title: "classificationError resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# classificationError resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property   | Type                                                                        | Description |
| :--------- | :-------------------------------------------------------------------------- | :---------- |
| code       | String                                                                      |             |
| details    | [classifcationErrorBase](../resources/classifcationerrorbase.md) collection |             |
| innerError | [classificationInnerError](../resources/classificationinnererror.md)        |             |
| message    | String                                                                      |             |
| target     | String                                                                      |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.classificationError",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.classificationError",
  "code": "String",
  "details": [{"@odata.type": "microsoft.graph.classifcationErrorBase"}],
  "innerError": {"@odata.type": "microsoft.graph.classificationInnerError"},
  "message": "String",
  "target": "String"
}
```
