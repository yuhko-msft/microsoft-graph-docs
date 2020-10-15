---
title: "referenceAttachment resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# referenceAttachment resource type

Namespace: microsoft.graph

Inherits from [attachment](attachment.md)

## Methods

| Method                                                                   | Return Type                                              | Description                                                        |
| :----------------------------------------------------------------------- | :------------------------------------------------------- | :----------------------------------------------------------------- |
| [List referenceAttachment](../api/referenceattachment-list.md)           | [referenceAttachment](referenceAttachment.md) collection | List properties and relationships of a referenceAttachment object. |
| [Create referenceAttachment](../api/referenceattachment-create.md)       | [referenceAttachment](referenceAttachment.md)            | Create a new referenceAttachment object.                           |
| [Get referenceAttachment](../api/referenceattachment-get.md)             | [referenceAttachment](referenceAttachment.md)            | Read properties and relationships of a referenceAttachment object. |
| [Update referenceAttachment](../api/referenceattachment-update.md)       | [referenceAttachment](referenceAttachment.md)            | Update the properties of a referenceAttachment object.             |
| [Delete referenceAttachment](../api/referenceattachment-delete.md)       |                                                          | Delete a referenceAttachment object.                               |
| [createUploadSession](../api/referenceattachment-createUploadSession.md) | uploadSession                                            |                                                                    |

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
  "@odata.type": "microsoft.graph.referenceAttachment",
  "baseType": "microsoft.graph.attachment",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.referenceAttachment",
  "contentType": "String",
  "id": "String (identifier)",
  "isInline": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "name": "String",
  "size": "Int32"
}
```
