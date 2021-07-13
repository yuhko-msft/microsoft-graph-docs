---
title: "Update fileAttachment"
description: "Update the properties of a fileAttachment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update fileAttachment
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [fileAttachment](../resources/fileattachment.md) object.

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
PATCH /fileAttachment
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [fileAttachment](../resources/fileattachment.md) object.

The following table shows the properties that are required when you update the [fileAttachment](../resources/fileattachment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|contentType|String|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|isInline|Boolean|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|name|String|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|size|Int32|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|contentBytes|Binary|**TODO: Add Description**|
|contentId|String|**TODO: Add Description**|
|contentLocation|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [fileAttachment](../resources/fileattachment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_fileattachment"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/fileAttachment
Content-Type: application/json
Content-length: 240

{
  "@odata.type": "#microsoft.graph.fileAttachment",
  "contentType": "String",
  "isInline": "Boolean",
  "name": "String",
  "size": "Integer",
  "contentBytes": "Binary",
  "contentId": "String",
  "contentLocation": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.fileAttachment",
  "id": "ac1aead1-ead1-ac1a-d1ea-1aacd1ea1aac",
  "contentType": "String",
  "isInline": "Boolean",
  "lastModifiedDateTime": "String (timestamp)",
  "name": "String",
  "size": "Integer",
  "contentBytes": "Binary",
  "contentId": "String",
  "contentLocation": "String"
}
```

