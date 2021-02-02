---
title: "windows10MobileCompliancePolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10MobileCompliancePolicy resource type

Namespace: microsoft.graph

**TODO: Add Description**


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
|activeFirewallRequired|Boolean|**TODO: Add Description**|
|bitLockerEnabled|Boolean|**TODO: Add Description**|
|codeIntegrityEnabled|Boolean|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|description|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|earlyLaunchAntiMalwareDriverEnabled|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|osMaximumVersion|String|**TODO: Add Description**|
|osMinimumVersion|String|**TODO: Add Description**|
|passwordBlockSimple|Boolean|**TODO: Add Description**|
|passwordExpirationDays|Int32|**TODO: Add Description**|
|passwordMinimumCharacterSetCount|Int32|**TODO: Add Description**|
|passwordMinimumLength|Int32|**TODO: Add Description**|
|passwordMinutesOfInactivityBeforeLock|Int32|**TODO: Add Description**|
|passwordPreviousPasswordBlockCount|Int32|**TODO: Add Description**|
|passwordRequired|Boolean|**TODO: Add Description**|
|passwordRequiredType|requiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|passwordRequireToUnlockFromIdle|Boolean|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|secureBootEnabled|Boolean|**TODO: Add Description**|
|storageRequireEncryption|Boolean|**TODO: Add Description**|
|uacRequired|Boolean|**TODO: Add Description**|
|validOperatingSystemBuildRanges|[operatingSystemVersionRange](../resources/intune-operatingsystemversionrange.md) collection|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.windows10MobileCompliancePolicy",
  "baseType": "microsoft.graph.deviceCompliancePolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10MobileCompliancePolicy",
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
  "passwordMinimumLength": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordRequiredType": "String",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordExpirationDays": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordRequireToUnlockFromIdle": "Boolean",
  "osMinimumVersion": "String",
  "osMaximumVersion": "String",
  "earlyLaunchAntiMalwareDriverEnabled": "Boolean",
  "bitLockerEnabled": "Boolean",
  "secureBootEnabled": "Boolean",
  "codeIntegrityEnabled": "Boolean",
  "storageRequireEncryption": "Boolean",
  "activeFirewallRequired": "Boolean",
  "uacRequired": "Boolean",
  "validOperatingSystemBuildRanges": [
    {
      "@odata.type": "microsoft.graph.operatingSystemVersionRange"
    }
  ]
}
```

