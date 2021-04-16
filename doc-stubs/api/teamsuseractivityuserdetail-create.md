---
title: "Create teamsUserActivityUserDetail"
description: "Create a new teamsUserActivityUserDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create teamsUserActivityUserDetail
Namespace: microsoft.graph



Create a new [teamsUserActivityUserDetail](../resources/teamsuseractivityuserdetail.md) object.

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
POST ** Collection URI for microsoft.graph.teamsUserActivityUserDetail not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [teamsUserActivityUserDetail](../resources/teamsuseractivityuserdetail.md) object.

The following table shows the properties that are required when you create the [teamsUserActivityUserDetail](../resources/teamsuseractivityuserdetail.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|adHocMeetingsAttendedCount|Int64|**TODO: Add Description**|
|adHocMeetingsOrganizedCount|Int64|**TODO: Add Description**|
|assignedProducts|String collection|**TODO: Add Description**|
|audioDuration|Duration|**TODO: Add Description**|
|callCount|Int64|**TODO: Add Description**|
|deletedDate|Date|**TODO: Add Description**|
|hasOtherAction|Boolean|**TODO: Add Description**|
|isDeleted|Boolean|**TODO: Add Description**|
|isLicensed|Boolean|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|meetingCount|Int64|**TODO: Add Description**|
|meetingsAttendedCount|Int64|**TODO: Add Description**|
|meetingsOrganizedCount|Int64|**TODO: Add Description**|
|privateChatMessageCount|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|scheduledOneTimeMeetingsAttendedCount|Int64|**TODO: Add Description**|
|scheduledOneTimeMeetingsOrganizedCount|Int64|**TODO: Add Description**|
|scheduledRecurringMeetingsAttendedCount|Int64|**TODO: Add Description**|
|scheduledRecurringMeetingsOrganizedCount|Int64|**TODO: Add Description**|
|screenShareDuration|Duration|**TODO: Add Description**|
|teamChatMessageCount|Int64|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|videoDuration|Duration|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [teamsUserActivityUserDetail](../resources/teamsuseractivityuserdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_teamsuseractivityuserdetail_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.teamsUserActivityUserDetail not found
Content-Type: application/json
Content-length: 1012

{
  "@odata.type": "#microsoft.graph.teamsUserActivityUserDetail",
  "adHocMeetingsAttendedCount": "Integer",
  "adHocMeetingsOrganizedCount": "Integer",
  "assignedProducts": [
    "String"
  ],
  "audioDuration": "String (duration)",
  "callCount": "Integer",
  "deletedDate": "Date",
  "hasOtherAction": "Boolean",
  "isDeleted": "Boolean",
  "isLicensed": "Boolean",
  "lastActivityDate": "Date",
  "meetingCount": "Integer",
  "meetingsAttendedCount": "Integer",
  "meetingsOrganizedCount": "Integer",
  "privateChatMessageCount": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "scheduledOneTimeMeetingsAttendedCount": "Integer",
  "scheduledOneTimeMeetingsOrganizedCount": "Integer",
  "scheduledRecurringMeetingsAttendedCount": "Integer",
  "scheduledRecurringMeetingsOrganizedCount": "Integer",
  "screenShareDuration": "String (duration)",
  "teamChatMessageCount": "Integer",
  "userPrincipalName": "String",
  "videoDuration": "String (duration)"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.teamsUserActivityUserDetail"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.teamsUserActivityUserDetail",
  "id": "ef3bcc15-cc15-ef3b-15cc-3bef15cc3bef",
  "adHocMeetingsAttendedCount": "Integer",
  "adHocMeetingsOrganizedCount": "Integer",
  "assignedProducts": [
    "String"
  ],
  "audioDuration": "String (duration)",
  "callCount": "Integer",
  "deletedDate": "Date",
  "hasOtherAction": "Boolean",
  "isDeleted": "Boolean",
  "isLicensed": "Boolean",
  "lastActivityDate": "Date",
  "meetingCount": "Integer",
  "meetingsAttendedCount": "Integer",
  "meetingsOrganizedCount": "Integer",
  "privateChatMessageCount": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "scheduledOneTimeMeetingsAttendedCount": "Integer",
  "scheduledOneTimeMeetingsOrganizedCount": "Integer",
  "scheduledRecurringMeetingsAttendedCount": "Integer",
  "scheduledRecurringMeetingsOrganizedCount": "Integer",
  "screenShareDuration": "String (duration)",
  "teamChatMessageCount": "Integer",
  "userPrincipalName": "String",
  "videoDuration": "String (duration)"
}
```

