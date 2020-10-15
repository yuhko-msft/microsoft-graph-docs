---
title: "microsoftAuthenticatorAuthenticationMethodTarget resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# microsoftAuthenticatorAuthenticationMethodTarget resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethodTarget](authenticationmethodtarget.md)

## Methods

| Method                                                                                                                       | Return Type                                                                                                        | Description                                                                                     |
| :--------------------------------------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------- |
| [List microsoftAuthenticatorAuthenticationMethodTarget](../api/microsoftauthenticatorauthenticationmethodtarget-list.md)     | [microsoftAuthenticatorAuthenticationMethodTarget](microsoftAuthenticatorAuthenticationMethodTarget.md) collection | List properties and relationships of a microsoftAuthenticatorAuthenticationMethodTarget object. |
| [Create microsoftAuthenticatorAuthenticationMethodTarget](../api/microsoftauthenticatorauthenticationmethodtarget-create.md) | [microsoftAuthenticatorAuthenticationMethodTarget](microsoftAuthenticatorAuthenticationMethodTarget.md)            | Create a new microsoftAuthenticatorAuthenticationMethodTarget object.                           |
| [Get microsoftAuthenticatorAuthenticationMethodTarget](../api/microsoftauthenticatorauthenticationmethodtarget-get.md)       | [microsoftAuthenticatorAuthenticationMethodTarget](microsoftAuthenticatorAuthenticationMethodTarget.md)            | Read properties and relationships of a microsoftAuthenticatorAuthenticationMethodTarget object. |
| [Update microsoftAuthenticatorAuthenticationMethodTarget](../api/microsoftauthenticatorauthenticationmethodtarget-update.md) | [microsoftAuthenticatorAuthenticationMethodTarget](microsoftAuthenticatorAuthenticationMethodTarget.md)            | Update the properties of a microsoftAuthenticatorAuthenticationMethodTarget object.             |
| [Delete microsoftAuthenticatorAuthenticationMethodTarget](../api/microsoftauthenticatorauthenticationmethodtarget-delete.md) |                                                                                                                    | Delete a microsoftAuthenticatorAuthenticationMethodTarget object.                               |

## Properties

| Property                 | Type    | Description |
| :----------------------- | :------ | :---------- |
| id                       | String  | Read-only.  |
| isNumberMatchingRequired | Boolean |             |
| isRegistrationRequired   | Boolean |             |
| shownContext             | String  |             |
| targetType               | String  |             |
| useForSignIn             | Boolean |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.microsoftAuthenticatorAuthenticationMethodTarget",
  "baseType": "microsoft.graph.authenticationMethodTarget",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.microsoftAuthenticatorAuthenticationMethodTarget",
  "id": "String (identifier)",
  "isNumberMatchingRequired": "Boolean",
  "isRegistrationRequired": "Boolean",
  "shownContext": "location | app",
  "targetType": "user | group | unknownFutureValue",
  "useForSignIn": "Boolean"
}
```
