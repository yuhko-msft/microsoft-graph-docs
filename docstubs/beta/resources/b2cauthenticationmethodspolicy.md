---
title: "b2cAuthenticationMethodsPolicy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# b2cAuthenticationMethodsPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                   | Return Type                                                                    | Description                                                                   |
| :--------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------- | :---------------------------------------------------------------------------- |
| [List b2cAuthenticationMethodsPolicy](../api/b2cauthenticationmethodspolicy-list.md)     | [b2cAuthenticationMethodsPolicy](b2cAuthenticationMethodsPolicy.md) collection | List properties and relationships of a b2cAuthenticationMethodsPolicy object. |
| [Create b2cAuthenticationMethodsPolicy](../api/b2cauthenticationmethodspolicy-create.md) | [b2cAuthenticationMethodsPolicy](b2cAuthenticationMethodsPolicy.md)            | Create a new b2cAuthenticationMethodsPolicy object.                           |
| [Get b2cAuthenticationMethodsPolicy](../api/b2cauthenticationmethodspolicy-get.md)       | [b2cAuthenticationMethodsPolicy](b2cAuthenticationMethodsPolicy.md)            | Read properties and relationships of a b2cAuthenticationMethodsPolicy object. |
| [Update b2cAuthenticationMethodsPolicy](../api/b2cauthenticationmethodspolicy-update.md) | [b2cAuthenticationMethodsPolicy](b2cAuthenticationMethodsPolicy.md)            | Update the properties of a b2cAuthenticationMethodsPolicy object.             |
| [Delete b2cAuthenticationMethodsPolicy](../api/b2cauthenticationmethodspolicy-delete.md) |                                                                                | Delete a b2cAuthenticationMethodsPolicy object.                               |

## Properties

| Property                                    | Type    | Description |
| :------------------------------------------ | :------ | :---------- |
| isEmailPasswordAuthenticationEnabled        | Boolean |             |
| isPhoneOneTimePasswordAuthenticationEnabled | Boolean |             |
| isUserNameAuthenticationEnabled             | Boolean |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.b2cAuthenticationMethodsPolicy",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.b2cAuthenticationMethodsPolicy",
  "isEmailPasswordAuthenticationEnabled": "Boolean",
  "isPhoneOneTimePasswordAuthenticationEnabled": "Boolean",
  "isUserNameAuthenticationEnabled": "Boolean"
}
```
