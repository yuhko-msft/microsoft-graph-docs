---
title: "List mailFolders"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# List mailFolders

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the mailFolder objects from a mailFolders navigation property.

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

## Optional query parameters

This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers

| Name          | Description               |
| :------------ | :------------------------ |
| Authorization | Bearer {token}. Required. |

## Request Body

<!-- Actions and Functions -->

<!-- CRUD Methods -->

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 Ok` response code and a mailFolder object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "list_mailfolders"
}
-->

```http
GET https://graph.microsoft.com/beta

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
HTTP 1.1 200 Ok

Content-Type: application/json
{
  "value": [
  {
    "@odata.type": "#microsoft.graph.mailFolder",
    "childFolderCount": "Int32",
    "displayName": "String",
    "id": "String(identifier)",
    "parentFolderId": "String",
    "totalItemCount": "Int32",
    "unreadItemCount": "Int32",
    "wellKnownName": "String"
  }
]
}

```
