---
title: "chatMessagePolicyViolationPolicyTip resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# chatMessagePolicyViolationPolicyTip resource type

Namespace: microsoft.graph

## Properties

| Property                     | Type              | Description |
| :--------------------------- | :---------------- | :---------- |
| complianceUrl                | String            |             |
| generalText                  | String            |             |
| matchedConditionDescriptions | String collection |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.chatMessagePolicyViolationPolicyTip",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.chatMessagePolicyViolationPolicyTip",
  "complianceUrl": "String",
  "generalText": "String",
  "matchedConditionDescriptions": ["String"]
}
```
