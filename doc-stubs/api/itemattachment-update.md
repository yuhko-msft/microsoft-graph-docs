---
title: "Update itemAttachment"
description: "Update the properties of an itemAttachment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update itemAttachment
Namespace: microsoft.graph

Update the properties of an [itemAttachment](../resources/itemattachment.md) object.

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
PATCH /itemAttachment
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [itemAttachment](../resources/itemattachment.md) object.

The following table shows the properties that are required when you create the [itemAttachment](../resources/itemattachment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|name|String|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|contentType|String|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|size|Int32|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|isInline|Boolean|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|



## Response

If successful, this method returns a `200 OK` response code and an updated [itemAttachment](../resources/itemattachment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_itemattachment"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/itemAttachment
Content-Type: application/json
Content-length: 153

{
  "@odata.type": "#microsoft.graph.itemAttachment",
  "name": "String",
  "contentType": "String",
  "size": "Integer",
  "isInline": "Boolean"
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
  "@odata.type": "#microsoft.graph.itemAttachment",
  "id": "6183b240-b240-6183-40b2-836140b28361",
  "lastModifiedDateTime": "String (timestamp)",
  "name": "String",
  "contentType": "String",
  "size": "Integer",
  "isInline": "Boolean"
}
```

