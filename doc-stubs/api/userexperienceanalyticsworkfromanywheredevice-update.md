---
title: "Update userExperienceAnalyticsWorkFromAnywhereDevice"
description: "Update the properties of a userExperienceAnalyticsWorkFromAnywhereDevice object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userExperienceAnalyticsWorkFromAnywhereDevice
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) object.

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
PATCH /deviceManagement/userExperienceAnalyticsWorkFromAnywhereMetrics/{userExperienceAnalyticsWorkFromAnywhereMetricId}/metricDevices/{userExperienceAnalyticsWorkFromAnywhereDeviceId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) object.

The following table shows the properties that are required when you update the [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|The unique identifier of the user experience analytics work from anywhere device.|
|deviceName|String|The work from anywhere device's name.|
|serialNumber|String|The user experience work from anywhere device's serial number.|
|manufacturer|String|The user experience work from anywhere device's manufacturer.|
|model|String|The user experience work from anywhere device's model.|
|ownership|String|The user experience work from anywhere device's ownership.|
|managedBy|String|The user experience work from anywhere management agent of the device.|
|autoPilotRegistered|Boolean|The user experience work from anywhere intune device's autopilotRegistered.|
|autoPilotProfileAssigned|Boolean|The user experience analytics work from anywhere intune device's autopilotProfileAssigned.|
|azureAdRegistered|Boolean|The user experience work from anywhere device's azureAdRegistered.|
|azureAdDeviceId|String|The user experience work from anywhere azure Ad device Id.|
|azureAdJoinType|String|The user experience work from anywhere device's azure Ad joinType.|
|osDescription|String|The user experience work from anywhere device's OS Description.|
|osVersion|String|The user experience work from anywhere device's OS Version.|
|tenantAttached|Boolean|The user experience work from anywhere device's tenantAttached.|
|compliancePolicySetToIntune|Boolean|The user experience work from anywhere device's compliancePolicySetToIntune.|
|otherWorkloadsSetToIntune|Boolean|The user experience work from anywhere device's otherWorkloadsSetToIntune.|
|upgradeEligibility|operatingSystemUpgradeEligibility|The user experience work from anywhere windows upgrade eligibility status of device. Possible values are: `upgraded`, `unknown`, `notCapable`, `capable`.|
|ramCheckFailed|Boolean|Is the user experience analytics work from anywhere device RAM hardware check failed for device to upgrade to the latest version of windows|
|storageCheckFailed|Boolean|The user experience work from anywhere device, Is storage hardware check failed for device to upgrade to the latest version of windows.|
|processorCoreCountCheckFailed|Boolean|The user experience work from anywhere device, Is processor hardware core count check failed for device to upgrade to the latest version of windows.|
|processorSpeedCheckFailed|Boolean|The user experience work from anywhere device, Is processor hardware speed check failed for device to upgrade to the latest version of windows.|
|tpmCheckFailed|Boolean|The user experience work from anywhere device, Is Trusted Platform Module (TPM) hardware check failed for device to the latest version of upgrade to windows.|
|secureBootCheckFailed|Boolean|The user experience work from anywhere device, Is secure boot hardware check failed for device to upgrade to the latest version of windows.|
|processorFamilyCheckFailed|Boolean|The user experience work from anywhere device, Is processor hardware family check failed for device to upgrade to the latest version of windows.|
|processor64BitCheckFailed|Boolean|The user experience work from anywhere device, Is processor hardware 64-bit architecture check failed for device to upgrade to the latest version of windows.|
|osCheckFailed|Boolean|The user experience work from anywhere device, Is OS check failed for device to upgrade to the latest version of windows.|



## Response

If successful, this method returns a `200 OK` response code and an updated [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userexperienceanalyticsworkfromanywheredevice"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsWorkFromAnywhereMetrics/{userExperienceAnalyticsWorkFromAnywhereMetricId}/metricDevices/{userExperienceAnalyticsWorkFromAnywhereDeviceId}
Content-Type: application/json
Content-length: 982

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsWorkFromAnywhereDevice",
  "deviceName": "String",
  "serialNumber": "String",
  "manufacturer": "String",
  "model": "String",
  "ownership": "String",
  "managedBy": "String",
  "autoPilotRegistered": "Boolean",
  "autoPilotProfileAssigned": "Boolean",
  "azureAdRegistered": "Boolean",
  "azureAdDeviceId": "String",
  "azureAdJoinType": "String",
  "osDescription": "String",
  "osVersion": "String",
  "tenantAttached": "Boolean",
  "compliancePolicySetToIntune": "Boolean",
  "otherWorkloadsSetToIntune": "Boolean",
  "upgradeEligibility": "String",
  "ramCheckFailed": "Boolean",
  "storageCheckFailed": "Boolean",
  "processorCoreCountCheckFailed": "Boolean",
  "processorSpeedCheckFailed": "Boolean",
  "tpmCheckFailed": "Boolean",
  "secureBootCheckFailed": "Boolean",
  "processorFamilyCheckFailed": "Boolean",
  "processor64BitCheckFailed": "Boolean",
  "osCheckFailed": "Boolean"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsWorkFromAnywhereDevice",
  "id": "a617902f-902f-a617-2f90-17a62f9017a6",
  "deviceName": "String",
  "serialNumber": "String",
  "manufacturer": "String",
  "model": "String",
  "ownership": "String",
  "managedBy": "String",
  "autoPilotRegistered": "Boolean",
  "autoPilotProfileAssigned": "Boolean",
  "azureAdRegistered": "Boolean",
  "azureAdDeviceId": "String",
  "azureAdJoinType": "String",
  "osDescription": "String",
  "osVersion": "String",
  "tenantAttached": "Boolean",
  "compliancePolicySetToIntune": "Boolean",
  "otherWorkloadsSetToIntune": "Boolean",
  "upgradeEligibility": "String",
  "ramCheckFailed": "Boolean",
  "storageCheckFailed": "Boolean",
  "processorCoreCountCheckFailed": "Boolean",
  "processorSpeedCheckFailed": "Boolean",
  "tpmCheckFailed": "Boolean",
  "secureBootCheckFailed": "Boolean",
  "processorFamilyCheckFailed": "Boolean",
  "processor64BitCheckFailed": "Boolean",
  "osCheckFailed": "Boolean"
}
```

