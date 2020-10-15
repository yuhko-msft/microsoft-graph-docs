---
title: "Update emailAuthenticationMethod"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update emailAuthenticationMethod

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an emailAuthenticationMethod object.

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

In the request body, supply JSON representation of the [emailAuthenticationMethod](../resources/-emailauthenticationmethod.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an emailAuthenticationMethod object.

| Property     | Type   | Description |
| :----------- | :----- | :---------- |
| emailAddress | String |             |

## Response

If successful, this method returns a `200 OK` response code and an emailAuthenticationMethod object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_emailauthenticationmethod"
}
-->

```http
PATCH https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 96

{
  "@odata.type": "#microsoft.graph.emailAuthenticationMethod",
  "emailAddress": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.strongAuthentication.emailAuthenticationMethod"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.emailAuthenticationMethod",
  "emailAddress": "String",
  "id": "String(identifier)"
}
}

```
