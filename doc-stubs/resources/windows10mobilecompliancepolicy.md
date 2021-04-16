---
title: "windows10MobileCompliancePolicy resource type"
description: "This class contains compliance settings for Windows 10 Mobile."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10MobileCompliancePolicy resource type

Namespace: microsoft.graph



This class contains compliance settings for Windows 10 Mobile.


Inherits from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows10MobileCompliancePolicy](../api/windows10mobilecompliancepolicy-list.md)|[windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md) collection|Get a list of the [windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md) objects and their properties.|
|[Create windows10MobileCompliancePolicy](../api/windows10mobilecompliancepolicy-create.md)|[windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md)|Create a new [windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md) object.|
|[Get windows10MobileCompliancePolicy](../api/windows10mobilecompliancepolicy-get.md)|[windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md)|Read the properties and relationships of a [windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md) object.|
|[Update windows10MobileCompliancePolicy](../api/windows10mobilecompliancepolicy-update.md)|[windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md)|Update the properties of a [windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md) object.|
|[Delete windows10MobileCompliancePolicy](../api/windows10mobilecompliancepolicy-delete.md)|None|Deletes a [windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activeFirewallRequired|Boolean|Require active firewall on Windows devices.|
|bitLockerEnabled|Boolean|Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled|
|codeIntegrityEnabled|Boolean|Require devices to be reported as healthy by Windows Device Health Attestation.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|earlyLaunchAntiMalwareDriverEnabled|Boolean|Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is enabled.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|osMaximumVersion|String|Maximum Windows Phone version.|
|osMinimumVersion|String|Minimum Windows Phone version.|
|passwordBlockSimple|Boolean|Whether or not to block syncing the calendar.|
|passwordExpirationDays|Int32|Number of days before password expiration. Valid values 1 to 255|
|passwordMinimumCharacterSetCount|Int32|The number of character sets required in the password.|
|passwordMinimumLength|Int32|Minimum password length. Valid values 4 to 16|
|passwordMinutesOfInactivityBeforeLock|Int32|Minutes of inactivity before a password is required.|
|passwordPreviousPasswordBlockCount|Int32|The number of previous passwords to prevent re-use of.|
|passwordRequired|Boolean|Require a password to unlock Windows Phone device.|
|passwordRequiredType|requiredPasswordType|The required password type. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|passwordRequireToUnlockFromIdle|Boolean|Require a password to unlock an idle device.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|secureBootEnabled|Boolean|Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.|
|storageRequireEncryption|Boolean|Require encryption on windows devices.|
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
  "@odata.type": "microsoft.graph.windows10MobileCompliancePolicy",
  "baseType": "microsoft.graph.deviceCompliancePolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10MobileCompliancePolicy",
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
  "bitLockerEnabled": "Boolean",
  "codeIntegrityEnabled": "Boolean",
  "earlyLaunchAntiMalwareDriverEnabled": "Boolean",
  "osMaximumVersion": "String",
  "osMinimumVersion": "String",
  "passwordBlockSimple": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequired": "Boolean",
  "passwordRequiredType": "String",
  "passwordRequireToUnlockFromIdle": "Boolean",
  "secureBootEnabled": "Boolean",
  "storageRequireEncryption": "Boolean",
  "validOperatingSystemBuildRanges": [
    {
      "@odata.type": "microsoft.graph.operatingSystemVersionRange"
    }
  ]
}
```

