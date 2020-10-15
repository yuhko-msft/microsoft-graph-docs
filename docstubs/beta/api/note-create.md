---
title: "Create note"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create note

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new note object.

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

## Request headers

| Name          | Description                 |
| :------------ | :-------------------------- |
| Authorization | Bearer {token}. Required.   |
| Content-Type  | application/json. Required. |

## Request Body

In the request body, supply JSON representation of the [note](../resources/-note.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a note object.

| Property       | Type                                 | Description |
| :------------- | :----------------------------------- | :---------- |
| body           | [itemBody](../resources/itembody.md) |             |
| hasAttachments | Boolean                              |             |
| isDeleted      | Boolean                              |             |
| subject        | String                               |             |

## Response

If successful, this method returns a `201 Created` response code and a note object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_note"
}
-->

```http
POST https://graph.microsoft.com/beta/users/{id}/notes/{id}

Content-Type: application/json
Content-Length: 402

{
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
  "isDeleted": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "subject": "String"
}

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
HTTP 1.1 201 Created

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
