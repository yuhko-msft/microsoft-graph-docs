---
title: "chatMessagePolicyViolation resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# chatMessagePolicyViolation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property          | Type                                                                                       | Description |
| :---------------- | :----------------------------------------------------------------------------------------- | :---------- |
| dlpAction         | String                                                                                     |             |
| justificationText | String                                                                                     |             |
| policyTip         | [chatMessagePolicyViolationPolicyTip](../resources/chatmessagepolicyviolationpolicytip.md) |             |
| userAction        | String                                                                                     |             |
| verdictDetails    | String                                                                                     |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.chatMessagePolicyViolation",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.chatMessagePolicyViolation",
  "dlpAction": "none | notifySender | blockAccess | blockAccessExternal",
  "justificationText": "String",
  "policyTip": {"@odata.type": "microsoft.graph.chatMessagePolicyViolationPolicyTip"},
  "userAction": "none | override | reportFalsePositive",
  "verdictDetails": "none | allowFalsePositiveOverride | allowOverrideWithoutJustification | allowOverrideWithJustification"
}
```
