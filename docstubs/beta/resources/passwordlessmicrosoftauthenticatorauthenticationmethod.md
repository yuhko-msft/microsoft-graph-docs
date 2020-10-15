---
title: "passwordlessMicrosoftAuthenticatorAuthenticationMethod resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# passwordlessMicrosoftAuthenticatorAuthenticationMethod resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethod](authenticationmethod.md)

## Methods

| Method                                                                                                                                   | Return Type                                                                                                                    | Description                                                                                           |
| :--------------------------------------------------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------------- |
| [List passwordlessMicrosoftAuthenticatorAuthenticationMethod](../api/passwordlessmicrosoftauthenticatorauthenticationmethod-list.md)     | [passwordlessMicrosoftAuthenticatorAuthenticationMethod](passwordlessMicrosoftAuthenticatorAuthenticationMethod.md) collection | List properties and relationships of a passwordlessMicrosoftAuthenticatorAuthenticationMethod object. |
| [Create passwordlessMicrosoftAuthenticatorAuthenticationMethod](../api/passwordlessmicrosoftauthenticatorauthenticationmethod-create.md) | [passwordlessMicrosoftAuthenticatorAuthenticationMethod](passwordlessMicrosoftAuthenticatorAuthenticationMethod.md)            | Create a new passwordlessMicrosoftAuthenticatorAuthenticationMethod object.                           |
| [Get passwordlessMicrosoftAuthenticatorAuthenticationMethod](../api/passwordlessmicrosoftauthenticatorauthenticationmethod-get.md)       | [passwordlessMicrosoftAuthenticatorAuthenticationMethod](passwordlessMicrosoftAuthenticatorAuthenticationMethod.md)            | Read properties and relationships of a passwordlessMicrosoftAuthenticatorAuthenticationMethod object. |
| [Update passwordlessMicrosoftAuthenticatorAuthenticationMethod](../api/passwordlessmicrosoftauthenticatorauthenticationmethod-update.md) | [passwordlessMicrosoftAuthenticatorAuthenticationMethod](passwordlessMicrosoftAuthenticatorAuthenticationMethod.md)            | Update the properties of a passwordlessMicrosoftAuthenticatorAuthenticationMethod object.             |
| [Delete passwordlessMicrosoftAuthenticatorAuthenticationMethod](../api/passwordlessmicrosoftauthenticatorauthenticationmethod-delete.md) |                                                                                                                                | Delete a passwordlessMicrosoftAuthenticatorAuthenticationMethod object.                               |
| [disableSmsSignIn](../api/passwordlessmicrosoftauthenticatorauthenticationmethod-disableSmsSignIn.md)                                    |                                                                                                                                |                                                                                                       |
| [enableSmsSignIn](../api/passwordlessmicrosoftauthenticatorauthenticationmethod-enableSmsSignIn.md)                                      |                                                                                                                                |                                                                                                       |
| [resetPassword](../api/passwordlessmicrosoftauthenticatorauthenticationmethod-resetPassword.md)                                          | passwordResetResponse                                                                                                          |                                                                                                       |
| [List device](../api/passwordlessmicrosoftauthenticatorauthenticationmethod-list-device.md)                                              | [device](../resources/-device.md)                                                                                              | Get the device objects from a device navigation property.                                             |
| [Create device](../api/passwordlessmicrosoftauthenticatorauthenticationmethod-post-device.md)                                            | [device](../resources/-device.md)                                                                                              | Create a new device object.                                                                           |
| [Get device](../api/passwordlessmicrosoftauthenticatorauthenticationmethod-get-device.md)                                                | [device](../resources/-device.md)                                                                                              | Read the properties and relationships of a device object.                                             |
| [Update device](../api/passwordlessmicrosoftauthenticatorauthenticationmethod-update-device.md)                                          | [device](../resources/-device.md)                                                                                              | Update the properties of a device object.                                                             |
| [Delete device](../api/passwordlessmicrosoftauthenticatorauthenticationmethod-delete-device.md)                                          |                                                                                                                                | Delete a device object.                                                                               |

## Properties

| Property         | Type           | Description |
| :--------------- | :------------- | :---------- |
| creationDateTime | DateTimeOffset |             |
| displayName      | String         |             |
| id               | String         | Read-only.  |

## Relationships

| Relationship | Type                             | Description |
| :----------- | :------------------------------- | :---------- |
| device       | [device](../resources/device.md) |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.passwordlessMicrosoftAuthenticatorAuthenticationMethod",
  "baseType": "microsoft.graph.authenticationMethod",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.passwordlessMicrosoftAuthenticatorAuthenticationMethod",
  "creationDateTime": "DateTimeOffset",
  "displayName": "String",
  "id": "String (identifier)"
}
```
