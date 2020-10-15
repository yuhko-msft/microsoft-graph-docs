---
title: "messageRuleActions resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# messageRuleActions resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property              | Type                                              | Description |
| :-------------------- | :------------------------------------------------ | :---------- |
| assignCategories      | String collection                                 |             |
| copyToFolder          | String                                            |             |
| delete                | Boolean                                           |             |
| forwardAsAttachmentTo | [recipient](../resources/recipient.md) collection |             |
| forwardTo             | [recipient](../resources/recipient.md) collection |             |
| markAsRead            | Boolean                                           |             |
| markImportance        | String                                            |             |
| moveToFolder          | String                                            |             |
| permanentDelete       | Boolean                                           |             |
| redirectTo            | [recipient](../resources/recipient.md) collection |             |
| stopProcessingRules   | Boolean                                           |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.messageRuleActions",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.messageRuleActions",
  "assignCategories": ["String"],
  "copyToFolder": "String",
  "delete": "Boolean",
  "forwardAsAttachmentTo": [{"@odata.type": "microsoft.graph.recipient"}],
  "forwardTo": [{"@odata.type": "microsoft.graph.recipient"}],
  "markAsRead": "Boolean",
  "markImportance": "low | normal | high",
  "moveToFolder": "String",
  "permanentDelete": "Boolean",
  "redirectTo": [{"@odata.type": "microsoft.graph.recipient"}],
  "stopProcessingRules": "Boolean"
}
```
