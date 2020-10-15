---
title: "authenticationMethod resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# authenticationMethod resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                               | Return Type                                                | Description                                                          |
| :------------------------------------------------------------------- | :--------------------------------------------------------- | :------------------------------------------------------------------- |
| [List authenticationMethod](../api/authenticationmethod-list.md)     | [authenticationMethod](authenticationMethod.md) collection | List properties and relationships of an authenticationMethod object. |
| [Create authenticationMethod](../api/authenticationmethod-create.md) | [authenticationMethod](authenticationMethod.md)            | Create a new authenticationMethod object.                            |
| [Get authenticationMethod](../api/authenticationmethod-get.md)       | [authenticationMethod](authenticationMethod.md)            | Read properties and relationships of an authenticationMethod object. |
| [Update authenticationMethod](../api/authenticationmethod-update.md) | [authenticationMethod](authenticationMethod.md)            | Update the properties of an authenticationMethod object.             |
| [Delete authenticationMethod](../api/authenticationmethod-delete.md) |                                                            | Delete an authenticationMethod object.                               |
| [disableSmsSignIn](../api/authenticationmethod-disableSmsSignIn.md)  |                                                            |                                                                      |
| [enableSmsSignIn](../api/authenticationmethod-enableSmsSignIn.md)    |                                                            |                                                                      |
| [resetPassword](../api/authenticationmethod-resetPassword.md)        | passwordResetResponse                                      |                                                                      |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.authenticationMethod",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.authenticationMethod",
  "id": "String (identifier)"
}
```
