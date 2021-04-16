---
title: "Get note"
description: "Read the properties and relationships of a note object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get note
Namespace: microsoft.graph



Read the properties and relationships of a [note](../resources/note.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /me/notes/{noteId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [note](../resources/note.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_note"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/notes/{noteId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.note"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.note",
    "id": "bdf080b6-80b6-bdf0-b680-f0bdb680f0bd",
    "categories": [
      "String"
    ],
    "changeKey": "String",
    "createdDateTime": "String (timestamp)",
    "lastModifiedDateTime": "String (timestamp)",
    "body": {
      "@odata.type": "microsoft.graph.itemBody"
    },
    "hasAttachments": "Boolean",
    "isDeleted": "Boolean",
    "subject": "String"
  }
}
```

