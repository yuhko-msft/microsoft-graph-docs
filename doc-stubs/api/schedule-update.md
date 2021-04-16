---
title: "Update schedule"
description: "Update the properties of a schedule object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update schedule
Namespace: microsoft.graph



Update the properties of a [schedule](../resources/schedule.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /teams/{teamsId}/schedule
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [schedule](../resources/schedule.md) object.

The following table shows the properties that are required when you update the [schedule](../resources/schedule.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|enabled|Boolean|**TODO: Add Description**|
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



## Response

If successful, this method returns a `200 OK` response code and an updated [schedule](../resources/schedule.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_schedule"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/teams/{teamsId}/schedule
Content-Type: application/json
Content-length: 503

{
  "@odata.type": "#microsoft.graph.schedule",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.schedule",
  "id": "ffecfe34-fe34-ffec-34fe-ecff34feecff",
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

