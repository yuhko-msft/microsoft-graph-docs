---
title: "exclusionGroupAssignmentTarget resource type"
description: "Represents a group that should be excluded from an assignment."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# exclusionGroupAssignmentTarget resource type

Namespace: microsoft.graph

Represents a group that should be excluded from an assignment.

## Properties

| Property | Type   | Description                                        |
| :------- | :----- | :------------------------------------------------- |
| groupId  | String | The group Id that is the target of the assignment. |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.exclusionGroupAssignmentTarget",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.exclusionGroupAssignmentTarget",
  "groupId": "String"
}
```
