---
title: "Delete namedItem"
description: "Delete the specified named item in a workbook."
author: "isvargasmsft"
localization_priority: Normal
ms.prod: "excel"
doc_type: apiPageType
---

# Delete namedItem

Namespace: microsoft.graph

Delete the specified [namedItem](../resources/nameditem.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged)              |
|:--------------------|:---------------------------------------------------------|
|Delegated (work or school account) | Files.ReadWrite.Selected, Files.ReadWrite.AppFolder, Files.ReadWrite, Files.ReadWrite.All, Sites.ReadWrite.All, Sites.Manage.All, Sites.FullControl.All    |
|Delegated (personal Microsoft account) | Files.ReadWrite, Files.ReadWrite.All    |
|Application | Files.ReadWrite.All, Sites.ReadWrite.All, Sites.Manage.All, Sites.FullControl.All   |

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
| Workbook-Session-ID  | Workbook session ID that determines if changes are persisted or not. Optional.|

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
DELETE https://graph.microsoft.com/v1.0/me/drive/items/{itemID}/workbook/names/{name}
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

