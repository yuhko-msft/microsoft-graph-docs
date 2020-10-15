---
title: "authenticationMethodTarget resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# authenticationMethodTarget resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                           | Return Type                                                            | Description                                                                |
| :------------------------------------------------------------------------------- | :--------------------------------------------------------------------- | :------------------------------------------------------------------------- |
| [List authenticationMethodTarget](../api/authenticationmethodtarget-list.md)     | [authenticationMethodTarget](authenticationMethodTarget.md) collection | List properties and relationships of an authenticationMethodTarget object. |
| [Create authenticationMethodTarget](../api/authenticationmethodtarget-create.md) | [authenticationMethodTarget](authenticationMethodTarget.md)            | Create a new authenticationMethodTarget object.                            |
| [Get authenticationMethodTarget](../api/authenticationmethodtarget-get.md)       | [authenticationMethodTarget](authenticationMethodTarget.md)            | Read properties and relationships of an authenticationMethodTarget object. |
| [Update authenticationMethodTarget](../api/authenticationmethodtarget-update.md) | [authenticationMethodTarget](authenticationMethodTarget.md)            | Update the properties of an authenticationMethodTarget object.             |
| [Delete authenticationMethodTarget](../api/authenticationmethodtarget-delete.md) |                                                                        | Delete an authenticationMethodTarget object.                               |

## Properties

| Property               | Type    | Description |
| :--------------------- | :------ | :---------- |
| id                     | String  | Read-only.  |
| isRegistrationRequired | Boolean |             |
| targetType             | String  |             |
| useForSignIn           | Boolean |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.authenticationMethodTarget",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.authenticationMethodTarget",
  "id": "String (identifier)",
  "isRegistrationRequired": "Boolean",
  "targetType": "user | group | unknownFutureValue",
  "useForSignIn": "Boolean"
}
```
