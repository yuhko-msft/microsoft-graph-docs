---
title: "List unifiedRbacResourceAction"
description: "Get a list of unifiedRbacResourceAction objects."
localization_priority: Normal
author: "abhijeetsinha"
ms.prod: "microsoft-directory-management"
doc_type: "apiPageType"
---

# List unifiedRbacResourceAction

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of [unifiedRbacResourceAction](../resources/unifiedrbacresourceaction.md) objects for a provider. 

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
GET /roleManagement/directory/resourceNamespaces/{namespace-id}/resourceActions
```

## Optional query parameters

This method supports OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

| Pattern          | Supported | Syntax | Notes                                     |
| ---------------- | :-------: | ------ | ----------------------------------------- |
| $top, $skiptoken |     ✓     |        |                                           |
| $select          |     ✓     |        |                                           |
| $filter          |     ✓     |        | Supports: `actionVerb`, `resourceScopeId` |
| $expand          |     ✓     |        | Supports: `resourceScope`                 |
| $count           |     ✓     |        |                                           |
| $orderby         |     X     |        |                                           |
| $search          |     X     |        |                                           |
| $skip            |     X     |        |                                           |

## Request headers

| Name      |Description|
|:----------|:----------|
| Authorization | Bearer {token} |

## Request body

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [unifiedRbacResourceAction](../resources/unifiedrbacresourceaction.md) objects in the response body.

## Example

### Request

The following is an example of the request.


# [HTTP](#tab/http)
<!-- {
  "blockType": "request",
  "name": "list_unifiedrbacresourceaction"
}-->

```msgraph-interactive
GET https://graph.microsoft.com/beta/roleManagement/directory/resourceNamespaces/microsoft.directory/resourceActions
```
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
  "@odata.context": "https://graph.microsoft.com/beta/$metadata#roleManagement/directory/resourceNamespaces('microsoft.directory')/resourceActions",
  "value": [
      {
          "actionVerb": "GET",
          "description": "Read members of administrative units",
          "id": "microsoft.directory-administrativeUnits-members-read-get",
          "name": "microsoft.directory/administrativeUnits/members/read",
          "resourceScopeId": null
      },
      {
          "actionVerb": "GET",
          "description": "Read all properties (including privileged properties) on application policies",
          "id": "microsoft.directory-applicationPolicies-allProperties-read-get",
          "name": "microsoft.directory/applicationPolicies/allProperties/read",
          "resourceScopeId": null
      },
      {
          "actionVerb": "PATCH",
          "description": "Update all properties (including privileged properties) on application policies",
          "id": "microsoft.directory-applicationPolicies-allProperties-update-patch",
          "name": "microsoft.directory/applicationPolicies/allProperties/update",
          "resourceScopeId": null
      },
      {
          "actionVerb": "POST",
          "description": "Create application policies, and creator is added as the first owner",
          "id": "microsoft.directory-applicationPolicies-createAsOwner-post",
          "name": "microsoft.directory/applicationPolicies/createAsOwner",
          "resourceScopeId": null
      },
      {
          "actionVerb": "DELETE",
          "description": "Delete application policies",
          "id": "microsoft.directory-applicationPolicies-delete-delete",
          "name": "microsoft.directory/applicationPolicies/delete",
          "resourceScopeId": null
      }
  ]
}

```

<!-- uuid: 16cd6b66-4b1a-43a1-adaf-3a886856ed98
2019-02-04 14:57:30 UTC -->
<!-- {
  "type": "#page.annotation",
  "description": "List unifiedRbacResourceAction",
  "keywords": "",
  "section": "documentation",
  "tocPath": ""
}-->
