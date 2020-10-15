---
title: "emailAuthenticationMethod resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# emailAuthenticationMethod resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethod](authenticationmethod.md)

## Methods

| Method                                                                         | Return Type                                                          | Description                                                               |
| :----------------------------------------------------------------------------- | :------------------------------------------------------------------- | :------------------------------------------------------------------------ |
| [List emailAuthenticationMethod](../api/emailauthenticationmethod-list.md)     | [emailAuthenticationMethod](emailAuthenticationMethod.md) collection | List properties and relationships of an emailAuthenticationMethod object. |
| [Create emailAuthenticationMethod](../api/emailauthenticationmethod-create.md) | [emailAuthenticationMethod](emailAuthenticationMethod.md)            | Create a new emailAuthenticationMethod object.                            |
| [Get emailAuthenticationMethod](../api/emailauthenticationmethod-get.md)       | [emailAuthenticationMethod](emailAuthenticationMethod.md)            | Read properties and relationships of an emailAuthenticationMethod object. |
| [Update emailAuthenticationMethod](../api/emailauthenticationmethod-update.md) | [emailAuthenticationMethod](emailAuthenticationMethod.md)            | Update the properties of an emailAuthenticationMethod object.             |
| [Delete emailAuthenticationMethod](../api/emailauthenticationmethod-delete.md) |                                                                      | Delete an emailAuthenticationMethod object.                               |
| [disableSmsSignIn](../api/emailauthenticationmethod-disableSmsSignIn.md)       |                                                                      |                                                                           |
| [enableSmsSignIn](../api/emailauthenticationmethod-enableSmsSignIn.md)         |                                                                      |                                                                           |
| [resetPassword](../api/emailauthenticationmethod-resetPassword.md)             | passwordResetResponse                                                |                                                                           |

## Properties

| Property     | Type   | Description |
| :----------- | :----- | :---------- |
| emailAddress | String |             |
| id           | String | Read-only.  |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.emailAuthenticationMethod",
  "baseType": "microsoft.graph.authenticationMethod",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.emailAuthenticationMethod",
  "emailAddress": "String",
  "id": "String (identifier)"
}
```
