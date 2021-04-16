---
title: "bookingSchedulingPolicy resource type"
description: "This type represents the set of policies that dictate how bookings can be created in a Booking Calendar."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# bookingSchedulingPolicy resource type

Namespace: microsoft.graph



This type represents the set of policies that dictate how bookings can be created in a Booking Calendar.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowStaffSelection|Boolean|Allow customers to choose a specific person for the booking.|
|maximumAdvance|Duration|Maximum number of days in advance that a booking can be made.|
|minimumLeadTime|Duration|Minimum lead time for bookings and cancellations.|
|sendConfirmationsToOwner|Boolean|Notify the business via email when a booking is created or changed.|
|timeSlotInterval|Duration|Duration of each time slot.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.bookingSchedulingPolicy"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.bookingSchedulingPolicy",
  "allowStaffSelection": "Boolean",
  "maximumAdvance": "String (duration)",
  "minimumLeadTime": "String (duration)",
  "sendConfirmationsToOwner": "Boolean",
  "timeSlotInterval": "String (duration)"
}
```

