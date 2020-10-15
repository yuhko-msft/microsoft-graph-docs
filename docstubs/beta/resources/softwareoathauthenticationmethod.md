---
title: "softwareOathAuthenticationMethod resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# softwareOathAuthenticationMethod resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethod](authenticationmethod.md)

## Methods

| Method                                                                                       | Return Type                                                                        | Description                                                                     |
| :------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------- | :------------------------------------------------------------------------------ |
| [List softwareOathAuthenticationMethod](../api/softwareoathauthenticationmethod-list.md)     | [softwareOathAuthenticationMethod](softwareOathAuthenticationMethod.md) collection | List properties and relationships of a softwareOathAuthenticationMethod object. |
| [Create softwareOathAuthenticationMethod](../api/softwareoathauthenticationmethod-create.md) | [softwareOathAuthenticationMethod](softwareOathAuthenticationMethod.md)            | Create a new softwareOathAuthenticationMethod object.                           |
| [Get softwareOathAuthenticationMethod](../api/softwareoathauthenticationmethod-get.md)       | [softwareOathAuthenticationMethod](softwareOathAuthenticationMethod.md)            | Read properties and relationships of a softwareOathAuthenticationMethod object. |
| [Update softwareOathAuthenticationMethod](../api/softwareoathauthenticationmethod-update.md) | [softwareOathAuthenticationMethod](softwareOathAuthenticationMethod.md)            | Update the properties of a softwareOathAuthenticationMethod object.             |
| [Delete softwareOathAuthenticationMethod](../api/softwareoathauthenticationmethod-delete.md) |                                                                                    | Delete a softwareOathAuthenticationMethod object.                               |
| [disableSmsSignIn](../api/softwareoathauthenticationmethod-disableSmsSignIn.md)              |                                                                                    |                                                                                 |
| [enableSmsSignIn](../api/softwareoathauthenticationmethod-enableSmsSignIn.md)                |                                                                                    |                                                                                 |
| [resetPassword](../api/softwareoathauthenticationmethod-resetPassword.md)                    | passwordResetResponse                                                              |                                                                                 |

## Properties

| Property              | Type   | Description |
| :-------------------- | :----- | :---------- |
| id                    | String | Read-only.  |
| secretKey             | String |             |
| timeIntervalInSeconds | Int32  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.softwareOathAuthenticationMethod",
  "baseType": "microsoft.graph.authenticationMethod",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.softwareOathAuthenticationMethod",
  "id": "String (identifier)",
  "secretKey": "String",
  "timeIntervalInSeconds": "Int32"
}
```
