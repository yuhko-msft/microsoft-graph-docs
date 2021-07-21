---
title: "Create meetingAttendanceReport"
description: "Create a new meetingAttendanceReport object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create meetingAttendanceReport
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new meetingAttendanceReport object.

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
POST /users/{usersId}/onlineMeetings/{onlineMeetingId}/meetingAttendanceReport
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [meetingAttendanceReport](../resources/meetingattendancereport.md) object.

The following table shows the properties that are required when you create the [meetingAttendanceReport](../resources/meetingattendancereport.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|attendanceRecords|[attendanceRecord](../resources/attendancerecord.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [meetingAttendanceReport](../resources/meetingattendancereport.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_meetingattendancereport_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/users/{usersId}/onlineMeetings/{onlineMeetingId}/meetingAttendanceReport
Content-Type: application/json
Content-length: 168

{
  "@odata.type": "#microsoft.graph.meetingAttendanceReport",
  "attendanceRecords": [
    {
      "@odata.type": "microsoft.graph.attendanceRecord"
    }
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.meetingAttendanceReport"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.meetingAttendanceReport",
  "id": "4c073b5c-3b5c-4c07-5c3b-074c5c3b074c",
  "attendanceRecords": [
    {
      "@odata.type": "microsoft.graph.attendanceRecord"
    }
  ]
}
```

