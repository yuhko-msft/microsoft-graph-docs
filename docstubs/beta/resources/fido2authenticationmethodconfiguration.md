---
title: "fido2AuthenticationMethodConfiguration resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# fido2AuthenticationMethodConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethodConfiguration](authenticationmethodconfiguration.md)

## Methods

| Method                                                                                                   | Return Type                                                                                    | Description                                                                            |
| :------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------- |
| [List fido2AuthenticationMethodConfiguration](../api/fido2authenticationmethodconfiguration-list.md)     | [fido2AuthenticationMethodConfiguration](fido2AuthenticationMethodConfiguration.md) collection | List properties and relationships of a fido2AuthenticationMethodConfiguration object.  |
| [Create fido2AuthenticationMethodConfiguration](../api/fido2authenticationmethodconfiguration-create.md) | [fido2AuthenticationMethodConfiguration](fido2AuthenticationMethodConfiguration.md)            | Create a new fido2AuthenticationMethodConfiguration object.                            |
| [Get fido2AuthenticationMethodConfiguration](../api/fido2authenticationmethodconfiguration-get.md)       | [fido2AuthenticationMethodConfiguration](fido2AuthenticationMethodConfiguration.md)            | Read properties and relationships of a fido2AuthenticationMethodConfiguration object.  |
| [Update fido2AuthenticationMethodConfiguration](../api/fido2authenticationmethodconfiguration-update.md) | [fido2AuthenticationMethodConfiguration](fido2AuthenticationMethodConfiguration.md)            | Update the properties of a fido2AuthenticationMethodConfiguration object.              |
| [Delete fido2AuthenticationMethodConfiguration](../api/fido2authenticationmethodconfiguration-delete.md) |                                                                                                | Delete a fido2AuthenticationMethodConfiguration object.                                |
| [List includeTargets](../api/fido2authenticationmethodconfiguration-list-includetargets.md)              | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                      | Get the authenticationMethodTarget objects from an includeTargets navigation property. |
| [Create includeTargets](../api/fido2authenticationmethodconfiguration-post-includetargets.md)            | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                      | Create a new authenticationMethodTarget object.                                        |
| [Get includeTargets](../api/fido2authenticationmethodconfiguration-get-includetargets.md)                | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                      | Read the properties and relationships of an authenticationMethodTarget object.         |
| [Update includeTargets](../api/fido2authenticationmethodconfiguration-update-includetargets.md)          | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                      | Update the properties of an authenticationMethodTarget object.                         |
| [Delete includeTargets](../api/fido2authenticationmethodconfiguration-delete-includetargets.md)          |                                                                                                | Delete an authenticationMethodTarget object.                                           |

## Properties

| Property                         | Type                                                         | Description |
| :------------------------------- | :----------------------------------------------------------- | :---------- |
| id                               | String                                                       | Read-only.  |
| isAttestationEnforced            | Boolean                                                      |             |
| isSelfServiceRegistrationAllowed | Boolean                                                      |             |
| keyRestrictions                  | [fido2KeyRestrictions](../resources/fido2keyrestrictions.md) |             |
| state                            | String                                                       |             |

## Relationships

| Relationship   | Type                                                                                | Description |
| :------------- | :---------------------------------------------------------------------------------- | :---------- |
| includeTargets | [authenticationMethodTarget](../resources/authenticationmethodtarget.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.fido2AuthenticationMethodConfiguration",
  "baseType": "microsoft.graph.authenticationMethodConfiguration",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.fido2AuthenticationMethodConfiguration",
  "id": "String (identifier)",
  "isAttestationEnforced": "Boolean",
  "isSelfServiceRegistrationAllowed": "Boolean",
  "keyRestrictions": {"@odata.type": "microsoft.graph.fido2KeyRestrictions"},
  "state": "enabled | disabled"
}
```
