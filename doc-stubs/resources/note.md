---
title: "note resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# note resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [outlookItem](../resources/outlookitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List notes](../api/note-list.md)|[note](../resources/note.md) collection|Get a list of the [note](../resources/note.md) objects and their properties.|
|[Create note](../api/note-create.md)|[note](../resources/note.md)|Create a new [note](../resources/note.md) object.|
|[Get note](../api/note-get.md)|[note](../resources/note.md)|Read the properties and relationships of a [note](../resources/note.md) object.|
|[Update note](../api/note-update.md)|[note](../resources/note.md)|Update the properties of a [note](../resources/note.md) object.|
|[Delete note](../api/note-delete.md)|None|Deletes a [note](../resources/note.md) object.|
|[delta](../api/note-delta.md)|[note](../resources/note.md) collection|**TODO: Add Description**|
|[List attachments](../api/note-list-attachments.md)|[attachment](../resources/attachment.md) collection|Get the attachment resources from the attachments navigation property.|
|[Create attachment](../api/note-post-attachments.md)|[attachment](../resources/attachment.md)|Create a new attachment object.|
|[List extensions](../api/note-list-extensions.md)|[extension](../resources/extension.md) collection|Get the extension resources from the extensions navigation property.|
|[Create extension](../api/note-post-extensions.md)|[extension](../resources/extension.md)|Create a new extension object.|
|[List multiValueExtendedProperties](../api/note-list-multivalueextendedproperties.md)|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|Get the multiValueLegacyExtendedProperty resources from the multiValueExtendedProperties navigation property.|
|[Create multiValueLegacyExtendedProperty](../api/note-post-multivalueextendedproperties.md)|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md)|Create a new multiValueLegacyExtendedProperty object.|
|[List singleValueExtendedProperties](../api/note-list-singlevalueextendedproperties.md)|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|Get the singleValueLegacyExtendedProperty resources from the singleValueExtendedProperties navigation property.|
|[Create singleValueLegacyExtendedProperty](../api/note-post-singlevalueextendedproperties.md)|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md)|Create a new singleValueLegacyExtendedProperty object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|body|[itemBody](../resources/itembody.md)|**TODO: Add Description**|
|categories|String collection|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|changeKey|String|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|hasAttachments|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isDeleted|Boolean|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|subject|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|attachments|[attachment](../resources/attachment.md) collection|**TODO: Add Description**|
|extensions|[extension](../resources/extension.md) collection|**TODO: Add Description**|
|multiValueExtendedProperties|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|**TODO: Add Description**|
|singleValueExtendedProperties|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.note",
  "baseType": "microsoft.graph.outlookItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.note",
  "id": "String (identifier)",
  "categories": [
    "String"
  ],
  "changeKey": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "body": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "hasAttachments": "Boolean",
  "isDeleted": "Boolean",
  "subject": "String"
}
```

