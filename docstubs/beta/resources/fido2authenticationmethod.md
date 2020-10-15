---
title: "fido2AuthenticationMethod resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# fido2AuthenticationMethod resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethod](authenticationmethod.md)

## Methods

| Method                                                                         | Return Type                                                          | Description                                                              |
| :----------------------------------------------------------------------------- | :------------------------------------------------------------------- | :----------------------------------------------------------------------- |
| [List fido2AuthenticationMethod](../api/fido2authenticationmethod-list.md)     | [fido2AuthenticationMethod](fido2AuthenticationMethod.md) collection | List properties and relationships of a fido2AuthenticationMethod object. |
| [Create fido2AuthenticationMethod](../api/fido2authenticationmethod-create.md) | [fido2AuthenticationMethod](fido2AuthenticationMethod.md)            | Create a new fido2AuthenticationMethod object.                           |
| [Get fido2AuthenticationMethod](../api/fido2authenticationmethod-get.md)       | [fido2AuthenticationMethod](fido2AuthenticationMethod.md)            | Read properties and relationships of a fido2AuthenticationMethod object. |
| [Update fido2AuthenticationMethod](../api/fido2authenticationmethod-update.md) | [fido2AuthenticationMethod](fido2AuthenticationMethod.md)            | Update the properties of a fido2AuthenticationMethod object.             |
| [Delete fido2AuthenticationMethod](../api/fido2authenticationmethod-delete.md) |                                                                      | Delete a fido2AuthenticationMethod object.                               |
| [disableSmsSignIn](../api/fido2authenticationmethod-disableSmsSignIn.md)       |                                                                      |                                                                          |
| [enableSmsSignIn](../api/fido2authenticationmethod-enableSmsSignIn.md)         |                                                                      |                                                                          |
| [resetPassword](../api/fido2authenticationmethod-resetPassword.md)             | passwordResetResponse                                                |                                                                          |

## Properties

| Property                | Type              | Description |
| :---------------------- | :---------------- | :---------- |
| aaGuid                  | String            |             |
| attestationCertificates | String collection |             |
| attestationLevel        | String            |             |
| creationDateTime        | DateTimeOffset    |             |
| displayName             | String            |             |
| id                      | String            | Read-only.  |
| model                   | String            |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.fido2AuthenticationMethod",
  "baseType": "microsoft.graph.authenticationMethod",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.fido2AuthenticationMethod",
  "aaGuid": "String",
  "attestationCertificates": ["String"],
  "attestationLevel": "attested | notAttested | unknownFutureValue",
  "creationDateTime": "DateTimeOffset",
  "displayName": "String",
  "id": "String (identifier)",
  "model": "String"
}
```
