---
title: "emailAuthenticationMethodConfiguration resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# emailAuthenticationMethodConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethodConfiguration](authenticationmethodconfiguration.md)

## Methods

| Method                                                                                                   | Return Type                                                                                    | Description                                                                            |
| :------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------- |
| [List emailAuthenticationMethodConfiguration](../api/emailauthenticationmethodconfiguration-list.md)     | [emailAuthenticationMethodConfiguration](emailAuthenticationMethodConfiguration.md) collection | List properties and relationships of an emailAuthenticationMethodConfiguration object. |
| [Create emailAuthenticationMethodConfiguration](../api/emailauthenticationmethodconfiguration-create.md) | [emailAuthenticationMethodConfiguration](emailAuthenticationMethodConfiguration.md)            | Create a new emailAuthenticationMethodConfiguration object.                            |
| [Get emailAuthenticationMethodConfiguration](../api/emailauthenticationmethodconfiguration-get.md)       | [emailAuthenticationMethodConfiguration](emailAuthenticationMethodConfiguration.md)            | Read properties and relationships of an emailAuthenticationMethodConfiguration object. |
| [Update emailAuthenticationMethodConfiguration](../api/emailauthenticationmethodconfiguration-update.md) | [emailAuthenticationMethodConfiguration](emailAuthenticationMethodConfiguration.md)            | Update the properties of an emailAuthenticationMethodConfiguration object.             |
| [Delete emailAuthenticationMethodConfiguration](../api/emailauthenticationmethodconfiguration-delete.md) |                                                                                                | Delete an emailAuthenticationMethodConfiguration object.                               |
| [List includeTargets](../api/emailauthenticationmethodconfiguration-list-includetargets.md)              | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                      | Get the authenticationMethodTarget objects from an includeTargets navigation property. |
| [Create includeTargets](../api/emailauthenticationmethodconfiguration-post-includetargets.md)            | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                      | Create a new authenticationMethodTarget object.                                        |
| [Get includeTargets](../api/emailauthenticationmethodconfiguration-get-includetargets.md)                | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                      | Read the properties and relationships of an authenticationMethodTarget object.         |
| [Update includeTargets](../api/emailauthenticationmethodconfiguration-update-includetargets.md)          | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                      | Update the properties of an authenticationMethodTarget object.                         |
| [Delete includeTargets](../api/emailauthenticationmethodconfiguration-delete-includetargets.md)          |                                                                                                | Delete an authenticationMethodTarget object.                                           |

## Properties

| Property                     | Type   | Description |
| :--------------------------- | :----- | :---------- |
| allowExternalIdToUseEmailOtp | String |             |
| id                           | String | Read-only.  |
| state                        | String |             |

## Relationships

| Relationship   | Type                                                                                | Description |
| :------------- | :---------------------------------------------------------------------------------- | :---------- |
| includeTargets | [authenticationMethodTarget](../resources/authenticationmethodtarget.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.emailAuthenticationMethodConfiguration",
  "baseType": "microsoft.graph.authenticationMethodConfiguration",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.emailAuthenticationMethodConfiguration",
  "allowExternalIdToUseEmailOtp": "default | enabled | disabled | unknownFutureValue",
  "id": "String (identifier)",
  "state": "enabled | disabled"
}
```
