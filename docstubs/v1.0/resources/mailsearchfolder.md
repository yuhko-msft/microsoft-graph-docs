---
title: "mailSearchFolder resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# mailSearchFolder resource type

Namespace: microsoft.graph

Inherits from [mailFolder](mailfolder.md)

## Methods

| Method                                                       | Return Type                                        | Description                                                     |
| :----------------------------------------------------------- | :------------------------------------------------- | :-------------------------------------------------------------- |
| [List mailSearchFolder](../api/mailsearchfolder-list.md)     | [mailSearchFolder](mailSearchFolder.md) collection | List properties and relationships of a mailSearchFolder object. |
| [Create mailSearchFolder](../api/mailsearchfolder-create.md) | [mailSearchFolder](mailSearchFolder.md)            | Create a new mailSearchFolder object.                           |
| [Get mailSearchFolder](../api/mailsearchfolder-get.md)       | [mailSearchFolder](mailSearchFolder.md)            | Read properties and relationships of a mailSearchFolder object. |
| [Update mailSearchFolder](../api/mailsearchfolder-update.md) | [mailSearchFolder](mailSearchFolder.md)            | Update the properties of a mailSearchFolder object.             |
| [Delete mailSearchFolder](../api/mailsearchfolder-delete.md) |                                                    | Delete a mailSearchFolder object.                               |
| [copy](../api/mailsearchfolder-copy.md)                      | [mailFolder](../resources/-mailfolder.md)          |                                                                 |
| [move](../api/mailsearchfolder-move.md)                      | [mailFolder](../resources/-mailfolder.md)          |                                                                 |

## Properties

| Property             | Type              | Description |
| :------------------- | :---------------- | :---------- |
| childFolderCount     | Int32             |             |
| displayName          | String            |             |
| filterQuery          | String            |             |
| id                   | String            | Read-only.  |
| includeNestedFolders | Boolean           |             |
| isSupported          | Boolean           |             |
| parentFolderId       | String            |             |
| sourceFolderIds      | String collection |             |
| totalItemCount       | Int32             |             |
| unreadItemCount      | Int32             |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mailSearchFolder",
  "baseType": "microsoft.graph.mailFolder",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.mailSearchFolder",
  "childFolderCount": "Int32",
  "displayName": "String",
  "filterQuery": "String",
  "id": "String (identifier)",
  "includeNestedFolders": "Boolean",
  "isSupported": "Boolean",
  "parentFolderId": "String",
  "sourceFolderIds": ["String"],
  "totalItemCount": "Int32",
  "unreadItemCount": "Int32"
}
```
