---
title: "authenticationEventsPolicy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# authenticationEventsPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                            | Return Type                                                            | Description                                                                     |
| :-------------------------------------------------------------------------------- | :--------------------------------------------------------------------- | :------------------------------------------------------------------------------ |
| [List authenticationEventsPolicy](../api/authenticationeventspolicy-list.md)      | [authenticationEventsPolicy](authenticationEventsPolicy.md) collection | List properties and relationships of an authenticationEventsPolicy object.      |
| [Create authenticationEventsPolicy](../api/authenticationeventspolicy-create.md)  | [authenticationEventsPolicy](authenticationEventsPolicy.md)            | Create a new authenticationEventsPolicy object.                                 |
| [Get authenticationEventsPolicy](../api/authenticationeventspolicy-get.md)        | [authenticationEventsPolicy](authenticationEventsPolicy.md)            | Read properties and relationships of an authenticationEventsPolicy object.      |
| [Update authenticationEventsPolicy](../api/authenticationeventspolicy-update.md)  | [authenticationEventsPolicy](authenticationEventsPolicy.md)            | Update the properties of an authenticationEventsPolicy object.                  |
| [Delete authenticationEventsPolicy](../api/authenticationeventspolicy-delete.md)  |                                                                        | Delete an authenticationEventsPolicy object.                                    |
| [List onSignupStart](../api/authenticationeventspolicy-list-onsignupstart.md)     | [authenticationAction](../resources/-authenticationaction.md)          | Get the authenticationAction objects from an onSignupStart navigation property. |
| [Create onSignupStart](../api/authenticationeventspolicy-post-onsignupstart.md)   | [authenticationAction](../resources/-authenticationaction.md)          | Create a new authenticationAction object.                                       |
| [Get onSignupStart](../api/authenticationeventspolicy-get-onsignupstart.md)       | [authenticationAction](../resources/-authenticationaction.md)          | Read the properties and relationships of an authenticationAction object.        |
| [Update onSignupStart](../api/authenticationeventspolicy-update-onsignupstart.md) | [authenticationAction](../resources/-authenticationaction.md)          | Update the properties of an authenticationAction object.                        |
| [Delete onSignupStart](../api/authenticationeventspolicy-delete-onsignupstart.md) |                                                                        | Delete an authenticationAction object.                                          |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |

## Relationships

| Relationship  | Type                                                                    | Description |
| :------------ | :---------------------------------------------------------------------- | :---------- |
| onSignupStart | [authenticationAction](../resources/authenticationaction.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.authenticationEventsPolicy",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.authenticationEventsPolicy",
  "id": "String (identifier)"
}
```
