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

## Properties

| Property               | Type              | Description |
| :--------------------- | :---------------- | :---------- |
| appId                  | String            |             |
| delegatedPermissionIds | String collection |             |

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
  "delegatedPermissionIds": ["String"]
}
```
