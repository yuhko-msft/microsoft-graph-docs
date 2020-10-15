---
title: "Create photo"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create photo

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new profilePhoto object.

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

In the request body, supply JSON representation of the [profilePhoto](../resources/-profilephoto.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a profilePhoto object.

| Property | Type   | Description |
| :------- | :----- | :---------- |
| height   | Int32  |             |
| id       | String | Read-only.  |
| width    | Int32  |             |

## Response

If successful, this method returns a `201 Created` response code and a profilePhoto object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_photo"
}
-->

```http
POST https://graph.microsoft.com/beta/users/{id}/photo

Content-Type: application/json
Content-Length: 97

{
  "@odata.type": "#microsoft.graph.profilePhoto",
  "height": "Int32",
  "width": "Int32"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.OutlookServices.profilePhoto"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.profilePhoto",
  "height": "Int32",
  "id": "String(identifier)",
  "width": "Int32"
}
}

```
