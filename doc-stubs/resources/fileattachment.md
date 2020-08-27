---
title: "fileAttachment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# fileAttachment resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [attachment](../resources/attachment.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List fileAttachments](../api/fileattachment-list.md)|[fileAttachment](../resources/fileattachment.md) collection|Get a list of the [fileAttachment](../resources/fileattachment.md) objects and their properties.|
|[Create fileAttachment](../api/fileattachment-create.md)|[fileAttachment](../resources/fileattachment.md)|Create a new [fileAttachment](../resources/fileattachment.md) object.|
|[Get fileAttachment](../api/fileattachment-get.md)|[fileAttachment](../resources/fileattachment.md)|Read the properties and relationships of a [fileAttachment](../resources/fileattachment.md) object.|
|[Update fileAttachment](../api/fileattachment-update.md)|[fileAttachment](../resources/fileattachment.md)|Update the properties of a [fileAttachment](../resources/fileattachment.md) object.|
|[Delete fileAttachment](../api/fileattachment-delete.md)|None|Deletes a [fileAttachment](../resources/fileattachment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|contentBytes|Binary|**TODO: Add Description**|
|contentId|String|**TODO: Add Description**|
|contentLocation|String|**TODO: Add Description**|
|contentType|String|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isInline|Boolean|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|name|String|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|
|size|Int32|**TODO: Add Description** Inherited from [attachment](../resources/attachment.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.fileAttachment",
  "baseType": "microsoft.graph.attachment",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.fileAttachment",
  "id": "String (identifier)",
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

