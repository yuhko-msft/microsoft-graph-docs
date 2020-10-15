---
title: "Create scopedRoleMembers"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create scopedRoleMembers

Namespace: microsoft.graph

Create a new scopedRoleMembership object.

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

In the request body, supply JSON representation of the [scopedRoleMembership](../resources/-scopedrolemembership.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a scopedRoleMembership object.

| Property             | Type                                 | Description |
| :------------------- | :----------------------------------- | :---------- |
| administrativeUnitId | String                               |             |
| id                   | String                               | Read-only.  |
| roleId               | String                               |             |
| roleMemberInfo       | [identity](../resources/identity.md) |             |

## Response

If successful, this method returns a `201 Created` response code and a scopedRoleMembership object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_scopedrolemembers"
}
-->

```http
POST https://graph.microsoft.com/v1.0

Content-Type: application/json
Content-Length: 321

[
  {
    "@odata.type": "#microsoft.graph.scopedRoleMembership",
    "administrativeUnitId": "String",
    "id": "String(identifier)",
    "roleId": "String",
    "roleMemberInfo": {
      "@odata.type": "#microsoft.graph.identity",
      "displayName": "String",
      "id": "String(identifier)"
    }
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
    "@odata.type": "#microsoft.graph.scopedRoleMembership",
    "administrativeUnitId": "String",
    "id": "String(identifier)",
    "roleId": "String",
    "roleMemberInfo": {
      "@odata.type": "#microsoft.graph.identity",
      "displayName": "String",
      "id": "String(identifier)"
    }
  }
]
}

```
