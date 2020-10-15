---
title: "user resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# user resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                    | Return Type                                                 | Description                                                                           |
| :------------------------------------------------------------------------ | :---------------------------------------------------------- | :------------------------------------------------------------------------------------ |
| [List user](../api/user-list.md)                                          | [user](user.md) collection                                  | List properties and relationships of a user object.                                   |
| [Create user](../api/user-create.md)                                      | [user](user.md)                                             | Create a new user object.                                                             |
| [Get user](../api/user-get.md)                                            | [user](user.md)                                             | Read properties and relationships of a user object.                                   |
| [Update user](../api/user-update.md)                                      | [user](user.md)                                             | Update the properties of a user object.                                               |
| [Delete user](../api/user-delete.md)                                      |                                                             | Delete a user object.                                                                 |
| [List agreementAcceptances](../api/user-list-agreementacceptances.md)     | [agreementAcceptance](../resources/-agreementacceptance.md) | Get the agreementAcceptance objects from an agreementAcceptances navigation property. |
| [Add agreementAcceptances](../api/user-post-agreementacceptances.md)      | [agreementAcceptance](../resources/-agreementacceptance.md) | Add agreementAcceptance by posting to the agreementAcceptance collection.             |
| [Get agreementAcceptances](../api/user-get-agreementacceptances.md)       | [agreementAcceptance](../resources/-agreementacceptance.md) | Read the properties and relationships of an agreementAcceptance object.               |
| [Update agreementAcceptances](../api/user-update-agreementacceptances.md) | [agreementAcceptance](../resources/-agreementacceptance.md) | Update the properties of an agreementAcceptance object.                               |
| [Remove agreementAcceptances](../api/user-delete-agreementacceptances.md) |                                                             | Remove an agreementAcceptance object.                                                 |

## Properties

| Property | Type | Description |
| :------- | :--- | :---------- |

## Relationships

| Relationship         | Type                                                                  | Description |
| :------------------- | :-------------------------------------------------------------------- | :---------- |
| agreementAcceptances | [agreementAcceptance](../resources/agreementacceptance.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.user",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.user",
}
```
