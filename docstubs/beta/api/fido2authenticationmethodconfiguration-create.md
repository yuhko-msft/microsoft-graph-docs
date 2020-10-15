---
title: "Create fido2AuthenticationMethodConfiguration"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create fido2AuthenticationMethodConfiguration

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new fido2AuthenticationMethodConfiguration object.

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

In the request body, supply JSON representation of the [fido2AuthenticationMethodConfiguration](../resources/-fido2authenticationmethodconfiguration.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a fido2AuthenticationMethodConfiguration object.

| Property                         | Type                                                         | Description |
| :------------------------------- | :----------------------------------------------------------- | :---------- |
| isAttestationEnforced            | Boolean                                                      |             |
| isSelfServiceRegistrationAllowed | Boolean                                                      |             |
| keyRestrictions                  | [fido2KeyRestrictions](../resources/fido2keyrestrictions.md) |             |

## Response

If successful, this method returns a `201 Created` response code and a fido2AuthenticationMethodConfiguration object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_fido2authenticationmethodconfiguration"
}
-->

```http
POST https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 387

{
  "@odata.type": "#microsoft.graph.fido2AuthenticationMethodConfiguration",
  "isAttestationEnforced": "Boolean",
  "isSelfServiceRegistrationAllowed": "Boolean",
  "keyRestrictions": {
    "@odata.type": "#microsoft.graph.fido2KeyRestrictions",
    "aaGuids": [
      "String"
    ],
    "enforcementType": "String",
    "isEnforced": "Boolean"
  },
  "state": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.authMethodPolicy.fido2AuthenticationMethodConfiguration"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.fido2AuthenticationMethodConfiguration",
  "id": "String(identifier)",
  "isAttestationEnforced": "Boolean",
  "isSelfServiceRegistrationAllowed": "Boolean",
  "keyRestrictions": {
    "@odata.type": "#microsoft.graph.fido2KeyRestrictions",
    "aaGuids": [
      "String"
    ],
    "enforcementType": "String",
    "isEnforced": "Boolean"
  },
  "state": "String"
}
}

```
