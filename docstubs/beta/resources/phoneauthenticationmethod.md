---
title: "phoneAuthenticationMethod resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# phoneAuthenticationMethod resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethod](authenticationmethod.md)

## Methods

| Method                                                                         | Return Type                                                          | Description                                                              |
| :----------------------------------------------------------------------------- | :------------------------------------------------------------------- | :----------------------------------------------------------------------- |
| [List phoneAuthenticationMethod](../api/phoneauthenticationmethod-list.md)     | [phoneAuthenticationMethod](phoneAuthenticationMethod.md) collection | List properties and relationships of a phoneAuthenticationMethod object. |
| [Create phoneAuthenticationMethod](../api/phoneauthenticationmethod-create.md) | [phoneAuthenticationMethod](phoneAuthenticationMethod.md)            | Create a new phoneAuthenticationMethod object.                           |
| [Get phoneAuthenticationMethod](../api/phoneauthenticationmethod-get.md)       | [phoneAuthenticationMethod](phoneAuthenticationMethod.md)            | Read properties and relationships of a phoneAuthenticationMethod object. |
| [Update phoneAuthenticationMethod](../api/phoneauthenticationmethod-update.md) | [phoneAuthenticationMethod](phoneAuthenticationMethod.md)            | Update the properties of a phoneAuthenticationMethod object.             |
| [Delete phoneAuthenticationMethod](../api/phoneauthenticationmethod-delete.md) |                                                                      | Delete a phoneAuthenticationMethod object.                               |
| [disableSmsSignIn](../api/phoneauthenticationmethod-disableSmsSignIn.md)       |                                                                      |                                                                          |
| [enableSmsSignIn](../api/phoneauthenticationmethod-enableSmsSignIn.md)         |                                                                      |                                                                          |
| [resetPassword](../api/phoneauthenticationmethod-resetPassword.md)             | passwordResetResponse                                                |                                                                          |

## Properties

| Property       | Type   | Description |
| :------------- | :----- | :---------- |
| id             | String | Read-only.  |
| phoneNumber    | String |             |
| phoneType      | String |             |
| smsSignInState | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.phoneAuthenticationMethod",
  "baseType": "microsoft.graph.authenticationMethod",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.phoneAuthenticationMethod",
  "id": "String (identifier)",
  "phoneNumber": "String",
  "phoneType": "mobile | alternateMobile | office | unknownFutureValue",
  "smsSignInState": "notSupported | notAllowedByPolicy | notEnabled | phoneNumberNotUnique | ready | notConfigured | unknownFutureValue"
}
```
