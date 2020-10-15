---
title: "Create certificateBasedAuthConfiguration"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create certificateBasedAuthConfiguration

Namespace: microsoft.graph

Create a new certificateBasedAuthConfiguration object.

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

In the request body, supply JSON representation of the [certificateBasedAuthConfiguration](../resources/-certificatebasedauthconfiguration.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a certificateBasedAuthConfiguration object.

| Property               | Type                                                                    | Description |
| :--------------------- | :---------------------------------------------------------------------- | :---------- |
| certificateAuthorities | [certificateAuthority](../resources/certificateauthority.md) collection |             |
| id                     | String                                                                  | Read-only.  |

## Response

If successful, this method returns a `201 Created` response code and a certificateBasedAuthConfiguration object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_certificatebasedauthconfiguration"
}
-->

```http
POST https://graph.microsoft.com/v1.0/certificateBasedAuthConfiguration/{id}

Content-Type: application/json
Content-Length: 417

{
  "@odata.type": "#microsoft.graph.certificateBasedAuthConfiguration",
  "certificateAuthorities": [
    {
      "@odata.type": "#microsoft.graph.certificateAuthority",
      "certificate": "Binary",
      "certificateRevocationListUrl": "String",
      "deltaCertificateRevocationListUrl": "String",
      "isRootAuthority": "Boolean",
      "issuer": "String",
      "issuerSki": "String"
    }
  ]
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.certificateBasedAuthConfiguration"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.certificateBasedAuthConfiguration",
  "certificateAuthorities": [
    {
      "@odata.type": "#microsoft.graph.certificateAuthority",
      "certificate": "Binary",
      "certificateRevocationListUrl": "String",
      "deltaCertificateRevocationListUrl": "String",
      "isRootAuthority": "Boolean",
      "issuer": "String",
      "issuerSki": "String"
    }
  ],
  "id": "String(identifier)"
}
}

```
