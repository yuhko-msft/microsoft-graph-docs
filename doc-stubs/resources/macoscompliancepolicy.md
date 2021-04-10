---
title: "macOSCompliancePolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSCompliancePolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


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
|advancedThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|**TODO: Add Description**. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|description|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|deviceThreatProtectionEnabled|Boolean|**TODO: Add Description**|
|deviceThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|**TODO: Add Description**. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|displayName|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|firewallBlockAllIncoming|Boolean|**TODO: Add Description**|
|firewallEnabled|Boolean|**TODO: Add Description**|
|firewallEnableStealthMode|Boolean|**TODO: Add Description**|
|gatekeeperAllowedAppSource|macOSGatekeeperAppSources|**TODO: Add Description**. Possible values are: `notConfigured`, `macAppStore`, `macAppStoreAndIdentifiedDevelopers`, `anywhere`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|osMaximumBuildVersion|String|**TODO: Add Description**|
|osMaximumVersion|String|**TODO: Add Description**|
|osMinimumBuildVersion|String|**TODO: Add Description**|
|osMinimumVersion|String|**TODO: Add Description**|
|passwordBlockSimple|Boolean|**TODO: Add Description**|
|passwordExpirationDays|Int32|**TODO: Add Description**|
|passwordMinimumCharacterSetCount|Int32|**TODO: Add Description**|
|passwordMinimumLength|Int32|**TODO: Add Description**|
|passwordMinutesOfInactivityBeforeLock|Int32|**TODO: Add Description**|
|passwordPreviousPasswordBlockCount|Int32|**TODO: Add Description**|
|passwordRequired|Boolean|**TODO: Add Description**|
|passwordRequiredType|requiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|storageRequireEncryption|Boolean|**TODO: Add Description**|
|systemIntegrityProtectionEnabled|Boolean|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.macOSCompliancePolicy",
  "baseType": "microsoft.graph.deviceCompliancePolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSCompliancePolicy",
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
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordRequiredType": "String",
  "osMinimumVersion": "String",
  "osMaximumVersion": "String",
  "osMinimumBuildVersion": "String",
  "osMaximumBuildVersion": "String",
  "systemIntegrityProtectionEnabled": "Boolean",
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "advancedThreatProtectionRequiredSecurityLevel": "String",
  "storageRequireEncryption": "Boolean",
  "gatekeeperAllowedAppSource": "String",
  "firewallEnabled": "Boolean",
  "firewallBlockAllIncoming": "Boolean",
  "firewallEnableStealthMode": "Boolean"
}
```

