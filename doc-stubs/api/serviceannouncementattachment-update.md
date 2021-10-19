---
title: "Update serviceAnnouncementAttachment"
description: "Update the properties of a serviceAnnouncementAttachment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update serviceAnnouncementAttachment
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [serviceAnnouncementAttachment](../resources/serviceannouncementattachment.md) object.

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
PATCH /admin/serviceAnnouncement/messages/{serviceUpdateMessageId}/attachments/{serviceAnnouncementAttachmentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md). Optional.|
|name|String|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md). Optional.|
|contentType|String|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md). Optional.|
|size|Int32|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md). Required.|
|isInline|Boolean|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md). Required.|
|content|Stream|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [serviceAnnouncementAttachment](../resources/serviceannouncementattachment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_serviceannouncementattachment"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/admin/serviceAnnouncement/messages/{serviceUpdateMessageId}/attachments/{serviceAnnouncementAttachmentId}
Content-Type: application/json
Content-length: 192

{
  "@odata.type": "#microsoft.graph.serviceAnnouncementAttachment",
  "name": "String",
  "contentType": "String",
  "size": "Integer",
  "isInline": "Boolean",
  "content": "Stream"
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
  "@odata.type": "#microsoft.graph.serviceAnnouncementAttachment",
  "id": "0cb897a3-97a3-0cb8-a397-b80ca397b80c",
  "lastModifiedDateTime": "String (timestamp)",
  "name": "String",
  "contentType": "String",
  "size": "Integer",
  "isInline": "Boolean",
  "content": "Stream"
}
```

