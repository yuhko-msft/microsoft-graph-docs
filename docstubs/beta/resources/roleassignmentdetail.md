---
title: "roleAssignmentDetail resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# roleAssignmentDetail resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property             | Type    | Description |
| :------------------- | :------ | :---------- |
| isDirect             | Boolean |             |
| principalDisplayName | String  |             |
| principalId          | String  |             |
| principalType        | String  |             |
| roleAssignmentId     | String  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.roleAssignmentDetail",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.roleAssignmentDetail",
  "isDirect": "Boolean",
  "principalDisplayName": "String",
  "principalId": "String",
  "principalType": "String",
  "roleAssignmentId": "String"
}
```
