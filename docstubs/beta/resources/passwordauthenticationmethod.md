---
title: "passwordAuthenticationMethod resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# passwordAuthenticationMethod resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethod](authenticationmethod.md)

## Methods

| Method                                                                               | Return Type                                                                | Description                                                                 |
| :----------------------------------------------------------------------------------- | :------------------------------------------------------------------------- | :-------------------------------------------------------------------------- |
| [List passwordAuthenticationMethod](../api/passwordauthenticationmethod-list.md)     | [passwordAuthenticationMethod](passwordAuthenticationMethod.md) collection | List properties and relationships of a passwordAuthenticationMethod object. |
| [Create passwordAuthenticationMethod](../api/passwordauthenticationmethod-create.md) | [passwordAuthenticationMethod](passwordAuthenticationMethod.md)            | Create a new passwordAuthenticationMethod object.                           |
| [Get passwordAuthenticationMethod](../api/passwordauthenticationmethod-get.md)       | [passwordAuthenticationMethod](passwordAuthenticationMethod.md)            | Read properties and relationships of a passwordAuthenticationMethod object. |
| [Update passwordAuthenticationMethod](../api/passwordauthenticationmethod-update.md) | [passwordAuthenticationMethod](passwordAuthenticationMethod.md)            | Update the properties of a passwordAuthenticationMethod object.             |
| [Delete passwordAuthenticationMethod](../api/passwordauthenticationmethod-delete.md) |                                                                            | Delete a passwordAuthenticationMethod object.                               |
| [disableSmsSignIn](../api/passwordauthenticationmethod-disableSmsSignIn.md)          |                                                                            |                                                                             |
| [enableSmsSignIn](../api/passwordauthenticationmethod-enableSmsSignIn.md)            |                                                                            |                                                                             |
| [resetPassword](../api/passwordauthenticationmethod-resetPassword.md)                | passwordResetResponse                                                      |                                                                             |

## Properties

| Property         | Type           | Description |
| :--------------- | :------------- | :---------- |
| creationDateTime | DateTimeOffset |             |
| id               | String         | Read-only.  |
| password         | String         |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.passwordAuthenticationMethod",
  "baseType": "microsoft.graph.authenticationMethod",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.passwordAuthenticationMethod",
  "creationDateTime": "DateTimeOffset",
  "id": "String (identifier)",
  "password": "String"
}
```
