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

Perform bulk restore for a set of Cloud PCs with their Intune managed device ids and restore point date time.

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
POST /me/managedDevices/bulkRestoreCloudPc
POST /users/{usersId}/managedDevices/bulkRestoreCloudPc
POST /deviceManagement/managedDevices/bulkRestoreCloudPc
POST /deviceManagement/comanagedDevices/bulkRestoreCloudPc
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
|managedDeviceIds|String collection|The IDs of the Cloud PC devices.|
|restorePointDateTime|DateTimeOffset|The UTC time point for selected Cloud PCs to restore to. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.|
|timeRange|restoreTimeRange|The time range of restore point.|



## Response

If successful, this action returns a `200 OK` response code and a [cloudPcBulkRemoteActionResult](../resources/cloudpcbulkremoteactionresult.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "manageddevicethis.bulkrestorecloudpc"
}
-->
``` http
POST https://graph.microsoft.com/beta/me/managedDevices/bulkRestoreCloudPc
Content-Type: application/json
Content-length: 123

{
  "managedDeviceIds": [
    "String"
  ],
  "restorePointDateTime": "String (timestamp)",
  "timeRange": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.cloudPcBulkRemoteActionResult"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "microsoft.graph.cloudPcBulkRemoteActionResult"
  }
}
```