---
title: "messageRuleActions resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# messageRuleActions resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assignCategories|String collection|**TODO: Add Description**|
|copyToFolder|String|**TODO: Add Description**|
|delete|Boolean|**TODO: Add Description**|
|forwardAsAttachmentTo|[recipient](../resources/recipient.md) collection|**TODO: Add Description**|
|forwardTo|[recipient](../resources/recipient.md) collection|**TODO: Add Description**|
|markAsRead|Boolean|**TODO: Add Description**|
|markImportance|importance|**TODO: Add Description**. Possible values are: `low`, `normal`, `high`.|
|moveToFolder|String|**TODO: Add Description**|
|permanentDelete|Boolean|**TODO: Add Description**|
|redirectTo|[recipient](../resources/recipient.md) collection|**TODO: Add Description**|
|stopProcessingRules|Boolean|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.messageRuleActions"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.messageRuleActions",
  "assignCategories": [
    "String"
  ],
  "copyToFolder": "String",
  "delete": "Boolean",
  "forwardAsAttachmentTo": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "forwardTo": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "markAsRead": "Boolean",
  "markImportance": "String",
  "moveToFolder": "String",
  "permanentDelete": "Boolean",
  "redirectTo": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "stopProcessingRules": "Boolean"
}
```

