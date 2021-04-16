---
title: "Get meetingActivityStatistics"
description: "Read the properties and relationships of a meetingActivityStatistics object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get meetingActivityStatistics
Namespace: microsoft.graph



Read the properties and relationships of a [meetingActivityStatistics](../resources/meetingactivitystatistics.md) object.

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
GET /meetingActivityStatistics
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [meetingActivityStatistics](../resources/meetingactivitystatistics.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_meetingactivitystatistics"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/meetingActivityStatistics
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

