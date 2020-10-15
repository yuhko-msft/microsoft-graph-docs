---
title: "Update phoneMethods"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update phoneMethods

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a phoneAuthenticationMethod object.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

| Permission type                        | Permissions (from most to least privileged) |
| :------------------------------------- | :------------------------------------------ |
| Delegated (work or school account)     |                                             |
| Delegated (personal Microsoft account) |                                             |
| Application                            |                                             |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

```http

```

## Request headers

| Name          | Description                 |
| :------------ | :-------------------------- |
| Authorization | Bearer {token}. Required.   |
| Content-Type  | application/json. Required. |

## Request Body

In the request body, supply JSON representation of the [phoneAuthenticationMethod](../resources/-phoneauthenticationmethod.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a phoneAuthenticationMethod object.

| Property       | Type   | Description |
| :------------- | :----- | :---------- |
| phoneNumber    | String |             |
| phoneType      | String |             |
| smsSignInState | String |             |

## Response

If successful, this method returns a `200 OK` response code and a phoneAuthenticationMethod object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_phonemethods"
}
-->

```http
PATCH https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 203

[
  {
    "@odata.type": "#microsoft.graph.phoneAuthenticationMethod",
    "id": "String(identifier)",
    "phoneNumber": "String",
    "phoneType": "String",
    "smsSignInState": "String"
  }
]

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "$(this.ReturnTypeFullName)"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": [
  {
    "@odata.type": "#microsoft.graph.phoneAuthenticationMethod",
    "id": "String(identifier)",
    "phoneNumber": "String",
    "phoneType": "String",
    "smsSignInState": "String"
  }
]
}

```
