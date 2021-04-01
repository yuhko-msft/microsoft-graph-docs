---
title: "Get unifiedRbacResourceNamespace"
description: "Retrieve the properties and relationships of a unifiedRbacResourceNamespace object."
localization_priority: Normal
author: "abhijeetsinha"
ms.prod: "directory-management"
doc_type: "apiPageType"
---

# Get unifiedRbacResourceNamespace

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Retrieve the properties and relationships of a [unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) object. 

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged)              |
|:--------------------|:---------------------------------------------------------|
|Delegated (work or school account) | RoleManagement.Read.Directory, RoleManagement.Read.All, Directory.Read.All, RoleManagement.ReadWrite.Directory, Directory.ReadWrite.All, Directory.AccessAsUser.All    |
|Delegated (personal Microsoft account) | Not supported.    |
|Application | RoleManagement.Read.Directory, RoleManagement.Read.All, Directory.Read.All, RoleManagement.ReadWrite.Directory, Directory.ReadWrite.All |

## HTTP request

<!-- { "blockType": "ignored" } -->

```http
GET /roleManagement/directory/resourceNamespaces/{id}
```

## Optional query parameters

This method supports OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

| Pattern          | Supported | Syntax | Notes            |
| ---------------- | :-------: | ------ | ---------------- |
| $top, $skiptoken |     ✓     |        |                  |
| $select          |     ✓     |        |                  |
| $filter          |     ✓     |        | Supports: `name` |
| $expand          |     ✓     |        |                  |
| $count           |     ✓     |        |                  |
| $orderby         |     X     |        |                  |
| $search          |     X     |        |                  |
| $skip            |     X     |        |                  |

## Request headers

| Name      |Description|
|:----------|:----------|
| Authorization | Bearer {token} |

## Request body

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and the requested [unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) object in the response body.

## Example

### Request

The following is an example of the request.


# [HTTP](#tab/http)
<!-- {
  "blockType": "request",
  "name": "get_unifiedrbacresourcenamespace"
}-->

```msgraph-interactive
GET https://graph.microsoft.com/beta/roleManagement/directory/resourceNamespaces/microsoft.directory
```
---


### Response

The following is an example of the response.

> **Note:** The response object shown here might be shortened for readability. All the properties will be returned from an actual call.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.unifiedRbacResourceNamespace"
} -->

```http
HTTP/1.1 200 OK
Content-type: application/json

{
    "@odata.context": "https://graph.microsoft.com/beta/$metadata#roleManagement/directory/resourceNamespaces/$entity",
    "id": "microsoft.directory",
    "name": "microsoft.directory"
}

```

<!-- uuid: 16cd6b66-4b1a-43a1-adaf-3a886856ed98
2019-02-04 14:57:30 UTC -->
<!-- {
  "type": "#page.annotation",
  "description": "Get unifiedRbacResourceNamespace",
  "keywords": "",
  "section": "documentation",
  "tocPath": ""
}-->
