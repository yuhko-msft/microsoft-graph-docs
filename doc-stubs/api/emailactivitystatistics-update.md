---
title: "Update emailActivityStatistics"
description: "Update the properties of an emailActivityStatistics object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update emailActivityStatistics
Namespace: microsoft.graph



Update the properties of an [emailActivityStatistics](../resources/emailactivitystatistics.md) object.

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
PATCH /emailActivityStatistics
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [emailActivityStatistics](../resources/emailactivitystatistics.md) object.

The following table shows the properties that are required when you update the [emailActivityStatistics](../resources/emailactivitystatistics.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|activity|analyticsActivityType|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md). Possible values are: `Email`, `Meeting`, `Focus`, `Chat`, `Call`.|
|duration|Duration|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|endDate|Date|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|startDate|Date|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|timeZoneUsed|String|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|afterHours|Duration|**TODO: Add Description**|
|readEmail|Duration|**TODO: Add Description**|
|sentEmail|Duration|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [emailActivityStatistics](../resources/emailactivitystatistics.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_emailactivitystatistics"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/emailActivityStatistics
Content-Type: application/json
Content-length: 313

{
  "@odata.type": "#microsoft.graph.emailActivityStatistics",
  "activity": "String",
  "duration": "String (duration)",
  "endDate": "Date",
  "startDate": "Date",
  "timeZoneUsed": "String",
  "afterHours": "String (duration)",
  "readEmail": "String (duration)",
  "sentEmail": "String (duration)"
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
  "@odata.type": "#microsoft.graph.emailActivityStatistics",
  "id": "06b27726-7726-06b2-2677-b2062677b206",
  "activity": "String",
  "duration": "String (duration)",
  "endDate": "Date",
  "startDate": "Date",
  "timeZoneUsed": "String",
  "afterHours": "String (duration)",
  "readEmail": "String (duration)",
  "sentEmail": "String (duration)"
}
```

