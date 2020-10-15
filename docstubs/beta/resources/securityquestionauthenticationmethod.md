---
title: "securityQuestionAuthenticationMethod resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# securityQuestionAuthenticationMethod resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [authenticationMethod](authenticationmethod.md)

## Methods

| Method                                                                                               | Return Type                                                                                | Description                                                                         |
| :--------------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------- |
| [List securityQuestionAuthenticationMethod](../api/securityquestionauthenticationmethod-list.md)     | [securityQuestionAuthenticationMethod](securityQuestionAuthenticationMethod.md) collection | List properties and relationships of a securityQuestionAuthenticationMethod object. |
| [Create securityQuestionAuthenticationMethod](../api/securityquestionauthenticationmethod-create.md) | [securityQuestionAuthenticationMethod](securityQuestionAuthenticationMethod.md)            | Create a new securityQuestionAuthenticationMethod object.                           |
| [Get securityQuestionAuthenticationMethod](../api/securityquestionauthenticationmethod-get.md)       | [securityQuestionAuthenticationMethod](securityQuestionAuthenticationMethod.md)            | Read properties and relationships of a securityQuestionAuthenticationMethod object. |
| [Update securityQuestionAuthenticationMethod](../api/securityquestionauthenticationmethod-update.md) | [securityQuestionAuthenticationMethod](securityQuestionAuthenticationMethod.md)            | Update the properties of a securityQuestionAuthenticationMethod object.             |
| [Delete securityQuestionAuthenticationMethod](../api/securityquestionauthenticationmethod-delete.md) |                                                                                            | Delete a securityQuestionAuthenticationMethod object.                               |
| [disableSmsSignIn](../api/securityquestionauthenticationmethod-disableSmsSignIn.md)                  |                                                                                            |                                                                                     |
| [enableSmsSignIn](../api/securityquestionauthenticationmethod-enableSmsSignIn.md)                    |                                                                                            |                                                                                     |
| [resetPassword](../api/securityquestionauthenticationmethod-resetPassword.md)                        | passwordResetResponse                                                                      |                                                                                     |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| answer   | String |             |
| id       | String | Read-only.  |
| question | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.securityQuestionAuthenticationMethod",
  "baseType": "microsoft.graph.authenticationMethod",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.securityQuestionAuthenticationMethod",
  "answer": "String",
  "id": "String (identifier)",
  "question": "String"
}
```
