---
title: "policyRoot resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# policyRoot resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                        | Return Type                                                                 | Description                                                                                          |
| :-------------------------------------------------------------------------------------------- | :-------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------------------- |
| [List policyRoot](../api/policyroot-list.md)                                                  | [policyRoot](policyRoot.md) collection                                      | List properties and relationships of a policyRoot object.                                            |
| [Create policyRoot](../api/policyroot-create.md)                                              | [policyRoot](policyRoot.md)                                                 | Create a new policyRoot object.                                                                      |
| [Get policyRoot](../api/policyroot-get.md)                                                    | [policyRoot](policyRoot.md)                                                 | Read properties and relationships of a policyRoot object.                                            |
| [Update policyRoot](../api/policyroot-update.md)                                              | [policyRoot](policyRoot.md)                                                 | Update the properties of a policyRoot object.                                                        |
| [Delete policyRoot](../api/policyroot-delete.md)                                              |                                                                             | Delete a policyRoot object.                                                                          |
| [List authenticationMethodsPolicy](../api/policyroot-list-authenticationmethodspolicy.md)     | [authenticationMethodsPolicy](../resources/-authenticationmethodspolicy.md) | Get the authenticationMethodsPolicy objects from an authenticationMethodsPolicy navigation property. |
| [Create authenticationMethodsPolicy](../api/policyroot-post-authenticationmethodspolicy.md)   | [authenticationMethodsPolicy](../resources/-authenticationmethodspolicy.md) | Create a new authenticationMethodsPolicy object.                                                     |
| [Get authenticationMethodsPolicy](../api/policyroot-get-authenticationmethodspolicy.md)       | [authenticationMethodsPolicy](../resources/-authenticationmethodspolicy.md) | Read the properties and relationships of an authenticationMethodsPolicy object.                      |
| [Update authenticationMethodsPolicy](../api/policyroot-update-authenticationmethodspolicy.md) | [authenticationMethodsPolicy](../resources/-authenticationmethodspolicy.md) | Update the properties of an authenticationMethodsPolicy object.                                      |
| [Delete authenticationMethodsPolicy](../api/policyroot-delete-authenticationmethodspolicy.md) |                                                                             | Delete an authenticationMethodsPolicy object.                                                        |

## Properties

| Property | Type | Description |
| :------- | :--- | :---------- |

## Relationships

| Relationship                | Type                                                                       | Description |
| :-------------------------- | :------------------------------------------------------------------------- | :---------- |
| authenticationMethodsPolicy | [authenticationMethodsPolicy](../resources/authenticationmethodspolicy.md) |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.policyRoot",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.policyRoot",
}
```
