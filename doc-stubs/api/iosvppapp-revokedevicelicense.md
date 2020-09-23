---
title: "iosVppApp: revokeDeviceLicense"
description: "Revoke assigned iOS VPP device license for given app."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# iosVppApp: revokeDeviceLicense
Namespace: microsoft.graph

Revoke assigned iOS VPP device license for given app.

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
POST ** Entity URI for microsoft.management.services.api.iosVppApp not found/revokeDeviceLicense
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|managedDeviceId|String|DeviceId for whom assigned app license is to be revoked|
|notifyManagedDevices|Boolean|Boolean that indicates if revoke notification should be sent to device|



## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "iosvppapp_revokedevicelicense"
}
-->
``` http
POST https://graph.microsoft.com/beta** Entity URI for microsoft.management.services.api.iosVppApp not found/revokeDeviceLicense

Content-Type: application/json
Content-length: 73

{
  "managedDeviceId": "String",
  "notifyManagedDevices": "Boolean"
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
HTTP/1.1 204 No Content
```

