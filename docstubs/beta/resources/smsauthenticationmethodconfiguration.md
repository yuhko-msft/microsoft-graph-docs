---
title: "smsAuthenticationMethodConfiguration resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# smsAuthenticationMethodConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethodConfiguration](authenticationmethodconfiguration.md)

## Methods

| Method                                                                                               | Return Type                                                                                | Description                                                                            |
| :--------------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------- |
| [List smsAuthenticationMethodConfiguration](../api/smsauthenticationmethodconfiguration-list.md)     | [smsAuthenticationMethodConfiguration](smsAuthenticationMethodConfiguration.md) collection | List properties and relationships of a smsAuthenticationMethodConfiguration object.    |
| [Create smsAuthenticationMethodConfiguration](../api/smsauthenticationmethodconfiguration-create.md) | [smsAuthenticationMethodConfiguration](smsAuthenticationMethodConfiguration.md)            | Create a new smsAuthenticationMethodConfiguration object.                              |
| [Get smsAuthenticationMethodConfiguration](../api/smsauthenticationmethodconfiguration-get.md)       | [smsAuthenticationMethodConfiguration](smsAuthenticationMethodConfiguration.md)            | Read properties and relationships of a smsAuthenticationMethodConfiguration object.    |
| [Update smsAuthenticationMethodConfiguration](../api/smsauthenticationmethodconfiguration-update.md) | [smsAuthenticationMethodConfiguration](smsAuthenticationMethodConfiguration.md)            | Update the properties of a smsAuthenticationMethodConfiguration object.                |
| [Delete smsAuthenticationMethodConfiguration](../api/smsauthenticationmethodconfiguration-delete.md) |                                                                                            | Delete a smsAuthenticationMethodConfiguration object.                                  |
| [List includeTargets](../api/smsauthenticationmethodconfiguration-list-includetargets.md)            | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                  | Get the authenticationMethodTarget objects from an includeTargets navigation property. |
| [Create includeTargets](../api/smsauthenticationmethodconfiguration-post-includetargets.md)          | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                  | Create a new authenticationMethodTarget object.                                        |
| [Get includeTargets](../api/smsauthenticationmethodconfiguration-get-includetargets.md)              | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                  | Read the properties and relationships of an authenticationMethodTarget object.         |
| [Update includeTargets](../api/smsauthenticationmethodconfiguration-update-includetargets.md)        | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                  | Update the properties of an authenticationMethodTarget object.                         |
| [Delete includeTargets](../api/smsauthenticationmethodconfiguration-delete-includetargets.md)        |                                                                                            | Delete an authenticationMethodTarget object.                                           |

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
  "@odata.type": "microsoft.graph.smsAuthenticationMethodConfiguration",
  "baseType": "microsoft.graph.authenticationMethodConfiguration",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.smsAuthenticationMethodConfiguration",
  "id": "String (identifier)",
  "state": "enabled | disabled"
}
```
