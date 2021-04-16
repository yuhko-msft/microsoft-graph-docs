---
title: "Create meetingActivityStatistics"
description: "Create a new meetingActivityStatistics object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create meetingActivityStatistics
Namespace: microsoft.graph



Create a new [meetingActivityStatistics](../resources/meetingactivitystatistics.md) object.

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
POST ** Collection URI for microsoft.graph.meetingActivityStatistics not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [meetingActivityStatistics](../resources/meetingactivitystatistics.md) object.

The following table shows the properties that are required when you create the [meetingActivityStatistics](../resources/meetingactivitystatistics.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|activity|analyticsActivityType|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md). Possible values are: `Email`, `Meeting`, `Focus`, `Chat`, `Call`.|
|duration|Duration|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|endDate|Date|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|startDate|Date|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|timeZoneUsed|String|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|afterHours|Duration|**TODO: Add Description**|
|conflicting|Duration|**TODO: Add Description**|
|long|Duration|**TODO: Add Description**|
|multitasking|Duration|**TODO: Add Description**|
|organized|Duration|**TODO: Add Description**|
|recurring|Duration|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [meetingActivityStatistics](../resources/meetingactivitystatistics.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_meetingactivitystatistics_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.meetingActivityStatistics not found
Content-Type: application/json
Content-length: 426

{
  "@odata.type": "#microsoft.graph.meetingActivityStatistics",
  "activity": "String",
  "duration": "String (duration)",
  "endDate": "Date",
  "startDate": "Date",
  "timeZoneUsed": "String",
  "afterHours": "String (duration)",
  "conflicting": "String (duration)",
  "long": "String (duration)",
  "multitasking": "String (duration)",
  "organized": "String (duration)",
  "recurring": "String (duration)"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.meetingActivityStatistics"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.meetingActivityStatistics",
  "id": "23531683-1683-2353-8316-532383165323",
  "activity": "String",
  "duration": "String (duration)",
  "endDate": "Date",
  "startDate": "Date",
  "timeZoneUsed": "String",
  "afterHours": "String (duration)",
  "conflicting": "String (duration)",
  "long": "String (duration)",
  "multitasking": "String (duration)",
  "organized": "String (duration)",
  "recurring": "String (duration)"
}
```

