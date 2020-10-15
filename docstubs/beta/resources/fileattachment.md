---
title: "fileAttachment resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# fileAttachment resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [attachment](attachment.md)

## Methods

| Method                                                              | Return Type                                    | Description                                                   |
| :------------------------------------------------------------------ | :--------------------------------------------- | :------------------------------------------------------------ |
| [List fileAttachment](../api/fileattachment-list.md)                | [fileAttachment](fileAttachment.md) collection | List properties and relationships of a fileAttachment object. |
| [Create fileAttachment](../api/fileattachment-create.md)            | [fileAttachment](fileAttachment.md)            | Create a new fileAttachment object.                           |
| [Get fileAttachment](../api/fileattachment-get.md)                  | [fileAttachment](fileAttachment.md)            | Read properties and relationships of a fileAttachment object. |
| [Update fileAttachment](../api/fileattachment-update.md)            | [fileAttachment](fileAttachment.md)            | Update the properties of a fileAttachment object.             |
| [Delete fileAttachment](../api/fileattachment-delete.md)            |                                                | Delete a fileAttachment object.                               |
| [createUploadSession](../api/fileattachment-createUploadSession.md) | uploadSession                                  |                                                               |

## Properties

| Property             | Type           | Description |
| :------------------- | :------------- | :---------- |
| contentBytes         | Binary         |             |
| contentId            | String         |             |
| contentLocation      | String         |             |
| contentType          | String         |             |
| id                   | String         | Read-only.  |
| isInline             | Boolean        |             |
| lastModifiedDateTime | DateTimeOffset |             |
| name                 | String         |             |
| size                 | Int32          |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.fileAttachment",
  "baseType": "microsoft.graph.attachment",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.fileAttachment",
  "contentBytes": "Binary",
  "contentId": "String",
  "contentLocation": "String",
  "contentType": "String",
  "id": "String (identifier)",
  "isInline": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "name": "String",
  "size": "Int32"
}
```
