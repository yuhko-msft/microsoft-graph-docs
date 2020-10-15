---
title: "instanceResourceAccess resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# instanceResourceAccess resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property      | Type                                                                | Description |
| :------------ | :------------------------------------------------------------------ | :---------- |
| permissions   | [resourcePermission](../resources/resourcepermission.md) collection |             |
| resourceAppId | String                                                              |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.instanceResourceAccess",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.instanceResourceAccess",
  "permissions": [{"@odata.type": "microsoft.graph.resourcePermission"}],
  "resourceAppId": "String"
}
```
