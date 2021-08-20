---
title: "userExperienceAnalyticsWorkFromAnywhereDevice resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsWorkFromAnywhereDevice resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsWorkFromAnywhereDevices](../api/intune-userexperienceanalyticsworkfromanywheredevice-list.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md) collection|Get a list of the [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md) objects and their properties.|
|[Create userExperienceAnalyticsWorkFromAnywhereDevice](../api/intune-userexperienceanalyticsworkfromanywheredevice-create.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md)|Create a new [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md) object.|
|[Get userExperienceAnalyticsWorkFromAnywhereDevice](../api/intune-userexperienceanalyticsworkfromanywheredevice-get.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md)|Read the properties and relationships of a [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md) object.|
|[Update userExperienceAnalyticsWorkFromAnywhereDevice](../api/intune-userexperienceanalyticsworkfromanywheredevice-update.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md)|Update the properties of a [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md) object.|
|[Delete userExperienceAnalyticsWorkFromAnywhereDevice](../api/intune-userexperienceanalyticsworkfromanywheredevice-delete.md)|None|Deletes a [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|autoPilotProfileAssigned|Boolean|**TODO: Add Description**|
|autoPilotRegistered|Boolean|**TODO: Add Description**|
|azureAdDeviceId|String|**TODO: Add Description**|
|azureAdJoinType|String|**TODO: Add Description**|
|azureAdRegistered|Boolean|**TODO: Add Description**|
|cloudIdentityScore|Double|**TODO: Add Description**|
|cloudManagementScore|Double|**TODO: Add Description**|
|cloudProvisioningScore|Double|**TODO: Add Description**|
|compliancePolicySetToIntune|Boolean|**TODO: Add Description**|
|deviceName|String|**TODO: Add Description**|
|healthStatus|userExperienceAnalyticsHealthState|**TODO: Add Description**. Possible values are: `unknown`, `insufficientData`, `needsAttention`, `meetingGoals`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|managedBy|String|**TODO: Add Description**|
|manufacturer|String|**TODO: Add Description**|
|model|String|**TODO: Add Description**|
|osCheckFailed|Boolean|**TODO: Add Description**|
|osDescription|String|**TODO: Add Description**|
|osVersion|String|**TODO: Add Description**|
|otherWorkloadsSetToIntune|Boolean|**TODO: Add Description**|
|ownership|String|**TODO: Add Description**|
|processor64BitCheckFailed|Boolean|**TODO: Add Description**|
|processorCoreCountCheckFailed|Boolean|**TODO: Add Description**|
|processorFamilyCheckFailed|Boolean|**TODO: Add Description**|
|processorSpeedCheckFailed|Boolean|**TODO: Add Description**|
|ramCheckFailed|Boolean|**TODO: Add Description**|
|secureBootCheckFailed|Boolean|**TODO: Add Description**|
|serialNumber|String|**TODO: Add Description**|
|storageCheckFailed|Boolean|**TODO: Add Description**|
|tenantAttached|Boolean|**TODO: Add Description**|
|tpmCheckFailed|Boolean|**TODO: Add Description**|
|upgradeEligibility|operatingSystemUpgradeEligibility|**TODO: Add Description**. Possible values are: `upgraded`, `unknown`, `notCapable`, `capable`.|
|windowsScore|Double|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsWorkFromAnywhereDevice",
  "baseType": "microsoft.graph.entity",
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
  "osCheckFailed": "Boolean",
  "windowsScore": "Double",
  "cloudManagementScore": "Double",
  "cloudIdentityScore": "Double",
  "cloudProvisioningScore": "Double",
  "healthStatus": "String"
}
```

