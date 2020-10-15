---
title: "qrAuthenticationMethodConfiguration resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# qrAuthenticationMethodConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethodConfiguration](authenticationmethodconfiguration.md)

## Methods

| Method                                                                                             | Return Type                                                                              | Description                                                                            |
| :------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------- |
| [List qrAuthenticationMethodConfiguration](../api/qrauthenticationmethodconfiguration-list.md)     | [qrAuthenticationMethodConfiguration](qrAuthenticationMethodConfiguration.md) collection | List properties and relationships of a qrAuthenticationMethodConfiguration object.     |
| [Create qrAuthenticationMethodConfiguration](../api/qrauthenticationmethodconfiguration-create.md) | [qrAuthenticationMethodConfiguration](qrAuthenticationMethodConfiguration.md)            | Create a new qrAuthenticationMethodConfiguration object.                               |
| [Get qrAuthenticationMethodConfiguration](../api/qrauthenticationmethodconfiguration-get.md)       | [qrAuthenticationMethodConfiguration](qrAuthenticationMethodConfiguration.md)            | Read properties and relationships of a qrAuthenticationMethodConfiguration object.     |
| [Update qrAuthenticationMethodConfiguration](../api/qrauthenticationmethodconfiguration-update.md) | [qrAuthenticationMethodConfiguration](qrAuthenticationMethodConfiguration.md)            | Update the properties of a qrAuthenticationMethodConfiguration object.                 |
| [Delete qrAuthenticationMethodConfiguration](../api/qrauthenticationmethodconfiguration-delete.md) |                                                                                          | Delete a qrAuthenticationMethodConfiguration object.                                   |
| [List includeTargets](../api/qrauthenticationmethodconfiguration-list-includetargets.md)           | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                | Get the authenticationMethodTarget objects from an includeTargets navigation property. |
| [Create includeTargets](../api/qrauthenticationmethodconfiguration-post-includetargets.md)         | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                | Create a new authenticationMethodTarget object.                                        |
| [Get includeTargets](../api/qrauthenticationmethodconfiguration-get-includetargets.md)             | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                | Read the properties and relationships of an authenticationMethodTarget object.         |
| [Update includeTargets](../api/qrauthenticationmethodconfiguration-update-includetargets.md)       | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                | Update the properties of an authenticationMethodTarget object.                         |
| [Delete includeTargets](../api/qrauthenticationmethodconfiguration-delete-includetargets.md)       |                                                                                          | Delete an authenticationMethodTarget object.                                           |

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
  "@odata.type": "microsoft.graph.qrAuthenticationMethodConfiguration",
  "baseType": "microsoft.graph.authenticationMethodConfiguration",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.qrAuthenticationMethodConfiguration",
  "id": "String (identifier)",
  "state": "enabled | disabled"
}
```
