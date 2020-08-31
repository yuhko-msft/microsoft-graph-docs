---
title: "Update item"
description: "Update the properties of an item object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update item
Namespace: microsoft.graph

Update the properties of an item object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
PATCH /itemAttachment/item
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [outlookItem](../resources/outlookitem.md) object.

The following table shows the properties that are required when you create the [outlookItem](../resources/outlookitem.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|changeKey|String|**TODO: Add Description**|
|categories|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [outlookItem](../resources/outlookitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_item"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/itemAttachment/item
Content-Type: application/json
Content-length: 118

{
  "@odata.type": "#microsoft.graph.outlookItem",
  "changeKey": "String",
  "categories": [
    "String"
  ]
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
  "@odata.type": "#microsoft.graph.outlookItem",
  "id": "1e8347c0-47c0-1e83-c047-831ec047831e",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "changeKey": "String",
  "categories": [
    "String"
  ]
}
```

