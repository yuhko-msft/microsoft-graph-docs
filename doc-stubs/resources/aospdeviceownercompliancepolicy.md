---
title: "aospDeviceOwnerCompliancePolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# aospDeviceOwnerCompliancePolicy resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List aospDeviceOwnerCompliancePolicies](../api/aospdeviceownercompliancepolicy-list.md)|[aospDeviceOwnerCompliancePolicy](../resources/aospdeviceownercompliancepolicy.md) collection|Get a list of the [aospDeviceOwnerCompliancePolicy](../resources/aospdeviceownercompliancepolicy.md) objects and their properties.|
|[Create aospDeviceOwnerCompliancePolicy](../api/aospdeviceownercompliancepolicy-create.md)|[aospDeviceOwnerCompliancePolicy](../resources/aospdeviceownercompliancepolicy.md)|Create a new [aospDeviceOwnerCompliancePolicy](../resources/aospdeviceownercompliancepolicy.md) object.|
|[Get aospDeviceOwnerCompliancePolicy](../api/aospdeviceownercompliancepolicy-get.md)|[aospDeviceOwnerCompliancePolicy](../resources/aospdeviceownercompliancepolicy.md)|Read the properties and relationships of an [aospDeviceOwnerCompliancePolicy](../resources/aospdeviceownercompliancepolicy.md) object.|
|[Update aospDeviceOwnerCompliancePolicy](../api/aospdeviceownercompliancepolicy-update.md)|[aospDeviceOwnerCompliancePolicy](../resources/aospdeviceownercompliancepolicy.md)|Update the properties of an [aospDeviceOwnerCompliancePolicy](../resources/aospdeviceownercompliancepolicy.md) object.|
|[Delete aospDeviceOwnerCompliancePolicy](../api/aospdeviceownercompliancepolicy-delete.md)|None|Deletes an [aospDeviceOwnerCompliancePolicy](../resources/aospdeviceownercompliancepolicy.md) object.|
|[assign](../api/aospdeviceownercompliancepolicy-assign.md)|[deviceCompliancePolicyAssignment](../resources/intune-devicecompliancepolicyassignment.md) collection|**TODO: Add Description**|
|[scheduleActionsForRules](../api/aospdeviceownercompliancepolicy-scheduleactionsforrules.md)|None|**TODO: Add Description**|
|[List assignments](../api/aospdeviceownercompliancepolicy-list-assignments.md)|[deviceCompliancePolicyAssignment](../resources/intune-devicecompliancepolicyassignment.md) collection|Get the deviceCompliancePolicyAssignment resources from the assignments navigation property.|
|[Create deviceCompliancePolicyAssignment](../api/aospdeviceownercompliancepolicy-post-assignments.md)|[deviceCompliancePolicyAssignment](../resources/intune-devicecompliancepolicyassignment.md)|Create a new deviceCompliancePolicyAssignment object.|
|[List deviceSettingStateSummaries](../api/aospdeviceownercompliancepolicy-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/aospdeviceownercompliancepolicy-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/aospdeviceownercompliancepolicy-list-devicestatuses.md)|[deviceComplianceDeviceStatus](../resources/intune-devicecompliancedevicestatus.md) collection|Get the deviceComplianceDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceComplianceDeviceStatus](../api/aospdeviceownercompliancepolicy-post-devicestatuses.md)|[deviceComplianceDeviceStatus](../resources/intune-devicecompliancedevicestatus.md)|Create a new deviceComplianceDeviceStatus object.|
|[List deviceComplianceDeviceOverview](../api/aospdeviceownercompliancepolicy-list-devicestatusoverview.md)|[deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md) collection|Get the deviceComplianceDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceComplianceDeviceOverview](../api/aospdeviceownercompliancepolicy-post-devicestatusoverview.md)|[deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md)|Create a new deviceComplianceDeviceOverview object.|
|[List scheduledActionsForRule](../api/aospdeviceownercompliancepolicy-list-scheduledactionsforrule.md)|[deviceComplianceScheduledActionForRule](../resources/intune-devicecompliancescheduledactionforrule.md) collection|Get the deviceComplianceScheduledActionForRule resources from the scheduledActionsForRule navigation property.|
|[Create deviceComplianceScheduledActionForRule](../api/aospdeviceownercompliancepolicy-post-scheduledactionsforrule.md)|[deviceComplianceScheduledActionForRule](../resources/intune-devicecompliancescheduledactionforrule.md)|Create a new deviceComplianceScheduledActionForRule object.|
|[List userStatuses](../api/aospdeviceownercompliancepolicy-list-userstatuses.md)|[deviceComplianceUserStatus](../resources/intune-devicecomplianceuserstatus.md) collection|Get the deviceComplianceUserStatus resources from the userStatuses navigation property.|
|[Create deviceComplianceUserStatus](../api/aospdeviceownercompliancepolicy-post-userstatuses.md)|[deviceComplianceUserStatus](../resources/intune-devicecomplianceuserstatus.md)|Create a new deviceComplianceUserStatus object.|
|[List deviceComplianceUserOverview](../api/aospdeviceownercompliancepolicy-list-userstatusoverview.md)|[deviceComplianceUserOverview](../resources/intune-devicecomplianceuseroverview.md) collection|Get the deviceComplianceUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceComplianceUserOverview](../api/aospdeviceownercompliancepolicy-post-userstatusoverview.md)|[deviceComplianceUserOverview](../resources/intune-devicecomplianceuseroverview.md)|Create a new deviceComplianceUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|description|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|minAndroidSecurityPatchLevel|String|**TODO: Add Description**|
|osMaximumVersion|String|**TODO: Add Description**|
|osMinimumVersion|String|**TODO: Add Description**|
|passwordMinimumLength|Int32|**TODO: Add Description**|
|passwordMinutesOfInactivityBeforeLock|Int32|**TODO: Add Description**|
|passwordRequired|Boolean|**TODO: Add Description**|
|passwordRequiredType|androidDeviceOwnerRequiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `required`, `numeric`, `numericComplex`, `alphabetic`, `alphanumeric`, `alphanumericWithSymbols`, `lowSecurityBiometric`, `customPassword`.|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
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
  "@odata.type": "microsoft.graph.aospDeviceOwnerCompliancePolicy",
  "baseType": "microsoft.graph.deviceCompliancePolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.aospDeviceOwnerCompliancePolicy",
  "id": "String (identifier)",
  "roleScopeTagIds": [
    "String"
  ],
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "displayName": "String",
  "version": "Integer",
  "osMinimumVersion": "String",
  "osMaximumVersion": "String",
  "minAndroidSecurityPatchLevel": "String",
  "passwordRequired": "Boolean",
  "passwordRequiredType": "String",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordMinimumLength": "Integer",
  "storageRequireEncryption": "Boolean"
}
```

