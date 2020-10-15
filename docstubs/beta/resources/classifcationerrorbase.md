---
title: "classifcationErrorBase resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# classifcationErrorBase resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property   | Type                                                                 | Description |
| :--------- | :------------------------------------------------------------------- | :---------- |
| code       | String                                                               |             |
| innerError | [classificationInnerError](../resources/classificationinnererror.md) |             |
| message    | String                                                               |             |
| target     | String                                                               |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.classifcationErrorBase",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.classifcationErrorBase",
  "code": "String",
  "innerError": {"@odata.type": "microsoft.graph.classificationInnerError"},
  "message": "String",
  "target": "String"
}
```
