---
title: "macOSCompliancePolicy resource type"
description: "This class contains compliance settings for Mac OS."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSCompliancePolicy resource type

Namespace: microsoft.graph



This class contains compliance settings for Mac OS.


Inherits from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List macOSCompliancePolicies](../api/macoscompliancepolicy-list.md)|[macOSCompliancePolicy](../resources/macoscompliancepolicy.md) collection|Get a list of the [macOSCompliancePolicy](../resources/macoscompliancepolicy.md) objects and their properties.|
|[Create macOSCompliancePolicy](../api/macoscompliancepolicy-create.md)|[macOSCompliancePolicy](../resources/macoscompliancepolicy.md)|Create a new [macOSCompliancePolicy](../resources/macoscompliancepolicy.md) object.|
|[Get macOSCompliancePolicy](../api/macoscompliancepolicy-get.md)|[macOSCompliancePolicy](../resources/macoscompliancepolicy.md)|Read the properties and relationships of a [macOSCompliancePolicy](../resources/macoscompliancepolicy.md) object.|
|[Update macOSCompliancePolicy](../api/macoscompliancepolicy-update.md)|[macOSCompliancePolicy](../resources/macoscompliancepolicy.md)|Update the properties of a [macOSCompliancePolicy](../resources/macoscompliancepolicy.md) object.|
|[Delete macOSCompliancePolicy](../api/macoscompliancepolicy-delete.md)|None|Deletes a [macOSCompliancePolicy](../resources/macoscompliancepolicy.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|deviceThreatProtectionEnabled|Boolean|Require that devices have enabled device threat protection.|
|deviceThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|firewallBlockAllIncoming|Boolean|Corresponds to the “Block all incoming connections” option.|
|firewallEnabled|Boolean|Whether the firewall should be enabled or not.|
|firewallEnableStealthMode|Boolean|Corresponds to “Enable stealth mode.”|
|gatekeeperAllowedAppSource|macOSGatekeeperAppSources|System and Privacy setting that determines which download locations apps can be run from on a macOS device. Possible values are: `notConfigured`, `macAppStore`, `macAppStoreAndIdentifiedDevelopers`, `anywhere`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|osMaximumBuildVersion|String|Maximum MacOS build version.|
|osMaximumVersion|String|Maximum MacOS version.|
|osMinimumBuildVersion|String|Minimum MacOS build version.|
|osMinimumVersion|String|Minimum MacOS version.|
|passwordBlockSimple|Boolean|Indicates whether or not to block simple passwords.|
|passwordExpirationDays|Int32|Number of days before the password expires. Valid values 1 to 65535|
|passwordMinimumCharacterSetCount|Int32|The number of character sets required in the password.|
|passwordMinimumLength|Int32|Minimum length of password. Valid values 4 to 14|
|passwordMinutesOfInactivityBeforeLock|Int32|Minutes of inactivity before a password is required.|
|passwordPreviousPasswordBlockCount|Int32|Number of previous passwords to block. Valid values 1 to 24|
|passwordRequired|Boolean|Whether or not to require a password.|
|passwordRequiredType|requiredPasswordType|The required password type. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|storageRequireEncryption|Boolean|Require encryption on Mac OS devices.|
|systemIntegrityProtectionEnabled|Boolean|Require that devices have enabled system integrity protection.|
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
  "@odata.type": "microsoft.graph.macOSCompliancePolicy",
  "baseType": "microsoft.graph.deviceCompliancePolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSCompliancePolicy",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "firewallBlockAllIncoming": "Boolean",
  "firewallEnabled": "Boolean",
  "firewallEnableStealthMode": "Boolean",
  "gatekeeperAllowedAppSource": "String",
  "osMaximumBuildVersion": "String",
  "osMaximumVersion": "String",
  "osMinimumBuildVersion": "String",
  "osMinimumVersion": "String",
  "passwordBlockSimple": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequired": "Boolean",
  "passwordRequiredType": "String",
  "storageRequireEncryption": "Boolean",
  "systemIntegrityProtectionEnabled": "Boolean"
}
```

