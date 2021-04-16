---
title: "Update chatActivityStatistics"
description: "Update the properties of a chatActivityStatistics object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update chatActivityStatistics
Namespace: microsoft.graph



Update the properties of a [chatActivityStatistics](../resources/chatactivitystatistics.md) object.

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
PATCH /chatActivityStatistics
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [chatActivityStatistics](../resources/chatactivitystatistics.md) object.

The following table shows the properties that are required when you update the [chatActivityStatistics](../resources/chatactivitystatistics.md).

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

If successful, this method returns a `200 OK` response code and an updated [chatActivityStatistics](../resources/chatactivitystatistics.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_chatactivitystatistics"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/chatActivityStatistics
Content-Type: application/json
Content-length: 238

{
  "@odata.type": "#microsoft.graph.chatActivityStatistics",
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.chatActivityStatistics",
  "id": "fd1ebd84-bd84-fd1e-84bd-1efd84bd1efd",
  "activity": "String",
  "duration": "String (duration)",
  "endDate": "Date",
  "startDate": "Date",
  "timeZoneUsed": "String",
  "afterHours": "String (duration)"
}
```

