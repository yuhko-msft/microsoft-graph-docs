---
title: "itemAttachment resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# itemAttachment resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [attachment](attachment.md)

## Methods

| Method                                                              | Return Type                                    | Description                                                     |
| :------------------------------------------------------------------ | :--------------------------------------------- | :-------------------------------------------------------------- |
| [List itemAttachment](../api/itemattachment-list.md)                | [itemAttachment](itemAttachment.md) collection | List properties and relationships of an itemAttachment object.  |
| [Create itemAttachment](../api/itemattachment-create.md)            | [itemAttachment](itemAttachment.md)            | Create a new itemAttachment object.                             |
| [Get itemAttachment](../api/itemattachment-get.md)                  | [itemAttachment](itemAttachment.md)            | Read properties and relationships of an itemAttachment object.  |
| [Update itemAttachment](../api/itemattachment-update.md)            | [itemAttachment](itemAttachment.md)            | Update the properties of an itemAttachment object.              |
| [Delete itemAttachment](../api/itemattachment-delete.md)            |                                                | Delete an itemAttachment object.                                |
| [createUploadSession](../api/itemattachment-createUploadSession.md) | uploadSession                                  |                                                                 |
| [List item](../api/itemattachment-list-item.md)                     | [outlookItem](../resources/-outlookitem.md)    | Get the outlookItem objects from an item navigation property.   |
| [Create item](../api/itemattachment-post-item.md)                   | [outlookItem](../resources/-outlookitem.md)    | Create a new outlookItem object.                                |
| [Get item](../api/itemattachment-get-item.md)                       | [outlookItem](../resources/-outlookitem.md)    | Read the properties and relationships of an outlookItem object. |
| [Update item](../api/itemattachment-update-item.md)                 | [outlookItem](../resources/-outlookitem.md)    | Update the properties of an outlookItem object.                 |
| [Delete item](../api/itemattachment-delete-item.md)                 |                                                | Delete an outlookItem object.                                   |

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

| Relationship | Type                                       | Description |
| :----------- | :----------------------------------------- | :---------- |
| item         | [outlookItem](../resources/outlookitem.md) |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.itemAttachment",
  "baseType": "microsoft.graph.attachment",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.itemAttachment",
  "contentType": "String",
  "id": "String (identifier)",
  "isInline": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "name": "String",
  "size": "Int32"
}
```
