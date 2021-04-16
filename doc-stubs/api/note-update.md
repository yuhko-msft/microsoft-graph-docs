---
title: "Update note"
description: "Update the properties of a note object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update note
Namespace: microsoft.graph



Update the properties of a [note](../resources/note.md) object.

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
PATCH /me/notes/{noteId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [note](../resources/note.md) object.

The following table shows the properties that are required when you update the [note](../resources/note.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|categories|String collection|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|changeKey|String|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|body|[itemBody](../resources/itembody.md)|**TODO: Add Description**|
|hasAttachments|Boolean|**TODO: Add Description**|
|isDeleted|Boolean|**TODO: Add Description**|
|subject|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [note](../resources/note.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_note"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/notes/{noteId}
Content-Type: application/json
Content-length: 260

{
  "@odata.type": "#microsoft.graph.note",
  "categories": [
    "String"
  ],
  "changeKey": "String",
  "body": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "hasAttachments": "Boolean",
  "isDeleted": "Boolean",
  "subject": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
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
```

