---
title: "windowsPhone81CompliancePolicy resource type"
description: "This class contains compliance settings for Windows 8.1 Mobile."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsPhone81CompliancePolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

This class contains compliance settings for Windows 8.1 Mobile.


Inherits from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsPhone81CompliancePolicy](../api/windowsphone81compliancepolicy-list.md)|[windowsPhone81CompliancePolicy](../resources/windowsphone81compliancepolicy.md) collection|Get a list of the [windowsPhone81CompliancePolicy](../resources/windowsphone81compliancepolicy.md) objects and their properties.|
|[Create windowsPhone81CompliancePolicy](../api/windowsphone81compliancepolicy-create.md)|[windowsPhone81CompliancePolicy](../resources/windowsphone81compliancepolicy.md)|Create a new [windowsPhone81CompliancePolicy](../resources/windowsphone81compliancepolicy.md) object.|
|[Get windowsPhone81CompliancePolicy](../api/windowsphone81compliancepolicy-get.md)|[windowsPhone81CompliancePolicy](../resources/windowsphone81compliancepolicy.md)|Read the properties and relationships of a [windowsPhone81CompliancePolicy](../resources/windowsphone81compliancepolicy.md) object.|
|[Update windowsPhone81CompliancePolicy](../api/windowsphone81compliancepolicy-update.md)|[windowsPhone81CompliancePolicy](../resources/windowsphone81compliancepolicy.md)|Update the properties of a [windowsPhone81CompliancePolicy](../resources/windowsphone81compliancepolicy.md) object.|
|[Delete windowsPhone81CompliancePolicy](../api/windowsphone81compliancepolicy-delete.md)|None|Deletes a [windowsPhone81CompliancePolicy](../resources/windowsphone81compliancepolicy.md) object.|
|[assign](../api/windowsphone81compliancepolicy-assign.md)|[deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md) collection|**TODO: Add Description**|
|[scheduleActionsForRules](../api/windowsphone81compliancepolicy-scheduleactionsforrules.md)|None|**TODO: Add Description**|
|[List assignments](../api/windowsphone81compliancepolicy-list-assignments.md)|[deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md) collection|Get the deviceCompliancePolicyAssignment resources from the assignments navigation property.|
|[Create deviceCompliancePolicyAssignment](../api/windowsphone81compliancepolicy-post-assignments.md)|[deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md)|Create a new deviceCompliancePolicyAssignment object.|
|[List deviceSettingStateSummaries](../api/windowsphone81compliancepolicy-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/windowsphone81compliancepolicy-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/windowsphone81compliancepolicy-list-devicestatuses.md)|[deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md) collection|Get the deviceComplianceDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceComplianceDeviceStatus](../api/windowsphone81compliancepolicy-post-devicestatuses.md)|[deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md)|Create a new deviceComplianceDeviceStatus object.|
|[List deviceComplianceDeviceOverview](../api/windowsphone81compliancepolicy-list-devicestatusoverview.md)|[deviceComplianceDeviceOverview](../resources/devicecompliancedeviceoverview.md) collection|Get the deviceComplianceDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceComplianceDeviceOverview](../api/windowsphone81compliancepolicy-post-devicestatusoverview.md)|[deviceComplianceDeviceOverview](../resources/devicecompliancedeviceoverview.md)|Create a new deviceComplianceDeviceOverview object.|
|[List scheduledActionsForRule](../api/windowsphone81compliancepolicy-list-scheduledactionsforrule.md)|[deviceComplianceScheduledActionForRule](../resources/devicecompliancescheduledactionforrule.md) collection|Get the deviceComplianceScheduledActionForRule resources from the scheduledActionsForRule navigation property.|
|[Create deviceComplianceScheduledActionForRule](../api/windowsphone81compliancepolicy-post-scheduledactionsforrule.md)|[deviceComplianceScheduledActionForRule](../resources/devicecompliancescheduledactionforrule.md)|Create a new deviceComplianceScheduledActionForRule object.|
|[List userStatuses](../api/windowsphone81compliancepolicy-list-userstatuses.md)|[deviceComplianceUserStatus](../resources/devicecomplianceuserstatus.md) collection|Get the deviceComplianceUserStatus resources from the userStatuses navigation property.|
|[Create deviceComplianceUserStatus](../api/windowsphone81compliancepolicy-post-userstatuses.md)|[deviceComplianceUserStatus](../resources/devicecomplianceuserstatus.md)|Create a new deviceComplianceUserStatus object.|
|[List deviceComplianceUserOverview](../api/windowsphone81compliancepolicy-list-userstatusoverview.md)|[deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md) collection|Get the deviceComplianceUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceComplianceUserOverview](../api/windowsphone81compliancepolicy-post-userstatusoverview.md)|[deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md)|Create a new deviceComplianceUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md).|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md).|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md).|
|osMaximumVersion|String|Maximum Windows Phone version.|
|osMinimumVersion|String|Minimum Windows Phone version.|
|passwordBlockSimple|Boolean|Whether or not to block syncing the calendar.|
|passwordExpirationDays|Int32|Number of days before the password expires.|
|passwordMinimumCharacterSetCount|Int32|The number of character sets required in the password.|
|passwordMinimumLength|Int32|Minimum length of passwords.|
|passwordMinutesOfInactivityBeforeLock|Int32|Minutes of inactivity before a password is required.|
|passwordPreviousPasswordBlockCount|Int32|Number of previous passwords to block. Valid values 0 to 24|
|passwordRequired|Boolean|Whether or not to require a password.|
|passwordRequiredType|requiredPasswordType|The required password type. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md).|
|storageRequireEncryption|Boolean|Require encryption on windows phone devices.|
|version|Int32|Version of the device configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md).|

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
  "@odata.type": "microsoft.graph.windowsPhone81CompliancePolicy",
  "baseType": "microsoft.graph.deviceCompliancePolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsPhone81CompliancePolicy",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "osMaximumVersion": "String",
  "osMinimumVersion": "String",
  "passwordBlockSimple": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequired": "Boolean",
  "passwordRequiredType": "String",
  "storageRequireEncryption": "Boolean"
}
```

