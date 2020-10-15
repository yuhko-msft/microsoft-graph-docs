---
title: "preAuthorizedApplication resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# preAuthorizedApplication resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property      | Type              | Description |
| :------------ | :---------------- | :---------- |
| appId         | String            |             |
| permissionIds | String collection |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.preAuthorizedApplication",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.preAuthorizedApplication",
  "appId": "String",
  "permissionIds": ["String"]
}
```
