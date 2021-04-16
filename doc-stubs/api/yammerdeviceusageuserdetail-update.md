---
title: "Update yammerDeviceUsageUserDetail"
description: "Update the properties of a yammerDeviceUsageUserDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update yammerDeviceUsageUserDetail
Namespace: microsoft.graph



Update the properties of a [yammerDeviceUsageUserDetail](../resources/yammerdeviceusageuserdetail.md) object.

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
PATCH /yammerDeviceUsageUserDetail
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [yammerDeviceUsageUserDetail](../resources/yammerdeviceusageuserdetail.md) object.

The following table shows the properties that are required when you update the [yammerDeviceUsageUserDetail](../resources/yammerdeviceusageuserdetail.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|stateChangeDate|Date|**TODO: Add Description**|
|usedAndroidPhone|Boolean|**TODO: Add Description**|
|usediPad|Boolean|**TODO: Add Description**|
|usediPhone|Boolean|**TODO: Add Description**|
|usedOthers|Boolean|**TODO: Add Description**|
|usedWeb|Boolean|**TODO: Add Description**|
|usedWindowsPhone|Boolean|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|userState|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [yammerDeviceUsageUserDetail](../resources/yammerdeviceusageuserdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_yammerdeviceusageuserdetail"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/yammerDeviceUsageUserDetail
Content-Type: application/json
Content-length: 454

{
  "@odata.type": "#microsoft.graph.yammerDeviceUsageUserDetail",
  "displayName": "String",
  "lastActivityDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "stateChangeDate": "Date",
  "usedAndroidPhone": "Boolean",
  "usediPad": "Boolean",
  "usediPhone": "Boolean",
  "usedOthers": "Boolean",
  "usedWeb": "Boolean",
  "usedWindowsPhone": "Boolean",
  "userPrincipalName": "String",
  "userState": "String"
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
  "@odata.type": "#microsoft.graph.yammerDeviceUsageUserDetail",
  "id": "dbcd3da3-3da3-dbcd-a33d-cddba33dcddb",
  "displayName": "String",
  "lastActivityDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "stateChangeDate": "Date",
  "usedAndroidPhone": "Boolean",
  "usediPad": "Boolean",
  "usediPhone": "Boolean",
  "usedOthers": "Boolean",
  "usedWeb": "Boolean",
  "usedWindowsPhone": "Boolean",
  "userPrincipalName": "String",
  "userState": "String"
}
```

