---
title: "Get transitiveReports count"
description: "Get the transitive reports count for a user or an organizational contact."
author: "dkershaw10"
localization_priority: Normal
ms.prod: "microsoft-identity-platform"
doc_type: apiPageType
---

# Get transitiveReports count

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Retrieve a count of transitive reports for a user or an organizational contact.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).


| Permission type | Permissions (from least to most privileged) |
|:--------------------|:---------------------------------------------------------|
| Delegated (work or school account) | User.Read, User.Read.All, Directory.Read.All |
| Delegated (personal Microsoft account) | Not supported. |
| Application | User.Read, User.Read.All, Directory.Read.All |

## HTTP request
<!-- { "blockType": "ignored" } -->
```http
GET /users/{id}/transitiveReports/$count
GET /contacts/{id}/transitiveReports/$count
```
## Optional query parameters

This method supports the `$filter` query parameter only with the **accountEnabled** property. For more information, see [OData Query Parameters](/graph/query-parameters).

## Request headers

| Header       | Value |
|:---------------|:--------|
| Authorization  | Bearer {token}. Required.  |
| ConsistencyLevel | eventual. Required. |

## Request body

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a count of transitive reports for the user in the response body.

## Examples

### Example 1: Get the count of transitive reports for a user

#### Request

The following is an example of the request.

<!-- {
  "blockType": "request",
  "name": "get_transitivereportscount"
}-->
```http
GET https://graph.microsoft.com/beta/users/45b7d2e7-b882-4a80-ba97-10b7a63b8fa4/transitiveReports/$count
```

#### Response

The following is an example of the response.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.transitivereports",
  "isCollection": true
} -->
```http
HTTP/1.1 200 OK
Content-type: text/plain
```

5

### Example 2: Get the count of transitive reports for only enabled user accounts

#### Request

The following is an example of the request.

<!-- {
  "blockType": "request",
  "name": "get_transitivereportscount"
}-->
```http
GET https://graph.microsoft.com/beta/users/45b7d2e7-b882-4a80-ba97-10b7a63b8fa4/transitiveReports/$count?&$filter=accountEnabled eq true
```

#### Response

The following is an example of the response. Note: The response object shown here may be truncated for brevity. All of the properties will be returned from an actual call.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.transitivereports",
  "isCollection": true
} -->
```http
HTTP/1.1 200 OK
Content-type: text/plain
```

5


<!-- uuid: 8fcb5dbc-d5aa-4681-8e31-b001d5168d79
2015-10-25 14:57:30 UTC -->
<!--
{
  "type": "#page.annotation",
  "description": "Get transitiveReports count",
  "keywords": "",
  "section": "documentation",
  "tocPath": "",
  "suppressions": [
  ]
}
-->
