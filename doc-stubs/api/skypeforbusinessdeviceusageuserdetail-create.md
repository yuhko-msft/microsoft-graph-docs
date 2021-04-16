---
title: "Create skypeForBusinessDeviceUsageUserDetail"
description: "Create a new skypeForBusinessDeviceUsageUserDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create skypeForBusinessDeviceUsageUserDetail
Namespace: microsoft.graph



Create a new [skypeForBusinessDeviceUsageUserDetail](../resources/skypeforbusinessdeviceusageuserdetail.md) object.

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
POST ** Collection URI for microsoft.graph.skypeForBusinessDeviceUsageUserDetail not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [skypeForBusinessDeviceUsageUserDetail](../resources/skypeforbusinessdeviceusageuserdetail.md) object.

The following table shows the properties that are required when you create the [skypeForBusinessDeviceUsageUserDetail](../resources/skypeforbusinessdeviceusageuserdetail.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastActivityDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|usedAndroidPhone|Boolean|**TODO: Add Description**|
|usediPad|Boolean|**TODO: Add Description**|
|usediPhone|Boolean|**TODO: Add Description**|
|usedWindows|Boolean|**TODO: Add Description**|
|usedWindowsPhone|Boolean|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [skypeForBusinessDeviceUsageUserDetail](../resources/skypeforbusinessdeviceusageuserdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_skypeforbusinessdeviceusageuserdetail_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.skypeForBusinessDeviceUsageUserDetail not found
Content-Type: application/json
Content-length: 356

{
  "@odata.type": "#microsoft.graph.skypeForBusinessDeviceUsageUserDetail",
  "lastActivityDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "usedAndroidPhone": "Boolean",
  "usediPad": "Boolean",
  "usediPhone": "Boolean",
  "usedWindows": "Boolean",
  "usedWindowsPhone": "Boolean",
  "userPrincipalName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.skypeForBusinessDeviceUsageUserDetail"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.skypeForBusinessDeviceUsageUserDetail",
  "id": "215892a6-92a6-2158-a692-5821a6925821",
  "lastActivityDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "usedAndroidPhone": "Boolean",
  "usediPad": "Boolean",
  "usediPhone": "Boolean",
  "usedWindows": "Boolean",
  "usedWindowsPhone": "Boolean",
  "userPrincipalName": "String"
}
```

