---
title: "microsoftAuthenticatorAuthenticationMethod resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# microsoftAuthenticatorAuthenticationMethod resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethod](authenticationmethod.md)

## Methods

| Method                                                                                                           | Return Type                                                                                            | Description                                                                               |
| :--------------------------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------- |
| [List microsoftAuthenticatorAuthenticationMethod](../api/microsoftauthenticatorauthenticationmethod-list.md)     | [microsoftAuthenticatorAuthenticationMethod](microsoftAuthenticatorAuthenticationMethod.md) collection | List properties and relationships of a microsoftAuthenticatorAuthenticationMethod object. |
| [Create microsoftAuthenticatorAuthenticationMethod](../api/microsoftauthenticatorauthenticationmethod-create.md) | [microsoftAuthenticatorAuthenticationMethod](microsoftAuthenticatorAuthenticationMethod.md)            | Create a new microsoftAuthenticatorAuthenticationMethod object.                           |
| [Get microsoftAuthenticatorAuthenticationMethod](../api/microsoftauthenticatorauthenticationmethod-get.md)       | [microsoftAuthenticatorAuthenticationMethod](microsoftAuthenticatorAuthenticationMethod.md)            | Read properties and relationships of a microsoftAuthenticatorAuthenticationMethod object. |
| [Update microsoftAuthenticatorAuthenticationMethod](../api/microsoftauthenticatorauthenticationmethod-update.md) | [microsoftAuthenticatorAuthenticationMethod](microsoftAuthenticatorAuthenticationMethod.md)            | Update the properties of a microsoftAuthenticatorAuthenticationMethod object.             |
| [Delete microsoftAuthenticatorAuthenticationMethod](../api/microsoftauthenticatorauthenticationmethod-delete.md) |                                                                                                        | Delete a microsoftAuthenticatorAuthenticationMethod object.                               |
| [disableSmsSignIn](../api/microsoftauthenticatorauthenticationmethod-disableSmsSignIn.md)                        |                                                                                                        |                                                                                           |
| [enableSmsSignIn](../api/microsoftauthenticatorauthenticationmethod-enableSmsSignIn.md)                          |                                                                                                        |                                                                                           |
| [resetPassword](../api/microsoftauthenticatorauthenticationmethod-resetPassword.md)                              | passwordResetResponse                                                                                  |                                                                                           |

## Properties

| Property        | Type   | Description |
| :-------------- | :----- | :---------- |
| deviceName      | String |             |
| deviceTag       | String |             |
| id              | String | Read-only.  |
| phoneAppVersion | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.microsoftAuthenticatorAuthenticationMethod",
  "baseType": "microsoft.graph.authenticationMethod",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.microsoftAuthenticatorAuthenticationMethod",
  "deviceName": "String",
  "deviceTag": "String",
  "id": "String (identifier)",
  "phoneAppVersion": "String"
}
```
