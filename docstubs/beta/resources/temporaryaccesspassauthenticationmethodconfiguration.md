---
title: "temporaryAccessPassAuthenticationMethodConfiguration resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# temporaryAccessPassAuthenticationMethodConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethodConfiguration](authenticationmethodconfiguration.md)

## Methods

| Method                                                                                                                               | Return Type                                                                                                                | Description                                                                                         |
| :----------------------------------------------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------------- | :-------------------------------------------------------------------------------------------------- |
| [List temporaryAccessPassAuthenticationMethodConfiguration](../api/temporaryaccesspassauthenticationmethodconfiguration-list.md)     | [temporaryAccessPassAuthenticationMethodConfiguration](temporaryAccessPassAuthenticationMethodConfiguration.md) collection | List properties and relationships of a temporaryAccessPassAuthenticationMethodConfiguration object. |
| [Create temporaryAccessPassAuthenticationMethodConfiguration](../api/temporaryaccesspassauthenticationmethodconfiguration-create.md) | [temporaryAccessPassAuthenticationMethodConfiguration](temporaryAccessPassAuthenticationMethodConfiguration.md)            | Create a new temporaryAccessPassAuthenticationMethodConfiguration object.                           |
| [Get temporaryAccessPassAuthenticationMethodConfiguration](../api/temporaryaccesspassauthenticationmethodconfiguration-get.md)       | [temporaryAccessPassAuthenticationMethodConfiguration](temporaryAccessPassAuthenticationMethodConfiguration.md)            | Read properties and relationships of a temporaryAccessPassAuthenticationMethodConfiguration object. |
| [Update temporaryAccessPassAuthenticationMethodConfiguration](../api/temporaryaccesspassauthenticationmethodconfiguration-update.md) | [temporaryAccessPassAuthenticationMethodConfiguration](temporaryAccessPassAuthenticationMethodConfiguration.md)            | Update the properties of a temporaryAccessPassAuthenticationMethodConfiguration object.             |
| [Delete temporaryAccessPassAuthenticationMethodConfiguration](../api/temporaryaccesspassauthenticationmethodconfiguration-delete.md) |                                                                                                                            | Delete a temporaryAccessPassAuthenticationMethodConfiguration object.                               |
| [List includeTargets](../api/temporaryaccesspassauthenticationmethodconfiguration-list-includetargets.md)                            | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                                                  | Get the authenticationMethodTarget objects from an includeTargets navigation property.              |
| [Create includeTargets](../api/temporaryaccesspassauthenticationmethodconfiguration-post-includetargets.md)                          | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                                                  | Create a new authenticationMethodTarget object.                                                     |
| [Get includeTargets](../api/temporaryaccesspassauthenticationmethodconfiguration-get-includetargets.md)                              | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                                                  | Read the properties and relationships of an authenticationMethodTarget object.                      |
| [Update includeTargets](../api/temporaryaccesspassauthenticationmethodconfiguration-update-includetargets.md)                        | [authenticationMethodTarget](../resources/-authenticationmethodtarget.md)                                                  | Update the properties of an authenticationMethodTarget object.                                      |
| [Delete includeTargets](../api/temporaryaccesspassauthenticationmethodconfiguration-delete-includetargets.md)                        |                                                                                                                            | Delete an authenticationMethodTarget object.                                                        |

## Properties

| Property                 | Type    | Description |
| :----------------------- | :------ | :---------- |
| defaultLength            | Int32   |             |
| defaultLifetimeInMinutes | Int32   |             |
| id                       | String  | Read-only.  |
| isUsableOnce             | Boolean |             |
| maximumLifetimeInMinutes | Int32   |             |
| minimumLifetimeInMinutes | Int32   |             |
| state                    | String  |             |

## Relationships

| Relationship   | Type                                                                                | Description |
| :------------- | :---------------------------------------------------------------------------------- | :---------- |
| includeTargets | [authenticationMethodTarget](../resources/authenticationmethodtarget.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.temporaryAccessPassAuthenticationMethodConfiguration",
  "baseType": "microsoft.graph.authenticationMethodConfiguration",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.temporaryAccessPassAuthenticationMethodConfiguration",
  "defaultLength": "Int32",
  "defaultLifetimeInMinutes": "Int32",
  "id": "String (identifier)",
  "isUsableOnce": "Boolean",
  "maximumLifetimeInMinutes": "Int32",
  "minimumLifetimeInMinutes": "Int32",
  "state": "enabled | disabled"
}
```
