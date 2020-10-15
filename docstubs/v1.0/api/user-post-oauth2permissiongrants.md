---
title: "Add oauth2PermissionGrants"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Add oauth2PermissionGrants

Namespace: microsoft.graph

Add oAuth2PermissionGrant by posting to the oAuth2PermissionGrant collection.

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

In the request body, supply JSON representation of the [oAuth2PermissionGrant](../resources/-oauth2permissiongrant.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an oAuth2PermissionGrant object.

| Property    | Type   | Description |
| :---------- | :----- | :---------- |
| clientId    | String |             |
| consentType | String |             |
| id          | String | Read-only.  |
| principalId | String |             |
| resourceId  | String |             |
| scope       | String |             |

## Response

If successful, this method returns a `201 Created` response code and an oAuth2PermissionGrant object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "add_oauth2permissiongrants"
}
-->

```http
POST https://graph.microsoft.com/v1.0

Content-Type: application/json
Content-Length: 248

[
  {
    "@odata.type": "#microsoft.graph.oAuth2PermissionGrant",
    "clientId": "String",
    "consentType": "String",
    "id": "String(identifier)",
    "principalId": "String",
    "resourceId": "String",
    "scope": "String"
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
    "@odata.type": "#microsoft.graph.oAuth2PermissionGrant",
    "clientId": "String",
    "consentType": "String",
    "id": "String(identifier)",
    "principalId": "String",
    "resourceId": "String",
    "scope": "String"
  }
]
}

```
