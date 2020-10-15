---
title: "temporaryAccessPassAuthenticationMethod resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# temporaryAccessPassAuthenticationMethod resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethod](authenticationmethod.md)

## Methods

| Method                                                                                                     | Return Type                                                                                      | Description                                                                            |
| :--------------------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------- |
| [List temporaryAccessPassAuthenticationMethod](../api/temporaryaccesspassauthenticationmethod-list.md)     | [temporaryAccessPassAuthenticationMethod](temporaryAccessPassAuthenticationMethod.md) collection | List properties and relationships of a temporaryAccessPassAuthenticationMethod object. |
| [Create temporaryAccessPassAuthenticationMethod](../api/temporaryaccesspassauthenticationmethod-create.md) | [temporaryAccessPassAuthenticationMethod](temporaryAccessPassAuthenticationMethod.md)            | Create a new temporaryAccessPassAuthenticationMethod object.                           |
| [Get temporaryAccessPassAuthenticationMethod](../api/temporaryaccesspassauthenticationmethod-get.md)       | [temporaryAccessPassAuthenticationMethod](temporaryAccessPassAuthenticationMethod.md)            | Read properties and relationships of a temporaryAccessPassAuthenticationMethod object. |
| [Update temporaryAccessPassAuthenticationMethod](../api/temporaryaccesspassauthenticationmethod-update.md) | [temporaryAccessPassAuthenticationMethod](temporaryAccessPassAuthenticationMethod.md)            | Update the properties of a temporaryAccessPassAuthenticationMethod object.             |
| [Delete temporaryAccessPassAuthenticationMethod](../api/temporaryaccesspassauthenticationmethod-delete.md) |                                                                                                  | Delete a temporaryAccessPassAuthenticationMethod object.                               |
| [disableSmsSignIn](../api/temporaryaccesspassauthenticationmethod-disableSmsSignIn.md)                     |                                                                                                  |                                                                                        |
| [enableSmsSignIn](../api/temporaryaccesspassauthenticationmethod-enableSmsSignIn.md)                       |                                                                                                  |                                                                                        |
| [resetPassword](../api/temporaryaccesspassauthenticationmethod-resetPassword.md)                           | passwordResetResponse                                                                            |                                                                                        |

## Properties

| Property            | Type           | Description |
| :------------------ | :------------- | :---------- |
| createdDateTime     | DateTimeOffset |             |
| id                  | String         | Read-only.  |
| lifetimeInMinutes   | Int32          |             |
| startDateTime       | DateTimeOffset |             |
| temporaryAccessPass | String         |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.temporaryAccessPassAuthenticationMethod",
  "baseType": "microsoft.graph.authenticationMethod",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.temporaryAccessPassAuthenticationMethod",
  "createdDateTime": "DateTimeOffset",
  "id": "String (identifier)",
  "lifetimeInMinutes": "Int32",
  "startDateTime": "DateTimeOffset",
  "temporaryAccessPass": "String"
}
```
