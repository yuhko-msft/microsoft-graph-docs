---
title: "informationProtectionContentLabel resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# informationProtectionContentLabel resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property         | Type                                         | Description |
| :--------------- | :------------------------------------------- | :---------- |
| assignmentMethod | String                                       |             |
| creationDateTime | DateTimeOffset                               |             |
| label            | [labelDetails](../resources/labeldetails.md) |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.informationProtectionContentLabel",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.informationProtectionContentLabel",
  "assignmentMethod": "standard | privileged | auto",
  "creationDateTime": "DateTimeOffset",
  "label": {"@odata.type": "microsoft.graph.labelDetails"}
}
```
