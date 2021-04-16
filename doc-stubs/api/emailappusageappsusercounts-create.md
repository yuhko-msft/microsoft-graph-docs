---
title: "Create emailAppUsageAppsUserCounts"
description: "Create a new emailAppUsageAppsUserCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create emailAppUsageAppsUserCounts
Namespace: microsoft.graph



Create a new [emailAppUsageAppsUserCounts](../resources/emailappusageappsusercounts.md) object.

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
POST ** Collection URI for microsoft.graph.emailAppUsageAppsUserCounts not found
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
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|imap4App|Int64|**TODO: Add Description**|
|mailForMac|Int64|**TODO: Add Description**|
|otherForMobile|Int64|**TODO: Add Description**|
|outlookForMac|Int64|**TODO: Add Description**|
|outlookForMobile|Int64|**TODO: Add Description**|
|outlookForWeb|Int64|**TODO: Add Description**|
|outlookForWindows|Int64|**TODO: Add Description**|
|pop3App|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|smtpApp|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [emailAppUsageAppsUserCounts](../resources/emailappusageappsusercounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_emailappusageappsusercounts_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.emailAppUsageAppsUserCounts not found
Content-Type: application/json
Content-length: 397

{
  "@odata.type": "#microsoft.graph.emailAppUsageAppsUserCounts",
  "imap4App": "Integer",
  "mailForMac": "Integer",
  "otherForMobile": "Integer",
  "outlookForMac": "Integer",
  "outlookForMobile": "Integer",
  "outlookForWeb": "Integer",
  "outlookForWindows": "Integer",
  "pop3App": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "smtpApp": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.emailAppUsageAppsUserCounts"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.emailAppUsageAppsUserCounts",
  "id": "7e8a37f5-37f5-7e8a-f537-8a7ef5378a7e",
  "imap4App": "Integer",
  "mailForMac": "Integer",
  "otherForMobile": "Integer",
  "outlookForMac": "Integer",
  "outlookForMobile": "Integer",
  "outlookForWeb": "Integer",
  "outlookForWindows": "Integer",
  "pop3App": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "smtpApp": "Integer"
}
```

