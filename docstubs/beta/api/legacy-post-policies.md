---
title: "Create policies"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create policies

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new policy object.

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

In the request body, supply JSON representation of the [policy](../resources/-policy.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a policy object.

| Property              | Type                                                      | Description |
| :-------------------- | :-------------------------------------------------------- | :---------- |
| alternativeIdentifier | String                                                    |             |
| definition            | String collection                                         |             |
| displayName           | String                                                    |             |
| isOrganizationDefault | Boolean                                                   |             |
| keyCredentials        | [keyCredential](../resources/keycredential.md) collection |             |
| type                  | String                                                    |             |

## Response

If successful, this method returns a `201 Created` response code and a policy object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_policies"
}
-->

```http
POST https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 691

[
  {
    "@odata.type": "#microsoft.graph.policy",
    "alternativeIdentifier": "String",
    "definition": [
      "String"
    ],
    "deletedDateTime": "DateTimeOffset",
    "displayName": "String",
    "id": "String(identifier)",
    "isOrganizationDefault": "Boolean",
    "keyCredentials": [
      {
        "@odata.type": "#microsoft.graph.keyCredential",
        "customKeyIdentifier": "Binary",
        "displayName": "String",
        "endDateTime": "DateTimeOffset",
        "key": "Binary",
        "keyId": "Guid",
        "startDateTime": "DateTimeOffset",
        "type": "String",
        "usage": "String"
      }
    ],
    "type": "String"
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
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": [
  {
    "@odata.type": "#microsoft.graph.policy",
    "alternativeIdentifier": "String",
    "definition": [
      "String"
    ],
    "deletedDateTime": "DateTimeOffset",
    "displayName": "String",
    "id": "String(identifier)",
    "isOrganizationDefault": "Boolean",
    "keyCredentials": [
      {
        "@odata.type": "#microsoft.graph.keyCredential",
        "customKeyIdentifier": "Binary",
        "displayName": "String",
        "endDateTime": "DateTimeOffset",
        "key": "Binary",
        "keyId": "Guid",
        "startDateTime": "DateTimeOffset",
        "type": "String",
        "usage": "String"
      }
    ],
    "type": "String"
  }
]
}

```
