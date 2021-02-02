---
title: "androidCompliancePolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidCompliancePolicy resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidCompliancePolicies](../api/androidcompliancepolicy-list.md)|[androidCompliancePolicy](../resources/androidcompliancepolicy.md) collection|Get a list of the [androidCompliancePolicy](../resources/androidcompliancepolicy.md) objects and their properties.|
|[Create androidCompliancePolicy](../api/androidcompliancepolicy-create.md)|[androidCompliancePolicy](../resources/androidcompliancepolicy.md)|Create a new [androidCompliancePolicy](../resources/androidcompliancepolicy.md) object.|
|[Get androidCompliancePolicy](../api/androidcompliancepolicy-get.md)|[androidCompliancePolicy](../resources/androidcompliancepolicy.md)|Read the properties and relationships of an [androidCompliancePolicy](../resources/androidcompliancepolicy.md) object.|
|[Update androidCompliancePolicy](../api/androidcompliancepolicy-update.md)|[androidCompliancePolicy](../resources/androidcompliancepolicy.md)|Update the properties of an [androidCompliancePolicy](../resources/androidcompliancepolicy.md) object.|
|[Delete androidCompliancePolicy](../api/androidcompliancepolicy-delete.md)|None|Deletes an [androidCompliancePolicy](../resources/androidcompliancepolicy.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|advancedThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|**TODO: Add Description**. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|androidCompanyPortalMinimumVersion|String|**TODO: Add Description**|
|conditionStatementId|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|description|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|deviceThreatProtectionEnabled|Boolean|**TODO: Add Description**|
|deviceThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|**TODO: Add Description**. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|displayName|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|minAndroidSecurityPatchLevel|String|**TODO: Add Description**|
|osMaximumVersion|String|**TODO: Add Description**|
|osMinimumVersion|String|**TODO: Add Description**|
|passwordExpirationDays|Int32|**TODO: Add Description**|
|passwordMinimumLength|Int32|**TODO: Add Description**|
|passwordMinutesOfInactivityBeforeLock|Int32|**TODO: Add Description**|
|passwordPreviousPasswordBlockCount|Int32|**TODO: Add Description**|
|passwordRequired|Boolean|**TODO: Add Description**|
|passwordRequiredType|androidRequiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `alphabetic`, `alphanumeric`, `alphanumericWithSymbols`, `lowSecurityBiometric`, `numeric`, `numericComplex`, `any`.|
|passwordSignInFailureCountBeforeFactoryReset|Int32|**TODO: Add Description**|
|requiredPasswordComplexity|androidRequiredPasswordComplexity|**TODO: Add Description**. Possible values are: `none`, `low`, `medium`, `high`.|
|restrictedApps|[appListItem](../resources/intune-applistitem.md) collection|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|securityBlockDeviceAdministratorManagedDevices|Boolean|**TODO: Add Description**|
|securityBlockJailbrokenDevices|Boolean|**TODO: Add Description**|
|securityDisableUsbDebugging|Boolean|**TODO: Add Description**|
|securityPreventInstallAppsFromUnknownSources|Boolean|**TODO: Add Description**|
|securityRequireCompanyPortalAppIntegrity|Boolean|**TODO: Add Description**|
|securityRequireGooglePlayServices|Boolean|**TODO: Add Description**|
|securityRequireSafetyNetAttestationBasicIntegrity|Boolean|**TODO: Add Description**|
|securityRequireSafetyNetAttestationCertifiedDevice|Boolean|**TODO: Add Description**|
|securityRequireUpToDateSecurityProviders|Boolean|**TODO: Add Description**|
|securityRequireVerifyApps|Boolean|**TODO: Add Description**|
|storageRequireEncryption|Boolean|**TODO: Add Description**|
|version|Int32|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceCompliancePolicyAssignment](../resources/intune-devicecompliancepolicyassignment.md) collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|deviceStatuses|[deviceComplianceDeviceStatus](../resources/intune-devicecompliancedevicestatus.md) collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|deviceStatusOverview|[deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md)|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|scheduledActionsForRule|[deviceComplianceScheduledActionForRule](../resources/intune-devicecompliancescheduledactionforrule.md) collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|userStatuses|[deviceComplianceUserStatus](../resources/intune-devicecomplianceuserstatus.md) collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|userStatusOverview|[deviceComplianceUserOverview](../resources/intune-devicecomplianceuseroverview.md)|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.androidCompliancePolicy",
  "baseType": "microsoft.graph.deviceCompliancePolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidCompliancePolicy",
  "id": "String (identifier)",
  "roleScopeTagIds": [
    "String"
  ],
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "displayName": "String",
  "version": "Integer",
  "passwordRequired": "Boolean",
  "passwordMinimumLength": "Integer",
  "passwordRequiredType": "String",
  "requiredPasswordComplexity": "String",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordExpirationDays": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "securityPreventInstallAppsFromUnknownSources": "Boolean",
  "securityDisableUsbDebugging": "Boolean",
  "securityRequireVerifyApps": "Boolean",
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "advancedThreatProtectionRequiredSecurityLevel": "String",
  "securityBlockJailbrokenDevices": "Boolean",
  "securityBlockDeviceAdministratorManagedDevices": "Boolean",
  "osMinimumVersion": "String",
  "osMaximumVersion": "String",
  "minAndroidSecurityPatchLevel": "String",
  "storageRequireEncryption": "Boolean",
  "securityRequireSafetyNetAttestationBasicIntegrity": "Boolean",
  "securityRequireSafetyNetAttestationCertifiedDevice": "Boolean",
  "securityRequireGooglePlayServices": "Boolean",
  "securityRequireUpToDateSecurityProviders": "Boolean",
  "securityRequireCompanyPortalAppIntegrity": "Boolean",
  "conditionStatementId": "String",
  "restrictedApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "androidCompanyPortalMinimumVersion": "String"
}
```

