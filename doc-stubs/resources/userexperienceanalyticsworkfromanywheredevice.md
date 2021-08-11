---
title: "userExperienceAnalyticsWorkFromAnywhereDevice resource type"
description: "The user experience analytics Device for work from anywhere report"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsWorkFromAnywhereDevice resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analytics Device for work from anywhere report

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsWorkFromAnywhereDevices](../api/userexperienceanalyticsworkfromanywheredevice-list.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) collection|Get a list of the [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) objects and their properties.|
|[Create userExperienceAnalyticsWorkFromAnywhereDevice](../api/userexperienceanalyticsworkfromanywheredevice-create.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md)|Create a new [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) object.|
|[Get userExperienceAnalyticsWorkFromAnywhereDevice](../api/userexperienceanalyticsworkfromanywheredevice-get.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md)|Read the properties and relationships of a [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) object.|
|[Update userExperienceAnalyticsWorkFromAnywhereDevice](../api/userexperienceanalyticsworkfromanywheredevice-update.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md)|Update the properties of a [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) object.|
|[Delete userExperienceAnalyticsWorkFromAnywhereDevice](../api/userexperienceanalyticsworkfromanywheredevice-delete.md)|None|Deletes a [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|autoPilotProfileAssigned|Boolean|The user experience analytics work from anywhere intune device's autopilotProfileAssigned.|
|autoPilotRegistered|Boolean|The user experience work from anywhere intune device's autopilotRegistered.|
|azureAdDeviceId|String|The user experience work from anywhere azure Ad device Id.|
|azureAdJoinType|String|The user experience work from anywhere device's azure Ad joinType.|
|azureAdRegistered|Boolean|The user experience work from anywhere device's azureAdRegistered.|
|compliancePolicySetToIntune|Boolean|The user experience work from anywhere device's compliancePolicySetToIntune.|
|deviceName|String|The work from anywhere device's name.|
|id|String|The unique identifier of the user experience analytics work from anywhere device.|
|managedBy|String|The user experience work from anywhere management agent of the device.|
|manufacturer|String|The user experience work from anywhere device's manufacturer.|
|model|String|The user experience work from anywhere device's model.|
|osCheckFailed|Boolean|The user experience work from anywhere device, Is OS check failed for device to upgrade to the latest version of windows.|
|osDescription|String|The user experience work from anywhere device's OS Description.|
|osVersion|String|The user experience work from anywhere device's OS Version.|
|otherWorkloadsSetToIntune|Boolean|The user experience work from anywhere device's otherWorkloadsSetToIntune.|
|ownership|String|The user experience work from anywhere device's ownership.|
|processor64BitCheckFailed|Boolean|The user experience work from anywhere device, Is processor hardware 64-bit architecture check failed for device to upgrade to the latest version of windows.|
|processorCoreCountCheckFailed|Boolean|The user experience work from anywhere device, Is processor hardware core count check failed for device to upgrade to the latest version of windows.|
|processorFamilyCheckFailed|Boolean|The user experience work from anywhere device, Is processor hardware family check failed for device to upgrade to the latest version of windows.|
|processorSpeedCheckFailed|Boolean|The user experience work from anywhere device, Is processor hardware speed check failed for device to upgrade to the latest version of windows.|
|ramCheckFailed|Boolean|Is the user experience analytics work from anywhere device RAM hardware check failed for device to upgrade to the latest version of windows|
|secureBootCheckFailed|Boolean|The user experience work from anywhere device, Is secure boot hardware check failed for device to upgrade to the latest version of windows.|
|serialNumber|String|The user experience work from anywhere device's serial number.|
|storageCheckFailed|Boolean|The user experience work from anywhere device, Is storage hardware check failed for device to upgrade to the latest version of windows.|
|tenantAttached|Boolean|The user experience work from anywhere device's tenantAttached.|
|tpmCheckFailed|Boolean|The user experience work from anywhere device, Is Trusted Platform Module (TPM) hardware check failed for device to the latest version of upgrade to windows.|
|upgradeEligibility|operatingSystemUpgradeEligibility|The user experience work from anywhere windows upgrade eligibility status of device. Possible values are: `upgraded`, `unknown`, `notCapable`, `capable`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsWorkFromAnywhereDevice",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsWorkFromAnywhereDevice",
  "id": "String (identifier)",
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

