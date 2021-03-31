---
title: "Delete namedItem"
description: "Delete the specified named item in a workbook."
author: "isvargasmsft"
localization_priority: Normal
ms.prod: ""
doc_type: apiPageType
---

# Delete namedItem

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Delete the specified [namedItem](../resources/nameditem.md) object.

## Permisions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged)              |
|:--------------------|:---------------------------------------------------------|
|Delegated (work or school account) | Files.ReadWrite, Sites.Read.All    |
|Delegated (personal Microsoft account) | Files.ReadWrite    |
|Application | Sites.Read.All |

## HTTP request
<!-- { "blockType": "ignored" } -->
```http
DELETE /me/drive/items/{id}/workbook/names/{name}
DELETE /me/drive/root:/{item-path}:/workbook/names/{name}
DELETE /me/drive/items/{id}/workbook/worksheets/{id|name}/names/{name}
DELETE /me/drive/root:/{item-path}:/workbook/worksheets/{id|name}/names/{name}
```

## Request headers
| Name       | Description|
|:---------------|:----------|
| Authorization  | Bearer {token}. Required. |

## Request body
Do not supply a request body for this method.

## Response
If successful, this method returns `204 No Content` response code. It does not return anything in the response body.

## Example
##### Request
<!-- {
  "blockType": "request",
  "name": "delete_nameditem"
}-->
```http
DELETE https://graph.microsoft.com/beta/me/drive/items/{itemID}/workbook/names/{name}
```

##### Response
Here is an example of the response. 
<!-- {
  "blockType": "response",
  "isEmpty": true
} -->
```http
HTTP/1.1 204 No Content
```

