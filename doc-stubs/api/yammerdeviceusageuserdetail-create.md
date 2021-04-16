---
title: "Create yammerDeviceUsageUserDetail"
description: "Create a new yammerDeviceUsageUserDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create yammerDeviceUsageUserDetail
Namespace: microsoft.graph



Create a new [yammerDeviceUsageUserDetail](../resources/yammerdeviceusageuserdetail.md) object.

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
POST ** Collection URI for microsoft.graph.yammerDeviceUsageUserDetail not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [yammerDeviceUsageUserDetail](../resources/yammerdeviceusageuserdetail.md) object.

The following table shows the properties that are required when you create the [yammerDeviceUsageUserDetail](../resources/yammerdeviceusageuserdetail.md).

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

If successful, this method returns a `201 Created` response code and a [yammerDeviceUsageUserDetail](../resources/yammerdeviceusageuserdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_yammerdeviceusageuserdetail_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.yammerDeviceUsageUserDetail not found
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
  "truncated": true,
  "@odata.type": "microsoft.graph.yammerDeviceUsageUserDetail"
}
-->
``` http
HTTP/1.1 201 Created
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

