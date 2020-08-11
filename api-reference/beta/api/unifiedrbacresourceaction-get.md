---
title: "Get unifiedRbacResourceAction"
description: "Retrieve the properties and relationships of a unifiedRbacResourceAction object."
localization_priority: Normal
author: "abhijeetsinha"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Get unifiedRbacResourceAction

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Retrieve the properties and relationships of a [unifiedRbacResourceAction](../resources/unifiedrbacresourceaction.md) object. 

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged)              |
|:--------------------|:---------------------------------------------------------|
|Delegated (work or school account) | RoleManagement.Read.Directory, Directory.Read.All, RoleManagement.ReadWrite.Directory, Directory.ReadWrite.All, Directory.AccessAsUser.All    |
|Delegated (personal Microsoft account) | Not supported.    |
|Application | RoleManagement.Read.Directory, Directory.Read.All, RoleManagement.ReadWrite.Directory, Directory.ReadWrite.All |

## HTTP request

<!-- { "blockType": "ignored" } -->

```http
GET /roleManagement/directory/resourceNamespaces/{namespace-id}/resourceActions/{action-id}
```

## Optional query parameters

This method supports OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers

| Name      |Description|
|:----------|:----------|
| Authorization | Bearer {token} |

## Request body

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and the requested [unifiedRbacResourceAction](../resources/unifiedrbacresourceaction.md) object in the response body.

## Example

### Request

The following is an example of the request.


# [HTTP](#tab/http)
<!-- {
  "blockType": "request",
  "name": "get_unifiedrbacresourceaction"
}-->

```msgraph-interactive
GET https://graph.microsoft.com/beta/roleManagement/directory/resourceNamespaces/microsoft.directory/resourceActions/microsoft.directory-application-create
```
# [C#](#tab/csharp)
[!INCLUDE [sample-code](../includes/snippets/csharp/get-unifiedroledefinition-csharp-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [JavaScript](#tab/javascript)
[!INCLUDE [sample-code](../includes/snippets/javascript/get-unifiedroledefinition-javascript-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [Objective-C](#tab/objc)
[!INCLUDE [sample-code](../includes/snippets/objc/get-unifiedroledefinition-objc-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

---


### Response

The following is an example of the response.

> **Note:** The response object shown here might be shortened for readability. All the properties will be returned from an actual call.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.unifiedRbacResourceAction"
} -->

```http
HTTP/1.1 200 OK
Content-type: application/json


{
  "@odata.context": "https://graph.microsoft.com/beta/$metadata#roleManagement/directory/resourceNamespaces/microsoft.directory/resourceActions/$entity",
  "@odata.type": "#microsoft.graph.unifiedRbacResourceAction",
  "id": "microsoft.directory-application-create",
  "name": "microsoft.directory/application/create",
  "description": "Create application",
  "actionVerb": "POST",
  "resourceScopeId": "microsoft.directory-applications"
}

```

<!-- uuid: 16cd6b66-4b1a-43a1-adaf-3a886856ed98
2019-02-04 14:57:30 UTC -->
<!-- {
  "type": "#page.annotation",
  "description": "Get unifiedRoleDefinition",
  "keywords": "",
  "section": "documentation",
  "tocPath": ""
}-->
