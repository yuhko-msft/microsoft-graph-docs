---
title: "Update emailAppUsageUserCounts"
description: "Update the properties of an emailAppUsageUserCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update emailAppUsageUserCounts
Namespace: microsoft.graph



Update the properties of an [emailAppUsageUserCounts](../resources/emailappusageusercounts.md) object.

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
PATCH /emailAppUsageUserCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [emailAppUsageUserCounts](../resources/emailappusageusercounts.md) object.

The following table shows the properties that are required when you update the [emailAppUsageUserCounts](../resources/emailappusageusercounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|imap4App|Int64|**TODO: Add Description**|
|mailForMac|Int64|**TODO: Add Description**|
|otherForMobile|Int64|**TODO: Add Description**|
|outlookForMac|Int64|**TODO: Add Description**|
|outlookForMobile|Int64|**TODO: Add Description**|
|outlookForWeb|Int64|**TODO: Add Description**|
|outlookForWindows|Int64|**TODO: Add Description**|
|pop3App|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|smtpApp|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [emailAppUsageUserCounts](../resources/emailappusageusercounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_emailappusageusercounts"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/emailAppUsageUserCounts
Content-Type: application/json
Content-length: 418

{
  "@odata.type": "#microsoft.graph.emailAppUsageUserCounts",
  "imap4App": "Integer",
  "mailForMac": "Integer",
  "otherForMobile": "Integer",
  "outlookForMac": "Integer",
  "outlookForMobile": "Integer",
  "outlookForWeb": "Integer",
  "outlookForWindows": "Integer",
  "pop3App": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "smtpApp": "Integer"
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
  "@odata.type": "#microsoft.graph.emailAppUsageUserCounts",
  "id": "0af78f6d-8f6d-0af7-6d8f-f70a6d8ff70a",
  "imap4App": "Integer",
  "mailForMac": "Integer",
  "otherForMobile": "Integer",
  "outlookForMac": "Integer",
  "outlookForMobile": "Integer",
  "outlookForWeb": "Integer",
  "outlookForWindows": "Integer",
  "pop3App": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "smtpApp": "Integer"
}
```

