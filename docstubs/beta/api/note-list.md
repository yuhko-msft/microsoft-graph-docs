---
title: "List note"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# List note

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the note objects and their properties.

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

If successful, this method returns a `200 Ok` response code and a note object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "list_note"
}
-->

```http
GET https://graph.microsoft.com/beta/users/{id}/notes/{id}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.OutlookServices.note"
}
-->

```http
HTTP 1.1 200 Ok

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.note",
  "body": {
    "@odata.type": "#microsoft.graph.itemBody",
    "content": "String",
    "contentType": "String"
  },
  "categories": [
    "String"
  ],
  "changeKey": "String",
  "createdDateTime": "DateTimeOffset",
  "hasAttachments": "Boolean",
  "id": "String(identifier)",
  "isDeleted": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "subject": "String"
}
}

```
