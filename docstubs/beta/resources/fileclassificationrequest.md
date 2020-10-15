---
title: "fileClassificationRequest resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# fileClassificationRequest resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                         | Return Type                                                          | Description                                                              |
| :----------------------------------------------------------------------------- | :------------------------------------------------------------------- | :----------------------------------------------------------------------- |
| [List fileClassificationRequest](../api/fileclassificationrequest-list.md)     | [fileClassificationRequest](fileClassificationRequest.md) collection | List properties and relationships of a fileClassificationRequest object. |
| [Create fileClassificationRequest](../api/fileclassificationrequest-create.md) | [fileClassificationRequest](fileClassificationRequest.md)            | Create a new fileClassificationRequest object.                           |
| [Get fileClassificationRequest](../api/fileclassificationrequest-get.md)       | [fileClassificationRequest](fileClassificationRequest.md)            | Read properties and relationships of a fileClassificationRequest object. |
| [Update fileClassificationRequest](../api/fileclassificationrequest-update.md) | [fileClassificationRequest](fileClassificationRequest.md)            | Update the properties of a fileClassificationRequest object.             |
| [Delete fileClassificationRequest](../api/fileclassificationrequest-delete.md) |                                                                      | Delete a fileClassificationRequest object.                               |

## Properties

| Property         | Type              | Description |
| :--------------- | :---------------- | :---------- |
| file             | Stream            |             |
| id               | String            | Read-only.  |
| sensitiveTypeIds | String collection |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.fileClassificationRequest",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.fileClassificationRequest",
  "file": "Stream",
  "id": "String (identifier)",
  "sensitiveTypeIds": ["String"]
}
```
