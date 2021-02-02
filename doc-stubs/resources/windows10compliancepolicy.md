---
title: "windows10CompliancePolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10CompliancePolicy resource type

Namespace: microsoft.graph

**TODO: Add Description**


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
|activeFirewallRequired|Boolean|**TODO: Add Description**|
|advancedThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|**TODO: Add Description**. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|antiSpywareRequireCurrentSignature|Boolean|**TODO: Add Description**|
|antiSpywareRequired|Boolean|**TODO: Add Description**|
|antivirusRequireCurrentSignature|Boolean|**TODO: Add Description**|
|antivirusRequired|Boolean|**TODO: Add Description**|
|bitLockerEnabled|Boolean|**TODO: Add Description**|
|codeIntegrityEnabled|Boolean|**TODO: Add Description**|
|configurationManagerComplianceRequired|Boolean|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|defenderEnabled|Boolean|**TODO: Add Description**|
|defenderVersion|String|**TODO: Add Description**|
|description|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|deviceCompliancePolicyScript|[deviceCompliancePolicyScript](../resources/intune-devicecompliancepolicyscript.md)|**TODO: Add Description**|
|deviceThreatProtectionEnabled|Boolean|**TODO: Add Description**|
|deviceThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|**TODO: Add Description**. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|displayName|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|earlyLaunchAntiMalwareDriverEnabled|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|mobileOsMaximumVersion|String|**TODO: Add Description**|
|mobileOsMinimumVersion|String|**TODO: Add Description**|
|osMaximumVersion|String|**TODO: Add Description**|
|osMinimumVersion|String|**TODO: Add Description**|
|passwordBlockSimple|Boolean|**TODO: Add Description**|
|passwordExpirationDays|Int32|**TODO: Add Description**|
|passwordMinimumCharacterSetCount|Int32|**TODO: Add Description**|
|passwordMinimumLength|Int32|**TODO: Add Description**|
|passwordMinutesOfInactivityBeforeLock|Int32|**TODO: Add Description**|
|passwordPreviousPasswordBlockCount|Int32|**TODO: Add Description**|
|passwordRequired|Boolean|**TODO: Add Description**|
|passwordRequiredToUnlockFromIdle|Boolean|**TODO: Add Description**|
|passwordRequiredType|requiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|requireHealthyDeviceReport|Boolean|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|rtpEnabled|Boolean|**TODO: Add Description**|
|secureBootEnabled|Boolean|**TODO: Add Description**|
|signatureOutOfDate|Boolean|**TODO: Add Description**|
|storageRequireEncryption|Boolean|**TODO: Add Description**|
|tpmRequired|Boolean|**TODO: Add Description**|
|uacRequired|Boolean|**TODO: Add Description**|
|validOperatingSystemBuildRanges|[operatingSystemVersionRange](../resources/intune-operatingsystemversionrange.md) collection|**TODO: Add Description**|
|version|Int32|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|windows10CompanyPortalMinimumVersion|String|**TODO: Add Description**|

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
  "@odata.type": "microsoft.graph.windows10CompliancePolicy",
  "baseType": "microsoft.graph.deviceCompliancePolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10CompliancePolicy",
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
  "passwordBlockSimple": "Boolean",
  "passwordRequiredToUnlockFromIdle": "Boolean",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordRequiredType": "String",
  "passwordPreviousPasswordBlockCount": "Integer",
  "requireHealthyDeviceReport": "Boolean",
  "osMinimumVersion": "String",
  "osMaximumVersion": "String",
  "mobileOsMinimumVersion": "String",
  "mobileOsMaximumVersion": "String",
  "earlyLaunchAntiMalwareDriverEnabled": "Boolean",
  "bitLockerEnabled": "Boolean",
  "secureBootEnabled": "Boolean",
  "codeIntegrityEnabled": "Boolean",
  "storageRequireEncryption": "Boolean",
  "activeFirewallRequired": "Boolean",
  "uacRequired": "Boolean",
  "defenderEnabled": "Boolean",
  "defenderVersion": "String",
  "signatureOutOfDate": "Boolean",
  "rtpEnabled": "Boolean",
  "antivirusRequired": "Boolean",
  "antivirusRequireCurrentSignature": "Boolean",
  "antiSpywareRequired": "Boolean",
  "antiSpywareRequireCurrentSignature": "Boolean",
  "validOperatingSystemBuildRanges": [
    {
      "@odata.type": "microsoft.graph.operatingSystemVersionRange"
    }
  ],
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "advancedThreatProtectionRequiredSecurityLevel": "String",
  "configurationManagerComplianceRequired": "Boolean",
  "tpmRequired": "Boolean",
  "deviceCompliancePolicyScript": {
    "@odata.type": "microsoft.graph.deviceCompliancePolicyScript"
  },
  "windows10CompanyPortalMinimumVersion": "String"
}
```

