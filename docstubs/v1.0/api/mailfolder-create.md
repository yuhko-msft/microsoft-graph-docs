---
title: "Create mailFolder"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create mailFolder

Namespace: microsoft.graph

Create a new mailFolder object.

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

In the request body, supply JSON representation of the [mailFolder](../resources/-mailfolder.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a mailFolder object.

| Property         | Type   | Description |
| :--------------- | :----- | :---------- |
| childFolderCount | Int32  |             |
| displayName      | String |             |
| id               | String | Read-only.  |
| parentFolderId   | String |             |
| totalItemCount   | Int32  |             |
| unreadItemCount  | Int32  |             |

## Response

If successful, this method returns a `201 Created` response code and a mailFolder object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_mailfolder"
}
-->

```http
POST https://graph.microsoft.com/v1.0/users/{id}/mailFolders/{id}

Content-Type: application/json
Content-Length: 204

{
  "@odata.type": "#microsoft.graph.mailFolder",
  "childFolderCount": "Int32",
  "displayName": "String",
  "parentFolderId": "String",
  "totalItemCount": "Int32",
  "unreadItemCount": "Int32"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.OutlookServices.mailFolder"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.mailFolder",
  "childFolderCount": "Int32",
  "displayName": "String",
  "id": "String(identifier)",
  "parentFolderId": "String",
  "totalItemCount": "Int32",
  "unreadItemCount": "Int32"
}
}

```
