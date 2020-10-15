---
title: "legacy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# legacy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                              | Return Type                       | Description                                                 |
| :-------------------------------------------------- | :-------------------------------- | :---------------------------------------------------------- |
| [List legacy](../api/legacy-list.md)                | [legacy](legacy.md) collection    | List properties and relationships of a legacy object.       |
| [Create legacy](../api/legacy-create.md)            | [legacy](legacy.md)               | Create a new legacy object.                                 |
| [Get legacy](../api/legacy-get.md)                  | [legacy](legacy.md)               | Read properties and relationships of a legacy object.       |
| [Update legacy](../api/legacy-update.md)            | [legacy](legacy.md)               | Update the properties of a legacy object.                   |
| [Delete legacy](../api/legacy-delete.md)            |                                   | Delete a legacy object.                                     |
| [List policies](../api/legacy-list-policies.md)     | [policy](../resources/-policy.md) | Get the policy objects from a policies navigation property. |
| [Create policies](../api/legacy-post-policies.md)   | [policy](../resources/-policy.md) | Create a new policy object.                                 |
| [Get policies](../api/legacy-get-policies.md)       | [policy](../resources/-policy.md) | Read the properties and relationships of a policy object.   |
| [Update policies](../api/legacy-update-policies.md) | [policy](../resources/-policy.md) | Update the properties of a policy object.                   |
| [Delete policies](../api/legacy-delete-policies.md) |                                   | Delete a policy object.                                     |

## Properties

| Property | Type | Description |
| :------- | :--- | :---------- |

## Relationships

| Relationship | Type                                        | Description |
| :----------- | :------------------------------------------ | :---------- |
| policies     | [policy](../resources/policy.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.legacy",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.legacy",
}
```
