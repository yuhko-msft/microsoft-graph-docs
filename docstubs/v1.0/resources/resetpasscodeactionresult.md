---
title: "resetPasscodeActionResult resource type"
description: "Reset passcode action result"
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# resetPasscodeActionResult resource type

Namespace: microsoft.graph

Reset passcode action result

## Properties

| Property            | Type           | Description                             |
| :------------------ | :------------- | :-------------------------------------- |
| actionName          | String         | Action name                             |
| actionState         | String         | State of the action                     |
| lastUpdatedDateTime | DateTimeOffset | Time the action state was last updated  |
| passcode            | String         | Newly generated passcode for the device |
| startDateTime       | DateTimeOffset | Time the action was initiated           |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.resetPasscodeActionResult",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.resetPasscodeActionResult",
  "actionName": "String",
  "actionState": "none | pending | canceled | active | done | failed | notSupported",
  "lastUpdatedDateTime": "DateTimeOffset",
  "passcode": "String",
  "startDateTime": "DateTimeOffset"
}
```