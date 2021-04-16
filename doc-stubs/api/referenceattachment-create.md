---
title: "Create referenceAttachment"
description: "Create a new referenceAttachment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create referenceAttachment
Namespace: microsoft.graph



Create a new [referenceAttachment](../resources/referenceattachment.md) object.

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
POST ** Collection URI for microsoft.graph.referenceAttachment not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [referenceAttachment](../resources/referenceattachment.md) object.

The following table shows the properties that are required when you create the [referenceAttachment](../resources/referenceattachment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|contentType|String|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|isInline|Boolean|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|name|String|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|size|Int32|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|isFolder|Boolean|**TODO: Add Description**|
|permission|referenceAttachmentPermission|**TODO: Add Description**. Possible values are: `other`, `view`, `edit`, `anonymousView`, `anonymousEdit`, `organizationView`, `organizationEdit`.|
|previewUrl|String|**TODO: Add Description**|
|providerType|referenceAttachmentProvider|**TODO: Add Description**. Possible values are: `other`, `oneDriveBusiness`, `oneDriveConsumer`, `dropbox`.|
|sourceUrl|String|**TODO: Add Description**|
|thumbnailUrl|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [referenceAttachment](../resources/referenceattachment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_referenceattachment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.referenceAttachment not found
Content-Type: application/json
Content-length: 322

{
  "@odata.type": "#microsoft.graph.referenceAttachment",
  "contentType": "String",
  "isInline": "Boolean",
  "name": "String",
  "size": "Integer",
  "isFolder": "Boolean",
  "permission": "String",
  "previewUrl": "String",
  "providerType": "String",
  "sourceUrl": "String",
  "thumbnailUrl": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.referenceAttachment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.referenceAttachment",
  "id": "041e2e30-2e30-041e-302e-1e04302e1e04",
  "contentType": "String",
  "isInline": "Boolean",
  "lastModifiedDateTime": "String (timestamp)",
  "name": "String",
  "size": "Integer",
  "isFolder": "Boolean",
  "permission": "String",
  "previewUrl": "String",
  "providerType": "String",
  "sourceUrl": "String",
  "thumbnailUrl": "String"
}
```

