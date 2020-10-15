---
title: "textClassificationRequest resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# textClassificationRequest resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                         | Return Type                                                          | Description                                                              |
| :----------------------------------------------------------------------------- | :------------------------------------------------------------------- | :----------------------------------------------------------------------- |
| [List textClassificationRequest](../api/textclassificationrequest-list.md)     | [textClassificationRequest](textClassificationRequest.md) collection | List properties and relationships of a textClassificationRequest object. |
| [Create textClassificationRequest](../api/textclassificationrequest-create.md) | [textClassificationRequest](textClassificationRequest.md)            | Create a new textClassificationRequest object.                           |
| [Get textClassificationRequest](../api/textclassificationrequest-get.md)       | [textClassificationRequest](textClassificationRequest.md)            | Read properties and relationships of a textClassificationRequest object. |
| [Update textClassificationRequest](../api/textclassificationrequest-update.md) | [textClassificationRequest](textClassificationRequest.md)            | Update the properties of a textClassificationRequest object.             |
| [Delete textClassificationRequest](../api/textclassificationrequest-delete.md) |                                                                      | Delete a textClassificationRequest object.                               |

## Properties

| Property         | Type              | Description |
| :--------------- | :---------------- | :---------- |
| fileExtension    | String            |             |
| id               | String            | Read-only.  |
| scopesToRun      | String            |             |
| sensitiveTypeIds | String collection |             |
| text             | String            |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.textClassificationRequest",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.textClassificationRequest",
  "fileExtension": "String",
  "id": "String (identifier)",
  "scopesToRun": "fullDocument | partialDocument",
  "sensitiveTypeIds": ["String"],
  "text": "String"
}
```
