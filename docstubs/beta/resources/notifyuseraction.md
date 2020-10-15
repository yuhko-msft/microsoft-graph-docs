---
title: "notifyUserAction resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# notifyUserAction resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                   | Type              | Description |
| :------------------------- | :---------------- | :---------- |
| action                     | String            |             |
| actionLastModifiedDateTime | DateTimeOffset    |             |
| emailText                  | String            |             |
| overrideOption             | String            |             |
| policyTip                  | String            |             |
| recipients                 | String collection |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.notifyUserAction",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.notifyUserAction",
  "action": "notifyUser | blockAccess | deviceRestriction",
  "actionLastModifiedDateTime": "DateTimeOffset",
  "emailText": "String",
  "overrideOption": "notAllowed | allowFalsePositiveOverride | allowWithJustification | allowWithoutJustification",
  "policyTip": "String",
  "recipients": ["String"]
}
```
