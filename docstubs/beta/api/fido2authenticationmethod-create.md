---
title: "Create fido2AuthenticationMethod"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create fido2AuthenticationMethod

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new fido2AuthenticationMethod object.

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

In the request body, supply JSON representation of the [fido2AuthenticationMethod](../resources/-fido2authenticationmethod.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a fido2AuthenticationMethod object.

| Property                | Type              | Description |
| :---------------------- | :---------------- | :---------- |
| aaGuid                  | String            |             |
| attestationCertificates | String collection |             |
| attestationLevel        | String            |             |
| creationDateTime        | DateTimeOffset    |             |
| displayName             | String            |             |
| model                   | String            |             |

## Response

If successful, this method returns a `201 Created` response code and a fido2AuthenticationMethod object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_fido2authenticationmethod"
}
-->

```http
POST https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 266

{
  "@odata.type": "#microsoft.graph.fido2AuthenticationMethod",
  "aaGuid": "String",
  "attestationCertificates": [
    "String"
  ],
  "attestationLevel": "String",
  "creationDateTime": "DateTimeOffset",
  "displayName": "String",
  "model": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.strongAuthentication.fido2AuthenticationMethod"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.fido2AuthenticationMethod",
  "aaGuid": "String",
  "attestationCertificates": [
    "String"
  ],
  "attestationLevel": "String",
  "creationDateTime": "DateTimeOffset",
  "displayName": "String",
  "id": "String(identifier)",
  "model": "String"
}
}

```
