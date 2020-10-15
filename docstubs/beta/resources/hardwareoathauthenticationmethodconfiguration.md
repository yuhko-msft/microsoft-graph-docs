---
title: "hardwareOathAuthenticationMethodConfiguration resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# hardwareOathAuthenticationMethodConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethodConfiguration](authenticationmethodconfiguration.md)

## Methods

| Method                                                                                                                 | Return Type                                                                                                  | Description                                                                                  |
| :--------------------------------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------- |
| [List hardwareOathAuthenticationMethodConfiguration](../api/hardwareoathauthenticationmethodconfiguration-list.md)     | [hardwareOathAuthenticationMethodConfiguration](hardwareOathAuthenticationMethodConfiguration.md) collection | List properties and relationships of a hardwareOathAuthenticationMethodConfiguration object. |
| [Create hardwareOathAuthenticationMethodConfiguration](../api/hardwareoathauthenticationmethodconfiguration-create.md) | [hardwareOathAuthenticationMethodConfiguration](hardwareOathAuthenticationMethodConfiguration.md)            | Create a new hardwareOathAuthenticationMethodConfiguration object.                           |
| [Get hardwareOathAuthenticationMethodConfiguration](../api/hardwareoathauthenticationmethodconfiguration-get.md)       | [hardwareOathAuthenticationMethodConfiguration](hardwareOathAuthenticationMethodConfiguration.md)            | Read properties and relationships of a hardwareOathAuthenticationMethodConfiguration object. |
| [Update hardwareOathAuthenticationMethodConfiguration](../api/hardwareoathauthenticationmethodconfiguration-update.md) | [hardwareOathAuthenticationMethodConfiguration](hardwareOathAuthenticationMethodConfiguration.md)            | Update the properties of a hardwareOathAuthenticationMethodConfiguration object.             |
| [Delete hardwareOathAuthenticationMethodConfiguration](../api/hardwareoathauthenticationmethodconfiguration-delete.md) |                                                                                                              | Delete a hardwareOathAuthenticationMethodConfiguration object.                               |
| [List includeTargets](../api/hardwareoathauthenticationmethodconfiguration-list-includetargets.md)                     | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                                    | Get the authenticationMethodTarget objects from an includeTargets navigation property.       |
| [Create includeTargets](../api/hardwareoathauthenticationmethodconfiguration-post-includetargets.md)                   | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                                    | Create a new authenticationMethodTarget object.                                              |
| [Get includeTargets](../api/hardwareoathauthenticationmethodconfiguration-get-includetargets.md)                       | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                                    | Read the properties and relationships of an authenticationMethodTarget object.               |
| [Update includeTargets](../api/hardwareoathauthenticationmethodconfiguration-update-includetargets.md)                 | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                                    | Update the properties of an authenticationMethodTarget object.                               |
| [Delete includeTargets](../api/hardwareoathauthenticationmethodconfiguration-delete-includetargets.md)                 |                                                                                                              | Delete an authenticationMethodTarget object.                                                 |

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
  "@odata.type": "microsoft.graph.hardwareOathAuthenticationMethodConfiguration",
  "baseType": "microsoft.graph.authenticationMethodConfiguration",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.hardwareOathAuthenticationMethodConfiguration",
  "id": "String (identifier)",
  "state": "enabled | disabled"
}
```
