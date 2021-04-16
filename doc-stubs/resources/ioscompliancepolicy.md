---
title: "iosCompliancePolicy resource type"
description: "This class contains compliance settings for IOS."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosCompliancePolicy resource type

Namespace: microsoft.graph



This class contains compliance settings for IOS.


Inherits from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosCompliancePolicies](../api/ioscompliancepolicy-list.md)|[iosCompliancePolicy](../resources/ioscompliancepolicy.md) collection|Get a list of the [iosCompliancePolicy](../resources/ioscompliancepolicy.md) objects and their properties.|
|[Create iosCompliancePolicy](../api/ioscompliancepolicy-create.md)|[iosCompliancePolicy](../resources/ioscompliancepolicy.md)|Create a new [iosCompliancePolicy](../resources/ioscompliancepolicy.md) object.|
|[Get iosCompliancePolicy](../api/ioscompliancepolicy-get.md)|[iosCompliancePolicy](../resources/ioscompliancepolicy.md)|Read the properties and relationships of an [iosCompliancePolicy](../resources/ioscompliancepolicy.md) object.|
|[Update iosCompliancePolicy](../api/ioscompliancepolicy-update.md)|[iosCompliancePolicy](../resources/ioscompliancepolicy.md)|Update the properties of an [iosCompliancePolicy](../resources/ioscompliancepolicy.md) object.|
|[Delete iosCompliancePolicy](../api/ioscompliancepolicy-delete.md)|None|Deletes an [iosCompliancePolicy](../resources/ioscompliancepolicy.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|advancedThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|MDATP Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|deviceThreatProtectionEnabled|Boolean|Require that devices have enabled device threat protection .|
|deviceThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|managedEmailProfileRequired|Boolean|Indicates whether or not to require a managed email profile.|
|osMaximumBuildVersion|String|Maximum IOS build version.|
|osMaximumVersion|String|Maximum IOS version.|
|osMinimumBuildVersion|String|Minimum IOS build version.|
|osMinimumVersion|String|Minimum IOS version.|
|passcodeBlockSimple|Boolean|Indicates whether or not to block simple passcodes.|
|passcodeExpirationDays|Int32|Number of days before the passcode expires. Valid values 1 to 65535|
|passcodeMinimumCharacterSetCount|Int32|The number of character sets required in the password.|
|passcodeMinimumLength|Int32|Minimum length of passcode. Valid values 4 to 14|
|passcodeMinutesOfInactivityBeforeLock|Int32|Minutes of inactivity before a passcode is required.|
|passcodeMinutesOfInactivityBeforeScreenTimeout|Int32|Minutes of inactivity before the screen times out.|
|passcodePreviousPasscodeBlockCount|Int32|Number of previous passcodes to block. Valid values 1 to 24|
|passcodeRequired|Boolean|Indicates whether or not to require a passcode.|
|passcodeRequiredType|requiredPasswordType|The required passcode type. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|restrictedApps|[appListItem](../resources/applistitem.md) collection|Require the device to not have the specified apps installed. This collection can contain a maximum of 100 elements.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|securityBlockJailbrokenDevices|Boolean|Devices must not be jailbroken or rooted.|
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
  "@odata.type": "microsoft.graph.iosCompliancePolicy",
  "baseType": "microsoft.graph.deviceCompliancePolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosCompliancePolicy",
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
  "managedEmailProfileRequired": "Boolean",
  "osMaximumBuildVersion": "String",
  "osMaximumVersion": "String",
  "osMinimumBuildVersion": "String",
  "osMinimumVersion": "String",
  "passcodeBlockSimple": "Boolean",
  "passcodeExpirationDays": "Integer",
  "passcodeMinimumCharacterSetCount": "Integer",
  "passcodeMinimumLength": "Integer",
  "passcodeMinutesOfInactivityBeforeLock": "Integer",
  "passcodeMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passcodePreviousPasscodeBlockCount": "Integer",
  "passcodeRequired": "Boolean",
  "passcodeRequiredType": "String",
  "restrictedApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "securityBlockJailbrokenDevices": "Boolean"
}
```

