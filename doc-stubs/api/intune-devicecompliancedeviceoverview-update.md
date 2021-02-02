---
title: "Update deviceComplianceDeviceOverview"
description: "Update the properties of a deviceComplianceDeviceOverview object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceComplianceDeviceOverview
Namespace: microsoft.graph

Update the properties of a [deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md) object.

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
PATCH /deviceManagement/deviceCompliancePolicies/{deviceCompliancePolicyId}/deviceStatusOverview
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md) object.

The following table shows the properties that are required when you update the [deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|retireScheduledCount|Int32|**TODO: Add Description**|
|pendingCount|Int32|**TODO: Add Description**|
|notApplicableCount|Int32|**TODO: Add Description**|
|notApplicablePlatformCount|Int32|**TODO: Add Description**|
|successCount|Int32|**TODO: Add Description**|
|errorCount|Int32|**TODO: Add Description**|
|failedCount|Int32|**TODO: Add Description**|
|conflictCount|Int32|**TODO: Add Description**|
|lastUpdateDateTime|DateTimeOffset|**TODO: Add Description**|
|configurationVersion|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicecompliancedeviceoverview"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/deviceCompliancePolicies/{deviceCompliancePolicyId}/deviceStatusOverview
Content-Type: application/json
Content-length: 423

{
  "@odata.type": "#microsoft.graph.deviceComplianceDeviceOverview",
  "retireScheduledCount": "Integer",
  "pendingCount": "Integer",
  "notApplicableCount": "Integer",
  "notApplicablePlatformCount": "Integer",
  "successCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "conflictCount": "Integer",
  "lastUpdateDateTime": "String (timestamp)",
  "configurationVersion": "Integer"
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
  "@odata.type": "#microsoft.graph.deviceComplianceDeviceOverview",
  "id": "9701a57d-a57d-9701-7da5-01977da50197",
  "retireScheduledCount": "Integer",
  "pendingCount": "Integer",
  "notApplicableCount": "Integer",
  "notApplicablePlatformCount": "Integer",
  "successCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "conflictCount": "Integer",
  "lastUpdateDateTime": "String (timestamp)",
  "configurationVersion": "Integer"
}
```

