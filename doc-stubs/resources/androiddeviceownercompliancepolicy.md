---
title: "androidDeviceOwnerCompliancePolicy resource type"
description: "This topic provides descriptions of the declared methods, properties and relationships exposed by the AndroidDeviceOwnerCompliancePolicy resource."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidDeviceOwnerCompliancePolicy resource type

Namespace: microsoft.graph



This topic provides descriptions of the declared methods, properties and relationships exposed by the AndroidDeviceOwnerCompliancePolicy resource.


Inherits from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidDeviceOwnerCompliancePolicies](../api/androiddeviceownercompliancepolicy-list.md)|[androidDeviceOwnerCompliancePolicy](../resources/androiddeviceownercompliancepolicy.md) collection|Get a list of the [androidDeviceOwnerCompliancePolicy](../resources/androiddeviceownercompliancepolicy.md) objects and their properties.|
|[Create androidDeviceOwnerCompliancePolicy](../api/androiddeviceownercompliancepolicy-create.md)|[androidDeviceOwnerCompliancePolicy](../resources/androiddeviceownercompliancepolicy.md)|Create a new [androidDeviceOwnerCompliancePolicy](../resources/androiddeviceownercompliancepolicy.md) object.|
|[Get androidDeviceOwnerCompliancePolicy](../api/androiddeviceownercompliancepolicy-get.md)|[androidDeviceOwnerCompliancePolicy](../resources/androiddeviceownercompliancepolicy.md)|Read the properties and relationships of an [androidDeviceOwnerCompliancePolicy](../resources/androiddeviceownercompliancepolicy.md) object.|
|[Update androidDeviceOwnerCompliancePolicy](../api/androiddeviceownercompliancepolicy-update.md)|[androidDeviceOwnerCompliancePolicy](../resources/androiddeviceownercompliancepolicy.md)|Update the properties of an [androidDeviceOwnerCompliancePolicy](../resources/androiddeviceownercompliancepolicy.md) object.|
|[Delete androidDeviceOwnerCompliancePolicy](../api/androiddeviceownercompliancepolicy-delete.md)|None|Deletes an [androidDeviceOwnerCompliancePolicy](../resources/androiddeviceownercompliancepolicy.md) object.|
|[assign](../api/androiddeviceownercompliancepolicy-assign.md)|[deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md) collection|**TODO: Add Description**|
|[scheduleActionsForRules](../api/androiddeviceownercompliancepolicy-scheduleactionsforrules.md)|None|**TODO: Add Description**|
|[List assignments](../api/androiddeviceownercompliancepolicy-list-assignments.md)|[deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md) collection|Get the deviceCompliancePolicyAssignment resources from the assignments navigation property.|
|[Create deviceCompliancePolicyAssignment](../api/androiddeviceownercompliancepolicy-post-assignments.md)|[deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md)|Create a new deviceCompliancePolicyAssignment object.|
|[List deviceSettingStateSummaries](../api/androiddeviceownercompliancepolicy-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/androiddeviceownercompliancepolicy-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/androiddeviceownercompliancepolicy-list-devicestatuses.md)|[deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md) collection|Get the deviceComplianceDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceComplianceDeviceStatus](../api/androiddeviceownercompliancepolicy-post-devicestatuses.md)|[deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md)|Create a new deviceComplianceDeviceStatus object.|
|[List deviceComplianceDeviceOverview](../api/androiddeviceownercompliancepolicy-list-devicestatusoverview.md)|[deviceComplianceDeviceOverview](../resources/devicecompliancedeviceoverview.md) collection|Get the deviceComplianceDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceComplianceDeviceOverview](../api/androiddeviceownercompliancepolicy-post-devicestatusoverview.md)|[deviceComplianceDeviceOverview](../resources/devicecompliancedeviceoverview.md)|Create a new deviceComplianceDeviceOverview object.|
|[List scheduledActionsForRule](../api/androiddeviceownercompliancepolicy-list-scheduledactionsforrule.md)|[deviceComplianceScheduledActionForRule](../resources/devicecompliancescheduledactionforrule.md) collection|Get the deviceComplianceScheduledActionForRule resources from the scheduledActionsForRule navigation property.|
|[Create deviceComplianceScheduledActionForRule](../api/androiddeviceownercompliancepolicy-post-scheduledactionsforrule.md)|[deviceComplianceScheduledActionForRule](../resources/devicecompliancescheduledactionforrule.md)|Create a new deviceComplianceScheduledActionForRule object.|
|[List userStatuses](../api/androiddeviceownercompliancepolicy-list-userstatuses.md)|[deviceComplianceUserStatus](../resources/devicecomplianceuserstatus.md) collection|Get the deviceComplianceUserStatus resources from the userStatuses navigation property.|
|[Create deviceComplianceUserStatus](../api/androiddeviceownercompliancepolicy-post-userstatuses.md)|[deviceComplianceUserStatus](../resources/devicecomplianceuserstatus.md)|Create a new deviceComplianceUserStatus object.|
|[List deviceComplianceUserOverview](../api/androiddeviceownercompliancepolicy-list-userstatusoverview.md)|[deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md) collection|Get the deviceComplianceUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceComplianceUserOverview](../api/androiddeviceownercompliancepolicy-post-userstatusoverview.md)|[deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md)|Create a new deviceComplianceUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|advancedThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|MDATP Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|deviceThreatProtectionEnabled|Boolean|Require that devices have enabled device threat protection.|
|deviceThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|minAndroidSecurityPatchLevel|String|Minimum Android security patch level.|
|osMaximumVersion|String|Maximum Android version.|
|osMinimumVersion|String|Minimum Android version.|
|passwordExpirationDays|Int32|Number of days before the password expires. Valid values 1 to 365|
|passwordMinimumLength|Int32|Minimum password length. Valid values 4 to 16|
|passwordMinimumLetterCharacters|Int32|Indicates the minimum number of letter characters required for device password. Valid values 1 to 16|
|passwordMinimumLowerCaseCharacters|Int32|Indicates the minimum number of lower case characters required for device password. Valid values 1 to 16|
|passwordMinimumNonLetterCharacters|Int32|Indicates the minimum number of non-letter characters required for device password. Valid values 1 to 16|
|passwordMinimumNumericCharacters|Int32|Indicates the minimum number of numeric characters required for device password. Valid values 1 to 16|
|passwordMinimumSymbolCharacters|Int32|Indicates the minimum number of symbol characters required for device password. Valid values 1 to 16|
|passwordMinimumUpperCaseCharacters|Int32|Indicates the minimum number of upper case letter characters required for device password. Valid values 1 to 16|
|passwordMinutesOfInactivityBeforeLock|Int32|Minutes of inactivity before a password is required.|
|passwordPreviousPasswordCountToBlock|Int32|Number of previous passwords to block. Valid values 1 to 24|
|passwordRequired|Boolean|Require a password to unlock device.|
|passwordRequiredType|androidDeviceOwnerRequiredPasswordType|Type of characters in password. Possible values are: `deviceDefault`, `required`, `numeric`, `numericComplex`, `alphabetic`, `alphanumeric`, `alphanumericWithSymbols`, `lowSecurityBiometric`, `customPassword`.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|securityRequireSafetyNetAttestationBasicIntegrity|Boolean|Require the device to pass the SafetyNet basic integrity check.|
|securityRequireSafetyNetAttestationCertifiedDevice|Boolean|Require the device to pass the SafetyNet certified device check.|
|storageRequireEncryption|Boolean|Require encryption on Android devices.|
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
  "@odata.type": "microsoft.graph.androidDeviceOwnerCompliancePolicy",
  "baseType": "microsoft.graph.deviceCompliancePolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidDeviceOwnerCompliancePolicy",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "advancedThreatProtectionRequiredSecurityLevel": "String",
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "minAndroidSecurityPatchLevel": "String",
  "osMaximumVersion": "String",
  "osMinimumVersion": "String",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinimumLetterCharacters": "Integer",
  "passwordMinimumLowerCaseCharacters": "Integer",
  "passwordMinimumNonLetterCharacters": "Integer",
  "passwordMinimumNumericCharacters": "Integer",
  "passwordMinimumSymbolCharacters": "Integer",
  "passwordMinimumUpperCaseCharacters": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordPreviousPasswordCountToBlock": "Integer",
  "passwordRequired": "Boolean",
  "passwordRequiredType": "String",
  "securityRequireSafetyNetAttestationBasicIntegrity": "Boolean",
  "securityRequireSafetyNetAttestationCertifiedDevice": "Boolean",
  "storageRequireEncryption": "Boolean"
}
```

