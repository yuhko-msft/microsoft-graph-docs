---
title: "user: findMeetingTimes"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# user: findMeetingTimes
Namespace: microsoft.graph



**TODO: Add Description**

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
POST /me/findMeetingTimes
POST /users/{usersId}/findMeetingTimes
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|Attendees|[attendeeBase](../resources/attendeebase.md) collection|**TODO: Add Description**|
|LocationConstraint|[locationConstraint](../resources/locationconstraint.md)|**TODO: Add Description**|
|TimeConstraint|[timeConstraint](../resources/timeconstraint.md)|**TODO: Add Description**|
|MeetingDuration|Duration|**TODO: Add Description**|
|MaxCandidates|Int32|**TODO: Add Description**|
|IsOrganizerOptional|Boolean|**TODO: Add Description**|
|ReturnSuggestionReasons|Boolean|**TODO: Add Description**|
|MinimumAttendeePercentage|Double|**TODO: Add Description**|



## Response

If successful, this action returns a `200 OK` response code and a [meetingTimeSuggestionsResult](../resources/meetingtimesuggestionsresult.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "user_findmeetingtimes"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/findMeetingTimes

Content-Type: application/json
Content-length: 460

{
  "Attendees": [
    {
      "@odata.type": "microsoft.graph.attendeeBase"
    }
  ],
  "LocationConstraint": {
    "@odata.type": "microsoft.graph.locationConstraint"
  },
  "TimeConstraint": {
    "@odata.type": "microsoft.graph.timeConstraint"
  },
  "MeetingDuration": "String (duration)",
  "MaxCandidates": "Integer",
  "IsOrganizerOptional": "Boolean",
  "ReturnSuggestionReasons": "Boolean",
  "MinimumAttendeePercentage": "Double"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.meetingTimeSuggestionsResult"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "microsoft.graph.meetingTimeSuggestionsResult"
  }
}
```

