---
title: "inferenceClassification resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# inferenceClassification resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                     | Return Type                                                                         | Description                                                                            |
| :------------------------------------------------------------------------- | :---------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------- |
| [List inferenceClassification](../api/inferenceclassification-list.md)     | [inferenceClassification](inferenceClassification.md) collection                    | List properties and relationships of an inferenceClassification object.                |
| [Create inferenceClassification](../api/inferenceclassification-create.md) | [inferenceClassification](inferenceClassification.md)                               | Create a new inferenceClassification object.                                           |
| [Get inferenceClassification](../api/inferenceclassification-get.md)       | [inferenceClassification](inferenceClassification.md)                               | Read properties and relationships of an inferenceClassification object.                |
| [Update inferenceClassification](../api/inferenceclassification-update.md) | [inferenceClassification](inferenceClassification.md)                               | Update the properties of an inferenceClassification object.                            |
| [Delete inferenceClassification](../api/inferenceclassification-delete.md) |                                                                                     | Delete an inferenceClassification object.                                              |
| [List overrides](../api/inferenceclassification-list-overrides.md)         | [inferenceClassificationOverride](../resources/-inferenceclassificationoverride.md) | Get the inferenceClassificationOverride objects from an overrides navigation property. |
| [Create overrides](../api/inferenceclassification-post-overrides.md)       | [inferenceClassificationOverride](../resources/-inferenceclassificationoverride.md) | Create a new inferenceClassificationOverride object.                                   |
| [Get overrides](../api/inferenceclassification-get-overrides.md)           | [inferenceClassificationOverride](../resources/-inferenceclassificationoverride.md) | Read the properties and relationships of an inferenceClassificationOverride object.    |
| [Update overrides](../api/inferenceclassification-update-overrides.md)     | [inferenceClassificationOverride](../resources/-inferenceclassificationoverride.md) | Update the properties of an inferenceClassificationOverride object.                    |
| [Delete overrides](../api/inferenceclassification-delete-overrides.md)     |                                                                                     | Delete an inferenceClassificationOverride object.                                      |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |

## Relationships

| Relationship | Type                                                                                          | Description |
| :----------- | :-------------------------------------------------------------------------------------------- | :---------- |
| overrides    | [inferenceClassificationOverride](../resources/inferenceclassificationoverride.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.inferenceClassification",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.inferenceClassification",
  "id": "String (identifier)"
}
```
