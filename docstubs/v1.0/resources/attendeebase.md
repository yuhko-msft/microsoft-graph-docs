---
title: "attendeeBase resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# attendeeBase resource type

Namespace: microsoft.graph

## Properties

| Property     | Type                                         | Description |
| :----------- | :------------------------------------------- | :---------- |
| emailAddress | [emailAddress](../resources/emailaddress.md) |             |
| type         | String                                       |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.attendeeBase",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.attendeeBase",
  "emailAddress": {"@odata.type": "microsoft.graph.emailAddress"},
  "type": "required | optional | resource"
}
```
