---
title: "softwareOathAuthenticationMethodConfiguration resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# softwareOathAuthenticationMethodConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethodConfiguration](authenticationmethodconfiguration.md)

## Methods

| Method                                                                                                                 | Return Type                                                                                                  | Description                                                                                  |
| :--------------------------------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------- |
| [List softwareOathAuthenticationMethodConfiguration](../api/softwareoathauthenticationmethodconfiguration-list.md)     | [softwareOathAuthenticationMethodConfiguration](softwareOathAuthenticationMethodConfiguration.md) collection | List properties and relationships of a softwareOathAuthenticationMethodConfiguration object. |
| [Create softwareOathAuthenticationMethodConfiguration](../api/softwareoathauthenticationmethodconfiguration-create.md) | [softwareOathAuthenticationMethodConfiguration](softwareOathAuthenticationMethodConfiguration.md)            | Create a new softwareOathAuthenticationMethodConfiguration object.                           |
| [Get softwareOathAuthenticationMethodConfiguration](../api/softwareoathauthenticationmethodconfiguration-get.md)       | [softwareOathAuthenticationMethodConfiguration](softwareOathAuthenticationMethodConfiguration.md)            | Read properties and relationships of a softwareOathAuthenticationMethodConfiguration object. |
| [Update softwareOathAuthenticationMethodConfiguration](../api/softwareoathauthenticationmethodconfiguration-update.md) | [softwareOathAuthenticationMethodConfiguration](softwareOathAuthenticationMethodConfiguration.md)            | Update the properties of a softwareOathAuthenticationMethodConfiguration object.             |
| [Delete softwareOathAuthenticationMethodConfiguration](../api/softwareoathauthenticationmethodconfiguration-delete.md) |                                                                                                              | Delete a softwareOathAuthenticationMethodConfiguration object.                               |
| [List includeTargets](../api/softwareoathauthenticationmethodconfiguration-list-includetargets.md)                     | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                                    | Get the authenticationMethodTarget objects from an includeTargets navigation property.       |
| [Create includeTargets](../api/softwareoathauthenticationmethodconfiguration-post-includetargets.md)                   | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                                    | Create a new authenticationMethodTarget object.                                              |
| [Get includeTargets](../api/softwareoathauthenticationmethodconfiguration-get-includetargets.md)                       | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                                    | Read the properties and relationships of an authenticationMethodTarget object.               |
| [Update includeTargets](../api/softwareoathauthenticationmethodconfiguration-update-includetargets.md)                 | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                                    | Update the properties of an authenticationMethodTarget object.                               |
| [Delete includeTargets](../api/softwareoathauthenticationmethodconfiguration-delete-includetargets.md)                 |                                                                                                              | Delete an authenticationMethodTarget object.                                                 |

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
  "@odata.type": "microsoft.graph.softwareOathAuthenticationMethodConfiguration",
  "baseType": "microsoft.graph.authenticationMethodConfiguration",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.softwareOathAuthenticationMethodConfiguration",
  "id": "String (identifier)",
  "state": "enabled | disabled"
}
```
