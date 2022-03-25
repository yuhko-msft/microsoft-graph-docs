---
author: JeremyKelley
title: Get listItem
description: Returns the metadata for an item in a SharePoint list.
ms.localizationpriority: high
ms.prod: "sharepoint"
doc_type: apiPageType
zone_pivot_groups: graph-sdk-languages
---
# Get listItem

Namespace: microsoft.graph

Returns the metadata for an [item][] in a [list][].

[list]: ../resources/list.md
[item]: ../resources/listitem.md

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged)              |
|:--------------------|:---------------------------------------------------------|
|Delegated (work or school account) | Sites.Read.All, Sites.ReadWrite.All    |
|Delegated (personal Microsoft account) | Not supported.    |
|Application | Sites.Read.All, Sites.ReadWrite.All, Sites.Manage.All |

> **Note**: The application permission Sites.Manage.All is required if the SharePoint list has content approval settings turned on. Otherwise, Microsoft Graph won't retrieve  list items that have an approval status other than Approved.

## HTTP request

Get a listItem
```http
GET https://graph.microsoft.com/v1.0/sites/{site-id}/lists/{list-id}/items/{item-id}
```
Get the column values of a listItem
```http
GET https://graph.microsoft.com/v1.0/sites/{site-id}/lists/{list-id}/items/{item-id}?expand=fields
```
Get specific column values of a listItem
```http
GET https://graph.microsoft.com/v1.0/sites/{site-id}/lists/{list-id}/items/{item-id}?expand=fields(select=Column1,Column2)
```
## Optional query parameters
This method supports the [OData query parameters](/graph/query-parameters) to help customize the response.

## Request headers

| Name      |Description|
|:----------|:----------|
| Authorization  | Bearer {code}. Required.|

## Request body

Do not supply a request body for this method.

## Response 

If successful, this method returns a `200 OK` response code and an [item][] in the response body.

## Example

### Request

::: zone pivot="programming-language-curl"
<!-- { "blockType": "request", "name": "get-list-item", "scopes": "sites.read.all" } -->

```msgraph-interactive
GET https://graph.microsoft.com/v1.0/sites/{site-id}/lists/{list-id}/items/{item-id}?expand=fields
```

::: zone-end

::: zone pivot="programming-language-csharp"
[!INCLUDE [sample-code](../includes/snippets/csharp/get-list-item-csharp-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]
::: zone-end

::: zone pivot="programming-language-browserjs"
[!INCLUDE [sample-code](../includes/snippets/javascript/get-list-item-javascript-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]
::: zone-end

::: zone pivot="programming-language-objectivec"
[!INCLUDE [sample-code](../includes/snippets/objc/get-list-item-objc-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]
::: zone-end

::: zone pivot="programming-language-java"
[!INCLUDE [sample-code](../includes/snippets/java/get-list-item-java-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]
::: zone-end

::: zone pivot="programming-language-go"
[!INCLUDE [sample-code](../includes/snippets/go/get-list-item-go-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]
::: zone-end

::: zone pivot="programming-language-powershell"
[!INCLUDE [sample-code](../includes/snippets/powershell/get-list-item-powershell-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]
::: zone-end

### Response

<!-- { "blockType": "response", "@odata.type": "microsoft.graph.listItem", "truncated": true } -->

```http
HTTP/1.1 200 OK
Content-type: application/json

{
  "id": "5",
  "fields": {
    "Name": "Widget",
    "Color": "Blue",
    "Quantity": 2357
    }
}
```

<!-- {
  "type": "#page.annotation",
  "description": "",
  "keywords": "",
  "section": "documentation",
  "tocPath": "ListItem/Get metadata",
  "suppressions": [
  ]
} -->

