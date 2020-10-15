---
title: "longRunningOperation resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# longRunningOperation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                               | Return Type                                                | Description                                                         |
| :------------------------------------------------------------------- | :--------------------------------------------------------- | :------------------------------------------------------------------ |
| [List longRunningOperation](../api/longrunningoperation-list.md)     | [longRunningOperation](longRunningOperation.md) collection | List properties and relationships of a longRunningOperation object. |
| [Create longRunningOperation](../api/longrunningoperation-create.md) | [longRunningOperation](longRunningOperation.md)            | Create a new longRunningOperation object.                           |
| [Get longRunningOperation](../api/longrunningoperation-get.md)       | [longRunningOperation](longRunningOperation.md)            | Read properties and relationships of a longRunningOperation object. |
| [Update longRunningOperation](../api/longrunningoperation-update.md) | [longRunningOperation](longRunningOperation.md)            | Update the properties of a longRunningOperation object.             |
| [Delete longRunningOperation](../api/longrunningoperation-delete.md) |                                                            | Delete a longRunningOperation object.                               |

## Properties

| Property           | Type           | Description |
| :----------------- | :------------- | :---------- |
| createdDateTime    | DateTimeOffset |             |
| id                 | String         | Read-only.  |
| lastActionDateTime | DateTimeOffset |             |
| resourceLocation   | String         |             |
| status             | String         |             |
| statusDetail       | String         |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.longRunningOperation",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.longRunningOperation",
  "createdDateTime": "DateTimeOffset",
  "id": "String (identifier)",
  "lastActionDateTime": "DateTimeOffset",
  "resourceLocation": "String",
  "status": "notstarted | running | succeeded | failed",
  "statusDetail": "String"
}
```
