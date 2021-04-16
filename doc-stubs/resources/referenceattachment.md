---
title: "referenceAttachment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# referenceAttachment resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [attachment](../resources/attachment.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List referenceAttachments](../api/referenceattachment-list.md)|[referenceAttachment](../resources/referenceattachment.md) collection|Get a list of the [referenceAttachment](../resources/referenceattachment.md) objects and their properties.|
|[Create referenceAttachment](../api/referenceattachment-create.md)|[referenceAttachment](../resources/referenceattachment.md)|Create a new [referenceAttachment](../resources/referenceattachment.md) object.|
|[Get referenceAttachment](../api/referenceattachment-get.md)|[referenceAttachment](../resources/referenceattachment.md)|Read the properties and relationships of a [referenceAttachment](../resources/referenceattachment.md) object.|
|[Update referenceAttachment](../api/referenceattachment-update.md)|[referenceAttachment](../resources/referenceattachment.md)|Update the properties of a [referenceAttachment](../resources/referenceattachment.md) object.|
|[Delete referenceAttachment](../api/referenceattachment-delete.md)|None|Deletes a [referenceAttachment](../resources/referenceattachment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|contentType|String|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isFolder|Boolean|**TODO: Add Description**|
|isInline|Boolean|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|name|String|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|permission|referenceAttachmentPermission|**TODO: Add Description**. Possible values are: `other`, `view`, `edit`, `anonymousView`, `anonymousEdit`, `organizationView`, `organizationEdit`.|
|previewUrl|String|**TODO: Add Description**|
|providerType|referenceAttachmentProvider|**TODO: Add Description**. Possible values are: `other`, `oneDriveBusiness`, `oneDriveConsumer`, `dropbox`.|
|size|Int32|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|sourceUrl|String|**TODO: Add Description**|
|thumbnailUrl|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.referenceAttachment",
  "baseType": "microsoft.graph.attachment",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.referenceAttachment",
  "id": "String (identifier)",
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

