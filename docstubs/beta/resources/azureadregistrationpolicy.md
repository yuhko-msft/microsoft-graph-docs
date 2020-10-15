---
title: "azureADRegistrationPolicy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# azureADRegistrationPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property            | Type              | Description |
| :------------------ | :---------------- | :---------- |
| allowedGroups       | String collection |             |
| allowedUsers        | String collection |             |
| appliesTo           | String            |             |
| isAdminConfigurable | Boolean           |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.azureADRegistrationPolicy",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.azureADRegistrationPolicy",
  "allowedGroups": ["String"],
  "allowedUsers": ["String"],
  "appliesTo": "none | all | selected | unknownFutureValue",
  "isAdminConfigurable": "Boolean"
}
```
