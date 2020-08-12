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

Update the properties of a [fileAttachment](../resources/fileattachment.md) object.

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
PATCH /fileAttachment
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [fileAttachment](../resources/fileattachment.md) object.

The following table shows the properties that are required when you create the [fileAttachment](../resources/fileattachment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|name|String|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|contentType|String|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|size|Int32|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|isInline|Boolean|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|contentId|String|**TODO: Add Description**|
|contentLocation|String|**TODO: Add Description**|
|contentBytes|Binary|**TODO: Add Description**|



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
  "name": "String",
  "contentType": "String",
  "size": "Integer",
  "isInline": "Boolean",
  "contentId": "String",
  "contentLocation": "String",
  "contentBytes": "Binary"
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
  "@odata.type": "#microsoft.graph.fileAttachment",
  "id": "c9ae9eeb-9eeb-c9ae-eb9e-aec9eb9eaec9",
  "lastModifiedDateTime": "String (timestamp)",
  "name": "String",
  "contentType": "String",
  "size": "Integer",
  "isInline": "Boolean",
  "contentId": "String",
  "contentLocation": "String",
  "contentBytes": "Binary"
}
```

