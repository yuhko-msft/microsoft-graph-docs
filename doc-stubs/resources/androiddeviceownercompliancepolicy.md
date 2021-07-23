---
title: "androidDeviceOwnerCompliancePolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidDeviceOwnerCompliancePolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidDeviceOwnerCompliancePolicies](../api/androiddeviceownercompliancepolicy-list.md)|[androidDeviceOwnerCompliancePolicy](../resources/androiddeviceownercompliancepolicy.md) collection|Get a list of the [androidDeviceOwnerCompliancePolicy](../resources/androiddeviceownercompliancepolicy.md) objects and their properties.|
|[Create androidDeviceOwnerCompliancePolicy](../api/androiddeviceownercompliancepolicy-create.md)|[androidDeviceOwnerCompliancePolicy](../resources/androiddeviceownercompliancepolicy.md)|Create a new [androidDeviceOwnerCompliancePolicy](../resources/androiddeviceownercompliancepolicy.md) object.|
|[Get androidDeviceOwnerCompliancePolicy](../api/androiddeviceownercompliancepolicy-get.md)|[androidDeviceOwnerCompliancePolicy](../resources/androiddeviceownercompliancepolicy.md)|Read the properties and relationships of an [androidDeviceOwnerCompliancePolicy](../resources/androiddeviceownercompliancepolicy.md) object.|
|[Update androidDeviceOwnerCompliancePolicy](../api/androiddeviceownercompliancepolicy-update.md)|[androidDeviceOwnerCompliancePolicy](../resources/androiddeviceownercompliancepolicy.md)|Update the properties of an [androidDeviceOwnerCompliancePolicy](../resources/androiddeviceownercompliancepolicy.md) object.|
|[Delete androidDeviceOwnerCompliancePolicy](../api/androiddeviceownercompliancepolicy-delete.md)|None|Deletes an [androidDeviceOwnerCompliancePolicy](../resources/androiddeviceownercompliancepolicy.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|advancedThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|**TODO: Add Description**. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md).|
|description|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md).|
|deviceThreatProtectionEnabled|Boolean|**TODO: Add Description**|
|deviceThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|**TODO: Add Description**. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|displayName|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md).|
|minAndroidSecurityPatchLevel|String|**TODO: Add Description**|
|osMaximumVersion|String|**TODO: Add Description**|
|osMinimumVersion|String|**TODO: Add Description**|
|passwordExpirationDays|Int32|**TODO: Add Description**|
|passwordMinimumLength|Int32|**TODO: Add Description**|
|passwordMinimumLetterCharacters|Int32|**TODO: Add Description**|
|passwordMinimumLowerCaseCharacters|Int32|**TODO: Add Description**|
|passwordMinimumNonLetterCharacters|Int32|**TODO: Add Description**|
|passwordMinimumNumericCharacters|Int32|**TODO: Add Description**|
|passwordMinimumSymbolCharacters|Int32|**TODO: Add Description**|
|passwordMinimumUpperCaseCharacters|Int32|**TODO: Add Description**|
|passwordMinutesOfInactivityBeforeLock|Int32|**TODO: Add Description**|
|passwordPreviousPasswordCountToBlock|Int32|**TODO: Add Description**|
|passwordRequired|Boolean|**TODO: Add Description**|
|passwordRequiredType|androidDeviceOwnerRequiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `required`, `numeric`, `numericComplex`, `alphabetic`, `alphanumeric`, `alphanumericWithSymbols`, `lowSecurityBiometric`, `customPassword`.|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md).|
|securityRequireIntuneAppIntegrity|Boolean|**TODO: Add Description**|
|securityRequireSafetyNetAttestationBasicIntegrity|Boolean|**TODO: Add Description**|
|securityRequireSafetyNetAttestationCertifiedDevice|Boolean|**TODO: Add Description**|
|storageRequireEncryption|Boolean|**TODO: Add Description**|
|version|Int32|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md).|

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
  "@odata.type": "microsoft.graph.androidDeviceOwnerCompliancePolicy",
  "baseType": "microsoft.graph.deviceCompliancePolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidDeviceOwnerCompliancePolicy",
  "id": "String (identifier)",
  "roleScopeTagIds": [
    "String"
  ],
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "displayName": "String",
  "version": "Integer",
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "advancedThreatProtectionRequiredSecurityLevel": "String",
  "securityRequireSafetyNetAttestationBasicIntegrity": "Boolean",
  "securityRequireSafetyNetAttestationCertifiedDevice": "Boolean",
  "osMinimumVersion": "String",
  "osMaximumVersion": "String",
  "minAndroidSecurityPatchLevel": "String",
  "passwordRequired": "Boolean",
  "passwordMinimumLength": "Integer",
  "passwordMinimumLetterCharacters": "Integer",
  "passwordMinimumLowerCaseCharacters": "Integer",
  "passwordMinimumNonLetterCharacters": "Integer",
  "passwordMinimumNumericCharacters": "Integer",
  "passwordMinimumSymbolCharacters": "Integer",
  "passwordMinimumUpperCaseCharacters": "Integer",
  "passwordRequiredType": "String",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordExpirationDays": "Integer",
  "passwordPreviousPasswordCountToBlock": "Integer",
  "storageRequireEncryption": "Boolean",
  "securityRequireIntuneAppIntegrity": "Boolean"
}
```

