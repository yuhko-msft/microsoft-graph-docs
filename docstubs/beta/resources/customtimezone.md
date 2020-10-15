---
title: "customTimeZone resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# customTimeZone resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property       | Type                                                             | Description |
| :------------- | :--------------------------------------------------------------- | :---------- |
| bias           | Int32                                                            |             |
| daylightOffset | [daylightTimeZoneOffset](../resources/daylighttimezoneoffset.md) |             |
| name           | String                                                           |             |
| standardOffset | [standardTimeZoneOffset](../resources/standardtimezoneoffset.md) |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.customTimeZone",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.customTimeZone",
  "bias": "Int32",
  "daylightOffset": {"@odata.type": "microsoft.graph.daylightTimeZoneOffset"},
  "name": "String",
  "standardOffset": {"@odata.type": "microsoft.graph.standardTimeZoneOffset"}
}
```
