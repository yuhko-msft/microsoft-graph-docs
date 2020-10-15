---
title: "teamsAsyncOperation resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# teamsAsyncOperation resource type

Namespace: microsoft.graph

## Methods

| Method                                                             | Return Type                                              | Description                                                        |
| :----------------------------------------------------------------- | :------------------------------------------------------- | :----------------------------------------------------------------- |
| [List teamsAsyncOperation](../api/teamsasyncoperation-list.md)     | [teamsAsyncOperation](teamsAsyncOperation.md) collection | List properties and relationships of a teamsAsyncOperation object. |
| [Create teamsAsyncOperation](../api/teamsasyncoperation-create.md) | [teamsAsyncOperation](teamsAsyncOperation.md)            | Create a new teamsAsyncOperation object.                           |
| [Get teamsAsyncOperation](../api/teamsasyncoperation-get.md)       | [teamsAsyncOperation](teamsAsyncOperation.md)            | Read properties and relationships of a teamsAsyncOperation object. |
| [Update teamsAsyncOperation](../api/teamsasyncoperation-update.md) | [teamsAsyncOperation](teamsAsyncOperation.md)            | Update the properties of a teamsAsyncOperation object.             |
| [Delete teamsAsyncOperation](../api/teamsasyncoperation-delete.md) |                                                          | Delete a teamsAsyncOperation object.                               |

## Properties

| Property               | Type                                             | Description |
| :--------------------- | :----------------------------------------------- | :---------- |
| attemptsCount          | Int32                                            |             |
| createdDateTime        | DateTimeOffset                                   |             |
| error                  | [operationError](../resources/operationerror.md) |             |
| id                     | String                                           | Read-only.  |
| lastActionDateTime     | DateTimeOffset                                   |             |
| operationType          | String                                           |             |
| status                 | String                                           |             |
| targetResourceId       | String                                           |             |
| targetResourceLocation | String                                           |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.teamsAsyncOperation",
  "baseType": "microsoft.graph.entity",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.teamsAsyncOperation",
  "attemptsCount": "Int32",
  "createdDateTime": "DateTimeOffset",
  "error": {"@odata.type": "microsoft.graph.operationError"},
  "id": "String (identifier)",
  "lastActionDateTime": "DateTimeOffset",
  "operationType": "invalid | cloneTeam | archiveTeam | unarchiveTeam | createTeam | unknownFutureValue",
  "status": "invalid | notStarted | inProgress | succeeded | failed | unknownFutureValue",
  "targetResourceId": "String",
  "targetResourceLocation": "String"
}
```
