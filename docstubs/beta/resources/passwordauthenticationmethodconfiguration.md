---
title: "passwordAuthenticationMethodConfiguration resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# passwordAuthenticationMethodConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethodConfiguration](authenticationmethodconfiguration.md)

## Methods

| Method                                                                                                         | Return Type                                                                                          | Description                                                                              |
| :------------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- |
| [List passwordAuthenticationMethodConfiguration](../api/passwordauthenticationmethodconfiguration-list.md)     | [passwordAuthenticationMethodConfiguration](passwordAuthenticationMethodConfiguration.md) collection | List properties and relationships of a passwordAuthenticationMethodConfiguration object. |
| [Create passwordAuthenticationMethodConfiguration](../api/passwordauthenticationmethodconfiguration-create.md) | [passwordAuthenticationMethodConfiguration](passwordAuthenticationMethodConfiguration.md)            | Create a new passwordAuthenticationMethodConfiguration object.                           |
| [Get passwordAuthenticationMethodConfiguration](../api/passwordauthenticationmethodconfiguration-get.md)       | [passwordAuthenticationMethodConfiguration](passwordAuthenticationMethodConfiguration.md)            | Read properties and relationships of a passwordAuthenticationMethodConfiguration object. |
| [Update passwordAuthenticationMethodConfiguration](../api/passwordauthenticationmethodconfiguration-update.md) | [passwordAuthenticationMethodConfiguration](passwordAuthenticationMethodConfiguration.md)            | Update the properties of a passwordAuthenticationMethodConfiguration object.             |
| [Delete passwordAuthenticationMethodConfiguration](../api/passwordauthenticationmethodconfiguration-delete.md) |                                                                                                      | Delete a passwordAuthenticationMethodConfiguration object.                               |
| [List includeTargets](../api/passwordauthenticationmethodconfiguration-list-includetargets.md)                 | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                            | Get the authenticationMethodTarget objects from an includeTargets navigation property.   |
| [Create includeTargets](../api/passwordauthenticationmethodconfiguration-post-includetargets.md)               | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                            | Create a new authenticationMethodTarget object.                                          |
| [Get includeTargets](../api/passwordauthenticationmethodconfiguration-get-includetargets.md)                   | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                            | Read the properties and relationships of an authenticationMethodTarget object.           |
| [Update includeTargets](../api/passwordauthenticationmethodconfiguration-update-includetargets.md)             | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                            | Update the properties of an authenticationMethodTarget object.                           |
| [Delete includeTargets](../api/passwordauthenticationmethodconfiguration-delete-includetargets.md)             |                                                                                                      | Delete an authenticationMethodTarget object.                                             |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |
| state    | String |             |

## Relationships

| Relationship   | Type                                                                                | Description |
| :------------- | :---------------------------------------------------------------------------------- | :---------- |
| includeTargets | [authenticationMethodTarget](../resources/authenticationmethodtarget.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.passwordAuthenticationMethodConfiguration",
  "baseType": "microsoft.graph.authenticationMethodConfiguration",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.passwordAuthenticationMethodConfiguration",
  "id": "String (identifier)",
  "state": "enabled | disabled"
}
```
