---
title: "synchronizationSchema: filterOperators"
description: "List all operators supported in the scoping filters."
ms.localizationpriority: medium
doc_type: apiPageType
author: "ArvindHarinder1"
ms.prod: "applications"
---

# synchronizationSchema: filterOperators

Namespace: microsoft.graph

List all operators supported in the [scoping filters](../resources/synchronization-filter.md).

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|Synchronization.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|Application.ReadWrite.OwnedBy, Synchronization.ReadWrite.All|

[!INCLUDE [rbac-synchronization-apis](../includes/rbac-for-apis/rbac-synchronization-apis.md)]

## HTTP Request
<!-- { "blockType": "ignored" } -->
```http
GET /servicePrincipals/{id}/synchronization/jobs/{jobId}/schema/filterOperators
GET /servicePrincipals/{id}/synchronization/templates/{templateId}/schema/filterOperators
GET /applications/{id}/synchronization/templates/{templateId}/schema/filterOperators
```

## Request headers

| Name           | Type    | Description|
|:---------------|:--------|:-----------|
| Authorization  | string  | Bearer {token}. Required. |

## Request body

Do not supply a request body for this method.

## Response

If successful, this method returns a `200, OK` response code and a [filterOperatorSchema](../resources/synchronization-filteroperatorschema.md) collection object in the response body.

## Example

##### Request
The following is an example of a request.

# [HTTP](#tab/http)
<!-- {
  "blockType": "request",
  "name": "synchronizationschema_filteroperators"
}-->
```msgraph-interactive
GET https://graph.microsoft.com/v1.0/servicePrincipals/{id}/synchronization/jobs/{jobId}/schema/filterOperators
```

# [C#](#tab/csharp)
[!INCLUDE [sample-code](../includes/snippets/csharp/synchronizationschema-filteroperators-csharp-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [CLI](#tab/cli)
[!INCLUDE [sample-code](../includes/snippets/cli/synchronizationschema-filteroperators-cli-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [Go](#tab/go)
[!INCLUDE [sample-code](../includes/snippets/go/synchronizationschema-filteroperators-go-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [Java](#tab/java)
[!INCLUDE [sample-code](../includes/snippets/java/synchronizationschema-filteroperators-java-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [JavaScript](#tab/javascript)
[!INCLUDE [sample-code](../includes/snippets/javascript/synchronizationschema-filteroperators-javascript-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [PHP](#tab/php)
[!INCLUDE [sample-code](../includes/snippets/php/synchronizationschema-filteroperators-php-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [PowerShell](#tab/powershell)
[!INCLUDE [sample-code](../includes/snippets/powershell/synchronizationschema-filteroperators-powershell-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [Python](#tab/python)
[!INCLUDE [sample-code](../includes/snippets/python/synchronizationschema-filteroperators-python-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

---


##### Response
The following is an example of a response.

>**Note:** The response object shown here might be shortened for readability. All the properties will be returned in an actual call.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.filterOperatorSchema",
  "isCollection": true
} -->
```http
HTTP/1.1 200 OK
Content-type: application/json

{
    "value": [
        {
            "name": "EQUALS",
            "arity": "Binary",
            "multivaluedComparisonType": "All",
            "supportedAttributeTypes": [
                "String",
                "Integer"
            ]
        }
    ]
}
```

<!--
{
  "type": "#page.annotation",
  "description": "synchronizationSchema: filterOperators",
  "keywords": "",
  "section": "documentation",
  "tocPath": "",
  "suppressions": [
    "Error: synchronizationschema_filteroperators/container/arity:\r\n       Expected type String but actual was Binary. Property: arity, actual value: 'Binary'"
  ]
}
-->
