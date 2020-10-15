---
title: "registrationEnforcement resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# registrationEnforcement resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                       | Type    | Description |
| :----------------------------- | :------ | :---------- |
| isAllowedToSkipRegistration    | Boolean |             |
| registrationSkipDurationInDays | Int32   |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.registrationEnforcement",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.registrationEnforcement",
  "isAllowedToSkipRegistration": "Boolean",
  "registrationSkipDurationInDays": "Int32"
}
```
