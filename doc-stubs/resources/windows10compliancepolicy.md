---
title: "windows10CompliancePolicy resource type"
description: "This class contains compliance settings for Windows 10."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10CompliancePolicy resource type

Namespace: microsoft.graph



This class contains compliance settings for Windows 10.


Inherits from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows10CompliancePolicy](../api/windows10compliancepolicy-list.md)|[windows10CompliancePolicy](../resources/windows10compliancepolicy.md) collection|Get a list of the [windows10CompliancePolicy](../resources/windows10compliancepolicy.md) objects and their properties.|
|[Create windows10CompliancePolicy](../api/windows10compliancepolicy-create.md)|[windows10CompliancePolicy](../resources/windows10compliancepolicy.md)|Create a new [windows10CompliancePolicy](../resources/windows10compliancepolicy.md) object.|
|[Get windows10CompliancePolicy](../api/windows10compliancepolicy-get.md)|[windows10CompliancePolicy](../resources/windows10compliancepolicy.md)|Read the properties and relationships of a [windows10CompliancePolicy](../resources/windows10compliancepolicy.md) object.|
|[Update windows10CompliancePolicy](../api/windows10compliancepolicy-update.md)|[windows10CompliancePolicy](../resources/windows10compliancepolicy.md)|Update the properties of a [windows10CompliancePolicy](../resources/windows10compliancepolicy.md) object.|
|[Delete windows10CompliancePolicy](../api/windows10compliancepolicy-delete.md)|None|Deletes a [windows10CompliancePolicy](../resources/windows10compliancepolicy.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activeFirewallRequired|Boolean|Require active firewall on Windows devices.|
|antiSpywareRequired|Boolean|Require any AntiSpyware solution registered with Windows Decurity Center to be on and monitoring (e.g. Symantec, Windows Defender).|
|antivirusRequired|Boolean|Require any Antivirus solution registered with Windows Decurity Center to be on and monitoring (e.g. Symantec, Windows Defender).|
|bitLockerEnabled|Boolean|Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled|
|codeIntegrityEnabled|Boolean|Require devices to be reported as healthy by Windows Device Health Attestation.|
|configurationManagerComplianceRequired|Boolean|Require to consider SCCM Compliance state into consideration for Intune Compliance State.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|defenderEnabled|Boolean|Require Windows Defender Antimalware on Windows devices.|
|defenderVersion|String|Require Windows Defender Antimalware minimum version on Windows devices.|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|deviceCompliancePolicyScript|[deviceCompliancePolicyScript](../resources/devicecompliancepolicyscript.md)|**TODO: Add Description**|
|deviceThreatProtectionEnabled|Boolean|Require that devices have enabled device threat protection.|
|deviceThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|Require Device Threat Protection minimum risk level to report noncompliance. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|earlyLaunchAntiMalwareDriverEnabled|Boolean|Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is enabled.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|mobileOsMaximumVersion|String|Maximum Windows Phone version.|
|mobileOsMinimumVersion|String|Minimum Windows Phone version.|
|osMaximumVersion|String|Maximum Windows 10 version.|
|osMinimumVersion|String|Minimum Windows 10 version.|
|passwordBlockSimple|Boolean|Indicates whether or not to block simple password.|
|passwordExpirationDays|Int32|The password expiration in days.|
|passwordMinimumCharacterSetCount|Int32|The number of character sets required in the password.|
|passwordMinimumLength|Int32|The minimum password length.|
|passwordMinutesOfInactivityBeforeLock|Int32|Minutes of inactivity before a password is required.|
|passwordPreviousPasswordBlockCount|Int32|The number of previous passwords to prevent re-use of.|
|passwordRequired|Boolean|Require a password to unlock Windows device.|
|passwordRequiredToUnlockFromIdle|Boolean|Require a password to unlock an idle device.|
|passwordRequiredType|requiredPasswordType|The required password type. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|requireHealthyDeviceReport|Boolean|Require devices to be reported as healthy by Windows Device Health Attestation.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|rtpEnabled|Boolean|Require Windows Defender Antimalware Real-Time Protection on Windows devices.|
|secureBootEnabled|Boolean|Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.|
|signatureOutOfDate|Boolean|Require Windows Defender Antimalware Signature to be up to date on Windows devices.|
|storageRequireEncryption|Boolean|Require encryption on windows devices.|
|tpmRequired|Boolean|Require Trusted Platform Module(TPM) to be present.|
|validOperatingSystemBuildRanges|[operatingSystemVersionRange](../resources/operatingsystemversionrange.md) collection|The valid operating system build ranges on Windows devices. This collection can contain a maximum of 10000 elements.|
|version|Int32|Version of the device configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md) collection|The collection of assignments for this compliance policy. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Compliance Setting State Device Summary Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|deviceStatuses|[deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md) collection|List of DeviceComplianceDeviceStatus. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|deviceStatusOverview|[deviceComplianceDeviceOverview](../resources/devicecompliancedeviceoverview.md)|Device compliance devices status overview Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|scheduledActionsForRule|[deviceComplianceScheduledActionForRule](../resources/devicecompliancescheduledactionforrule.md) collection|The list of scheduled action for this rule Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|userStatuses|[deviceComplianceUserStatus](../resources/devicecomplianceuserstatus.md) collection|List of DeviceComplianceUserStatus. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|userStatusOverview|[deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md)|Device compliance users status overview Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windows10CompliancePolicy",
  "baseType": "microsoft.graph.deviceCompliancePolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10CompliancePolicy",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "activeFirewallRequired": "Boolean",
  "antiSpywareRequired": "Boolean",
  "antivirusRequired": "Boolean",
  "bitLockerEnabled": "Boolean",
  "codeIntegrityEnabled": "Boolean",
  "configurationManagerComplianceRequired": "Boolean",
  "defenderEnabled": "Boolean",
  "defenderVersion": "String",
  "deviceCompliancePolicyScript": {
    "@odata.type": "microsoft.graph.deviceCompliancePolicyScript"
  },
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "earlyLaunchAntiMalwareDriverEnabled": "Boolean",
  "mobileOsMaximumVersion": "String",
  "mobileOsMinimumVersion": "String",
  "osMaximumVersion": "String",
  "osMinimumVersion": "String",
  "passwordBlockSimple": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequired": "Boolean",
  "passwordRequiredToUnlockFromIdle": "Boolean",
  "passwordRequiredType": "String",
  "requireHealthyDeviceReport": "Boolean",
  "rtpEnabled": "Boolean",
  "secureBootEnabled": "Boolean",
  "signatureOutOfDate": "Boolean",
  "storageRequireEncryption": "Boolean",
  "tpmRequired": "Boolean",
  "validOperatingSystemBuildRanges": [
    {
      "@odata.type": "microsoft.graph.operatingSystemVersionRange"
    }
  ]
}
```

