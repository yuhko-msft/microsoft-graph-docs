---
title: "Create callActivityStatistics"
description: "Create a new callActivityStatistics object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create callActivityStatistics
Namespace: microsoft.graph



Create a new [callActivityStatistics](../resources/callactivitystatistics.md) object.

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
POST ** Collection URI for microsoft.graph.callActivityStatistics not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [callActivityStatistics](../resources/callactivitystatistics.md) object.

The following table shows the properties that are required when you create the [callActivityStatistics](../resources/callactivitystatistics.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|activity|analyticsActivityType|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md). Possible values are: `Email`, `Meeting`, `Focus`, `Chat`, `Call`.|
|duration|Duration|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|endDate|Date|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|startDate|Date|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|timeZoneUsed|String|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|afterHours|Duration|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [callActivityStatistics](../resources/callactivitystatistics.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_callactivitystatistics_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.callActivityStatistics not found
Content-Type: application/json
Content-length: 238

{
  "@odata.type": "#microsoft.graph.callActivityStatistics",
  "activity": "String",
  "duration": "String (duration)",
  "endDate": "Date",
  "startDate": "Date",
  "timeZoneUsed": "String",
  "afterHours": "String (duration)"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.callActivityStatistics"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.callActivityStatistics",
  "id": "c167fb1f-fb1f-c167-1ffb-67c11ffb67c1",
  "activity": "String",
  "duration": "String (duration)",
  "endDate": "Date",
  "startDate": "Date",
  "timeZoneUsed": "String",
  "afterHours": "String (duration)"
}
```

