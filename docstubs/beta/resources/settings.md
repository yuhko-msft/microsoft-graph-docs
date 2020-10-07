---
title: "settings resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# settings resource type

Namespace: microsoft.graph.analytics

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property        | Type    | Description |
| :-------------- | :------ | :---------- |
| hasGraphMailbox | Boolean |             |
| hasLicense      | Boolean |             |
| hasOptedOut     | Boolean |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.analytics.settings",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.analytics.settings",
  "hasGraphMailbox": "Boolean",
  "hasLicense": "Boolean",
  "hasOptedOut": "Boolean"
}
```