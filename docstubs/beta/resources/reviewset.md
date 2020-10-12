---
title: "reviewSet resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# reviewSet resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                               | Return Type                                       | Description                                                        |
| :--------------------------------------------------- | :------------------------------------------------ | :----------------------------------------------------------------- |
| [List reviewSet](../api/reviewset-list.md)           | [reviewSet](reviewSet.md) collection              | List properties and relationships of a reviewSet object.           |
| [Create reviewSet](../api/reviewset-create.md)       | [reviewSet](reviewSet.md)                         | Create a new reviewSet object.                                     |
| [Get reviewSet](../api/reviewset-get.md)             | [reviewSet](reviewSet.md)                         | Read properties and relationships of a reviewSet object.           |
| [Update reviewSet](../api/reviewset-update.md)       | [reviewSet](reviewSet.md)                         | Update the properties of a reviewSet object.                       |
| [Delete reviewSet](../api/reviewset-delete.md)       |                                                   | Delete a reviewSet object.                                         |
| [List queries](../api/reviewset-list-queries.md)     | [reviewSetQuery](../resources/-reviewsetquery.md) | Get the reviewSetQuery objects from a queries navigation property. |
| [Create queries](../api/reviewset-post-queries.md)   | [reviewSetQuery](../resources/-reviewsetquery.md) | Create a new reviewSetQuery object.                                |
| [Get queries](../api/reviewset-get-queries.md)       | [reviewSetQuery](../resources/-reviewsetquery.md) | Read the properties and relationships of a reviewSetQuery object.  |
| [Update queries](../api/reviewset-update-queries.md) | [reviewSetQuery](../resources/-reviewsetquery.md) | Update the properties of a reviewSetQuery object.                  |
| [Delete queries](../api/reviewset-delete-queries.md) |                                                   | Delete a reviewSetQuery object.                                    |

## Properties

| Property        | Type                                       | Description |
| :-------------- | :----------------------------------------- | :---------- |
| createdBy       | [identitySet](../resources/identityset.md) |             |
| createdDateTime | DateTimeOffset                             |             |
| displayName     | String                                     |             |
| id              | String                                     | Read-only.  |

## Relationships

| Relationship | Type                                                        | Description |
| :----------- | :---------------------------------------------------------- | :---------- |
| queries      | [reviewSetQuery](../resources/reviewsetquery.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.reviewSet",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.reviewSet",
  "createdBy": {"@odata.type": "microsoft.graph.identitySet"},
  "createdDateTime": "DateTimeOffset",
  "displayName": "String",
  "id": "String (identifier)"
}
```
