---
title: "onlineMeetingInfo resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# onlineMeetingInfo resource type

Namespace: microsoft.graph

## Properties

| Property        | Type                                      | Description |
| :-------------- | :---------------------------------------- | :---------- |
| conferenceId    | String                                    |             |
| joinUrl         | String                                    |             |
| phones          | [phone](../resources/phone.md) collection |             |
| quickDial       | String                                    |             |
| tollFreeNumbers | String collection                         |             |
| tollNumber      | String                                    |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.onlineMeetingInfo",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.onlineMeetingInfo",
  "conferenceId": "String",
  "joinUrl": "String",
  "phones": [{"@odata.type": "microsoft.graph.phone"}],
  "quickDial": "String",
  "tollFreeNumbers": ["String"],
  "tollNumber": "String"
}
```
