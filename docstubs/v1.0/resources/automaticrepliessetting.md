---
title: "automaticRepliesSetting resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# automaticRepliesSetting resource type

Namespace: microsoft.graph

## Properties

| Property               | Type                                                 | Description |
| :--------------------- | :--------------------------------------------------- | :---------- |
| externalAudience       | String                                               |             |
| externalReplyMessage   | String                                               |             |
| internalReplyMessage   | String                                               |             |
| scheduledEndDateTime   | [dateTimeTimeZone](../resources/datetimetimezone.md) |             |
| scheduledStartDateTime | [dateTimeTimeZone](../resources/datetimetimezone.md) |             |
| status                 | String                                               |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.automaticRepliesSetting",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.automaticRepliesSetting",
  "externalAudience": "none | contactsOnly | all",
  "externalReplyMessage": "String",
  "internalReplyMessage": "String",
  "scheduledEndDateTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "scheduledStartDateTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "status": "disabled | alwaysEnabled | scheduled"
}
```
