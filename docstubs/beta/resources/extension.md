---
title: "extension resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# extension resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                         | Return Type                          | Description                                               |
| :--------------------------------------------- | :----------------------------------- | :-------------------------------------------------------- |
| [List extension](../api/extension-list.md)     | [extension](extension.md) collection | List properties and relationships of an extension object. |
| [Create extension](../api/extension-create.md) | [extension](extension.md)            | Create a new extension object.                            |
| [Get extension](../api/extension-get.md)       | [extension](extension.md)            | Read properties and relationships of an extension object. |
| [Update extension](../api/extension-update.md) | [extension](extension.md)            | Update the properties of an extension object.             |
| [Delete extension](../api/extension-delete.md) |                                      | Delete an extension object.                               |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.extension",
  "baseType": "microsoft.graph.entity",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.extension",
  "id": "String (identifier)"
}
```
