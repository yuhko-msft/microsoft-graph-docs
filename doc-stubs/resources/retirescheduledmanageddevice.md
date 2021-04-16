---
title: "retireScheduledManagedDevice resource type"
description: "ManagedDevices that are scheduled for retire"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# retireScheduledManagedDevice resource type

Namespace: microsoft.graph



ManagedDevices that are scheduled for retire

## Properties
|Property|Type|Description|
|:---|:---|:---|
|complianceState|complianceStatus|Managed Device ComplianceStatus. Possible values are: `unknown`, `notApplicable`, `compliant`, `remediated`, `nonCompliant`, `error`, `conflict`, `notAssigned`.|
|deviceCompliancePolicyId|String|Device Compliance PolicyId|
|deviceCompliancePolicyName|String|Device Compliance Policy Name|
|deviceType|deviceType|Managed Device Device Type. Possible values are: `desktop`, `windowsRT`, `winMO6`, `nokia`, `windowsPhone`, `mac`, `winCE`, `winEmbedded`, `iPhone`, `iPad`, `iPod`, `android`, `iSocConsumer`, `unix`, `macMDM`, `holoLens`, `surfaceHub`, `androidForWork`, `androidEnterprise`, `windows10x`, `androidnGMS`, `chromeOS`, `linux`, `blackberry`, `palm`, `unknown`, `cloudPC`.|
|id|String|Key of the entity.|
|managedDeviceId|String|Managed DeviceId|
|managedDeviceName|String|Managed Device Name|
|managementAgent|managementAgentType|Managed Device ManagementAgentType. Possible values are: `eas`, `mdm`, `easMdm`, `intuneClient`, `easIntuneClient`, `configurationManagerClient`, `configurationManagerClientMdm`, `configurationManagerClientMdmEas`, `unknown`, `jamf`, `googleCloudDevicePolicyController`, `microsoft365ManagedMdm`, `windowsManagementCloudApi`.|
|ownerType|managedDeviceOwnerType|Managed Device ManagedDeviceOwnerType. Possible values are: `unknown`, `company`, `personal`.|
|retireAfterDateTime|DateTimeOffset|Managed Device Retire After DateTime|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.retireScheduledManagedDevice"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.retireScheduledManagedDevice",
  "complianceState": "String",
  "deviceCompliancePolicyId": "String",
  "deviceCompliancePolicyName": "String",
  "deviceType": "String",
  "id": "String (identifier)",
  "managedDeviceId": "String",
  "managedDeviceName": "String",
  "managementAgent": "String",
  "ownerType": "String",
  "retireAfterDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ]
}
```

