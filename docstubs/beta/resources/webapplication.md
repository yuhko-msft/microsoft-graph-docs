---
title: "webApplication resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# webApplication resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                | Type                                                           | Description |
| :---------------------- | :------------------------------------------------------------- | :---------- |
| homePageUrl             | String                                                         |             |
| implicitGrantSettings   | [implicitGrantSettings](../resources/implicitgrantsettings.md) |             |
| logoutUrl               | String                                                         |             |
| oauth2AllowImplicitFlow | Boolean                                                        |             |
| redirectUris            | String collection                                              |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.webApplication",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.webApplication",
  "homePageUrl": "String",
  "implicitGrantSettings": {"@odata.type": "microsoft.graph.implicitGrantSettings"},
  "logoutUrl": "String",
  "oauth2AllowImplicitFlow": "Boolean",
  "redirectUris": ["String"]
}
```
