---
title: "managedDevice: bulkRestoreCloudPc"
description: "Perform bulk restore for a set of Cloud PCs with their Intune managed device ids and restore point date time."
author: "rongting"
ms.localizationpriority: medium
ms.prod: "cloud-pc"
doc_type: apiPageType
---

# managedDevice: bulkRestoreCloudPc

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Bulk restore a set of Cloud PC devices with Intune [managed device](../resources/cloudpc.md) IDs.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|CloudPC.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|CloudPC.ReadWrite.All|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

``` http
POST /deviceManagement/managedDevices/bulkRestoreCloudPc
```

## Request headers

|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body

In the request body, supply a JSON representation of the IDs of the Intune managed devices.

The following table shows the properties that are required when you bulk restore a set of Cloud PC devices.

|Property|Type|Description|
|:---|:---|:---|
|managedDeviceIds|Collection(String)|The IDs of the Cloud PC devices.|
|restorePointDateTime|DateTimeOffset|The UTC time point for selected Cloud PCs to restore to. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.|
|timeRange|microsoft.graph.restoreTimeRange|The time range of restore point.|

## Response

If successful, this method returns a `200 OK` response code and a [cloudPcBulkRemoteActionResult](../resources/manageddevice-cloudPcBulkRemoteActionResult.md) object in the response body.

## Examples

### Request


# [HTTP](#tab/http)
<!-- {
  "blockType": "request",
  "name": "managedDevice_bulkRestoreCloudPc"
}
-->

``` http
POST https://graph.microsoft.com/beta/deviceManagement/managedDevices/bulkRestoreCloudPc
Content-Type: application/json

{
  "managedDeviceIds": ["30d0e128-de93-41dc-89ec-33d84bb662a0", "7c82a3e3-9459-44e4-94d9-b92f93bf78dd"],
  "restorePointDateTime": "2021-09-23T04:00:00.0000000",
  "timeRange": "before" 
}
```


### Response

<!-- {
  "blockType": "response",
  "truncated": true
}
-->

``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.context":"https://graph.microsoft.com/beta/$metadata#microsoft.graph.cloudPcBulkRemoteActionResult",
  "successfulDeviceIds": [
      "30d0e128-de93-41dc-89ec-33d84bb662a0"
  ],
  "failedDeviceIds": [
      "7c82a3e3-9459-44e4-94d9-b92f93bf78dd"
  ],
  "notFoundDeviceIds": [
  ],
  "notSupportedDeviceIds": [
  ]
}
```
