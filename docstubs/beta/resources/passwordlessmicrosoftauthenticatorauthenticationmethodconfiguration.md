---
title: "passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethodConfiguration](authenticationmethodconfiguration.md)

## Methods

| Method                                                                                                                                                             | Return Type                                                                                                                                              | Description                                                                                                              |
| :----------------------------------------------------------------------------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------------------------------------------- |
| [List passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration](../api/passwordlessmicrosoftauthenticatorauthenticationmethodconfiguration-list.md)     | [passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration](passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration.md) collection | List properties and relationships of a passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration object.       |
| [Create passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration](../api/passwordlessmicrosoftauthenticatorauthenticationmethodconfiguration-create.md) | [passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration](passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration.md)            | Create a new passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration object.                                 |
| [Get passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration](../api/passwordlessmicrosoftauthenticatorauthenticationmethodconfiguration-get.md)       | [passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration](passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration.md)            | Read properties and relationships of a passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration object.       |
| [Update passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration](../api/passwordlessmicrosoftauthenticatorauthenticationmethodconfiguration-update.md) | [passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration](passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration.md)            | Update the properties of a passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration object.                   |
| [Delete passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration](../api/passwordlessmicrosoftauthenticatorauthenticationmethodconfiguration-delete.md) |                                                                                                                                                          | Delete a passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration object.                                     |
| [List includeTargets](../api/passwordlessmicrosoftauthenticatorauthenticationmethodconfiguration-list-includetargets.md)                                           | passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget                                                                                             | Get the passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget objects from an includeTargets navigation property. |
| [Create includeTargets](../api/passwordlessmicrosoftauthenticatorauthenticationmethodconfiguration-post-includetargets.md)                                         | passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget                                                                                             | Create a new passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget object.                                        |
| [Get includeTargets](../api/passwordlessmicrosoftauthenticatorauthenticationmethodconfiguration-get-includetargets.md)                                             | passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget                                                                                             | Read the properties and relationships of a passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget object.          |
| [Update includeTargets](../api/passwordlessmicrosoftauthenticatorauthenticationmethodconfiguration-update-includetargets.md)                                       | passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget                                                                                             | Update the properties of a passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget object.                          |
| [Delete includeTargets](../api/passwordlessmicrosoftauthenticatorauthenticationmethodconfiguration-delete-includetargets.md)                                       |                                                                                                                                                          | Delete a passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget object.                                            |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |
| state    | String |             |

## Relationships

| Relationship   | Type                                                                                                                                                    | Description |
| :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------ | :---------- |
| includeTargets | [passwordlessMicrosoftAuthenticatorAuthenticationMethodTarget](../resources/passwordlessmicrosoftauthenticatorauthenticationmethodtarget.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration",
  "baseType": "microsoft.graph.authenticationMethodConfiguration",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.passwordlessMicrosoftAuthenticatorAuthenticationMethodConfiguration",
  "id": "String (identifier)",
  "state": "enabled | disabled"
}
```
