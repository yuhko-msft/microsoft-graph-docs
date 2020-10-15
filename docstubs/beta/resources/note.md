---
title: "note resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# note resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [outlookItem](outlookitem.md)

## Methods

| Method                                                                                      | Return Type                                                                             | Description                                                                                                 |
| :------------------------------------------------------------------------------------------ | :-------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------------------- |
| [List note](../api/note-list.md)                                                            | [note](note.md) collection                                                              | List properties and relationships of a note object.                                                         |
| [Create note](../api/note-create.md)                                                        | [note](note.md)                                                                         | Create a new note object.                                                                                   |
| [Get note](../api/note-get.md)                                                              | [note](note.md)                                                                         | Read properties and relationships of a note object.                                                         |
| [Update note](../api/note-update.md)                                                        | [note](note.md)                                                                         | Update the properties of a note object.                                                                     |
| [Delete note](../api/note-delete.md)                                                        |                                                                                         | Delete a note object.                                                                                       |
| [delta](../api/note-delta.md)                                                               |                                                                                         |                                                                                                             |
| [List attachments](../api/note-list-attachments.md)                                         | [attachment](../resources/-attachment.md)                                               | Get the attachment objects from an attachments navigation property.                                         |
| [Create attachments](../api/note-post-attachments.md)                                       | [attachment](../resources/-attachment.md)                                               | Create a new attachment object.                                                                             |
| [Get attachments](../api/note-get-attachments.md)                                           | [attachment](../resources/-attachment.md)                                               | Read the properties and relationships of an attachment object.                                              |
| [Update attachments](../api/note-update-attachments.md)                                     | [attachment](../resources/-attachment.md)                                               | Update the properties of an attachment object.                                                              |
| [Delete attachments](../api/note-delete-attachments.md)                                     |                                                                                         | Delete an attachment object.                                                                                |
| [List extensions](../api/note-list-extensions.md)                                           | [extension](../resources/-extension.md)                                                 | Get the extension objects from an extensions navigation property.                                           |
| [Create extensions](../api/note-post-extensions.md)                                         | [extension](../resources/-extension.md)                                                 | Create a new extension object.                                                                              |
| [Get extensions](../api/note-get-extensions.md)                                             | [extension](../resources/-extension.md)                                                 | Read the properties and relationships of an extension object.                                               |
| [Update extensions](../api/note-update-extensions.md)                                       | [extension](../resources/-extension.md)                                                 | Update the properties of an extension object.                                                               |
| [Delete extensions](../api/note-delete-extensions.md)                                       |                                                                                         | Delete an extension object.                                                                                 |
| [List multiValueExtendedProperties](../api/note-list-multivalueextendedproperties.md)       | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Get the multiValueLegacyExtendedProperty objects from a multiValueExtendedProperties navigation property.   |
| [Create multiValueExtendedProperties](../api/note-post-multivalueextendedproperties.md)     | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Create a new multiValueLegacyExtendedProperty object.                                                       |
| [Get multiValueExtendedProperties](../api/note-get-multivalueextendedproperties.md)         | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Read the properties and relationships of a multiValueLegacyExtendedProperty object.                         |
| [Update multiValueExtendedProperties](../api/note-update-multivalueextendedproperties.md)   | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Update the properties of a multiValueLegacyExtendedProperty object.                                         |
| [Delete multiValueExtendedProperties](../api/note-delete-multivalueextendedproperties.md)   |                                                                                         | Delete a multiValueLegacyExtendedProperty object.                                                           |
| [List singleValueExtendedProperties](../api/note-list-singlevalueextendedproperties.md)     | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Get the singleValueLegacyExtendedProperty objects from a singleValueExtendedProperties navigation property. |
| [Create singleValueExtendedProperties](../api/note-post-singlevalueextendedproperties.md)   | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Create a new singleValueLegacyExtendedProperty object.                                                      |
| [Get singleValueExtendedProperties](../api/note-get-singlevalueextendedproperties.md)       | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Read the properties and relationships of a singleValueLegacyExtendedProperty object.                        |
| [Update singleValueExtendedProperties](../api/note-update-singlevalueextendedproperties.md) | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Update the properties of a singleValueLegacyExtendedProperty object.                                        |
| [Delete singleValueExtendedProperties](../api/note-delete-singlevalueextendedproperties.md) |                                                                                         | Delete a singleValueLegacyExtendedProperty object.                                                          |

## Properties

| Property             | Type                                 | Description |
| :------------------- | :----------------------------------- | :---------- |
| body                 | [itemBody](../resources/itembody.md) |             |
| categories           | String collection                    |             |
| changeKey            | String                               |             |
| createdDateTime      | DateTimeOffset                       |             |
| hasAttachments       | Boolean                              |             |
| id                   | String                               | Read-only.  |
| isDeleted            | Boolean                              |             |
| lastModifiedDateTime | DateTimeOffset                       |             |
| subject              | String                               |             |

## Relationships

| Relationship                  | Type                                                                                              | Description |
| :---------------------------- | :------------------------------------------------------------------------------------------------ | :---------- |
| attachments                   | [attachment](../resources/attachment.md) collection                                               |             |
| extensions                    | [extension](../resources/extension.md) collection                                                 |             |
| multiValueExtendedProperties  | [multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection   |             |
| singleValueExtendedProperties | [singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.note",
  "baseType": "microsoft.graph.outlookItem",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.note",
  "body": {"@odata.type": "microsoft.graph.itemBody"},
  "categories": ["String"],
  "changeKey": "String",
  "createdDateTime": "DateTimeOffset",
  "hasAttachments": "Boolean",
  "id": "String (identifier)",
  "isDeleted": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "subject": "String"
}
```
