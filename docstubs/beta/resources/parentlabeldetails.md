---
title: "parentLabelDetails resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# parentLabelDetails resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property    | Type                                                     | Description |
| :---------- | :------------------------------------------------------- | :---------- |
| color       | String                                                   |             |
| description | String                                                   |             |
| id          | String                                                   |             |
| isActive    | Boolean                                                  |             |
| name        | String                                                   |             |
| parent      | [parentLabelDetails](../resources/parentlabeldetails.md) |             |
| sensitivity | Int32                                                    |             |
| tooltip     | String                                                   |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.parentLabelDetails",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.parentLabelDetails",
  "color": "String",
  "description": "String",
  "id": "String",
  "isActive": "Boolean",
  "name": "String",
  "parent": {"@odata.type": "microsoft.graph.parentLabelDetails"},
  "sensitivity": "Int32",
  "tooltip": "String"
}
```
