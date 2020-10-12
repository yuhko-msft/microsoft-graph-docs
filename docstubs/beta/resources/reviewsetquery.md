---
title: "reviewSetQuery resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# reviewSetQuery resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                   | Return Type                                    | Description                                                   |
| :------------------------------------------------------- | :--------------------------------------------- | :------------------------------------------------------------ |
| [List reviewSetQuery](../api/reviewsetquery-list.md)     | [reviewSetQuery](reviewSetQuery.md) collection | List properties and relationships of a reviewSetQuery object. |
| [Create reviewSetQuery](../api/reviewsetquery-create.md) | [reviewSetQuery](reviewSetQuery.md)            | Create a new reviewSetQuery object.                           |
| [Get reviewSetQuery](../api/reviewsetquery-get.md)       | [reviewSetQuery](reviewSetQuery.md)            | Read properties and relationships of a reviewSetQuery object. |
| [Update reviewSetQuery](../api/reviewsetquery-update.md) | [reviewSetQuery](reviewSetQuery.md)            | Update the properties of a reviewSetQuery object.             |
| [Delete reviewSetQuery](../api/reviewsetquery-delete.md) |                                                | Delete a reviewSetQuery object.                               |

## Properties

| Property             | Type                                       | Description |
| :------------------- | :----------------------------------------- | :---------- |
| createdBy            | [identitySet](../resources/identityset.md) |             |
| createdDateTime      | DateTimeOffset                             |             |
| displayName          | String                                     |             |
| id                   | String                                     | Read-only.  |
| lastModifiedBy       | [identitySet](../resources/identityset.md) |             |
| lastModifiedDateTime | DateTimeOffset                             |             |
| query                | String                                     |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.reviewSetQuery",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.reviewSetQuery",
  "createdBy": {"@odata.type": "microsoft.graph.identitySet"},
  "createdDateTime": "DateTimeOffset",
  "displayName": "String",
  "id": "String (identifier)",
  "lastModifiedBy": {"@odata.type": "microsoft.graph.identitySet"},
  "lastModifiedDateTime": "DateTimeOffset",
  "query": "String"
}
```
