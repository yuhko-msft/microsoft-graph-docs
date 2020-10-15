---
title: "passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethodTarget](authenticationmethodtarget.md)

## Methods

| Method                                                                                                                                               | Return Type                                                                                                                                | Description                                                                                                 |
| :--------------------------------------------------------------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------------------- |
| [List passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget](../api/passwordlessmicrosoftauthenticatorauthenticationmethodtarget-list.md)     | [passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget](passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget.md) collection | List properties and relationships of a passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget object. |
| [Create passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget](../api/passwordlessmicrosoftauthenticatorauthenticationmethodtarget-create.md) | [passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget](passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget.md)            | Create a new passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget object.                           |
| [Get passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget](../api/passwordlessmicrosoftauthenticatorauthenticationmethodtarget-get.md)       | [passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget](passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget.md)            | Read properties and relationships of a passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget object. |
| [Update passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget](../api/passwordlessmicrosoftauthenticatorauthenticationmethodtarget-update.md) | [passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget](passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget.md)            | Update the properties of a passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget object.             |
| [Delete passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget](../api/passwordlessmicrosoftauthenticatorauthenticationmethodtarget-delete.md) |                                                                                                                                            | Delete a passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget object.                               |

## Properties

| Property               | Type    | Description |
| :--------------------- | :------ | :---------- |
| id                     | String  | Read-only.  |
| isRegistrationRequired | Boolean |             |
| shownContext           | String  |             |
| targetType             | String  |             |
| useForSignIn           | Boolean |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget",
  "baseType": "microsoft.graph.authenticationMethodTarget",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget",
  "id": "String (identifier)",
  "isRegistrationRequired": "Boolean",
  "shownContext": "location | app",
  "targetType": "user | group | unknownFutureValue",
  "useForSignIn": "Boolean"
}
```
