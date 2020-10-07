---
title: "remoteLockActionResult resource type"
description: "Lock action result with a pin to unlock"
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# remoteLockActionResult resource type

Namespace: microsoft.graph

Lock action result with a pin to unlock

## Properties

| Property            | Type           | Description                            |
| :------------------ | :------------- | :------------------------------------- |
| actionName          | String         | Action name                            |
| actionState         | String         | State of the action                    |
| lastUpdatedDateTime | DateTimeOffset | Time the action state was last updated |
| startDateTime       | DateTimeOffset | Time the action was initiated          |
| unlockPin           | String         | Pin to unlock the client               |
| startDateTimes      | DateTimeOffset | Time the action was initiated.         |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.remoteLockActionResult",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.remoteLockActionResult",
  "actionName": "String",
  "actionState": "none | pending | canceled | active | done | failed | notSupported",
  "lastUpdatedDateTime": "DateTimeOffset",
  "startDateTime": "DateTimeOffset",
  "unlockPin": "String"
}
```