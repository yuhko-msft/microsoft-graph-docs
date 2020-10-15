---
title: "matchingDlpRule resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# matchingDlpRule resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property          | Type                                                      | Description |
| :---------------- | :-------------------------------------------------------- | :---------- |
| actions           | [dlpActionInfo](../resources/dlpactioninfo.md) collection |             |
| isMostRestrictive | Boolean                                                   |             |
| policyId          | String                                                    |             |
| policyName        | String                                                    |             |
| priority          | Int32                                                     |             |
| ruleId            | String                                                    |             |
| ruleMode          | String                                                    |             |
| ruleName          | String                                                    |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.matchingDlpRule",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.matchingDlpRule",
  "actions": [{"@odata.type": "microsoft.graph.dlpActionInfo"}],
  "isMostRestrictive": "Boolean",
  "policyId": "String",
  "policyName": "String",
  "priority": "Int32",
  "ruleId": "String",
  "ruleMode": "audit | auditAndNotify | enforce | pendingDeletion | test",
  "ruleName": "String"
}
```
