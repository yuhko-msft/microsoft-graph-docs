---
title: "attachment resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# attachment resource type

Namespace: microsoft.graph

## Methods

| Method                                                          | Return Type                            | Description                                                |
| :-------------------------------------------------------------- | :------------------------------------- | :--------------------------------------------------------- |
| [List attachment](../api/attachment-list.md)                    | [attachment](attachment.md) collection | List properties and relationships of an attachment object. |
| [Create attachment](../api/attachment-create.md)                | [attachment](attachment.md)            | Create a new attachment object.                            |
| [Get attachment](../api/attachment-get.md)                      | [attachment](attachment.md)            | Read properties and relationships of an attachment object. |
| [Update attachment](../api/attachment-update.md)                | [attachment](attachment.md)            | Update the properties of an attachment object.             |
| [Delete attachment](../api/attachment-delete.md)                |                                        | Delete an attachment object.                               |
| [createUploadSession](../api/attachment-createUploadSession.md) | uploadSession                          |                                                            |

## Properties

| Property             | Type           | Description |
| :------------------- | :------------- | :---------- |
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
  "@odata.type": "microsoft.graph.attachment",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.attachment",
  "contentType": "String",
  "id": "String (identifier)",
  "isInline": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "name": "String",
  "size": "Int32"
}
```
