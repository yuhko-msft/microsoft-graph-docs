---
title: "Update emailAppUsageAppsUserCounts"
description: "Update the properties of an emailAppUsageAppsUserCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update emailAppUsageAppsUserCounts
Namespace: microsoft.graph

Update the properties of an [emailAppUsageAppsUserCounts](../resources/emailappusageappsusercounts.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
PATCH /emailAppUsageAppsUserCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [emailAppUsageAppsUserCounts](../resources/emailappusageappsusercounts.md) object.

The following table shows the properties that are required when you create the [emailAppUsageAppsUserCounts](../resources/emailappusageappsusercounts.md).

|Property|Type|Description|
|:---|:---|:---|
|reportRefreshDate|Date|**TODO: Add Description**|
|mailForMac|Int64|**TODO: Add Description**|
|outlookForMac|Int64|**TODO: Add Description**|
|outlookForWindows|Int64|**TODO: Add Description**|
|outlookForMobile|Int64|**TODO: Add Description**|
|otherForMobile|Int64|**TODO: Add Description**|
|outlookForWeb|Int64|**TODO: Add Description**|
|pop3App|Int64|**TODO: Add Description**|
|imap4App|Int64|**TODO: Add Description**|
|smtpApp|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [emailAppUsageAppsUserCounts](../resources/emailappusageappsusercounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_emailappusageappsusercounts"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/emailAppUsageAppsUserCounts
Content-Type: application/json
Content-length: 397

{
  "@odata.type": "#microsoft.graph.emailAppUsageAppsUserCounts",
  "reportRefreshDate": "Date",
  "mailForMac": "Integer",
  "outlookForMac": "Integer",
  "outlookForWindows": "Integer",
  "outlookForMobile": "Integer",
  "otherForMobile": "Integer",
  "outlookForWeb": "Integer",
  "pop3App": "Integer",
  "imap4App": "Integer",
  "smtpApp": "Integer",
  "reportPeriod": "String"
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
  "@odata.type": "#microsoft.graph.emailAppUsageAppsUserCounts",
  "reportRefreshDate": "Date",
  "mailForMac": "Integer",
  "outlookForMac": "Integer",
  "outlookForWindows": "Integer",
  "outlookForMobile": "Integer",
  "otherForMobile": "Integer",
  "outlookForWeb": "Integer",
  "pop3App": "Integer",
  "imap4App": "Integer",
  "smtpApp": "Integer",
  "reportPeriod": "String"
}
```

