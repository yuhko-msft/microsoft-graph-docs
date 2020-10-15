---
title: "microsoftAuthenticatorAuthenticationMethodConfiguration resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# microsoftAuthenticatorAuthenticationMethodConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethodConfiguration](authenticationmethodconfiguration.md)

## Methods

| Method                                                                                                                                     | Return Type                                                                                                                      | Description                                                                                                  |
| :----------------------------------------------------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------------------------------- |
| [List microsoftAuthenticatorAuthenticationMethodConfiguration](../api/microsoftauthenticatorauthenticationmethodconfiguration-list.md)     | [microsoftAuthenticatorAuthenticationMethodConfiguration](microsoftAuthenticatorAuthenticationMethodConfiguration.md) collection | List properties and relationships of a microsoftAuthenticatorAuthenticationMethodConfiguration object.       |
| [Create microsoftAuthenticatorAuthenticationMethodConfiguration](../api/microsoftauthenticatorauthenticationmethodconfiguration-create.md) | [microsoftAuthenticatorAuthenticationMethodConfiguration](microsoftAuthenticatorAuthenticationMethodConfiguration.md)            | Create a new microsoftAuthenticatorAuthenticationMethodConfiguration object.                                 |
| [Get microsoftAuthenticatorAuthenticationMethodConfiguration](../api/microsoftauthenticatorauthenticationmethodconfiguration-get.md)       | [microsoftAuthenticatorAuthenticationMethodConfiguration](microsoftAuthenticatorAuthenticationMethodConfiguration.md)            | Read properties and relationships of a microsoftAuthenticatorAuthenticationMethodConfiguration object.       |
| [Update microsoftAuthenticatorAuthenticationMethodConfiguration](../api/microsoftauthenticatorauthenticationmethodconfiguration-update.md) | [microsoftAuthenticatorAuthenticationMethodConfiguration](microsoftAuthenticatorAuthenticationMethodConfiguration.md)            | Update the properties of a microsoftAuthenticatorAuthenticationMethodConfiguration object.                   |
| [Delete microsoftAuthenticatorAuthenticationMethodConfiguration](../api/microsoftauthenticatorauthenticationmethodconfiguration-delete.md) |                                                                                                                                  | Delete a microsoftAuthenticatorAuthenticationMethodConfiguration object.                                     |
| [List includeTargets](../api/microsoftauthenticatorauthenticationmethodconfiguration-list-includetargets.md)                               | microsoftAuthenticatorAuthenticationMethodTarget                                                                                 | Get the microsoftAuthenticatorAuthenticationMethodTarget objects from an includeTargets navigation property. |
| [Create includeTargets](../api/microsoftauthenticatorauthenticationmethodconfiguration-post-includetargets.md)                             | microsoftAuthenticatorAuthenticationMethodTarget                                                                                 | Create a new microsoftAuthenticatorAuthenticationMethodTarget object.                                        |
| [Get includeTargets](../api/microsoftauthenticatorauthenticationmethodconfiguration-get-includetargets.md)                                 | microsoftAuthenticatorAuthenticationMethodTarget                                                                                 | Read the properties and relationships of a microsoftAuthenticatorAuthenticationMethodTarget object.          |
| [Update includeTargets](../api/microsoftauthenticatorauthenticationmethodconfiguration-update-includetargets.md)                           | microsoftAuthenticatorAuthenticationMethodTarget                                                                                 | Update the properties of a microsoftAuthenticatorAuthenticationMethodTarget object.                          |
| [Delete includeTargets](../api/microsoftauthenticatorauthenticationmethodconfiguration-delete-includetargets.md)                           |                                                                                                                                  | Delete a microsoftAuthenticatorAuthenticationMethodTarget object.                                            |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |
| state    | String |             |

## Relationships

| Relationship   | Type                                                                                                                            | Description |
| :------------- | :------------------------------------------------------------------------------------------------------------------------------ | :---------- |
| includeTargets | [microsoftAuthenticatorAuthenticationMethodTarget](../resources/microsoftauthenticatorauthenticationmethodtarget.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.microsoftAuthenticatorAuthenticationMethodConfiguration",
  "baseType": "microsoft.graph.authenticationMethodConfiguration",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.microsoftAuthenticatorAuthenticationMethodConfiguration",
  "id": "String (identifier)",
  "state": "enabled | disabled"
}
```
