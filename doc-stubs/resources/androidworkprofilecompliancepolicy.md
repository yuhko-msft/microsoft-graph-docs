---
title: "androidWorkProfileCompliancePolicy resource type"
description: "This class contains compliance settings for Android Work Profile."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidWorkProfileCompliancePolicy resource type

Namespace: microsoft.graph



This class contains compliance settings for Android Work Profile.


Inherits from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidWorkProfileCompliancePolicies](../api/androidworkprofilecompliancepolicy-list.md)|[androidWorkProfileCompliancePolicy](../resources/androidworkprofilecompliancepolicy.md) collection|Get a list of the [androidWorkProfileCompliancePolicy](../resources/androidworkprofilecompliancepolicy.md) objects and their properties.|
|[Create androidWorkProfileCompliancePolicy](../api/androidworkprofilecompliancepolicy-create.md)|[androidWorkProfileCompliancePolicy](../resources/androidworkprofilecompliancepolicy.md)|Create a new [androidWorkProfileCompliancePolicy](../resources/androidworkprofilecompliancepolicy.md) object.|
|[Get androidWorkProfileCompliancePolicy](../api/androidworkprofilecompliancepolicy-get.md)|[androidWorkProfileCompliancePolicy](../resources/androidworkprofilecompliancepolicy.md)|Read the properties and relationships of an [androidWorkProfileCompliancePolicy](../resources/androidworkprofilecompliancepolicy.md) object.|
|[Update androidWorkProfileCompliancePolicy](../api/androidworkprofilecompliancepolicy-update.md)|[androidWorkProfileCompliancePolicy](../resources/androidworkprofilecompliancepolicy.md)|Update the properties of an [androidWorkProfileCompliancePolicy](../resources/androidworkprofilecompliancepolicy.md) object.|
|[Delete androidWorkProfileCompliancePolicy](../api/androidworkprofilecompliancepolicy-delete.md)|None|Deletes an [androidWorkProfileCompliancePolicy](../resources/androidworkprofilecompliancepolicy.md) object.|

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
|passwordMinutesOfInactivityBeforeLock|Int32|Minutes of inactivity before a password is required.|
|passwordPreviousPasswordBlockCount|Int32|Number of previous passwords to block. Valid values 1 to 24|
|passwordRequired|Boolean|Require a password to unlock device.|
|passwordRequiredType|androidRequiredPasswordType|Type of characters in password. Possible values are: `deviceDefault`, `alphabetic`, `alphanumeric`, `alphanumericWithSymbols`, `lowSecurityBiometric`, `numeric`, `numericComplex`, `any`.|
|passwordSignInFailureCountBeforeFactoryReset|Int32|Number of sign-in failures allowed before factory reset. Valid values 1 to 16|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|securityBlockJailbrokenDevices|Boolean|Devices must not be jailbroken or rooted.|
|securityDisableUsbDebugging|Boolean|Disable USB debugging on Android devices.|
|securityPreventInstallAppsFromUnknownSources|Boolean|Require that devices disallow installation of apps from unknown sources.|
|securityRequireCompanyPortalAppIntegrity|Boolean|Require the device to pass the Company Portal client app runtime integrity check.|
|securityRequireGooglePlayServices|Boolean|Require Google Play Services to be installed and enabled on the device.|
|securityRequireSafetyNetAttestationBasicIntegrity|Boolean|Require the device to pass the SafetyNet basic integrity check.|
|securityRequireSafetyNetAttestationCertifiedDevice|Boolean|Require the device to pass the SafetyNet certified device check.|
|securityRequireUpToDateSecurityProviders|Boolean|Require the device to have up to date security providers. The device will require Google Play Services to be enabled and up to date.|
|securityRequireVerifyApps|Boolean|Require the Android Verify apps feature is turned on.|
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
  "@odata.type": "microsoft.graph.androidWorkProfileCompliancePolicy",
  "baseType": "microsoft.graph.deviceCompliancePolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidWorkProfileCompliancePolicy",
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
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequired": "Boolean",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "securityBlockJailbrokenDevices": "Boolean",
  "securityDisableUsbDebugging": "Boolean",
  "securityPreventInstallAppsFromUnknownSources": "Boolean",
  "securityRequireCompanyPortalAppIntegrity": "Boolean",
  "securityRequireGooglePlayServices": "Boolean",
  "securityRequireSafetyNetAttestationBasicIntegrity": "Boolean",
  "securityRequireSafetyNetAttestationCertifiedDevice": "Boolean",
  "securityRequireUpToDateSecurityProviders": "Boolean",
  "securityRequireVerifyApps": "Boolean",
  "storageRequireEncryption": "Boolean"
}
```

