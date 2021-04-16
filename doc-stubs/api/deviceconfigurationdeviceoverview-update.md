---
title: "Update deviceConfigurationDeviceOverview"
description: "Update the properties of a deviceConfigurationDeviceOverview object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceConfigurationDeviceOverview
Namespace: microsoft.graph



Update the properties of a [deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) object.

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
PATCH /deviceManagement/deviceConfigurations/{deviceConfigurationId}/deviceStatusOverview
PATCH /deviceManagement/deviceConfigurations/{deviceConfigurationId}/rootCertificate/deviceStatusOverview
PATCH /deviceManagement/deviceConfigurations/{deviceConfigurationId}/identityCertificate/deviceStatusOverview
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) object.

The following table shows the properties that are required when you update the [deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|configurationVersion|Int32|Version of the policy for that overview|
|conflictCount|Int32|Number of devices in conflict|
|errorCount|Int32|Number of error devices|
|failedCount|Int32|Number of failed devices|
|lastUpdateDateTime|DateTimeOffset|Last update time|
|notApplicableCount|Int32|Number of not applicable devices|
|notApplicablePlatformCount|Int32|Number of not applicable devices due to mismatch platform and policy|
|pendingCount|Int32|Number of pending devices|
|successCount|Int32|Number of succeeded devices|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_deviceconfigurationdeviceoverview"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/deviceConfigurations/{deviceConfigurationId}/deviceStatusOverview
Content-Type: application/json
Content-length: 388

{
  "@odata.type": "#microsoft.graph.deviceConfigurationDeviceOverview",
  "configurationVersion": "Integer",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "lastUpdateDateTime": "String (timestamp)",
  "notApplicableCount": "Integer",
  "notApplicablePlatformCount": "Integer",
  "pendingCount": "Integer",
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
  "@odata.type": "#microsoft.graph.deviceConfigurationDeviceOverview",
  "id": "0d8f790b-790b-0d8f-0b79-8f0d0b798f0d",
  "configurationVersion": "Integer",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "lastUpdateDateTime": "String (timestamp)",
  "notApplicableCount": "Integer",
  "notApplicablePlatformCount": "Integer",
  "pendingCount": "Integer",
  "successCount": "Integer"
}
```

