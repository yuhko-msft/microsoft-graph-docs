---
title: "inferenceClassificationOverride resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# inferenceClassificationOverride resource type

Namespace: microsoft.graph

## Methods

| Method                                                                                     | Return Type                                                                      | Description                                                                     |
| :----------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------- | :------------------------------------------------------------------------------ |
| [List inferenceClassificationOverride](../api/inferenceclassificationoverride-list.md)     | [inferenceClassificationOverride](inferenceClassificationOverride.md) collection | List properties and relationships of an inferenceClassificationOverride object. |
| [Create inferenceClassificationOverride](../api/inferenceclassificationoverride-create.md) | [inferenceClassificationOverride](inferenceClassificationOverride.md)            | Create a new inferenceClassificationOverride object.                            |
| [Get inferenceClassificationOverride](../api/inferenceclassificationoverride-get.md)       | [inferenceClassificationOverride](inferenceClassificationOverride.md)            | Read properties and relationships of an inferenceClassificationOverride object. |
| [Update inferenceClassificationOverride](../api/inferenceclassificationoverride-update.md) | [inferenceClassificationOverride](inferenceClassificationOverride.md)            | Update the properties of an inferenceClassificationOverride object.             |
| [Delete inferenceClassificationOverride](../api/inferenceclassificationoverride-delete.md) |                                                                                  | Delete an inferenceClassificationOverride object.                               |

## Properties

| Property           | Type                                         | Description |
| :----------------- | :------------------------------------------- | :---------- |
| classifyAs         | String                                       |             |
| id                 | String                                       | Read-only.  |
| senderEmailAddress | [emailAddress](../resources/emailaddress.md) |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.inferenceClassificationOverride",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.inferenceClassificationOverride",
  "classifyAs": "focused | other",
  "id": "String (identifier)",
  "senderEmailAddress": {"@odata.type": "microsoft.graph.emailAddress"}
}
```
