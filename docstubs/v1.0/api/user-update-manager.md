---
title: "Update manager"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update manager

Namespace: microsoft.graph

Update the properties of a directoryObject object.

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

In the request body, supply JSON representation of the [directoryObject](../resources/-directoryobject.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a directoryObject object.

| Property        | Type           | Description |
| :-------------- | :------------- | :---------- |
| deletedDateTime | DateTimeOffset |             |
| id              | String         | Read-only.  |

## Response

If successful, this method returns a `200 OK` response code and a directoryObject object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_manager"
}
-->

```http
PATCH https://graph.microsoft.com/v1.0/me/manager

Content-Type: application/json
Content-Length: 97

{
  "@odata.type": "#microsoft.graph.directoryObject",
  "deletedDateTime": "DateTimeOffset"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.directoryObject"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.directoryObject",
  "deletedDateTime": "DateTimeOffset",
  "id": "String(identifier)"
}
}

```
