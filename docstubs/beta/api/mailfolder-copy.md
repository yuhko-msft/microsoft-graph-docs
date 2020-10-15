---
title: "mailfolder : copy"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# mailfolder : copy

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

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

| Parameter     | Type   | Description |
| :------------ | :----- | :---------- |
| DestinationId | String |             |

<!-- CRUD Methods -->

## Response

If successful, this method returns a `200 Ok` response code and a mailFolder object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "mailfolder_copy"
}
-->

```http
POST https://graph.microsoft.com/beta/users/{id}/mailFolders/{id}/copy

Content-Type: application/json
Content-Length: 234

{
  "@odata.type": "#microsoft.graph.mailFolder",
  "childFolderCount": "Int32",
  "displayName": "String",
  "parentFolderId": "String",
  "totalItemCount": "Int32",
  "unreadItemCount": "Int32",
  "wellKnownName": "String"
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
HTTP 1.1 200 Ok

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.mailFolder",
  "childFolderCount": "Int32",
  "displayName": "String",
  "id": "String(identifier)",
  "parentFolderId": "String",
  "totalItemCount": "Int32",
  "unreadItemCount": "Int32",
  "wellKnownName": "String"
}
}

```
