---
title: "voiceAuthenticationMethodConfiguration resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# voiceAuthenticationMethodConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethodConfiguration](authenticationmethodconfiguration.md)

## Methods

| Method                                                                                                   | Return Type                                                                                    | Description                                                                            |
| :------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------- |
| [List voiceAuthenticationMethodConfiguration](../api/voiceauthenticationmethodconfiguration-list.md)     | [voiceAuthenticationMethodConfiguration](voiceAuthenticationMethodConfiguration.md) collection | List properties and relationships of a voiceAuthenticationMethodConfiguration object.  |
| [Create voiceAuthenticationMethodConfiguration](../api/voiceauthenticationmethodconfiguration-create.md) | [voiceAuthenticationMethodConfiguration](voiceAuthenticationMethodConfiguration.md)            | Create a new voiceAuthenticationMethodConfiguration object.                            |
| [Get voiceAuthenticationMethodConfiguration](../api/voiceauthenticationmethodconfiguration-get.md)       | [voiceAuthenticationMethodConfiguration](voiceAuthenticationMethodConfiguration.md)            | Read properties and relationships of a voiceAuthenticationMethodConfiguration object.  |
| [Update voiceAuthenticationMethodConfiguration](../api/voiceauthenticationmethodconfiguration-update.md) | [voiceAuthenticationMethodConfiguration](voiceAuthenticationMethodConfiguration.md)            | Update the properties of a voiceAuthenticationMethodConfiguration object.              |
| [Delete voiceAuthenticationMethodConfiguration](../api/voiceauthenticationmethodconfiguration-delete.md) |                                                                                                | Delete a voiceAuthenticationMethodConfiguration object.                                |
| [List includeTargets](../api/voiceauthenticationmethodconfiguration-list-includetargets.md)              | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                      | Get the authenticationMethodTarget objects from an includeTargets navigation property. |
| [Create includeTargets](../api/voiceauthenticationmethodconfiguration-post-includetargets.md)            | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                      | Create a new authenticationMethodTarget object.                                        |
| [Get includeTargets](../api/voiceauthenticationmethodconfiguration-get-includetargets.md)                | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                      | Read the properties and relationships of an authenticationMethodTarget object.         |
| [Update includeTargets](../api/voiceauthenticationmethodconfiguration-update-includetargets.md)          | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                      | Update the properties of an authenticationMethodTarget object.                         |
| [Delete includeTargets](../api/voiceauthenticationmethodconfiguration-delete-includetargets.md)          |                                                                                                | Delete an authenticationMethodTarget object.                                           |

## Properties

| Property             | Type    | Description |
| :------------------- | :------ | :---------- |
| id                   | String  | Read-only.  |
| isOfficePhoneAllowed | Boolean |             |
| state                | String  |             |

## Relationships

| Relationship   | Type                                                                                | Description |
| :------------- | :---------------------------------------------------------------------------------- | :---------- |
| includeTargets | [authenticationMethodTarget](../resources/authenticationmethodtarget.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.voiceAuthenticationMethodConfiguration",
  "baseType": "microsoft.graph.authenticationMethodConfiguration",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.voiceAuthenticationMethodConfiguration",
  "id": "String (identifier)",
  "isOfficePhoneAllowed": "Boolean",
  "state": "enabled | disabled"
}
```
