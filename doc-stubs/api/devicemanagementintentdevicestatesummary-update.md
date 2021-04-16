---
title: "Update deviceManagementIntentDeviceStateSummary"
description: "Update the properties of a deviceManagementIntentDeviceStateSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementIntentDeviceStateSummary
Namespace: microsoft.graph



Update the properties of a [deviceManagementIntentDeviceStateSummary](../resources/devicemanagementintentdevicestatesummary.md) object.

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
PATCH /deviceManagement/intents/{deviceManagementIntentId}/deviceStateSummary
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementIntentDeviceStateSummary](../resources/devicemanagementintentdevicestatesummary.md) object.

The following table shows the properties that are required when you update the [deviceManagementIntentDeviceStateSummary](../resources/devicemanagementintentdevicestatesummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|conflictCount|Int32|Number of devices in conflict|
|errorCount|Int32|Number of error devices|
|failedCount|Int32|Number of failed devices|
|notApplicableCount|Int32|Number of not applicable devices|
|notApplicablePlatformCount|Int32|Number of not applicable devices due to mismatch platform and policy|
|successCount|Int32|Number of succeeded devices|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementIntentDeviceStateSummary](../resources/devicemanagementintentdevicestatesummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementintentdevicestatesummary"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/intents/{deviceManagementIntentId}/deviceStateSummary
Content-Type: application/json
Content-length: 280

{
  "@odata.type": "#microsoft.graph.deviceManagementIntentDeviceStateSummary",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "notApplicableCount": "Integer",
  "notApplicablePlatformCount": "Integer",
  "successCount": "Integer"
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
  "@odata.type": "#microsoft.graph.deviceManagementIntentDeviceStateSummary",
  "id": "08b7d699-d699-08b7-99d6-b70899d6b708",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "notApplicableCount": "Integer",
  "notApplicablePlatformCount": "Integer",
  "successCount": "Integer"
}
```

