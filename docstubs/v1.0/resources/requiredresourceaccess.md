---
title: "requiredResourceAccess resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# requiredResourceAccess resource type

Namespace: microsoft.graph

## Properties

| Property       | Type                                                        | Description |
| :------------- | :---------------------------------------------------------- | :---------- |
| resourceAccess | [resourceAccess](../resources/resourceaccess.md) collection |             |
| resourceAppId  | String                                                      |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.requiredResourceAccess",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.requiredResourceAccess",
  "resourceAccess": [{"@odata.type": "microsoft.graph.resourceAccess"}],
  "resourceAppId": "String"
}
```
