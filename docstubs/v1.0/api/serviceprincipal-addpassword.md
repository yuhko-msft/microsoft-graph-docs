---
title: "serviceprincipal : addPassword"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# serviceprincipal : addPassword

Namespace: microsoft.graph

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

In the request body, supply JSON representation of the parameters.

<!-- Actions and Functions -->

The following table shows the parameters that can be used with this method.

| Parameter          | Type                                                     | Description |
| :----------------- | :------------------------------------------------------- | :---------- |
| passwordCredential | [passwordCredential](../resources/passwordcredential.md) |             |

<!-- CRUD Methods -->

## Response

If successful, this method returns a `200 Ok` response code and a passwordCredential object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "serviceprincipal_addpassword"
}
-->

```http
POST https://graph.microsoft.com/v1.0/servicePrincipals/{id}/addPassword

Content-Type: application/json
Content-Length: 266

{
  "@odata.type": "#microsoft.graph.passwordCredential",
  "customKeyIdentifier": "Binary",
  "displayName": "String",
  "endDateTime": "DateTimeOffset",
  "hint": "String",
  "keyId": "Guid",
  "secretText": "String",
  "startDateTime": "DateTimeOffset"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.passwordCredential"
}
-->

```http
HTTP 1.1 200 Ok

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.passwordCredential",
  "customKeyIdentifier": "Binary",
  "displayName": "String",
  "endDateTime": "DateTimeOffset",
  "hint": "String",
  "keyId": "Guid",
  "secretText": "String",
  "startDateTime": "DateTimeOffset"
}
}

```
