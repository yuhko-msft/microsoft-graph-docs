---
title: "schedule resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# schedule resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List schedules](../api/schedule-list.md)|[schedule](../resources/schedule.md) collection|Get a list of the [schedule](../resources/schedule.md) objects and their properties.|
|[Create schedule](../api/schedule-create.md)|[schedule](../resources/schedule.md)|Create a new [schedule](../resources/schedule.md) object.|
|[Get schedule](../api/schedule-get.md)|[schedule](../resources/schedule.md)|Read the properties and relationships of a [schedule](../resources/schedule.md) object.|
|[Update schedule](../api/schedule-update.md)|[schedule](../resources/schedule.md)|Update the properties of a [schedule](../resources/schedule.md) object.|
|[Delete schedule](../api/schedule-delete.md)|None|Deletes a [schedule](../resources/schedule.md) object.|
|[List timeCards](../api/schedule-list-timecards.md)|[timeCard](../resources/timecard.md) collection|Get the timeCard resources from the timeCards navigation property.|
|[Create timeCard](../api/schedule-post-timecards.md)|[timeCard](../resources/timecard.md)|Create a new timeCard object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|enabled|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|offerShiftRequestsEnabled|Boolean|**TODO: Add Description**|
|openShiftsEnabled|Boolean|**TODO: Add Description**|
|provisionStatus|operationStatus|**TODO: Add Description**. Possible values are: `NotStarted`, `Running`, `Completed`, `Failed`.|
|provisionStatusCode|String|**TODO: Add Description**|
|swapShiftsRequestsEnabled|Boolean|**TODO: Add Description**|
|timeClockEnabled|Boolean|**TODO: Add Description**|
|timeClockSettings|[timeClockSettings](../resources/timeclocksettings.md)|**TODO: Add Description**|
|timeOffRequestsEnabled|Boolean|**TODO: Add Description**|
|timeZone|String|**TODO: Add Description**|
|workforceIntegrationIds|String collection|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|offerShiftRequests|[offerShiftRequest](../resources/offershiftrequest.md) collection|**TODO: Add Description**|
|openShiftChangeRequests|[openShiftChangeRequest](../resources/openshiftchangerequest.md) collection|**TODO: Add Description**|
|openShifts|[openShift](../resources/openshift.md) collection|**TODO: Add Description**|
|schedulingGroups|[schedulingGroup](../resources/schedulinggroup.md) collection|**TODO: Add Description**|
|shifts|[shift](../resources/shift.md) collection|**TODO: Add Description**|
|swapShiftsChangeRequests|[swapShiftsChangeRequest](../resources/swapshiftschangerequest.md) collection|**TODO: Add Description**|
|timeCards|[timeCard](../resources/timecard.md) collection|**TODO: Add Description**|
|timeOffReasons|[timeOffReason](../resources/timeoffreason.md) collection|**TODO: Add Description**|
|timeOffRequests|[timeOffRequest](../resources/timeoffrequest.md) collection|**TODO: Add Description**|
|timesOff|[timeOff](../resources/timeoff.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.schedule",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.schedule",
  "id": "String (identifier)",
  "enabled": "Boolean",
  "offerShiftRequestsEnabled": "Boolean",
  "openShiftsEnabled": "Boolean",
  "provisionStatus": "String",
  "provisionStatusCode": "String",
  "swapShiftsRequestsEnabled": "Boolean",
  "timeClockEnabled": "Boolean",
  "timeClockSettings": {
    "@odata.type": "microsoft.graph.timeClockSettings"
  },
  "timeOffRequestsEnabled": "Boolean",
  "timeZone": "String",
  "workforceIntegrationIds": [
    "String"
  ]
}
```

